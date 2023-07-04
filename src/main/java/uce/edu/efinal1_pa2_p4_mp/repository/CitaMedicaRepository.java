package uce.edu.efinal1_pa2_p4_mp.repository;

import uce.edu.efinal1_pa2_p4_mp.repository.model.CitaMedica;


public interface CitaMedicaRepository {
    public void create(CitaMedica citaMedica);
    public CitaMedica readPorId(Integer id);
    public void update(CitaMedica citaMedica);
    public void deletePorId(Integer id);

    public CitaMedica readPorNumero(Integer numero);
}
