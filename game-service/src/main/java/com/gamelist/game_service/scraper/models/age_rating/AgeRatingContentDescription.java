package com.gamelist.game_service.scraper.models.age_rating;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating-content-description-v2
public record AgeRatingContentDescription(int id, String description,
                                          AgeRatingOrganization organization,
                                          AgeRatingContentDescriptionType descriptionType,
                                          Instant createdAt, Instant updatedAt, UUID checksum) {
}
