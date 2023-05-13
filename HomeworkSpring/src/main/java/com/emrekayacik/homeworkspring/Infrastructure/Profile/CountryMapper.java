package com.emrekayacik.homeworkspring.Infrastructure.Profile;

import com.emrekayacik.homeworkspring.Domain.CountryDto;
import com.emrekayacik.homeworkspring.Entity.Country;
import org.mapstruct.Mapper;

/**
 * This mapper interface provides methods to map between Country and CountryDto objects.
 */
@Mapper
public interface CountryMapper {

    /**
     * Converts a Country object to a CountryDto object.
     *
     * @param country the Country object to be converted
     * @return a CountryDto object representing the converted country
     */
    CountryDto countryToCountryDto(Country country);

    /**
     * Converts a CountryDto object to a Country object.
     *
     * @param countryDto the CountryDto object to be converted
     * @return a Country object representing the converted country
     */
    Country countryDtoToCountry(CountryDto countryDto);
}