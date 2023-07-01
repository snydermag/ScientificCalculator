package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Function;
import org.junit.Assert;
import org.junit.Test;
public class TestFunction {


    @Test
    public void testGetSum (){
       double actual = Function.getSum(2,2);
       double expected = 4.0;
        Assert.assertEquals(actual,expected,0.1);
    }
    @Test
    public void testGetSubtract () {
        double actual = Function.getSubtract(10.50,5.00);
        double expected = 5.50;
        Assert.assertEquals(actual,expected,0.1);
    }
    @Test
    public void  testGetMultiply () {
        double actual = Function.getMultiply(2.5,2.5);
        double expected = 6.25;
        Assert.assertEquals(actual, expected ,0.001);
    }

    @Test
    public void testGetDivide () {
        double actual = Function.getDivide(20, 2.5 );
        double expected = 8.00;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testGetSquareRoot () {
        double actual = Function.getSquareRoot(10);
        double expected = 3.16;
        Assert.assertEquals(actual,expected,0.01);
    }

    @Test
    public void testGetSquare () {
        double actual = Function.getSquare(5.5);
        double expected = 30.25;
        Assert.assertEquals(actual,expected,0.01);
    }

    @Test
    public void testGetExponent() {
        double actual = Function.getExponent(5.5,5.5);
        double expected = 27680.640625;
        Assert.assertEquals(actual,expected,0.0001);
    }

    @Test
    public void testGetInverse () {
        double actual = Function.getInverse(5.5);
        double expected = 0.18181818;
        Assert.assertEquals(actual, expected, 0.01);
    }

    @Test
    public void testGetSine() {
        double actual = Function.getSine(2.2);
        double expected = 0.80849640382;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testGetCosine() {
        double actual = Function.getCosine(18.55);
        double expected = 0.95546762908;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testGetTangent() {
        double actual = Function.getTangent(55.55);
        double expected = -1.55285357369;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testGetInverseSine () {
        double actual = Function.getInverseSine(-0.55);
        double expected = 1.1729867870360222;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testGetInverseCosine () {
        double actual = Function.getInverseCosine(-0.25);
        double expected = 1.0320850239843857;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testInverseTan () {
        double actual = Function.getInverseTan(-0.75);
        double expected = -1.0734261485493772;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testLN() {
        double actual = Function.getLN(22.5);
        double expected = 3.1135153092104;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testLog10 () {
        double actual = Function.getLog10(2);
        double expected = 0.3010299956639812;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testAbsValue () {
        double actual = Function.getAbsValue(15.5);
        double expected = 15.5;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testPythagoreanTheorem () {
        double actual = Function.getPythagoreanTheorem(2.5,2.5);
        double expected = 3.5355339059327;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testFactorial  () {
        double actual = Function.getFactorial(5);
        double expected = 120;
        Assert.assertEquals(actual,expected,0.001);
    }

    @Test
    public void testGetNegate () {
        double actual = Function.getNegate(8.5);
        double expected = -8.5;
        Assert.assertEquals(actual,expected,0.001);
    }

}




