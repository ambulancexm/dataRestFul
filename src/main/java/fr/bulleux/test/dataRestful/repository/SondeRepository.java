package fr.bulleux.test.dataRestful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.bulleux.test.dataRestful.beans.Sonde;


@RepositoryRestResource(collectionResourceRel = "sonde", path = "sonde")
public interface SondeRepository extends CrudRepository<Sonde, Long> {

}
