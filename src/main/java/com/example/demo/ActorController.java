package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/sakila")
@CrossOrigin(origins = "*")
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

//guardar el empleado
/*@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("/actor")
public Actor guardarActor(@RequestBody Actor actor){
    return actorService.guardarActor(actor);
}

@CrossOrigin(origins = "*")  
@PostMapping("/actor")
public Actor addActor(@RequestBody Actor actor){
    Actor getactor = actorRepository.save(actor);
    return getactor;
}*/

@PostMapping("/actor")
public Actor save(@RequestBody Actor actor){
    return actorRepository.save(actor);
}

}
