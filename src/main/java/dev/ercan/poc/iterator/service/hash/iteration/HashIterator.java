package dev.ercan.poc.iterator.service.hash.iteration;

import dev.ercan.poc.iterator.enums.HashType;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HashIterator {

  private final List<HashIteration> hashIterations;

  public Map<HashType, String> hash(String text) {
    Map<HashType, String> result = new EnumMap<>(HashType.class);

    for (HashIteration hashIteration : hashIterations) {
      result.put(hashIteration.getHashType(), hashIteration.hash(text));
    }

    return result;
  }

}
