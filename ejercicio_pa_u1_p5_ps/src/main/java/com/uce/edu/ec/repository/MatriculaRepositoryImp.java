package com.uce.edu.ec.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImp implements IMatriculaRepository {
	public static List<Matricula> base = new ArrayList<Matricula>();

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		base.add(matricula);
	}

}
