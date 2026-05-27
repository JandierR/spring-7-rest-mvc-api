package guru.springframework.spring7restmvcapi.model;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonDeserialize(builder = BeerOrderLine.BeerOrderLineBuilder.class)
public class BeerOrderLineDTO {

//    @JsonProperty("id")
    private UUID id;

//    @JsonProperty("version")
    private Long version;

//    @JsonProperty("createdDate")
    private Timestamp createdDate;

//    @JsonProperty("lastModifiedDate")
    private Timestamp lastModifiedDate;

//    @JsonProperty("beer")
    private BeerDTO beer;


//    @JsonProperty("orderQuantity")
    @Min(value = 1, message = "Quantity On Hand must be greater than 0")
    private Integer orderQuantity;

//    @JsonProperty("quantityAllocated")
    private Integer quantityAllocated;

//    @JsonProperty("beerOrderLineStatus")
    private BeerOrderLineStatus beerOrderLineStatus;

}
