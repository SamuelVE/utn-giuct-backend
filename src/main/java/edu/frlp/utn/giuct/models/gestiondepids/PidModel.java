package edu.frlp.utn.giuct.models.gestiondepids;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pids")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PidModel {
    @Id
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
