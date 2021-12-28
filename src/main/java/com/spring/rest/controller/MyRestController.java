package com.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.rest.entity.HeroesDota;
import com.spring.rest.exeption.NoSuchEmployeeException;
import com.spring.rest.service.HeroesDotaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private HeroesDotaService heroesDotaService;

    @GetMapping("/heroes")
    public List<HeroesDota>showAllEmployees(){
        List<HeroesDota> allHeroesDota = heroesDotaService.getAllHeroesDota();
        return allHeroesDota;
    }

    @GetMapping("/heroes/{id}")
    public HeroesDota getHeroesDota(@PathVariable int id){
        HeroesDota heroesDota = heroesDotaService.getHeroesDota(id);

        if (heroesDota == null){
            throw new NoSuchEmployeeException("There is no heroes with id = "+id + " in database");
        }
        return heroesDota;
    }


    @PostMapping("/heroes")
    public HeroesDota addNewHeroesDota(@RequestBody HeroesDota heroesDota){

        heroesDotaService.saveHeroesDota(heroesDota);
        return heroesDota;
    }
    @PutMapping ("/heroes")
    public HeroesDota updateHeroesDota(@RequestBody HeroesDota heroesDota){

        heroesDotaService.saveHeroesDota(heroesDota);
        return heroesDota;
    }

    @DeleteMapping("/heroes/{id}")
    public String  deleteHeroesDota(@PathVariable int id){

        HeroesDota heroesDota = heroesDotaService.getHeroesDota(id);
        if (heroesDota==null){
            throw new NoSuchEmployeeException("There is no heroes with id = "+ id + " in database");
        }
        heroesDotaService.deleteHeroesDota(id);
        return "heroes wit ID = "+ id + " was deleted";

    }
}
