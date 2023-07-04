package uce.edu.efinal1_pa2_p4_mp;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uce.edu.efinal1_pa2_p4_mp.repository.PacienteRepository;
import uce.edu.efinal1_pa2_p4_mp.repository.model.CitaMedica;
import uce.edu.efinal1_pa2_p4_mp.repository.model.Doctor;
import uce.edu.efinal1_pa2_p4_mp.repository.model.Paciente;
import uce.edu.efinal1_pa2_p4_mp.service.CitaMedicaService;
import uce.edu.efinal1_pa2_p4_mp.service.DoctorService;
import uce.edu.efinal1_pa2_p4_mp.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4MpApplication implements CommandLineRunner {

	@Autowired
	DoctorService doctorService;

	@Autowired
	PacienteService pacienteService;

	@Autowired
	CitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4MpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Examen parcial programacion avanzada 2 MMarco Andre Pineda Fernandez");

		System.out.println("1. Funcionalidad CRUD para Doctor\r\n" +
				"Nota: desde la clase principal debe ejecutarse el ingreso de 1 Doctor\r");

		Doctor doctor1 = Doctor.builder()
				.cedula("12233123")
				.nombre("Jose")
				.apellido("Ramirez")
				.fechaNacimiento(LocalDate.of(1964, 6, 5))
				.numeroConsultorio("122")
				.codigoSenecyt("124551")
				.genero('M')
				.build();

		// doctorService.registrarDoctor(doctor1);

		System.out.println("2. Funcionalidad Ingresar y Actualizar Paciente\r\n" +
				"Nota: desde la clase principal debe ejecutarse el ingreso de 1 Paciente\r");

		Paciente paciente1 = Paciente.builder()
				.cedula("1241414")
				.nombre("Alejandro")
				.apellido("Loor")
				.fechaNacimiento(LocalDate.of(2001, 01, 17))
				.codigoSeguro("09867")
				.estatura(1.75)
				.peso(95.0)
				.genero('M')
				.build();

		// pacienteService.registrarPaciente(paciente1);

		System.out.println("3. Funcionalidad agendamiento cita medica\r\n" + //
				"A partir de \u00FAnicamente los siguientes datos:\r\n" + //
				"\u2022 N\u00FAmero de cita\r\n" + //
				"\u2022 Fecha cita\r\n" + //
				"\u2022 Valor cita\r\n" + //
				"\u2022 Lugar cita\r\n" + //
				"\u2022 Cedula doctor\r\n" + //
				"\u2022 Cedula paciente\r\n" + //
				"Esta funcionalidad debe permitir agendar una cita m\u00E9dica (ingresar/insertar una cita m\u00E9dica).\r\n"
				+ //
				"Nota: desde la clase principal debe ejecutarse esta funcionalidad \u00FAnicamente con los 6\r\n" + //
				"argumentos necesarios (N\u00FAmero de cita, Fecha cita, Valor cita, Lugar cita, Cedula doctor, \r\n" + //
				"Cedula paciente) y con los datos utilizados en el punto 1 y 2.");

		/*
		 * citaMedicaService.registrarCitaMedica(001,
		 * LocalDate.now(),
		 * BigDecimal.valueOf(500),
		 * "Matriz norte",
		 * "12233123",
		 * "1241414");
		 */

		System.out.println("4. Funcionalidad actualizaci\u00F3n cita medica\r\n" + //
				"Cuando ya se lleva a cabo una cita m\u00E9dica, el sistema a partir del N\u00FAmero de cita, debe tener \r\n"
				+ //
				"una funcionalidad que permita actualizar los siguientes datos:\r\n" + //
				"\u2022 Diagn\u00F3stico\r\n" + //
				"\u2022 Receta\r\n" + //
				"\u2022 Fecha pr\u00F3xima cita\r\n" + //
				"Nota: desde la clase principal debe ejecutarse esta funcionalidad \u00FAnicamente con los 4\r\n" + //
				"argumentos necesarios (N\u00FAmero de cita, Diagn\u00F3stico, Receta y Fecha pr\u00F3xima cita).");

				/* 
				citaMedicaService.actualizarCitaMedica(001,
				 "dermatitis", "extracto de aloe vera cada 6 horas", LocalDate.of(2023,07,18)); */
	}

}
