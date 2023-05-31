package day11;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		int key=20;
		System.out.println("enter the array element");
		arr[0]=10;
		arr[1]=20;
		arr[2]=3;
		arr[3]=40;
		arr[4]=5;
		arr[5]=60;
		int arr1[]= new int[6];
	    arr1[0]=60;
		arr1[1]=5;
		arr1[2]=3;
		arr1[3]=40;
		arr1[4]=20;
		arr1[5]=10;		
		System.out.println(arr[0]);
		//to don't repeat the arr[] we use the loops,in that i valu should be 0
		
		/*for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.asList(arr));
		System.out.println(Arrays.binarySearch(arr,0));
		System.out.println(Arrays.binarySearch(arr,1,2,key));
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.equals(arr, arr1));
		int arr2[][]= new int[2][2] ;
		/*System.out.print(arr2[0][0]);
		int arr3[][]=new int[3][3];*/
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.println("enter the value for index ["+i+"] ["+j+"]");
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}
		int arr3[][]= new int[3][3] ;
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.println("enter the value for index ["+i+"] ["+j+"]");
				arr3[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr3[i][j]+",");
			}
			System.out.println();
		}

	}

}
