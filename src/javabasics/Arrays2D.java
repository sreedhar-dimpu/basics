package javabasics;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//2 indexes -[rowindex][colindex]-a[0][1]
		
/*		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		} */
		
		int[][]arr= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		for(int[] i:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
		
	}

}
