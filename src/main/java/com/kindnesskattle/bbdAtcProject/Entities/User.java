package com.kindnesskattle.bbdAtcProject.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "FirstName")
    private String FirstName;
}

//  [UserID] INT PRIMARY KEY IDENTITY(1, 1),
//  [FirstName] VARCHAR(50) NOT NULL,
//  [LastName] VARCHAR(50) NOT NULL,