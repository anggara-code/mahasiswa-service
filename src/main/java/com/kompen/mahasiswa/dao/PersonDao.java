package com.kompen.mahasiswa.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.kompen.mahasiswa.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao {

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    int updatePersonById(UUID id, Person person);
    
    int deletePersonById(UUID id);

}