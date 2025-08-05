package com.gamelist.seeding.entity.igdb.event;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#event

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "events")
public class Event {

    @Id
    private int id;

    private String name;
    private String description;
    private String slug;
    private String live_stream_url;
    private String timezone;

    private Instant startTime;
    private Instant endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_logo_id")
    private EventLogo eventLogo;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EventNetwork> eventNetworks;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
