package com.gamelist.game_service.scraper.models.age_rating;

import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#age-rating

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "age_ratings")
public class AgeRating {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "rating_cover_url")
    private String ratingCoverURL;

    @Column(columnDefinition = "TEXT")
    private String synopsis;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private AgeRatingOrganization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private AgeRatingCategory category;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "age_rating_to_content_description",
            joinColumns = @JoinColumn(name = "age_rating_id"),
            inverseJoinColumns = @JoinColumn(name = "content_description_id")
    )
    private Set<AgeRatingContentDescription> ratingContentDescriptions = new HashSet<>();

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}