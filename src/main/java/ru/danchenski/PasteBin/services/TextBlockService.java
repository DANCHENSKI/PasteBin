package ru.danchenski.PasteBin.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danchenski.PasteBin.entities.TextBlockEntity;
import ru.danchenski.PasteBin.mappers.TextBlockMapper;
import ru.danchenski.PasteBin.models.TextBlockDTO;
import ru.danchenski.PasteBin.repositories.TextBlockRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TextBlockService {

    private final TextBlockRepository textBlockRepository;
    private final TextBlockMapper textBlockMapper;

    public List<TextBlockDTO> getAll() {
        return textBlockMapper.toTextBlockDTOs(textBlockRepository.findAll());
    }

//    public TextBlockDTO getById(Long id) {
//        return textBlockMapper.toTextBlockDTO(textBlockRepository.findById(id));
//    }

    public void save(TextBlockDTO textBlockDTO) {
        textBlockRepository.save(textBlockMapper.toTextBlockEntity(textBlockDTO));
    }

    public void updateById(TextBlockDTO textBlockDTO, Long id) {
        TextBlockEntity textBlockEntity = textBlockRepository.findById(id).orElseThrow();
        textBlockEntity.setText(textBlockDTO.getText());
        textBlockRepository.save(textBlockEntity);
    }

    public void deleteById(Long id) {
        textBlockRepository.deleteById(id);
    }
}
