package com.gamelist.game_service.scraper.models.age_rating;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating-category
public record AgeRatingCategory(int id, String rating, AgeRatingOrganization organization, Instant createdAt, Instant updatedAt, UUID checksum) { }
