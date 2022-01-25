package test;

import main.BalancedBrackets;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsSeparatedByTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textBracketsContainingTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void emptyBracketsThenTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleBracketFollowedByTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void pairedBracketsInWrongOrderMixedWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oneLeftHandBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void twoBracketsWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void manyNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void stringWithoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
}
