package com.kindnesskattle.bbdAtcProject.ServiceImp;

import com.kindnesskattle.bbdAtcProject.Entities.Country;
import com.kindnesskattle.bbdAtcProject.Repo.CountryRepository;
import com.kindnesskattle.bbdAtcProject.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryImplement implements CountryService {

    @Autowired
    CountryRepository countryRepo;
    List<Country> list;


    @Override
    public List<Country> getCountry(){
        List<Country> countries = countryRepo.findAll();
        System.out.println( countryRepo.findAll());
        System.out.println("this ui "+ countries);
        for (Country country : countries) {
            System.out.println("Country ID: " + country.getCountryID());
            System.out.println("Country Name: " + country.getCountryName());
        }
        return countries;

    }


}
