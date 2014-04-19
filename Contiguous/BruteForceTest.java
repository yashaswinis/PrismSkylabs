package test;

import main.BruteForce;

import org.junit.Assert;
import org.junit.Test;

public class BruteForceTest {

	Integer[] inputList = {4, -1, 5, 6, -13, 2};
	int size = inputList.length;
	Integer[] outputList = new Integer[size];
	Integer[] expectedOutputList = {4, -1, 5, 6};
	
	@Test
	public void test() 
	{
		BruteForce bf = new BruteForce(inputList);
		outputList = bf.printContiguous();
		Assert.assertArrayEquals(expectedOutputList, outputList);
	}

}
