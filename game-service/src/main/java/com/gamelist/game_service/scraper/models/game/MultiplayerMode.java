package com.gamelist.game_service.scraper.models.game;

import com.gamelist.game_service.scraper.models.platform.Platform;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

// https://api-docs.igdb.com/#multiplayer-mode

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "multiplayer_modes")
public class MultiplayerMode {

    @Id
    private int id;

    private int offlineCoopMax;
    private int offlineMax;
    private int onlineCoopMax;
    private int onlineMax;
    private boolean campaignCoop;
    private boolean dropIn;
    private boolean lanCoop;
    private boolean offlineCoop;
    private boolean onlineCoop;
    private boolean splitScreen;
    private boolean splitScreenOnline;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    private UUID checksum;
}