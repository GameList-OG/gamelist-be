package com.gamelist.seeding.entity.igdb;

import com.gamelist.game_service.scraper.models.event.EventNetwork;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#network-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "network_types")
public class NetworkType {

    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "networkType", fetch = FetchType.LAZY)
    private Set<EventNetwork> events;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
