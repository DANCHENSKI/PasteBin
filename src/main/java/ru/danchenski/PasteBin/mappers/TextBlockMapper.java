package ru.danchenski.PasteBin.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import ru.danchenski.PasteBin.entities.TextBlockEntity;
import ru.danchenski.PasteBin.models.TextBlockDTO;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TextBlockMapper {
    List<TextBlockDTO> toTextBlockDTOs(List<TextBlockEntity> textBlockEntities);

    TextBlockEntity toTextBlockEntity(TextBlockDTO textBlockDTO);

    TextBlockDTO toTextBlockDTO(TextBlockEntity textBlockEntity);
}

