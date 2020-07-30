package br.com.petcare.models;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name ="petcare_participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    private UUID id;

    private String name;

    private String password;

    @Column(unique = true)
    private String emailAddress;

    @OneToMany(mappedBy = "participant")
    private List<Address> address;

    @OneToMany(mappedBy = "participant")
    private List<Pet> pets;

    @ManyToOne
    private ParticipantType type;

    @ManyToOne
    private Company company;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false, columnDefinition = "datetime")
    private OffsetDateTime createdDate;
}
