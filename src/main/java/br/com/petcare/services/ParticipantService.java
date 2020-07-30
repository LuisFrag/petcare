package br.com.petcare.services;

import br.com.petcare.models.Participant;
import br.com.petcare.models.dto.AuthDTO;
import br.com.petcare.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;


    public Optional<Participant> authenticate(AuthDTO credentials){
       Optional<Participant> foundParticipant = participantRepository.findByEmailAddress(credentials.getEmailAddress());
        foundParticipant.ifPresent(participant -> {

        });
        return foundParticipant;
    }


}
