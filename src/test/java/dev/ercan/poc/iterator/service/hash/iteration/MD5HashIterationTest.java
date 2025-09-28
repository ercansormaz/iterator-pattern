package dev.ercan.poc.iterator.service.hash.iteration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ercan.poc.iterator.service.hash.iteration.impl.MD5HashIteration;
import org.junit.jupiter.api.Test;

public class MD5HashIterationTest {

  private final HashIteration iteration = new MD5HashIteration();

  @Test
  void shouldHashTextWithMD5() {
    String result = iteration.hash("hello");
    assertEquals("5d41402abc4b2a76b9719d911017c592", result);
  }

}
