package uce.edu.efinal1_pa2_p4_mp.service;

import uce.edu.efinal1_pa2_p4_mp.repository.model.Paciente;

public interface PacienteService {
    public void registrarPaciente(Paciente paciente);
    public Paciente buscarPacientePorId(Integer id);
    public void actualizarPaciente(Paciente paciente);
    public void eliminarPacientePorId(Integer id);
}
