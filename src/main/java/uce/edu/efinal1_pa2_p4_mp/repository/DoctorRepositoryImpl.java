package uce.edu.efinal1_pa2_p4_mp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.efinal1_pa2_p4_mp.repository.model.Doctor;

@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public void create(Doctor doctor) {
        this.entityManager.persist(doctor);
    }

    @Override
    public Doctor readPorId(Integer id) {
        return this.entityManager.find(Doctor.class, id);
    }

    @Override
    public void update(Doctor doctor) {
        this.entityManager.merge(doctor);
    }

    @Override
    public void deletePorId(Integer id) {
        this.entityManager.remove(readPorId(id));
    }
    




        @Override
    public Doctor readPorCedula(String cedula) {
        

        String jpql = "SELECT d FROM Doctor d  WHERE d.cedula = :datoCedula";

        TypedQuery<Doctor> query = this.entityManager.createQuery(jpql, Doctor.class);

        query.setParameter("datoCedula", cedula);

        return query.getSingleResult();

    }
}
