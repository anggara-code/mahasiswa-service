package com.kompen.mahasiswa.api;

import java.util.List;
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
public class MahasiswaController {

    private final MahasiswaService mahasiswaService;

    @Autowired
    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }
    
    @GetMapping
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @GetMapping(path = "/{nim}")
    public Mahasiswa getMahasiswaByNim(@PathVariable("nim") int nim) {
        return mahasiswaService.getMahasiswaByNim(nim)
                .orElse(null);
    }
    
    @PostMapping
    public void addMahasiswa(@Valid @NonNull @RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.addMahasiswa(mahasiswa);
    }

    @PutMapping(path = "/{nim}")
    public void updateMahasiswa(@PathVariable("nim") int nim, @Valid @NonNull @RequestBody Mahasiswa mahasiswaToUpdate) {
        mahasiswaService.updateMahasiswaByNim(nim, mahasiswaToUpdate);
    }

    @DeleteMapping(path = "/{nim}")
    public void deleteMahasiswaByNim(@PathVariable("nim") int nim) {
        mahasiswaService.deleteMahasiswaByNim(nim);
    }

}   