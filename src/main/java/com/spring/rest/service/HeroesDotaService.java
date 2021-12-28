package com.spring.rest.service;

import com.spring.rest.entity.HeroesDota;

import java.util.List;

public interface HeroesDotaService {

    public List<HeroesDota> getAllHeroesDota();

    public void saveHeroesDota(HeroesDota heroesDota);

    public HeroesDota getHeroesDota(int id);

    public void deleteHeroesDota(int id);
}
