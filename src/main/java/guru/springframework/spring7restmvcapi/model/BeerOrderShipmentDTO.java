package guru.springframework.spring7restmvcapi.model;

import jakarta.validation.constraints.NotBlank;
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
//@JsonDeserialize(builder = BeerOrderShipmentDTO.BeerOrderShipmentDTOBuilder.class)
public class BeerOrderShipmentDTO {

//    @JsonProperty("id")
    private UUID id;

//    @JsonProperty("version")
    private Long version;

//    @JsonProperty("trackingNumber")
    @NotBlank
    private String trackingNumber;

//    @JsonProperty("createdDate")
    private Timestamp createdDate;

//    @JsonProperty("lastModifiedDate")
    private Timestamp lastModifiedDate;
}
