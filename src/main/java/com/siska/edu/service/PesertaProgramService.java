package com.siska.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siska.edu.model.PesertaProgram;
import com.siska.edu.repository.PesertaProgramRepository;

@Service
@Transactional
public class PesertaProgramService {

	@Autowired
	PesertaProgramRepository repo;

	public List<PesertaProgram> listAll() {
		return (List<PesertaProgram>) repo.findAll();
	}

	public void save(PesertaProgram pesertaProgram) {
		repo.save(pesertaProgram);
	}

	public PesertaProgram get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

//	public List<PesertaProgram> search(String keyword) {
//		return repo.search(keyword);
//	}

}
