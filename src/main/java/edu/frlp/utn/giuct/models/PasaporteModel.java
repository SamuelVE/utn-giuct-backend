package edu.frlp.utn.giuct.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pasaporte")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasaporteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String numero;
    private String fechaDeVencimiento;
}
