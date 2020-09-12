package me.ldclrcq.lineageos.ota.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeltaListDTO {
    @JsonProperty("source_incremental")
    private String sourceIncremental;
    @JsonProperty("target_incremental")
    private String targetIncremental;
}
