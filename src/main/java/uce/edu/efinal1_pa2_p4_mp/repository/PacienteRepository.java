package uce.edu.efinal1_pa2_p4_mp.repository;

import uce.edu.efinal1_pa2_p4_mp.repository.model.Paciente;

public interface PacienteRepository {
    public void create(Paciente paciente);
    public Paciente readPorId(Integer id);


    /////////////////////////////////////
    public void update(Paciente paciente);
    public void deletePorId(Integer id);
    public Paciente readPorCedula(String cedula);

}
