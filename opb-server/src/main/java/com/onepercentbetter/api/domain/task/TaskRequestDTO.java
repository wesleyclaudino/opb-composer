package com.onepercentbetter.api.domain.task;

import java.time.LocalDateTime;

public record TaskRequestDTO(
        String name,
        String description,
//        List<Category> categoryList,
        String state,
        LocalDateTime creationDate,
        LocalDateTime lastUpdateDate,
        LocalDateTime reminderDate
) {
}
