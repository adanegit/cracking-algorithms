package com.adane.binarrysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by agebrem on 9/13/16.
 */
public class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    @Test
    public void validateBinarySearch(){
        int[] array = {5, 12, 18, 25, 75, 90, 100, 120};
        Assert.assertEquals(2, bs.iterativeSearchElement(array, 18));
        Assert.assertEquals(-1, bs.iterativeSearchElement(array, 20));
        Assert.assertEquals(2, bs.recursiveSearchElement(array, 18));
        Assert.assertEquals(-1, bs.recursiveSearchElement(array, 20));


    }

    @Test
    public void validateFindFirstOccurrence(){
        int[] array = {5, 12, 20, 20, 20, 90, 100};
        Assert.assertEquals(2, bs.findFirstOccurrence(array, 20));
        Assert.assertEquals(-1, bs.findFirstOccurrence(array, 10));
        Assert.assertEquals(5, bs.findFirstOccurrence(array, 90));

    }

    @Test
    public void validateFindLastOccurrence(){
        int[] array = {5, 12, 20, 20, 20, 90, 100};
        Assert.assertEquals(4, bs.findLastOccurrence(array, 20));
        Assert.assertEquals(-1, bs.findLastOccurrence(array, 10));
        Assert.assertEquals(5, bs.findLastOccurrence(array, 90));

    }

    @Test
    public void validateCountOccurrence(){
        int[] array = {5, 12, 20, 20, 20, 90, 100};
        Assert.assertEquals(3, bs.countOccurrence(array, 20));
        Assert.assertEquals(1, bs.countOccurrence(array, 90));
        Assert.assertEquals(0, bs.countOccurrence(array, 10));

    }
}

