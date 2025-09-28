package dev.ercan.poc.iterator.service.hash;

import dev.ercan.poc.iterator.dto.request.HashRequest;
import dev.ercan.poc.iterator.dto.response.HashResponse;
import dev.ercan.poc.iterator.enums.HashType;
import dev.ercan.poc.iterator.service.hash.iteration.HashIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HashService {

  private final HashIterator hashIterator;

  public List<HashResponse> hash(HashRequest request) {
    Map<HashType, String> result = hashIterator.hash(request.text());

    return result.keySet().stream()
        .sorted(Comparator.comparingInt(e -> e.getHexStringLength()))
        .map(s -> new HashResponse(s.getAlgorithm(), result.get(s)))
        .toList();
  }

}
