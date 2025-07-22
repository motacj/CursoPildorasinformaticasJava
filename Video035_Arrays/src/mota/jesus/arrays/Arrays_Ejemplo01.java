package mota.jesus.arrays;

public class Arrays_Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mi = new int[5];
		
		mi[0] = 2;
		mi[1] = 5;
		mi[2] = -5;
		mi[3] = 7;
		mi[4] = 12;
		
		for (int i : mi) {
			System.out.println(i);
		}
		
		String[] nombre = {"Jesus","Luis","Laura"};
		
		for (String string : nombre) {
			System.out.println(string);
		}
		
		int[][] numeros =  new int[3][3];
		
		numeros[0][0]=1;
		numeros[0][1]=3;
		numeros[0][2]=-1;
		
		numeros[1][0]=0;
		numeros[1][1]=9;
		numeros[1][2]=2;
		
		for(int[] fila:numeros) {
			
			for(int columna:fila) {
				
				System.out.print(columna + " ");
			}
			
			System.out.print("\n");
			
		}
	}

}
