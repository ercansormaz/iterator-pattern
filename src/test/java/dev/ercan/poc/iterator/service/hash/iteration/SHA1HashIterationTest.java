package dev.ercan.poc.iterator.service.hash.iteration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ercan.poc.iterator.service.hash.iteration.impl.SHA1HashIteration;
import org.junit.jupiter.api.Test;

public class SHA1HashIterationTest {

  private final HashIteration iteration = new SHA1HashIteration();

  @Test
  void shouldHashTextWithSHA1() {
    String result = iteration.hash("hello");
    assertEquals("aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d", result);
  }

}
