package com.emrekayacik.homeworkspring.Controllers.Country;

import com.emrekayacik.homeworkspring.Domain.Country.CountryDto;
import com.emrekayacik.homeworkspring.Domain.Country.CountrySaveResponse;
import com.emrekayacik.homeworkspring.Domain.Country.CountryUpdatePresidentRequest;
import com.emrekayacik.homeworkspring.Domain.Country.CountryUpdatePresidentResponse;
import com.emrekayacik.homeworkspring.Service.Abstract.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/")
    public ResponseEntity<List<CountryDto>> get(){
        return ResponseEntity.ok(countryService.get());
    }

    @GetMapping("{id}")
    public ResponseEntity<CountryDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(countryService.getById(id));
    }
    @PostMapping("/")
    public ResponseEntity<CountrySaveResponse> save(@RequestBody CountryDto countryDto){
        return ResponseEntity.ok(countryService.save(countryDto));
    }
    @PatchMapping("/")
    public ResponseEntity<CountryUpdatePresidentResponse> updatePresident(@RequestBody CountryUpdatePresidentRequest request){
        return ResponseEntity.ok(countryService.changePresident(request));
    }
}