package com.isj.autoecole.services;


import com.isj.autoecole.domaine.Administrateur;
import com.isj.autoecole.domaine.Cours;
import com.isj.autoecole.domaine.Eleve;
import com.isj.autoecole.domaine.Enseignant;

import java.util.List;

public interface IService {

	//services eleve
	Eleve enregistrerEleveService(Eleve eleve);
	List<Eleve> listEleveService();
	List<Eleve> listEleveRecherche(String nom);

	//services cours
	Cours enregistrerCoursService(Cours cours);
	List<Cours> listCoursService();
	List<Cours> listCoursRecherche(String nom);

	//services Enseignant
	Enseignant enregistrerEnseignantService(Enseignant enseignant);
	List<Enseignant> listEnseignantService();
	List<Enseignant> listEnseignantRecherche(String nom);

	//services Administrateur
	Enseignant enregistrerEnseignantService(Administrateur administrateur);
	List<Administrateur> listAdministrateurService();
	List<Administrateur> listAdministrateurRecherche(String nom);

}
