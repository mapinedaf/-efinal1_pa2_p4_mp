package uce.edu.efinal1_pa2_p4_mp.repository.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "doctor")
public class Doctor {

    @GeneratedValue(generator = "sec_doctor", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sec_doctor", sequenceName = "sec_doctor", allocationSize = 1)
    @Id
    @Column(name = "doct_id")
    private Integer id;

    @Column(name = "doct_cedula")
    private String cedula;

    @Column(name = "doct_nombre")
    private String nombre;

    @Column(name = "doct_apellido")
    private String apellido;

    @Column(name = "doct_fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "doct_numero_consultorio")
    private String numeroConsultorio;

    @Column(name = "doct_codigo_senecyt")
    private String codigoSenecyt;

    @Column(name = "doct_genero")
    private Character genero;

    @OneToMany(mappedBy = "doctor")
    private List <CitaMedica> citas;

}
