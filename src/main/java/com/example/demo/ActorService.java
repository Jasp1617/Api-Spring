package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ActorService{

    @Autowired
    ActorRepository actorRepository;

    public Actor addActor(Actor actor){
        return actorRepository.save(actor);
    }

}