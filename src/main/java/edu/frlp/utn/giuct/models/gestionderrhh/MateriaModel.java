package edu.frlp.utn.giuct.models.gestionderrhh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "materia")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String dedicacion;
    @OneToOne(fetch=FetchType.EAGER, optional=true, cascade=CascadeType.ALL)
    private CargoModel cargo;
}
