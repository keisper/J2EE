package com.isj.autoecole.domaine;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enseignant")
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_enseignant")
    private Long id_enseignant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;


    @ManyToMany
    private List<Cours> listeCours = new ArrayList<>();

}
