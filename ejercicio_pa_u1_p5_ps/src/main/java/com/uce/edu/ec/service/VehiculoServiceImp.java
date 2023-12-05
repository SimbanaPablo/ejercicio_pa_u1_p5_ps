package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IVehiculoRepository;
import com.uce.edu.ec.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImp implements IVehiculoService {
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionar(placa);
	}

	@Override
	public void guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
	}

}
