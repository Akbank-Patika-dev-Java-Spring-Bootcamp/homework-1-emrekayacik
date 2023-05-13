package com.emrekayacik.homeworkspring.Infrastructure.Profile;

import com.emrekayacik.homeworkspring.Domain.CountryDto;
import com.emrekayacik.homeworkspring.Entity.Country;
import org.mapstruct.Mapper;

@Mapper
public interface CountryMapper {

    CountryDto countryToCountryDto(Country country);
    Country countryDtoToCountry(CountryDto countryDto);
}