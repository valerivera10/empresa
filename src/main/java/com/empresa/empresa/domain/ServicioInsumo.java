package com.empresa.empresa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class ServicioInsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_insumo")
    private Insumo insumo;

    // Getters y setters
}