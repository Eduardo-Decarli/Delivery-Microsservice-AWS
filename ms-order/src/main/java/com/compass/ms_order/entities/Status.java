package com.compass.ms_order.entities;

public enum Status {
    PENDENTE(1L, "Pendente"),
    ENVIADO(2L, "Enviado"),
    CONCLUIDO(3L, "Concluido"),
    CANCELADO(4L, "Cancelado");

    private Long id;
    private String description;


    Status(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
