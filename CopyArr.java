// this code copys a sclice from an array to a sclice from another array

public class CopyArr{
	public static void main(String[] args){
		//int nCol = 6;
		//int level = 1;
		//int firstCol = 0; 
		int[][] hiMx = new int[4][4];
		int[][] loMx = new int[4][4];

		hiMx[1][0] = 9;
		hiMx[1][1] = 8;
		hiMx[1][2] = 7;
		hiMx[1][3] = 6;


		

		System.out.println("the hiMx before:");

		for (int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 4 ; j++ ) {

				
				System.out.print(" "+hiMx[i][j]+" ");


				
			}
			System.out.println();

			
		}
		System.out.println();

		System.out.println("the loMx before:");

		for (int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 4 ; j++ ) {
				
				System.out.print(" "+loMx[i][j]+" ");


				
			}
			System.out.println();

			
		}



		 for (int i = 0; i < 4 ; i++){
			    if (i == 0){
				    for(int j = 0; j < 4; j++){
					    loMx[i][j] = hiMx[1][j];
			        }
			        break;
			    }
		    }
		    

		System.out.println("the hiMx after:");

		for (int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 4 ; j++ ) {
				
				System.out.print(" "+hiMx[i][j]+" ");


				
			}
			System.out.println();

			
		}

		System.out.println();

		System.out.println("the loMx after:");

		for (int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 4 ; j++ ) {
				
				System.out.print(" "+loMx[i][j]+" ");


				
			}
			System.out.println();

			
		}
		

	}
	
}
