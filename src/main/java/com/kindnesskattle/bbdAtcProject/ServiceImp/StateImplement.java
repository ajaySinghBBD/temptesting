package com.kindnesskattle.bbdAtcProject.ServiceImp;

import com.kindnesskattle.bbdAtcProject.Entities.State;
import com.kindnesskattle.bbdAtcProject.Repo.StateRepository;
import com.kindnesskattle.bbdAtcProject.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateImplement implements StateService {

    @Autowired
    StateRepository stateRepo;

    @Override
    public List<State> getStateCountry(){

                List<State> states = stateRepo.findAll();
                return states;

    }


}
