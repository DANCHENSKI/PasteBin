package ru.danchenski.PasteBin.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "textblock", schema = "pastebin")
public class TextBlockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
}
