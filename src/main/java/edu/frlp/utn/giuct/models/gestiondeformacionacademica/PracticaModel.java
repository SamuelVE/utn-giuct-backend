package edu.frlp.utn.giuct.models.gestiondeformacionacademica;

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
    private String fechaInicioEnMillis;
    private String fechaFinalEnMillis;
    private String catedra;
    private String universidad;
    private String escuela;
    private String director;
    private String carrera;
    private String titulo;
    private String tutor;
    private String docente;

    private String tipoDePractica;
    private String vinculacionConProyecto;
    private String fuenteDeFinanciamiento;
    private Integer persona;
}
