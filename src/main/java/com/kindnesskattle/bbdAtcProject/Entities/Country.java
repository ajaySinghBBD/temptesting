package com.kindnesskattle.bbdAtcProject.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="country_id")
    private int CountryID;

    @Column( name="country_name")
    private String CountryName;

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int countryID) {
        CountryID = countryID;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryID=" + CountryID +
                ", CountryName='" + CountryName + '\'' +
                '}';
    }
}
//CREATE TABLE [dbo].[Country] (
//        [CountryID] INT PRIMARY KEY IDENTITY(1, 1),
//  [CountryName] VARCHAR(50) NOT NULL
//)
