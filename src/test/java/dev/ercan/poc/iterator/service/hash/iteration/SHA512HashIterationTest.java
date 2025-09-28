package dev.ercan.poc.iterator.service.hash.iteration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ercan.poc.iterator.service.hash.iteration.impl.SHA512HashIteration;
import org.junit.jupiter.api.Test;

public class SHA512HashIterationTest {

  private final HashIteration iteration = new SHA512HashIteration();

  @Test
  void shouldHashTextWithSHA512() {
    String result = iteration.hash("hello");
    assertEquals(
        "9b71d224bd62f3785d96d46ad3ea3d73319bfbc2890caadae2dff72519673ca72323c3d99ba5c11d7c7acc6e14b8c5da0c4663475c2e5c3adef46f73bcdec043",
        result);
  }

}
