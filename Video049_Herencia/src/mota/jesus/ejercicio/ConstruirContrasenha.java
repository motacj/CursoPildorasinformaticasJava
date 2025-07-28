package mota.jesus.ejercicio;

public class ConstruirContrasenha {
	
	private int dimArray;
	
	private int dimPass;
	
	private String passGenerada;
	
	private int leghtGenerada;
	
	private String[] Contrasenhas;

	/**
	 * @param dimArray
	 * @param dimPass
	 */
	public ConstruirContrasenha(int dimArray, int dimPass) {
		this.dimArray = dimArray;
		this.dimPass = dimPass;
		this.Contrasenhas = new String[dimArray];
	}
	/**
	 * @return the dimArray
	 */
	public int getDimArray() {
		return dimArray;
	}
	
	/**
	 * @return the contrasenhas
	 */
	public String[] getContrasenhas() {
		return Contrasenhas;
	}
	/**
	 * @return the passGenerada
	 */
	public void getPassGenerada() {
		
		String pass = "";
		
		for (int i = 0; i < this.Contrasenhas.length; i++) {
			for(int j = 0 ; j<this.dimPass; j++) {
		
			switch ((int)((Math.random() * (2 - 0 + 1)) + 0)) {
			
				case 0:
					
					pass += (char)(int)((Math.random() * (90 - 65 + 1)) + 65);
					
					break;
					
				case 1:
					
					pass += (char)(int)((Math.random() * (122 - 97 + 1)) + 97);
					
					break;
					
				case 2:
					
					pass += (char)(int)((Math.random() * (57 - 48 + 1)) + 48);
					
					break;
				}
			}
			
			this.Contrasenhas[i] = pass;
			pass = "";
		}

	}
	/*
	 * 
	 */
	public void generaPass() {
		
		int mayusculas = 0;
		
		int minusculas = 0;
		
		int numeros = 0;
		
		for (int i = 0; i < this.Contrasenhas.length; i++) {
			
			for (int j = 0; j < this.Contrasenhas[i].length(); j++) {
				
				if((int)this.Contrasenhas[i].charAt(j)>64 && (int)this.Contrasenhas[i].charAt(j)<91){
					
					mayusculas++;
					
				}else if((int)this.Contrasenhas[i].charAt(j)>96 && (int)this.Contrasenhas[i].charAt(j)<123){
					
					minusculas++;
					
				}else if((int)this.Contrasenhas[i].charAt(j)>47 && (int)this.Contrasenhas[i].charAt(j)<58){
					
					numeros++;
				}
				
			}
			
			if(numeros > 5 && minusculas > 1 && mayusculas > 2) {
				
				System.out.println("La contraseña " + this.Contrasenhas[i] + " tiene " 
				+ this.Contrasenhas[i].length() +  " caracteres y es segura");
				
			}else {
				
				System.out.println("La contraseña " + this.Contrasenhas[i] + " tiene " 
				+ this.Contrasenhas[i].length() +  " caracteres y es débil");
			}
				
			mayusculas = 0;
			
			minusculas = 0;
			
			numeros = 0;
	
		}
		
	}

}
