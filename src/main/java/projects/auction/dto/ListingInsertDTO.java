package projects.auction.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ListingInsertDTO {
    private String title;
    private String description;
    private String price;
    private String startDate;
    private String endDate;
}
