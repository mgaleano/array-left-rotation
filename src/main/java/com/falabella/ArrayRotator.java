package com.falabella;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Rotates, to the left or right, n times the elements of an array of integers.
 */
public class ArrayRotator {

  public static void main(String[] args) {
    int d = Integer.parseInt(args[0]);
    int[] a = ArrayRotator.toIntArray(args[1]);
    int[] result = leftRotation(a, d);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
    }
    System.out.println("");
  }

  /**
   * Converts the input of the program from the string format as "1 2" to an array of integers containing each integer.
   * @param input the string argument passed to the program
   * @return an array of integer from the split string by the space character
   */
  private static int[] toIntArray(String input) {
    int[] output = new int[input.split(" ").length];
    int x = 0;
    for (String i : input.split(" ")) {
      output[x] = Integer.parseInt(i);
      x++;
    }
    return output;
  }

  /**
   * Rotates the elments of the array n times to the left
   * @param a the array of integers to rotate
   * @param d times to rotate
   * @return the array after rotating its elements
   */
  public static int[] leftRotation(int[] a, int d) {
    // TODO: add logic to rotate the elements of the array to the right n times
    throw new NotImplementedException();
  }
}
