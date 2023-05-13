package com.emrekayacik.homeworkspring.Repository;

import com.emrekayacik.homeworkspring.Entity.Country;
import org.springframework.data.repository.CrudRepository;


/**
 * This repository interface provides CRUD operations for the Country entity.
 */
public interface CountryRepository extends CrudRepository<Country,Long> {

}
