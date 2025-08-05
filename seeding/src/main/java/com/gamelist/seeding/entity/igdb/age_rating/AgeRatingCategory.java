package com.gamelist.seeding.entity.igdb.age_rating;

import com.gamelist.game_service.scraper.models.age_rating.AgeRatingOrganization;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating-category

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "age_rating_categories")
public class AgeRatingCategory {

    @Id
    private int id;

    private String rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "age_rating_organization_id")
    private AgeRatingOrganization organization;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
