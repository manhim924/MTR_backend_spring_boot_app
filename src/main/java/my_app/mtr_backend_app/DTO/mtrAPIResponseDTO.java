package my_app.mtr_backend_app.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public record mtrAPIResponseDTO(
        @JsonProperty("sys_time") String system_time,
        @JsonProperty("curr_time") String current_time,
        @JsonProperty("data") Map<String, mtrStationDataDTO> data,
        @JsonProperty("isdelay") String is_delay,
        @JsonProperty("status") Integer status,
        @JsonProperty("message") String message
) {
}