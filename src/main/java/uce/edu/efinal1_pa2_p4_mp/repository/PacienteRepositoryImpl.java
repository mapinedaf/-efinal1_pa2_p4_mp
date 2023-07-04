package uce.edu.efinal1_pa2_p4_mp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.efinal1_pa2_p4_mp.repository.model.Paciente;

@Repository
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public void create(Paciente paciente) {
        this.entityManager.persist(paciente);
    }

    @Override
    public Paciente readPorId(Integer id) {
        return this.entityManager.find(Paciente.class, id);
    }

    @Override
    public void update(Paciente paciente) {
        this.entityManager.merge(paciente);
    }

    @Override
    public void deletePorId(Integer id) {
        this.entityManager.remove(readPorId(id));
    }

    @Override
    public Paciente readPorCedula(String cedula) {
        

        String jpql = "SELECT p FROM Paciente p  WHERE p.cedula = :datoCedula";

        TypedQuery<Paciente> query = this.entityManager.createQuery(jpql, Paciente.class);

        query.setParameter("datoCedula", cedula);

        return query.getSingleResult();

    }
    
}