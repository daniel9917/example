package com.perficient.demo.domain;

import java.io.Serializable;
import java.util.UUID;

public class Salary implements Serializable {

    private UUID id;
    private UUID collaboratorId;
    private double value;
    private boolean deleted;

    public Salary() {
    }

    public Salary(UUID id, UUID collaboratorId, double value, boolean isDeleted) {
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
