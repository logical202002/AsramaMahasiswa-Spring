package com.pbo.asrama.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mahasiswa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nim;
	private String namaLengkap;
	private int angkatan;
	private Date tanggalLahir;
	private String tempatLahir;

	public Mahasiswa(Long id, String nim, String namaLengkap, int angkatan) {
		super();
		this.id = id;
		this.nim = nim;
		this.namaLengkap = namaLengkap;
		this.angkatan = angkatan;
	}

	public Mahasiswa() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public int getAngkatan() {
		return angkatan;
	}

	public void setAngkatan(int angkatan) {
		this.angkatan = angkatan;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}
}
