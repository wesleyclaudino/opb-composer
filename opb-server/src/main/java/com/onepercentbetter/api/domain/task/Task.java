package com.onepercentbetter.api.domain.task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.onepercentbetter.api.domain.category.Category;
import jakarta.persistence.*;
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

    /* TODO: Quero mapear mais estados, inicialmente será String mas posteriormente será Enum */
    private String state;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime reminderDate;

    @JsonIgnoreProperties("tasks")
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
