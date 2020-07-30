package br.com.petcare.repositories;

import br.com.petcare.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, UUID> {

    Optional<Participant> findByEmailAddress(String emailAddress);

}
