package edu.frlp.utn.giuct.setup;

import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DownloadFileFromBytes {
    public static void mapObjectsToCsv(String fileName, HttpServletResponse response, List<PracticaModel> dataList) throws IOException {
        response.setContentType("text/csv");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename="+fileName;
        response.setHeader(headerKey, headerValue);

        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.EXCEL_PREFERENCE);
        String[] csvHeader = {"Titulo", "NombreDePersona", "FechaDeInicio","FechaFinal","Carrera", "FuenteDeFinanciamiento", "ProyectoVinculado"};
        String[] nameMapping = {"titulo", "persona", "fechaInicio","fechaFinal","carrera", "fuenteDeFinanciamiento", "vinculacionConProyecto"};

        csvWriter.writeHeader(csvHeader);

        for (PracticaModel practica : dataList) {
            csvWriter.write(practica, nameMapping);
        }

        csvWriter.close();
        //<a th:href="/@{/users/export}">Export to CSV</a>
    }
}
