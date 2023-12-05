package com.uce.edu.ec;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Propietario;
import com.uce.edu.ec.repository.modelo.Vehiculo;
import com.uce.edu.ec.service.IMatriculaService;
import com.uce.edu.ec.service.IPropietarioService;
import com.uce.edu.ec.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPaU1P5PsApplication implements CommandLineRunner {
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo();
		v.setMarca("Audi");
		v.setPlaca("PDF-1234");
		v.setPrecio(new BigDecimal(10000));
		v.setTipo("pesado");
		this.vehiculoService.guardar(v);

		Vehiculo c = this.vehiculoService.buscar("PDF-1234");
		System.out.println(c);

		Propietario p = new Propietario();
		p.setApellido("Loveli");
		p.setCedula("1752245041");
		p.setGenero("Femenino");
		p.setNombre("Ada");
		this.propietarioService.guardar(p);

		Propietario p1 = this.propietarioService.buscar("1752245041");
		System.out.println(p1);

		Propietario p2 = this.propietarioService.buscar("1752245041");
		p2.setNombre("Ada - Martha");
		p2.setApellido("Loveli - Turin");
		this.propietarioService.actualizar(p2);

		Propietario p3 = this.propietarioService.buscar("1752245041");
		System.out.println(p3);

		this.matriculaService.matricular("1752245041", "PDF-1234");

	}

}