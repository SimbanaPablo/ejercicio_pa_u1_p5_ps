package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Propietario;

public interface IPropietarioRepository {
	public Propietario seleccionar(String cedula);

	public void insertar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);
}
