
public class Main {

	public static void main(String[] args) {
		Conta contaPedro = new Conta(); //Instanciando o objeto
		contaPedro.setNumero(109);
		contaPedro.setSaldo(10.00);
		
		Conta contaJeferson = new Conta(110, 90.00); //Instanciando o objeto
		
		System.out.println("O saldo do Pedro � " + contaPedro.getSaldo()); //ctrl + espa�o
		System.out.println("O saldo do Jeferson � " + contaJeferson.getSaldo());
		

	}

}
