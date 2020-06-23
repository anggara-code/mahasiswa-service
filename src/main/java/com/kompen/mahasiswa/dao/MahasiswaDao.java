package com.kompen.mahasiswa.dao;

import java.util.List;
import java.util.Optional;
import com.kompen.mahasiswa.model.Mahasiswa;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaDao {

    List<Mahasiswa> selectAllMahasiswa();

    Optional<Mahasiswa> selectMahasiswaByNim(int nim);

    // int insertPerson(UUID id, Person person);

    // default int insertPerson(Person person) {
    //     UUID id = UUID.randomUUID();
    //     return insertPerson(id, person);
    // }

    // int updatePersonById(UUID id, Person person);

    // int deletePersonById(UUID id);

}