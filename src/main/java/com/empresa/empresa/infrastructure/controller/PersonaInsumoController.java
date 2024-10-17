package com.empresa.empresa.infrastructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.empresa.application.service.IPersonaInsumoService;
import com.empresa.empresa.domain.PersonaInsumoPK;
import com.empresa.empresa.domain.Persona_Insumo;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/personainsumo")
public class PersonaInsumoController {

    @Autowired
    private IPersonaInsumoService personaInsumoService;

    @GetMapping
    public ResponseEntity<List<Persona_Insumo>> list() {
        List<Persona_Insumo> personaInsumos = personaInsumoService.getAll();
        return new ResponseEntity<>(personaInsumos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Persona_Insumo> create(@RequestBody @Valid Persona_Insumo personaInsumo) {
        Persona_Insumo createdPersonaInsumo = personaInsumoService.save(personaInsumo);
        return new ResponseEntity<>(createdPersonaInsumo, HttpStatus.CREATED);
    }

    @GetMapping("/{idInsu}/{nroDoc}/{idServicio}")
    public ResponseEntity<Persona_Insumo> show(@PathVariable Long idInsu, @PathVariable Long nroDoc, @PathVariable Long idServicio) {
        PersonaInsumoPK id = new PersonaInsumoPK(idInsu, nroDoc, idServicio);
        return personaInsumoService.findById(id)
                .map(personaInsumo -> new ResponseEntity<>(personaInsumo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{idInsu}/{nroDoc}/{idServicio}")
    public ResponseEntity<Persona_Insumo> update(@PathVariable Long idInsu, @PathVariable Long nroDoc, @PathVariable Long idServicio, @RequestBody @Valid Persona_Insumo personaInsumo) {
        PersonaInsumoPK id = new PersonaInsumoPK(idInsu, nroDoc, idServicio);
        try {
            Persona_Insumo updatedPersonaInsumo = personaInsumoService.update(id, personaInsumo);
            return new ResponseEntity<>(updatedPersonaInsumo, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{idInsu}/{nroDoc}/{idServicio}")
    public ResponseEntity<Void> delete(@PathVariable Long idInsu, @PathVariable Long nroDoc, @PathVariable Long idServicio) {
        PersonaInsumoPK id = new PersonaInsumoPK(idInsu, nroDoc, idServicio);
        if (personaInsumoService.findById(id).isPresent()) {
            personaInsumoService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}