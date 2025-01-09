package projects.auction.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "listings")

public class Listing {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long listingId;
    private String title;
    private String description;
    private String startDate;
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "item")
    private Set<Item> items = new HashSet<>();


}
