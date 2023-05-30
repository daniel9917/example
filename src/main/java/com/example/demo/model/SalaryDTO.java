package com.example.demo.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

public class SalaryDTO implements Serializable {
    private UUID id;

    @NotNull(message = "Collaborator id is required")
    private UUID collaboratorId;

    private Double value;

    private Boolean deleted;

    public SalaryDTO() {
    }

    public SalaryDTO(UUID id, UUID collaboratorId, Double value, Boolean isDeleted) {
        this.id = id;
        this.collaboratorId = collaboratorId;
        this.value = value;
        this.deleted = isDeleted;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCollaboratorId() {
        return collaboratorId;
    }

    public void setCollaboratorId(UUID collaboratorId) {
        this.collaboratorId = collaboratorId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
