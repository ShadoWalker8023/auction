package projects.auction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "categories")
public class Category {
    private long id;
    private String name;

    @OneToMany(mappedBy = "listing_id")
    private Set<Listing> listings = new HashSet<>();
}
