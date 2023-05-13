package com.emrekayacik.homeworkspring.Service.Concrete;
import com.emrekayacik.homeworkspring.Domain.CountryDto;
import com.emrekayacik.homeworkspring.Domain.CountrySaveResponse;
import com.emrekayacik.homeworkspring.Domain.CountryUpdatePresidentRequest;
import com.emrekayacik.homeworkspring.Domain.CountryUpdatePresidentResponse;
import com.emrekayacik.homeworkspring.Entity.Country;
import com.emrekayacik.homeworkspring.Infrastructure.Profile.CountryMapper;
import com.emrekayacik.homeworkspring.Repository.CountryRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService implements com.emrekayacik.homeworkspring.Service.Abstract.CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper = Mappers.getMapper(CountryMapper.class);

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<CountryDto> get() {
        List<CountryDto> countries = new ArrayList<>();

        countryRepository.findAll().iterator().forEachRemaining(country -> countries.add(countryMapper.countryToCountryDto(country)));

        return countries;
    }

    @Override
    public CountryDto getById(Long id) {
        Country country  = countryRepository.findById(id).orElse(null);
        return countryMapper.countryToCountryDto(country);
    }

    @Override
    public CountrySaveResponse save(CountryDto countryDto) {
        return new CountrySaveResponse(
                countryRepository.save(countryMapper.countryDtoToCountry(countryDto))
                        .getId()
        );
    }

    @Override
    public CountryUpdatePresidentResponse changePresident(CountryUpdatePresidentRequest request, Long id) {
        Country country  = countryRepository.findById(id).orElse(null);
        if (country==null){
            return null;
        }

        country.setPresident(request.president());
        Country savedCountry = countryRepository.save(country);

        return new CountryUpdatePresidentResponse(savedCountry.getId(), savedCountry.getPresident());
    }
}
