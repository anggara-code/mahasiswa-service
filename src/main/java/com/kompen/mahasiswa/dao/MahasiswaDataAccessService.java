package com.kompen.mahasiswa.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.RowMapper;
import com.kompen.mahasiswa.model.Mahasiswa;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("postgres")
public class MahasiswaDataAccessService implements MahasiswaDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MahasiswaDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Mahasiswa> selectAllMahasiswa() {
        final String sql = "SELECT * FROM mahasiswa";
        return jdbcTemplate.query(sql, mapPersonFromDB());
    }
    
    @Override
    public Optional<Mahasiswa> selectMahasiswaByNim(int nim) {
        final String sql = "SELECT * FROM mahasiswa WHERE nim = ?";
        Mahasiswa mahasiswa = jdbcTemplate.queryForObject(sql, new Object[]{nim}, mapPersonFromDB());
        return Optional.ofNullable(mahasiswa);
    }
    
    // @Override
    // public int insertPerson(UUID id, Person person) {
    //     final String sql = "INSERT INTO mahasiswa (id, name) VALUES (?, ?)";
    //     return jdbcTemplate.update(sql, id, person.getName());
    // }
    // INSERT INTO mahasiswa (nim, nama_lengkap, prodi, tahun_masuk, username, password, foto_profil, nomor_telepon, email) VALUES (1641720008, 'Anggara Mahendra P', 'TI', '2016', 'anggara', 'polinema16', '1.jpg', '085850840454', 'anggaramahendra00@gmail.com');

    // @Override
    // public int updatePersonById(UUID id, Person person) {
    //     final String sql = "UPDATE person SET name = ? WHERE id = ?";
    //     return jdbcTemplate.update(sql, person.getName(), id);
    // }

    // @Override
    // public int deletePersonById(UUID id) {
    //     final String sql = "DELETE FROM person WHERE id = ?";
    //     return jdbcTemplate.update(sql, id);
    // }

    private RowMapper<Mahasiswa> mapPersonFromDB() {
        return (resultSet, i) -> {
            int nim = resultSet.getInt("nim");
            String namaLengkap = resultSet.getString("nama_lengkap");
            String prodi = resultSet.getString("prodi");
            String tahunMasuk = resultSet.getString("tahun_masuk");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String fotoProfil = resultSet.getString("foto_profil");
            String nomorTelepon = resultSet.getString("nomor_telepon");
            String email = resultSet.getString("email");
            return new Mahasiswa(nim, namaLengkap, prodi, tahunMasuk, username, password, fotoProfil, nomorTelepon, email);
        };
    }
    
}