package projects.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.auction.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
