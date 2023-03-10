package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/sakila")
@CrossOrigin(origins = "http://localhost:4200")
public class ActorController {

    @Autowired
    ActorRepository actorRepository;   

@GetMapping("/hola")
public String hola(){
    return "hola";
}

@GetMapping("/actor")

public List<Actor> findAll(){
  return actorRepository.findAll();
}
@GetMapping("/actor/{id}")
public Optional<Actor> findById(@PathVariable Integer id){
    return actorRepository.findById(id);
}

@PostMapping("/actor")
public Actor findById(Actor actor){
    return actorRepository.save(actor);
}

    
}
