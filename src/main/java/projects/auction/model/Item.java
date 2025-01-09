package projects.auction.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

public class Item {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private int price;
    private int quantity;
    private long step;

    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;
}
