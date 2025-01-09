package projects.auction.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "items")

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
