package com.gamelist.game_service.scraper.models.langauge;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#language

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "languages")
public class Language {

    @Id
    private int id;

    private String name;
    private String nativeName;
    private String locale;

    @OneToMany(mappedBy = "language")
    private Set<LanguageSupport> languageSupports;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}