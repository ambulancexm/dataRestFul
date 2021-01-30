package fr.bulleux.test.dataRestful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.bulleux.test.dataRestful.beans.Position;

@RepositoryRestResource(collectionResourceRel = "position", path = "position")
public interface PositionRepository extends CrudRepository<Position, Long> {

}
