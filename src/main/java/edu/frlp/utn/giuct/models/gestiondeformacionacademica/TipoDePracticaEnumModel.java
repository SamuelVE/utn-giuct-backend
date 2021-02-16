package edu.frlp.utn.giuct.models.gestiondeformacionacademica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "practicaenum")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoDePracticaEnumModel {
    @Id
    private String tipoDePractica;
}
