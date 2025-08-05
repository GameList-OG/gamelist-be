package com.gamelist.seeding.entity.igdb.website;

import com.gamelist.seeding.entity.igdb.game.Game;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#website

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "websites")
public class Website {

    @Id
    private int id;

    private String url;
    private boolean trusted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "website_type_id")
    private WebsiteType websiteType;

    private UUID checksum;
}
