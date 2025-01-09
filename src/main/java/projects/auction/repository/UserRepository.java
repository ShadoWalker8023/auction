package projects.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.auction.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
