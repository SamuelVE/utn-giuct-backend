package edu.frlp.utn.giuct.models.gestiondeformacionacademica;

import edu.frlp.utn.giuct.models.fuentesdefinanciamiento.FuenteDeFinanciamientoModel;
import edu.frlp.utn.giuct.models.gestiondepids.PidModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "practica")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PracticaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fechaInicio;
    private String fechaFinal;
    private String catedra;
    private String universidad;
    private String escuela;
    private String director;
    private String carrera;
    private String titulo;
    private String tutor;
    private String docente;

    @OneToOne private TipoDePracticaEnumModel tipoDePractica;
    @OneToOne private PidModel vinculacionConProyecto;
    @OneToOne private FuenteDeFinanciamientoModel fuenteDeFinanciamiento;
    @OneToOne private PersonaModel persona;
}
