package com.kindnesskattle.bbdAtcProject.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="state_id")
    private int StateId;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "state_name")
    private String StateName;


    public int getStateId() {
        return StateId;
    }

    public void setStateId(int stateId) {
        StateId = stateId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }
}

//CREATE TABLE state (
//        state_id INT PRIMARY KEY IDENTITY(1, 1),
//country_id INT NOT NULL,
//state_name VARCHAR(50) NOT NULL,
//FOREIGN KEY (country_id) REFERENCES country (country_id)
//        );
//