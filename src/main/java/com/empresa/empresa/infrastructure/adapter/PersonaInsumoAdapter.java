package com.empresa.empresa.infrastructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empresa.application.service.IPersonaInsumoService;
import com.empresa.empresa.domain.PersonaInsumoPK;
import com.empresa.empresa.domain.Persona_Insumo;
import com.empresa.empresa.infrastructure.repository.Persona_InsumoRepository;
@Service
public class PersonaInsumoAdapter implements IPersonaInsumoService {

    @Autowired
    private Persona_InsumoRepository servicioInsumoRepository;

    @Override
    public Optional<Persona_Insumo> findById(PersonaInsumoPK id) {
        return servicioInsumoRepository.findById(id);
    }

    @Override
    public List<Persona_Insumo> getAll() {
        return servicioInsumoRepository.findAll();
    }

    @Override
    public Persona_Insumo save(Persona_Insumo servicioInsumo) {
        return servicioInsumoRepository.save(servicioInsumo);
    }

    @Override
    public Persona_Insumo update(PersonaInsumoPK id, Persona_Insumo servicioInsumo) {
        return servicioInsumoRepository.findById(id)
            .map(existingServicioInsumo -> {
                existingServicioInsumo.setId(servicioInsumo.getId());
                return servicioInsumoRepository.save(existingServicioInsumo);
            })
            .orElse(null);
    }

    @Override
    public void deleteById(PersonaInsumoPK id) {
        servicioInsumoRepository.deleteById(id);
    }
}