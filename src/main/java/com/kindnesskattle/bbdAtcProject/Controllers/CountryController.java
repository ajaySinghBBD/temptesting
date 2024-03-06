package com.kindnesskattle.bbdAtcProject.Controllers;

import com.kindnesskattle.bbdAtcProject.Entities.Country;
import com.kindnesskattle.bbdAtcProject.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryobj;

    @GetMapping("/home")
    private List<Country> home()
    {
        return this.countryobj.getCountry();
    }
}
