package fr.bulleux.test.dataRestful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.bulleux.test.dataRestful.beans.Mesure;

@RepositoryRestResource(collectionResourceRel = "mesure", path = "mesure")
public interface MesureRepository extends CrudRepository<Mesure, Long> {

}
