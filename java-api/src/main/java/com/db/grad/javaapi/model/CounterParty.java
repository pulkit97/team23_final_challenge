package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "counterparty")
public class CounterParty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public CounterParty(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CounterParty() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CounterParty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
