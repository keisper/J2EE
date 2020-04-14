package com.isj.autoecole.domaine;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "administrateur")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_administrateur")
    private Long id_administrateur;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "age")
    private String age;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
}
