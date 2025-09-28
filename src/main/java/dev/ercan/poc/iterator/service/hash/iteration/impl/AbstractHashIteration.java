package dev.ercan.poc.iterator.service.hash.iteration.impl;

import dev.ercan.poc.iterator.service.hash.iteration.HashIteration;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

abstract class AbstractHashIteration implements HashIteration {

  private final MessageDigest md;

  {
    try {
      md = MessageDigest.getInstance(getHashType().getAlgorithm());
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  public String hash(String input) {
    byte[] messageDigest = md.digest(input.getBytes());

    // Convert byte array into signum representation
    BigInteger no = new BigInteger(1, messageDigest);

    // Convert message digest into hex value
    StringBuilder output = new StringBuilder(no.toString(16));

    while (output.length() < getHashType().getHexStringLength()) {
      output.insert(0, "0");
    }

    return output.toString();
  }

}
