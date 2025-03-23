package com.onepercentbetter.api.domain.examples;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "example")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JoinnerClassExample {
    @Id
    @GeneratedValue
    private UUID id;

    /*

    // Exemplo de relação 1p1
    @OneToOne
    @JoinColumn(name = "task")
    private Task task;

    // Exemplo de relação Xp1
    @ManyToOne
    @JoinColumn(name = "taskManyToOne")
    private Task taskManyToOne;

    // Exemplo de relação 1pX
    @OneToMany
    @JoinColumn(name = "taskOneToMany")
    private List<Task> taskOneToMany;

    // Exemplo de relação XpX
    @ManyToMany
    @JoinTable(
            name = "task",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "taskManyToManyExample1")
    )
    private List<Task> taskManyToManyExample1;

    // Mapeamento bidirecional de relação XpX
    @ManyToMany(mappedBy = "taskManyToManyExample1")
    private List<Task> taskManyToManyExample2;

    */
}
