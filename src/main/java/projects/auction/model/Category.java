package projects.auction.model;

import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

public class Category {
    private long id;
    private String name;

    @OneToMany(mappedBy = "listing_id")
    private Set<Listing> listings = new HashSet<>();
}
