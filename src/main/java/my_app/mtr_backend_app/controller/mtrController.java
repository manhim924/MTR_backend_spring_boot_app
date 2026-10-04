// src/main/java/my_app/mtr_backend_app/controller/mtrController.java
package my_app.mtr_backend_app.controller;

import my_app.mtr_backend_app.service.mtrService;
import my_app.mtr_backend_app.DTO.mtrAPIResponseDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mtr")
public class mtrController{

  private final mtrService mtrService;

  public mtrController(mtrService mtrService){
    this.mtrService = mtrService;
  }

  @GetMapping("/schedule/{line}/{sta}")
  public ResponseEntity<mtrAPIResponseDTO> get_schedule_by_line(
          @PathVariable("line") String line,
          @PathVariable("sta") String station
  ){
    mtrAPIResponseDTO response = mtrService.getRawSchedule(line, station);
    return ResponseEntity.ok(response);
  }
}