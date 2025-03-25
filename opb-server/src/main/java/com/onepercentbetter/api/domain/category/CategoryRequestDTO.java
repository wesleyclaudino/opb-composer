package com.onepercentbetter.api.domain.category;

import java.util.UUID;

public record CategoryRequestDTO(
        UUID id,
        String name,
        String description
) {
}
