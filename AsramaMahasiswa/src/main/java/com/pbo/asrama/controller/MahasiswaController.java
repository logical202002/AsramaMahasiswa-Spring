package com.pbo.asrama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pbo.asrama.model.Mahasiswa;
import com.pbo.asrama.repository.MahasiswaRepository;

@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaRepository mahasiswaRepository;

	@GetMapping("/mahasiswa")
	public String getListMahasiswa(Model model) {
		List<Mahasiswa> daftarMahasiswa = mahasiswaRepository.findAll();

		model.addAttribute("listMahasiswa", daftarMahasiswa);
		return "mahasiswa/mahasiswa";
	}

	@GetMapping("/mahasiswa/new")
	public String showForm(Model model) {
		model.addAttribute("mahasiswa", new Mahasiswa());
		return "mahasiswa/formMahasiswa";
	}

	@PostMapping("/mahasiswa")
	public String saveOrUpdate(Mahasiswa mahasiswa) {
		this.mahasiswaRepository.save(mahasiswa);
		return "redirect:/mahasiswa";
	}

	@GetMapping("/mahasiswa/edit/{id}")
	public String getMahasiswa(Model model, @PathVariable Long id) {
		Mahasiswa m = mahasiswaRepository.getOne(id);
		model.addAttribute("mahasiswa", m);
		return "mahasiswa/formMahasiswa";
	}

	@GetMapping("/mahasiswa/delete/{id}")
	public String deleteMahasiswa(@PathVariable Long id) {
		Mahasiswa m = mahasiswaRepository.getOne(id);
		mahasiswaRepository.delete(m);
		return "redirect:/mahasiswa";
	}
}
