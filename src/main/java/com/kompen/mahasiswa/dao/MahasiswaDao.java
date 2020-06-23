package com.kompen.mahasiswa.dao;

import java.util.List;
import java.util.Optional;
import com.kompen.mahasiswa.model.Mahasiswa;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaDao {

    List<Mahasiswa> selectAllMahasiswa();

    Optional<Mahasiswa> selectMahasiswaByNim(int nim);

    int insertMahasiswa(Mahasiswa mahasiswa);

    int updateMahasiswaByNim(int nim, Mahasiswa mahasiswa);

    int deleteMahasiswaByNim(int nim);

}