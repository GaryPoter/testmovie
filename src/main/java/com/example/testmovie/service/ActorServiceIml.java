package com.example.testmovie.service;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.mappers.ActorMapper;
import com.example.testmovie.utils.ConditionalObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(readOnly = true)
public class ActorServiceIml implements ActorService {

    @Autowired
    private ActorMapper actorMapper;

    @Override
    public ArrayList<Actor> getAllActors() {
        return actorMapper.getAll();
    }

    @Override
    public ArrayList<Actor> getActorByNotDefinedName(ConditionalObj co) {
        return actorMapper.getActorByNotDefineName(co);
    }

    @Override
    public int deleteActorById(Actor actor) {
        return actorMapper.deleteActorById(actor);
    }

    @Override
    public int deleteActorByName(Actor actor) {
        return actorMapper.deleteActorByName(actor);
    }

    @Override
    public int updateActor(Actor actor) {
        return actorMapper.updateActor(actor);
    }

    @Override
    public int addActor(Actor actor) {
        return actorMapper.addActor(actor);
    }
}
