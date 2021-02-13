package edu.frlp.utn.giuct.models.fuentesDeFinanciamiento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "fuentedefinanciamiento")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuenteDeFinanciamientoModel {
    @Id
    private String fuente;
}
