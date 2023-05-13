package com.emrekayacik.homeworkspring.Controllers;

import com.emrekayacik.homeworkspring.Domain.CountryDto;
import com.emrekayacik.homeworkspring.Domain.CountrySaveResponse;
import com.emrekayacik.homeworkspring.Domain.CountryUpdatePresidentRequest;
import com.emrekayacik.homeworkspring.Domain.CountryUpdatePresidentResponse;
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
    @PatchMapping("/{id}/change-president")
    public ResponseEntity<CountryUpdatePresidentResponse> updatePresident(@RequestBody CountryUpdatePresidentRequest request, @PathVariable Long id){
        return ResponseEntity.ok(countryService.changePresident(request,id));
    }
}
