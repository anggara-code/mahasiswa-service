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
    
    public int addMahasiswa(Mahasiswa mahasiswa) {
        return mahasiswaDao.insertMahasiswa(mahasiswa);
    }

    public int updateMahasiswa(int nim, Mahasiswa mahasiswa) {
        return mahasiswaDao.updateMahasiswaByNim(nim, mahasiswa);
    }

    public int deleteMahasiswaByNim(int nim) {
        return mahasiswaDao.deleteMahasiswaByNim(nim);
    }

}