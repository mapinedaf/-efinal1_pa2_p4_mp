package uce.edu.efinal1_pa2_p4_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.efinal1_pa2_p4_mp.repository.PacienteRepository;
import uce.edu.efinal1_pa2_p4_mp.repository.model.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public void registrarPaciente(Paciente paciente) {
        this.pacienteRepository.create(paciente);
    }

    @Override
    public Paciente buscarPacientePorId(Integer id) {
       return this.pacienteRepository.readPorId(id);
    }

    @Override
    public void actualizarPaciente(Paciente paciente) {
        this.pacienteRepository.update(paciente);
    }

    @Override
    public void eliminarPacientePorId(Integer id) {
        this.pacienteRepository.deletePorId(id);
    }
    
}
