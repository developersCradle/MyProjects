package com.semanticsquare.exercises;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil
{

	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades)
	{
		if (lower < 0 || higher < 0 || lower > higher)
		{

			return null;
		}
		
		List<Integer> where = new ArrayList<Integer>();
		
		double[] tulos = calculateGPA(studentIdList, studentsGrades);
	
		
		
		for (int i = 1; i <= studentIdList.length; i++)
		{
			if (tulos[i-1] >= lower && tulos[i-1] <= higher)
			{
				where.add(studentIdList[i-1]);

			}
			
		}
		
		

		
		
		int [] ints = where.stream().mapToInt(Integer::intValue).toArray();
		
		return ints;
		
	}

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades)
	{

		
		double[] summa = new double[studentIdList.length];
		
		for (int j = 1; j <= studentIdList.length; j++)
		{

			for (int j2 = 0; j2 < studentsGrades[j - 1].length; j2++)
			{


				switch (studentsGrades[j - 1][j2])
				{

				case 'A':
					summa[j - 1] += 4;
					break;

				case 'B':
					summa[j - 1] += 3;
					break;

				case 'C':
					summa[j - 1] += 2;
					break;
				}
				
				

			}
			summa[j - 1] /= studentsGrades[j - 1].length;


		}

		return summa;
	}

	/*
	 * public static int[] getStudentsByGPA(double lower, double higher, int[]
	 * studentIdList, char[][] studentsGrades) { // perform parameter validation.
	 * Return null if passed parameters are not valid
	 * 
	 * // invoke calculateGPA
	 * 
	 * // construct the result array and return it. You would need an extra for loop
	 * to compute the size of the resulting array }
	 */

	public static void main(String[] args)
	{
		int[] test =
		{ 1001, 1002, 1003};

		char[][] grades =
		{
				{ 'A', 'A', 'A', 'B' },
				{ 'A', 'B', 'B' },
				{ 'A', 'B', 'B'}};

		int[] test2 = getStudentsByGPA(3.2,3.5,test,grades);
		
		for (int i : test2)
		{
			System.out.println(i);
			
		}
		
	}

}