package com.gamelist.game_service.scraper.models.game_version;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameVersionFeatureValueType {

    NOT_INCLUDED(0),
    INCLUDED(1),
    PRE_ORDER_ONLY(2);

    private final int value;
}
