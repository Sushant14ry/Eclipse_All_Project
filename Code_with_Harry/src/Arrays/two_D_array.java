package Arrays;

public class two_D_array {
	public static void main(String[] args) {
		int [] marks;	// 1-D Array
		int [][] flats;	// 2-D Array
		
		flats = new int[2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		
		for(int i=0; i<flats.length; i++) {
			for(int j=0; j<flats[i].length; j++){
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}	
	}
}
