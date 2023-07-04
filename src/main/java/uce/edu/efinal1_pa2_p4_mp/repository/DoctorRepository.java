package uce.edu.efinal1_pa2_p4_mp.repository;

import uce.edu.efinal1_pa2_p4_mp.repository.model.Doctor;


public interface DoctorRepository {
    public void create(Doctor doctor);
    public Doctor readPorId(Integer id);
    public void update(Doctor doctor);
    public void deletePorId(Integer id);
    
    /////////////////////////////////////

    public Doctor readPorCedula(String cedula);

}
