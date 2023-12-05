package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Matricula;

public interface IMatriculaService {
	public void guardar(Matricula matricula);

	public void matricular(String cedula, String placa);
}
