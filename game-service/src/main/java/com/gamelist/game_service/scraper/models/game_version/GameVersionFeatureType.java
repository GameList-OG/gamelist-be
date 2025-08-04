package com.gamelist.game_service.scraper.models.game_version;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameVersionFeatureType {
    BOOLEAN(0),
    DESCRIPTION(1);

    private final int value;
}
