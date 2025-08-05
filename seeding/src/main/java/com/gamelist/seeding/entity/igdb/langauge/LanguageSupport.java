package com.gamelist.seeding.entity.igdb.langauge;

import com.gamelist.game_service.scraper.models.game.Game;
import com.gamelist.game_service.scraper.models.langauge.Language;
import com.gamelist.game_service.scraper.models.langauge.LanguageSupportType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#language-support

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "language_supports")
public class LanguageSupport {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_support_type_id")
    private LanguageSupportType languageSupportType;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
