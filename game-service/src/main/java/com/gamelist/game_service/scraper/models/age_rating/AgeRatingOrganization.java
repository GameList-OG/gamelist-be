package com.gamelist.game_service.scraper.models.age_rating;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating-organization
public record AgeRatingOrganization(int id, String name, Instant createdAt, Instant updatedAt, UUID checksum) {  }
