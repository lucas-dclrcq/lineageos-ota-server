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
public class FullListDTO {
    public String method;

    public FullListParamsDTO params;

    @JsonProperty("source_incremental")
    public String sourceIncremental;
}
