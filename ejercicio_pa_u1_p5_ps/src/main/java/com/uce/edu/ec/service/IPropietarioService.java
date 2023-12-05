package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Propietario;

public interface IPropietarioService {
	public Propietario buscar(String cedula);

	public void guardar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);
}
