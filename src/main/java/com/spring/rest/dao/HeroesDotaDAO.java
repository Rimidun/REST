package com.spring.rest.dao;

import com.spring.rest.entity.HeroesDota;

import java.util.List;

public interface HeroesDotaDAO {

    public List<HeroesDota> getAllHeroesDota();

    public void saveHeroesDota(HeroesDota heroesDota);

    public HeroesDota getHeroesDota(int id);

    public void deleteHeroesDota(int id);
}


