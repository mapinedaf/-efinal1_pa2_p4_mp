package uce.edu.efinal1_pa2_p4_mp.repository.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "cita_medica")


public class CitaMedica {
    @GeneratedValue(generator = "sec_cita_medica", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sec_cita_medica", sequenceName = "sec_cita_medica", allocationSize = 1)
    @Id
    @Column(name = "cime_id")
    private Integer id;

    @Column(name = "cime_numero_cita")
    private Integer numeroCita;

    @Column(name = "cime_fecha_cita")
    private LocalDate fechaCita;

    @Column(name = "cime_valor_cita")
    private BigDecimal valorCita;

    @Column(name = "cime_lugar_cita")
    private String lugarCita;

    @Column(name = "cime_diagnostico")
    private String diagnostico;


    @Column(name = "cime_receta")
    private String receta;

    @Column(name = "cime_fecha_proxima_cita")
    private LocalDate fechaProximaCita;


    @ManyToOne()
    @JoinColumn(name="cime_doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="cime_paciente_id")
    private Paciente paciente;

}
