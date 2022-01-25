package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyArrayWithAnySearchIntReturnsNegOne() {
        int[] array = {};
        assertEquals(-1, BonusBinarySearch.binarySearch(array, 5));
    }

    @Test
    public void arrayOneMemberSearchForMemberReturnsZero() {
        int[] array = {3};
        assertEquals(0, BonusBinarySearch.binarySearch(array, 3));
    }

    @Test
    public void arrayTenMembersSearchTermExistsReturnsIndex() {
        int[] array = {0, 1, 2, 5, 7, 307, 444, 501, 900, 10000};
        assertEquals(8, BonusBinarySearch.binarySearch(array, 900));
    }

    @Test
    public void arrayTenMembersSearchTermIsFirstMemberReturnsZero() {
        int[] array = {0, 1, 2, 5, 7, 307, 444, 501, 900, 10000};
        assertEquals(0, BonusBinarySearch.binarySearch(array, 0));
    }

    @Test
    public void searchForLastTermReturnsIndex() {
        int[] array = {0, 1, 2, 5, 7, 307, 444, 501, 900, 10000};
        assertEquals(9, BonusBinarySearch.binarySearch(array, 10000));
    }
}
