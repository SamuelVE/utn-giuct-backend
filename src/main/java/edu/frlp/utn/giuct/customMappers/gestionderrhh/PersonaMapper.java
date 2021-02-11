package edu.frlp.utn.giuct.customMappers.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface PersonaMapper {
    void updatePersonaFromResponse(PersonaModel dto, @MappingTarget PersonaModel entity);
}
