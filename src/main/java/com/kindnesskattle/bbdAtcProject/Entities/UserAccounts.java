package com.kindnesskattle.bbdAtcProject.Entities;

import jakarta.persistence.*;

@Entity
@Table(name ="dbo.UserAccounts")
public class UserAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID") // Specify column name if different from property
    private int userId;

    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "Username", nullable = false, length = 50, unique = true)
    private String username;

    @Column(name = "ImageURL", length = 2083)
    private String imageURL;

    @Column(name = "EmailAddress", nullable = false, length = 100, unique = true)
    private String emailAddress;

    @Column(name = "ProfileDescription", length = 120)
    private String profileDescription;

    @Column(name = "IsActive", nullable = false, columnDefinition = "bit default 1")
    private boolean isActive = true; // Default true

    @Column(name = "EmailNotificationEnabled", nullable = false, columnDefinition = "bit default 0")
    private boolean emailNotificationEnabled=false ; // Default false

}
//CREATE TABLE [dbo].[UserAccounts] (
//        [UserID] INT PRIMARY KEY IDENTITY(1, 1),
//  [FirstName] VARCHAR(50) NOT NULL,
//  [LastName] VARCHAR(50) NOT NULL,
//  [Username] VARCHAR(50) UNIQUE NOT NULL,
//  [ImageURL] VARCHAR(2083),
//  [EmailAddress] VARCHAR(100) UNIQUE NOT NULL,
//  [ProfileDescription] NVARCHAR(120),
//  [IsActive] BIT NOT NULL DEFAULT (1),
//  [EmailNotificationEnabled] BIT NOT NULL DEFAULT (0)
//)