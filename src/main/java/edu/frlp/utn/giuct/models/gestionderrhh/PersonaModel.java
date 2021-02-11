package edu.frlp.utn.giuct.models.gestionderrhh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    private String direccionPostal;
    private String telefono;
    @OneToOne(fetch=FetchType.EAGER, optional=true, cascade=CascadeType.ALL) private PasaporteModel pasaporte;
    @OneToOne(fetch=FetchType.EAGER, optional=true, cascade=CascadeType.ALL) private InvestigadorModel investigador;
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL) private List<MateriaModel> materias;
}
