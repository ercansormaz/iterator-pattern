package dev.ercan.poc.iterator.service.hash.iteration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ercan.poc.iterator.service.hash.iteration.impl.SHA384HashIteration;
import org.junit.jupiter.api.Test;

public class SHA384HashIterationTest {

  private final HashIteration iteration = new SHA384HashIteration();

  @Test
  void shouldHashTextWithSHA384() {
    String result = iteration.hash("hello");
    assertEquals(
        "59e1748777448c69de6b800d7a33bbfb9ff1b463e44354c3553bcdb9c666fa90125a3c79f90397bdf5f6a13de828684f",
        result);
  }

}
