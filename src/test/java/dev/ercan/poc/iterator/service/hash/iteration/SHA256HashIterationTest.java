package dev.ercan.poc.iterator.service.hash.iteration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ercan.poc.iterator.service.hash.iteration.impl.SHA256HashIteration;
import org.junit.jupiter.api.Test;

class SHA256HashIterationTest {

  private final HashIteration iteration = new SHA256HashIteration();

  @Test
  void shouldHashTextWithSHA256() {
    String result = iteration.hash("hello");
    assertEquals("2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824", result);
  }

}
