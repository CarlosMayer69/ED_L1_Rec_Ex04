package controller;

public class ContaNegController {

	public ContaNegController() {
		super();
	}
	
	public int contaNegativos(int[] vetor, int n) {
	    //a) Condi��o de parada: quando n for igual a 0.
	    if (n == 0) {
	        
	    	// Se o elemento for negativo, retorna 1
	    if (vetor[n] < 0) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	   //b) C�lculo do termo n em fun��o do termo anterior.
       //Se o elemento for negativo, adiciona 1 ao resultado da fun��o recursiva
	    	if (vetor[n] < 0) {
	    	return 1 + contaNegativos(vetor, n-1);
	    	} else {
	    		return contaNegativos(vetor, n-1);
	    	}
	}

}