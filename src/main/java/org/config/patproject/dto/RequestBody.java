package org.config.patproject.dto;

import lombok.Builder;

@Builder
public record RequestBody(String response, int Id) {
}
