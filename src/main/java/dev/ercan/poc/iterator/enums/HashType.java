package dev.ercan.poc.iterator.enums;

import lombok.Getter;

@Getter
public enum HashType {

  MD5("MD5", 32),
  SHA1("SHA-1", 40),
  SHA224("SHA-224", 56),
  SHA256("SHA-256", 64),
  SHA384("SHA-384", 96),
  SHA512("SHA-512", 128),
  SHA3_224("SHA3-224", 56),
  SHA3_256("SHA3-256", 64),
  SHA3_384("SHA3-384", 96),
  SHA3_512("SHA3-512", 128),
  ;

  private final String algorithm;
  private final int hexStringLength;

  HashType(String algorithm, int hexStringLength) {
    this.algorithm = algorithm;
    this.hexStringLength = hexStringLength;
  }

}
