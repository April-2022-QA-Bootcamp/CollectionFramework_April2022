package CollectionFramework;

public class DoubleDimentionArray {

	public static void main(String[] args) {
		
		//1d array
		int []arr=new int[3];
		arr[0]=50;
		
		//2d array	
		int[][]a1=new int[2][5];
		a1[0][0]=122;
		a1[0][1]=123;
		a1[0][2]=182;
		a1[0][3]=122;
		a1[0][4]=18822;
		
		a1[1][0]=622;
		a1[1][1]=722;
		a1[1][2]=122;
		a1[1][3]=122;
		a1[1][4]=822;

		
		//for single value
		System.out.println(a1[1][1]);
		
		//for all value--using nested loop
		for(int r=0;r<2;r++) {//outer loop will control rows
			for(int c=0;c<5;c++) {//inner loop will control column
				System.out.println(a1[r][c]);
				
			}
		}
		
		
		
		

	}

}
