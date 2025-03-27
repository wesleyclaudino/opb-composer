package com.onepercentbetter.api.domain.task;

import com.onepercentbetter.api.domain.category.Category;

import java.time.LocalDateTime;

public record TaskRequestDTO(
        String name,
        String description,
        String state,
        LocalDateTime creationDate,
        LocalDateTime lastUpdateDate,
        LocalDateTime reminderDate,
        Category category
) {
}
