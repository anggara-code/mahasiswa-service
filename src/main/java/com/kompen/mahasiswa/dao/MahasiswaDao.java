package com.kompen.mahasiswa.dao;

import java.util.List;
import java.util.Optional;
import com.kompen.mahasiswa.model.Mahasiswa;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaDao {

    List<Mahasiswa> selectAllPeople();

    // Optional<Person> selectPersonById(UUID id);

    // int insertPerson(UUID id, Person person);

    // default int insertPerson(Person person) {
    //     UUID id = UUID.randomUUID();
    //     return insertPerson(id, person);
    // }

    // int updatePersonById(UUID id, Person person);

    // int deletePersonById(UUID id);

}