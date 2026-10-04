package my_app.mtr_backend_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class MtrClientConfig {

  @Bean
  public RestClient mtrRestClient(){
    return RestClient.builder()
            .baseUrl("https://rt.data.gov.hk/v1/transport/mtr/getSchedule.php")
            .defaultHeader("Accept", "application/json")
            .build();
  }

}