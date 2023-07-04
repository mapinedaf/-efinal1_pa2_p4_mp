package uce.edu.efinal1_pa2_p4_mp.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.efinal1_pa2_p4_mp.repository.CitaMedicaRepository;
import uce.edu.efinal1_pa2_p4_mp.repository.DoctorRepository;
import uce.edu.efinal1_pa2_p4_mp.repository.PacienteRepository;
import uce.edu.efinal1_pa2_p4_mp.repository.model.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService {

    @Autowired
    CitaMedicaRepository citaMedicaRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public void registrarCitaMedica(Integer numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
            String cedulaDoctor, String cedulaPaciente) {
       
                CitaMedica citaMedica = CitaMedica.builder()
                    .numeroCita(numeroCita)
                    .fechaCita(fechaCita)
                    .valorCita(valorCita)
                    .lugarCita(lugarCita)
                    .doctor(doctorRepository.readPorCedula(cedulaDoctor))
                    .paciente(pacienteRepository.readPorCedula(cedulaPaciente))
                    .build();

                    citaMedicaRepository.create(citaMedica);

    }

    @Override
    public CitaMedica buscarCitaMedicaPorId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCitaMedicaPorId'");
    }


    @Override
    public void eliminarCitaMedicaPorId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarCitaMedicaPorId'");
    }

    @Override
    public void actualizarCitaMedica(Integer numeroCita, String diagnostico, String Receta,
            LocalDate fechaProximaCita) {
        CitaMedica citaMedica = citaMedicaRepository.readPorNumero(numeroCita);

        citaMedica.setDiagnostico(diagnostico);
        citaMedica.setReceta(Receta);
        citaMedica.setFechaProximaCita(fechaProximaCita);

        citaMedicaRepository.update(citaMedica);
    }
    
}
