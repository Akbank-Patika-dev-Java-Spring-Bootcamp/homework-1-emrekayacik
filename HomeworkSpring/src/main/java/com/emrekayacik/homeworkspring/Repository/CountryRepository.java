package com.emrekayacik.homeworkspring.Repository;

import com.emrekayacik.homeworkspring.Entity.Country;
import org.springframework.data.repository.CrudRepository;


public interface CountryRepository extends CrudRepository<Country,Long> {

}
