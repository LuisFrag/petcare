package br.com.petcare.models;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "petcare_company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    private UUID id;

    @Column(length = 14)
    private String document;

    @Column(length = 40)
    private String socialName;

    @Column(length = 40)
    private String fantasyName;

    @Column(length = 40)
    private String companyEmail;

    private String description;

    @OneToMany(mappedBy = "company")
    private List<Participant> collaborators;



}
