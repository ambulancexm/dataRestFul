package fr.bulleux.test.dataRestful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.bulleux.test.dataRestful.beans.Projet;

@RepositoryRestResource(collectionResourceRel = "projet", path = "projet")
public interface ProjetRepository extends CrudRepository<Projet, Long> {

}
