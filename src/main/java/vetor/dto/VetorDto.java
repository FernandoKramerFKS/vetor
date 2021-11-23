package vetor.dto;

public class VetorDto {
	
	private int numero;
	private int opcao;
	private int resultado;

	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public int getResultado() {
		return resultado;
	}

	public void calcularVetor(VetorDto calc) {
		
		
		int vect[] = new int[11];
		int soma = 0;
		
		if(calc.getNumero() % 10 == 0 && calc.getNumero() >= 100 && calc.getNumero() <= 1000) {
			
			for(int i = 1; i < vect.length; i++) {
				if(i % 3 == 0) {
					vect[i] = (int) Math.round(i * 0.3 * calc.getNumero());
				}else {
					vect[i] = (int) Math.round(i * 0.1 * calc.getNumero());
				}
			}
			
			if(calc.getOpcao() != 1) {
				for(int i = 1; i < vect.length; i++) {
					if(i % 2 == 0) {
						soma += vect[i];
					}
				}
			}else {
				for(int i = 1; i < vect.length; i++) {
					if(i % 2 != 0) {
						soma += vect[i];
					}
				}
			}			
			
		}
		this.resultado = soma;
	}
	
	
}
