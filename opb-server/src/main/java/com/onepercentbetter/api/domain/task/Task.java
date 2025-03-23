package com.onepercentbetter.api.domain.task;

import com.onepercentbetter.api.domain.category.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
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

    @ManyToMany
    @JoinTable(
            name = "task_categories",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;

    /* TODO: Quero mapear mais estados, inicialmente será String mas posteriormente será Enum */
    private String state;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime reminderDate;
}
