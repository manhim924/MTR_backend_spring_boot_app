package my_app.mtr_backend_app.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public record mtrTrainDataDTO(
        @JsonProperty("seq") String seq,
        @JsonProperty("dest") String destination,
        @JsonProperty("plat") String platform_index,
        @JsonProperty("time") String arrive_time,
        @JsonProperty("ttnt") String time_to_next_train,
        @JsonProperty("valid") String valid,
        @JsonProperty("source") String source
) {
}