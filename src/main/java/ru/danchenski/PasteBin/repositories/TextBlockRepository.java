package ru.danchenski.PasteBin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.danchenski.PasteBin.entities.TextBlockEntity;

@Repository
public interface TextBlockRepository extends JpaRepository<TextBlockEntity, Long> {
}
