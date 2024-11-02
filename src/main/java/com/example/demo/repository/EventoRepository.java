package com.example.demo.repository;

import com.example.demo.dto.EventoConConteoDTO;
import com.example.demo.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    @Query("SELECT new com.example.demo.dto.EventoConConteoDTO(e.nombre, e.fecha, e.hora, e.ubicacion, e.capacidadMaxima, COUNT(ep.persona.id), e.estado) " +
            "FROM Evento e LEFT JOIN e.personasRegistradas ep " +
            "GROUP BY e.id")
    List<EventoConConteoDTO> findAllEventosConConteoPersonas();
}