// src/main/java/my_app/mtr_backend_app/DTO/mtrStationDataDTO.java
package my_app.mtr_backend_app.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record mtrStationDataDTO(
        @JsonProperty("curr_time") String current_time,
        @JsonProperty("sys_time") String system_time,
        @JsonProperty("UP") List<mtrTrainDataDTO> up,
        @JsonProperty("DOWN") List<mtrTrainDataDTO> down
) {
}