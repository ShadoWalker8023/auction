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
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

     private String username;
     private String password;
     private String role;

     private String firstName;
     private String lastName;
     private String email;
     private String phone;
     private String address;
     private String addressNumber;
     private String postalCode;

     @OneToMany(mappedBy = "listing_id")
     private Set<Listing> listings = new HashSet<>();

}
