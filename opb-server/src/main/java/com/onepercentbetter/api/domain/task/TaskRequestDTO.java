package com.onepercentbetter.api.domain.task;

import com.onepercentbetter.api.domain.category.Category;

import java.time.LocalDateTime;
import java.util.List;

public record TaskRequestDTO(
        String name,
        String description,
        List<Category> categoryList,
        String state,
        LocalDateTime creationDate,
        LocalDateTime lastUpdateDate,
        LocalDateTime reminderDate
) {
}
