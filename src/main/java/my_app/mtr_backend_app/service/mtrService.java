// src/main/java/my_app/mtr_backend_app/service/MtrService.java
package my_app.mtr_backend_app.service;

import my_app.mtr_backend_app.DTO.mtrAPIResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class mtrService {

  private final RestClient mtrRestClient;

  public mtrService(RestClient mtrRestClient){
    this.mtrRestClient = mtrRestClient;
  }

  public mtrAPIResponseDTO getRawSchedule(String line , String station){
    return mtrRestClient.get()
            .uri(uriBuilder -> uriBuilder
                    .queryParam("line", line)
                    .queryParam("sta", station)
                    .build()
            )
            .retrieve()
            .body(mtrAPIResponseDTO.class);
  }

}