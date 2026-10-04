// src/main/java/my_app/mtr_backend_app/config/uiPropertiesConfig.java
package my_app.mtr_backend_app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("spring")
@Getter
@Setter
public class uiPropertiesConfig {

  private List<MTR_line_option> mtr_line;

  @Getter
  @Setter
  public static class MTR_line_option{
    private String label;
    private String value;
  }
}