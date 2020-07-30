package br.com.petcare.controllers;

import br.com.petcare.models.dto.AuthDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value ="/api/v1/participant/")
public class ParticipantController {


    @PostMapping("/auth")
    public ResponseEntity<?> authenticate(@Valid @RequestBody AuthDTO credentials){
        return ResponseEntity.ok().build();
    }

}
