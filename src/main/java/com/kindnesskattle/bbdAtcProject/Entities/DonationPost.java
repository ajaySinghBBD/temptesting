package com.kindnesskattle.bbdAtcProject.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="donation_post")
public class DonationPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Post_id;

//    @Column(name = "user_id")
//    private String
}

//CREATE TABLE [dbo].[DonationPosts] (
//        [PostID] INT PRIMARY KEY IDENTITY(1, 1),
//  [UserID] INT NOT NULL,
//        [FoodTypeId] INT NOT NULL,
//        [AddressID] INT NOT NULL,
//        [FoodImageURL] VARCHAR(2048),
//  [TimeAvailable] DATETIME NOT NULL,
//        [IsPickupCompleted] BIT NOT NULL DEFAULT (0),
//  [CreatedAt] DATETIME DEFAULT (GETDATE())
//        )
