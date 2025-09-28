package dev.ercan.poc.iterator.controller;

import dev.ercan.poc.iterator.dto.request.HashRequest;
import dev.ercan.poc.iterator.dto.response.HashResponse;
import dev.ercan.poc.iterator.service.hash.HashService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hash")
public class HashController {

  private final HashService hashService;

  @PostMapping
  public List<HashResponse> hash(@RequestBody HashRequest request) {
    return hashService.hash(request);
  }

}
