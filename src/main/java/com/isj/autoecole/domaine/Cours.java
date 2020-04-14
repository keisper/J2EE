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
@Table(name = "cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cours")
    private Long id_cours;
    @Column(name = "description")
    private String description;

    @ManyToMany
    private List<Eleve> listeEleve = new ArrayList<>();

    @ManyToMany
    private List<Enseignant> listeEnseignant = new ArrayList<>();

}
