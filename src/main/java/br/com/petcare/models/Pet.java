package br.com.petcare.models;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "petcare_pet")
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    private UUID id;

    private String name;

    @Column(length = 3)
    private Integer age;

    @Column(length = 40)
    private String type;

    private String race;


    private String gender;

    @ManyToOne
    private Participant participant;

}
