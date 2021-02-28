package edu.frlp.utn.giuct.models.reportes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MetricsModel {
    private Long tesisLicenciaturaCreadas;
    private Long TesisPostgradoCreadas;
    private Long practicasProfesionalizantesCreadas;
    private Long practicasSupervisadasCreadas;
    private Long ensayosDeCatedraCreadas;
    private Long proyectosFinalesCreados;
    private Long totalDeTesis;
    private Long totalDePracticas;
}
