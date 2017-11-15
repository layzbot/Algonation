package com.algonation.dp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {

	int[] inputArr1 = {1,2,3};
	int result1 = 4;
	
	int[] inputArr2 = {2, 5, 3, 6};
	int result2 = 10;
	
	@Test
	public void countTest() {
		List<Integer> path = new ArrayList<Integer>();
		List<List<Integer>> pathList = new ArrayList<List<Integer>>();
		Assert.assertEquals(4, CoinChangeProblem.getCount(inputArr1,path, pathList, result1, inputArr1.length-1));
	//	Assert.assertEquals(5, CoinChangeProblem.getCount(inputArr2,path, pathList, result2, inputArr2.length-1));
		System.out.println(pathList);
	}
	
	@Test
	public void printPaths() {
		List<List<Integer>> paths = new ArrayList<List<Integer>>();
			
	}
}
