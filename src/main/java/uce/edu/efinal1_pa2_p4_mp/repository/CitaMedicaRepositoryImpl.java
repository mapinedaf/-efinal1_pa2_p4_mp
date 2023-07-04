package uce.edu.efinal1_pa2_p4_mp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.efinal1_pa2_p4_mp.repository.model.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public void create(CitaMedica citaMedica) {
        this.entityManager.persist(citaMedica);
    }

    @Override
    public CitaMedica readPorId(Integer id) {
        return this.entityManager.find(CitaMedica.class, id);
    }

    @Override
    public void update(CitaMedica citaMedica) {
       this.entityManager.merge(citaMedica);
    }

    @Override
    public void deletePorId(Integer id) {
        this.entityManager.remove(readPorId(id));
    }

    @Override
    public CitaMedica readPorNumero(Integer numeroCita) {
        String jpql = "SELECT c FROM CitaMedica c  WHERE c.numeroCita = :datoNumero";

        TypedQuery<CitaMedica> query = this.entityManager.createQuery(jpql, CitaMedica.class);

        query.setParameter("datoNumero", numeroCita);

        return query.getSingleResult();
    }
    
}