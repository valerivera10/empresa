package com.empresa.empresa.application.service;
import java.util.List;
import java.util.Optional;

import com.empresa.empresa.domain.ServicioInsumo;

public interface IServicioInsumoService {
    Optional<ServicioInsumo> findById(Long id);
    List<ServicioInsumo> getAll();
    ServicioInsumo save(ServicioInsumo servicioInsumo);
    ServicioInsumo update(Long id, ServicioInsumo servicioInsumo);
    void deleteById(Long id);
}

