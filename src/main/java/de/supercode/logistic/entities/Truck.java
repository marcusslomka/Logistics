package de.supercode.logistic.entities;

import jakarta.persistence.*;

@Entity
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column
    private String model;

    @Column
    private long distance;

    @Column
    private long tonnage;

    public long getTonnage() {
        return tonnage;
    }

    public void setTonnage(long tonnage) {
        this.tonnage = tonnage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}
