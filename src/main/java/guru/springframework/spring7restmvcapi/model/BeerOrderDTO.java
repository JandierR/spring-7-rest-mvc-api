package guru.springframework.spring7restmvcapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonDeserialize(builder = BeerOrderDTO.BeerOrderDTOBuilder.class)
public class BeerOrderDTO {

//    @JsonProperty("id")
    private UUID id;

//    @JsonProperty("version")
    private Long version;

//    @JsonProperty("createdDate")
    private Timestamp createdDate;

//    @JsonProperty("lastModifiedDate")
    private Timestamp lastModifiedDate;

//    @JsonProperty("customerRef")
    private String customerRef;

//    @JsonProperty("customer")
    private CustomerDTO customerDTO;

//    @JsonProperty("beerOrderLines")
    private Set<BeerOrderLineDTO> beerOrderLines;

//    @JsonProperty("beerOrderShipment")
    private BeerOrderShipmentDTO beerOrderShipment;

//    @JsonProperty("paymentAmount")
    private BigDecimal paymentAmount;
}
