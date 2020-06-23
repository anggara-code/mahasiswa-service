CREATE TABLE mahasiswa (
    nim integer NOT NULL PRIMARY KEY,
    nama_lengkap VARCHAR(50) NOT NULL,
    prodi VARCHAR(10) NOT NULL,
    tahun_masuk VARCHAR(10) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    foto_profil VARCHAR(50) NOT NULL,
    nomor_telepon VARCHAR(12),
    email VARCHAR(50)
);