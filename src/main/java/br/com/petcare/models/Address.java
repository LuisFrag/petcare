package br.com.petcare.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="petcare_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25)
    private String numberHouse;

    @Column(length = 10)
    private String zipCode;

    private String complement;

    @ManyToOne
    private Participant participant;
}
