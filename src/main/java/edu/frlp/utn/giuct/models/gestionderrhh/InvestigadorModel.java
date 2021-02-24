package edu.frlp.utn.giuct.models.gestionderrhh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "investigador")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvestigadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String categoriaDeInvestigador;
    private String tipoDeInvestigador;
    private String cantidadDeHoras;
    private String fechaDeObtencionDeCategoria;
    private String numeroDeResolucion;
}
