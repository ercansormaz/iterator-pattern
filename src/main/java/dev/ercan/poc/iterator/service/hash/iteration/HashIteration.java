package dev.ercan.poc.iterator.service.hash.iteration;

import dev.ercan.poc.iterator.enums.HashType;

public interface HashIteration {

  String hash(String text);
  HashType getHashType();

}
