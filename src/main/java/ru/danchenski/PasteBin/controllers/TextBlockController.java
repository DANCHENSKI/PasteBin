package ru.danchenski.PasteBin.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.danchenski.PasteBin.models.TextBlockDTO;
import ru.danchenski.PasteBin.services.TextBlockService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/textblock")
public class TextBlockController {

    private final TextBlockService textBlockService;

    @GetMapping
    public List<TextBlockDTO> getAll() {
        return textBlockService.getAll();
    }

//    @GetMapping("/{id}")
//    public TextBlockDTO getById(@PathVariable Long id) {
//        return textBlockService.getById(id);
//    }

    @PutMapping("/{id}")
    public void updateById(@RequestBody @Valid TextBlockDTO textBlockDTO, @PathVariable("id") Long id) {
        textBlockService.updateById(textBlockDTO, id);
    }

    @PostMapping
    public void save(@RequestBody @Valid TextBlockDTO textBlockDTO) {
        textBlockService.save(textBlockDTO);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long id) {
        textBlockService.deleteById(id);
    }
}
