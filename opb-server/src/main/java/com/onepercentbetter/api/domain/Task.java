package com.onepercentbetter.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "task")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String description;
    /* TODO: Quero mapear as categorias do evento, inicialmente será String mas posteriormente será Enum */
    private String category;
    /* TODO: Quero mapear mais estados, inicialmente será String mas posteriormente será Enum */
    private String state;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime reminderDate;
}
