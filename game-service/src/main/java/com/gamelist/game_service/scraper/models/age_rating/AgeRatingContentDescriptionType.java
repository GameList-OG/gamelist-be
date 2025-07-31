package com.gamelist.game_service.scraper.models.age_rating;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating-content-description-type
public record AgeRatingContentDescriptionType(int id, String name, String slug, Instant createdAt, Instant updatedAt, UUID checksum) {  }
