package com.kindnesskattle.bbdAtcProject.Controllers;

import com.kindnesskattle.bbdAtcProject.Entities.State;
import com.kindnesskattle.bbdAtcProject.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StateController {

    @Autowired
    StateService stateobj;

    @GetMapping("/state_country/{id}")
    private List<State> fetchStateCountry()
    {
            return this.stateobj.getStateCountry();
    }
}
