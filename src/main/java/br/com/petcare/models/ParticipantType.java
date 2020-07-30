package br.com.petcare.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "petcare_participant_type")
public class ParticipantType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;


}
