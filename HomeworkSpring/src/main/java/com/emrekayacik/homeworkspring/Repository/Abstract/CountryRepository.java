package com.emrekayacik.homeworkspring.Repository.Abstract;

import com.emrekayacik.homeworkspring.Entity.Country.Country;
import org.springframework.data.repository.CrudRepository;


public interface CountryRepository extends CrudRepository<Country,Long> {

}
