package com.emrekayacik.homeworkspring.Service.Abstract;

import com.emrekayacik.homeworkspring.Domain.Country.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    List<CountryDto> get();
    CountryDto getById(Long id);
    CountrySaveResponse save(CountryDto countryDto);
    CountryUpdatePresidentResponse changePresident(CountryUpdatePresidentRequest request);
}