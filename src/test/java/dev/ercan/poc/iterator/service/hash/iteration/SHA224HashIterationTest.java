package dev.ercan.poc.iterator.service.hash.iteration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ercan.poc.iterator.service.hash.iteration.impl.SHA224HashIteration;
import org.junit.jupiter.api.Test;

class SHA224HashIterationTest {

  private final HashIteration iteration = new SHA224HashIteration();

  @Test
  void shouldHashTextWithSHA224() {
    String result = iteration.hash("hello");
    assertEquals("ea09ae9cc6768c50fcee903ed054556e5bfc8347907f12598aa24193", result);
  }

}
