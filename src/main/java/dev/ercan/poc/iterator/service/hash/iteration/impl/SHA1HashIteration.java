package dev.ercan.poc.iterator.service.hash.iteration.impl;

import dev.ercan.poc.iterator.enums.HashType;
import org.springframework.stereotype.Component;

@Component
public class SHA1HashIteration extends AbstractHashIteration {

  @Override
  public HashType getHashType() {
    return HashType.SHA1;
  }

}
