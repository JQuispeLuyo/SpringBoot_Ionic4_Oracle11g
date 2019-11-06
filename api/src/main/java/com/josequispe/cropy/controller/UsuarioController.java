package com.josequispe.cropy.controller;

import java.util.List;
import java.util.Optional;

import com.josequispe.cropy.model.Usuario;
import com.josequispe.cropy.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController{

    @Autowired
    UsuarioRepository repo;

    // GET POST PUT DELETE

    @GetMapping()
    public ResponseEntity<List<Usuario>> findAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping(value = "{IDPER}")
    public ResponseEntity<Usuario> find(@PathVariable("IDPER") Long IDPER){
        Optional<Usuario> user = repo.findById(IDPER);
        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        }else{
            return ResponseEntity.notFound().build();
        }
        
    }

    @PostMapping()
    public ResponseEntity<Usuario> create(@RequestBody Usuario user){
        return ResponseEntity.ok(repo.save(user));
    }

    @PutMapping()
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        Optional<Usuario> user = repo.findById(usuario.getIDPER());
        if(user.isPresent()){
            return ResponseEntity.ok(repo.save(usuario));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{IDPER}")
    public ResponseEntity<Void>delete(@PathVariable("IDPER") Long IDPER ){
        repo.deleteById(IDPER);
        return ResponseEntity.ok().build();
    }


}