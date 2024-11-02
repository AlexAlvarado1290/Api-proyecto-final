package com.example.demo.controller;

import com.example.demo.dto.EventoConConteoDTO;
import com.example.demo.model.Evento;
import com.example.demo.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    @PostMapping
    public Evento createEvento(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

    // Endpoint para obtener eventos con conteo de personas registradas
    @GetMapping("/con-conteo")
    public List<EventoConConteoDTO> getAllEventosConConteoPersonas() {
        return eventoRepository.findAllEventosConConteoPersonas();
    }

    // Cambia la ruta de este endpoint para evitar conflicto
    @GetMapping("/id/{id}")
    public Evento getEventoById(@PathVariable Long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Evento updateEvento(@PathVariable Long id, @RequestBody Evento eventoDetails) {
        Evento evento = eventoRepository.findById(id).orElse(null);
        if (evento != null) {
            evento.setFecha(eventoDetails.getFecha());
            evento.setHora(eventoDetails.getHora());
            return eventoRepository.save(evento);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEvento(@PathVariable Long id) {
        eventoRepository.deleteById(id);
    }
}
