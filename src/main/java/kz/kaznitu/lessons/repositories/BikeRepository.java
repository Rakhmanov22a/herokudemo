package kz.kaznitu.lessons.repositories;

import kz.kaznitu.lessons.models.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike,Long> {
}
