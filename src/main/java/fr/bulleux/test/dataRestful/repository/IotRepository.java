package fr.bulleux.test.dataRestful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.bulleux.test.dataRestful.beans.Iot;

@RepositoryRestResource(collectionResourceRel = "iot", path = "iot")
public interface IotRepository extends CrudRepository<Iot, Long> {

}
