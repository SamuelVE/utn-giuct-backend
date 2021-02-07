package edu.frlp.utn.giuct.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "perfilinvestigador")
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
}
