package uce.edu.efinal1_pa2_p4_mp.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import uce.edu.efinal1_pa2_p4_mp.repository.model.CitaMedica;

public interface CitaMedicaService {
    public void registrarCitaMedica(
            Integer numeroCita,
            LocalDate fechaCita,
            BigDecimal valorCita,
            String lugarCita,
            String cedulaDoctor,
            String cedulaPaciente);

    public CitaMedica buscarCitaMedicaPorId(Integer id);

    public void actualizarCitaMedica(Integer numeroCita, String diagnostico, String Receta, LocalDate fechaProximaCita);

    public void eliminarCitaMedicaPorId(Integer id);
}
