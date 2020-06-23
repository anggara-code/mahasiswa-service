package com.kompen.mahasiswa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mahasiswa {

    private final int nim;
    private final String namaLengkap;
    private final String prodi;
    private final String tahunMasuk;
    private final String username;
    private final String password;
    private final String fotoProfil;
    private final String nomorTelepon;
    private final String email;

    public Mahasiswa(@JsonProperty("nim") int nim, @JsonProperty("nama_lengkap") String namaLengkap, @JsonProperty("prodi") String prodi, 
            @JsonProperty("tahun_masuk") String tahunMasuk, @JsonProperty("username") String username, @JsonProperty("password") String password, 
            @JsonProperty("foto_profil") String fotoProfil, @JsonProperty("nomor_telepon") String nomorTelepon, @JsonProperty("email") String email) {
        this.nim = nim;
        this.namaLengkap = namaLengkap;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
        this.username = username;
        this.password = password;
        this.fotoProfil = fotoProfil;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public int getNim() {
        return nim;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getProdi() {
        return prodi;
    }

    public String getTahunMasuk() {
        return tahunMasuk;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getFotoProfil() {
        return fotoProfil;
    }

    public String getEmail() {
        return email;
    }

}