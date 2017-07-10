
public class Arrays {
	public static void main(String[] args){
		final int SIZE = 9;
		int i = 0, j = 0;
		int cube1[] = new int[SIZE];
		int cube2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int cube3[][] = new int[5][];
		
		cube3[0] = new int[1];
		cube3[1] = new int[2];
		cube3[2] = new int[3];
		cube3[3] = new int[4];
		cube3[4] = new int[5];
		
		// 1 Dimension Array
		while(i < SIZE){
			System.out.println(cube1[i]);
			i++;
		}
		i = 0;
		
		while(i < SIZE){
			System.out.println(cube2[i]);
			i++;
		}
		
		// 2 Dimension Array
		for(i = 0; i < cube3.length; i++){
			for(j = 0; j < cube3[i].length; j++){
				System.out.print(cube3[i][j]);
			}
			System.out.println();
		}
	}
}
