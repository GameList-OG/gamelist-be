package com.gamelist.game_service.scraper.models.age_rating;

import com.google.common.collect.ImmutableList;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating
public record AgeRating(int id, String ratingCoverURL, String synopsis,
                        AgeRatingOrganization organization,
                        AgeRatingCategory category,
                        ImmutableList<AgeRatingContentDescription> ratingContentDescriptions,
                        Instant createdAt, Instant updatedAt, UUID checksum) {
}
