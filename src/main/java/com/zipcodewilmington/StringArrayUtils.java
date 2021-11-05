package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int element = array.length - 1;

        return array[element];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int element = array.length - 2;

        return array[element];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];

        for (int i = array.length, j = 0; i > 0; i--, j++) {
            reverse[j] = array[i - 1];
        }

        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverse = new String[array.length];

        for (int i = array.length, j = 0; i > 0; i--, j++) {
            reverse[j] = array[i - 1];

            if (Arrays.equals(reverse, array)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean pangram = false;
        int letterCount = 0;
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u','v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < array.length; i++) {
            String subString = array[i].toLowerCase();

            for (int j = 0; j < subString.length(); j++) {
                char compare = subString.charAt(j);

                for (int n = 0; n < alphabet.length; n++) {
                    char placeholder = alphabet[n];

                    if (compare == placeholder) {
                        letterCount++;
                    }
                }
            }
        }

        if (letterCount >= 26) {
            pangram = true;
        }

        return pangram;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<> (Arrays.asList(array));
        list.remove(valueToRemove);

        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<> ();
        String compare = "";
        int i;

        for (i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                compare = array[i];
            } else {
                compare = array[i];
                list.add(compare);
            }
        }

        if (!compare.equals(array[i])) {
            compare = array[i];
        }

        list.add(compare);

        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<> ();
        String compare = "";
        int i;

        for (i = 0; i < array.length - 1; i++) {

            if (array[i].equals(array[i + 1])) {
                compare += array[i];
            } else {
                compare += array[i];
                list.add(compare);
                compare = "";
            }
        }

        if (!compare.equals(array[i])) {
            compare += array[i];
        }

        list.add(compare);

        return list.toArray(new String[0]);
    }
}
