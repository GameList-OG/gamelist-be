package com.gamelist.game_service.scraper.models.age_rating;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating-content-description-v2

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "age_rating_content_descriptions")
public class AgeRatingContentDescription {

    @Id
    private int id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private AgeRatingOrganization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "description_type_id")
    private AgeRatingContentDescriptionType descriptionType;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}