package edu.frlp.utn.giuct.customMappers.gestiondeformacionacademica;

import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface PracticaMapper {
    void updatePracticaFromResponse(PracticaModel dto, @MappingTarget PracticaModel entity);
}
