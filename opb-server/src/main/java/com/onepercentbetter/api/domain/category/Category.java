package com.onepercentbetter.api.domain.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.onepercentbetter.api.domain.task.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "category")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String description;

    @JsonIgnoreProperties("category")
    @OneToMany(mappedBy = "category")
    private List<Task> tasks;
}
