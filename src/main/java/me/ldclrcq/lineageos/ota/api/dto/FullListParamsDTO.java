package me.ldclrcq.lineageos.ota.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullListParamsDTO {
    public String device;
    public List<String> channels;
}
