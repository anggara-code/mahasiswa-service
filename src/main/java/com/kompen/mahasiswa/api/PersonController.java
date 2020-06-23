package com.kompen.mahasiswa.api;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import com.kompen.mahasiswa.model.Mahasiswa;
import com.kompen.mahasiswa.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/mahasiswa")
@RestController
public class PersonController {

    private final MahasiswaService mahasiswaService;

    @Autowired
    public PersonController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }
    
    @GetMapping
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    // @GetMapping(path = "/{id}")
    // public Person getPersonById(@PathVariable("id") UUID id) {
    //     return personService.getPersonById(id)
    //             .orElse(null);
    // }
    
    // @PostMapping
    // public void addPerson(@Valid @NonNull @RequestBody Person person) {
    //     personService.addPerson(person);
    // }

    // @PutMapping(path = "/{id}")
    // public void updatePerson(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Person personToUpdate) {
    //     personService.updatePerson(id, personToUpdate);
    // }

    // @DeleteMapping(path = "/{id}")
    // public void deletePersonById(@PathVariable("id") UUID id) {
    //     personService.deletePerson(id);
    // }

}   