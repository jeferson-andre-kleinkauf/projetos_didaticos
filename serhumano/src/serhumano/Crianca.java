package serhumano;

public class Crianca extends Pessoa {
 
	double tamanho;
	double peso;
	public Crianca() {
		super();
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void chorar() {
		System.out.println("a crian�a est� chorando");
	}
	public void brincar() {
		System.out.println("a crian�a est� brincando");
	}
	public void brigar() {
		System.out.println("a crian�a est� brigando");
	}
	
	
}
