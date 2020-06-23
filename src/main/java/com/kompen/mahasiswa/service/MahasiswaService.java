package com.kompen.mahasiswa.service;

import java.util.List;
import java.util.Optional;
import com.kompen.mahasiswa.dao.MahasiswaDao;
import com.kompen.mahasiswa.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MahasiswaService {

    private final MahasiswaDao mahasiswaDao;

    @Autowired
    public MahasiswaService(@Qualifier("postgres") MahasiswaDao mahasiswaDao) {
        this.mahasiswaDao = mahasiswaDao;
    }
    
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaDao.selectAllMahasiswa();
    }
    
    public Optional<Mahasiswa> getMahasiswaByNim(int nim) {
        return mahasiswaDao.selectMahasiswaByNim(nim);
    }
    
    // public int addPerson(Person person) {
    //     return personDao.insertPerson(person);
    // }

    // public int updatePerson(UUID id, Person newPerson) {
    //     return personDao.updatePersonById(id, newPerson);
    // }

    // public int deletePerson(UUID id) {
    //     return personDao.deletePersonById(id);
    // }

}