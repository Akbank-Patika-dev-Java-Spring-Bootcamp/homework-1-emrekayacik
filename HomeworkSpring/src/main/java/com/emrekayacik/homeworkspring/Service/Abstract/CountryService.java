package com.emrekayacik.homeworkspring.Service.Abstract;

import com.emrekayacik.homeworkspring.Domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service interface provides methods to interact with country-related operations.
 */
@Service
public interface CountryService {

    /**
     * Retrieves a list of all countries.
     *
     * @return a list of CountryDto objects representing the countries
     */
    List<CountryDto> get();

    /**
     * Retrieves a country by its ID.
     *
     * @param id the ID of the country to retrieve
     * @return a CountryDto object representing the retrieved country, or null if not found
     */
    CountryDto getById(Long id);

    /**
     * Saves a new country.
     *
     * @param countryDto the CountryDto object representing the country to save
     * @return a CountrySaveResponse object indicating the result of the save operation
     */
    CountrySaveResponse save(CountryDto countryDto);

    CountryDeleteResponse delete(Long id);

    /**
     * Updates the president of a country.
     *
     * @param request the CountryUpdatePresidentRequest object containing the new president information
     * @param id      the ID of the country to update
     * @return a CountryUpdatePresidentResponse object indicating the result of the update operation
     */
    CountryUpdatePresidentResponse changePresident(CountryUpdatePresidentRequest request, Long id);
}