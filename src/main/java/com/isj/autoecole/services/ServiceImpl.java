package com.isj.autoecole.services;

import com.isj.autoecole.domaine.Administrateur;
import com.isj.autoecole.domaine.Cours;
import com.isj.autoecole.domaine.Eleve;
import com.isj.autoecole.domaine.Enseignant;
import com.isj.autoecole.repository.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceImpl implements IService {

	//injection de l'interface repository
	@Autowired
	private EleveRepository eleveRepository;


	@Override
	public Eleve enregistrerEleveService(Eleve eleve) {

		return eleveRepository.save(eleve);

	}

	@Override
	public List<Eleve> listEleveService() {

		return eleveRepository.findAll();
	}

	@Override
	public List<Eleve> listEleveRecherche(String nom) {
		return eleveRepository.findAllByNomLike(nom);
	}

	@Override
	public Cours enregistrerCoursService(Cours cours) {
		return null;
	}

	@Override
	public List<Cours> listCoursService() {
		return null;
	}

	@Override
	public List<Cours> listCoursRecherche(String nom) {
		return null;
	}

	@Override
	public Enseignant enregistrerEnseignantService(Enseignant enseignant) {
		return null;
	}

	@Override
	public List<Enseignant> listEnseignantService() {
		return null;
	}

	@Override
	public List<Enseignant> listEnseignantRecherche(String nom) {
		return null;
	}

	@Override
	public Enseignant enregistrerEnseignantService(Administrateur administrateur) {
		return null;
	}

	@Override
	public List<Administrateur> listAdministrateurService() {
		return null;
	}

	@Override
	public List<Administrateur> listAdministrateurRecherche(String nom) {
		return null;
	}

}
