package uce.edu.efinal1_pa2_p4_mp.service;

import uce.edu.efinal1_pa2_p4_mp.repository.model.Doctor;

public interface DoctorService {
    public void registrarDoctor(Doctor doctor);
    public Doctor buscarDoctorPorId(Integer id);
    public void actualizarDoctor(Doctor doctor);
    public void eliminarDoctorPorId(Integer id);
}
