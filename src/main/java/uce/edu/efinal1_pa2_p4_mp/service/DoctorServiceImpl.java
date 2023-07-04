package uce.edu.efinal1_pa2_p4_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.efinal1_pa2_p4_mp.repository.DoctorRepository;
import uce.edu.efinal1_pa2_p4_mp.repository.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public void registrarDoctor(Doctor doctor) {
        this.doctorRepository.create(doctor);
    }

    @Override
    public Doctor buscarDoctorPorId(Integer id) {
       return this.doctorRepository.readPorId(id);
    }

    @Override
    public void actualizarDoctor(Doctor doctor) {
        this.doctorRepository.update(doctor);
    }

    @Override
    public void eliminarDoctorPorId(Integer id) {
        this.doctorRepository.deletePorId(id);
    }
    
}
