package com.gamelist.seeding.entity.igdb.company;

import com.gamelist.seeding.entity.igdb.DateFormat;
import com.gamelist.seeding.entity.igdb.game_engine.GameEngine;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#company

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "companies")
public class Company {

    @Id
    private int id;

    private String name;
    private String description;
    private String slug;
    private String url;
    private int country;
    private Instant changeDate;
    private Instant startDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "start_date_format_id")
    private DateFormat startDateFormat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "change_date_format_id")
    private DateFormat changeDateFormat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "changed_company_id")
    private Company changedCompanyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_company_id")
    private Company parentCompanyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "logo_id")
    private CompanyLogo logo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private CompanyStatus status;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CompanyWebsite> websites;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<InvolvedCompany> involvedCompanies;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "company_game_engines",
            joinColumns = @JoinColumn(name = "game_engine_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    private Set<GameEngine> gameEngines;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
