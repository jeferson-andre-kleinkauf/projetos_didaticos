package hamburgueria;
import java.util.ArrayList;
public class Hamburguer {
	
	private String nome;
	private double preco;
	
	ArrayList<Ingrediente> ingrediente = new ArrayList<Ingrediente>();
	public Hamburguer() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	
}
