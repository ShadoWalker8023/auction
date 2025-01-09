package projects.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.auction.model.Listing;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
