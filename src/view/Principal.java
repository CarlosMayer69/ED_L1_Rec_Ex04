package view;

import controller.ContaNegController;

public class Principal {

	public static void main(String[] args) {
		
		ContaNegController cn = new ContaNegController();
		
		int[] vetor = {-3,-2,-1,0,1,2,3};
		int n = vetor.length-1;
		int contaNegativos = cn.contaNegativos(vetor, n);
		
		System.out.println(contaNegativos);

	}

}
