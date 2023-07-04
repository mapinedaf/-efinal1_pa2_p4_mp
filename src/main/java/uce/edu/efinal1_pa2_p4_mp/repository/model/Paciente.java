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
@Table(name = "paciente")
public class Paciente {

    @GeneratedValue(generator = "sec_paciente", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sec_paciente", sequenceName = "sec_paciente", allocationSize = 1)
    @Id
    @Column(name = "paci_id")
    private Integer id;

    @Column(name = "paci_cedula")
    private String cedula;

    @Column(name = "paci_nombre")
    private String nombre;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "paci_codigo_seguro")
    private String codigoSeguro;

    @Column(name = "paci_estatura")
    private Double estatura;




    @Column(name = "paci_peso")
    private Double peso;


    @Column(name = "paci_genero")
    private Character genero;


    @OneToMany(mappedBy = "paciente")
    private List <CitaMedica> citas;


        @Override
    public String toString() {
        return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNacimiento=" + fechaNacimiento + ", codigoSeguro=" + codigoSeguro + ", estatura=" + estatura
                + ", peso=" + peso + ", genero=" + genero + "]";
    }
}
