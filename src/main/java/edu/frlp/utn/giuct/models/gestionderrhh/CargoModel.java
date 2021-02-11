package edu.frlp.utn.giuct.models.gestionderrhh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cargo")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CargoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cargo;
}
