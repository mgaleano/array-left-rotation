package com.falabella;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Left Rotation.
 */
public class ArrayRotatorTest {

  @Test
  public void testOneLeftRotation() {
    Assert.assertArrayEquals("Array is not well rotated",
        new int[]{2, 3, 4, 5, 1},
        ArrayRotator.leftRotation(new int[]{1, 2, 3, 4, 5}, 1));
  }

  @Test
  public void testTwoLeftRotations() {
    Assert.assertArrayEquals("Array is not well rotated",
        new int[]{5, 7, 9, 1, 3},
        ArrayRotator.leftRotation(new int[]{1, 3, 5, 7, 9}, 2));
  }

  @Test
  public void testThreeLeftRotations() {
    Assert.assertArrayEquals("Array is not well rotated",
        new int[]{6, 8, 0, 2, 4},
        ArrayRotator.leftRotation(new int[]{0, 2, 4, 6, 8}, 3));
  }
}
