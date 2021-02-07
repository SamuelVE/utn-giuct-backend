package edu.frlp.utn.giuct.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String cuil;
    private String direccionPostal;
    private String emailInstitucional;
    private String emailPersonal;
    private String telefono;
    @OneToOne private PasaporteModel pasaporte;
    @OneToOne private InvestigadorModel investigador;
}
