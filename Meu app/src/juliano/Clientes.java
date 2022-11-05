package juliano;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Clientes {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String cadastro;
	
	ArrayList<String>clientes = new ArrayList<String>();
	

	public ArrayList<String> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<String> clientes) {
		this.clientes = clientes;
	}

	
	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}
	Scanner input = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void cadCliente() {
		
		String []a = {"SIM","NÃO"};
		int x =JOptionPane.showOptionDialog(null,"CADASTRAR CLIENTE:","BY RAFA E LUCAS", 0,3,null,a,"");
		if(x == 1) {
			JOptionPane.showMessageDialog(null, "CLIENTE NÃO CADATRADO");
		}
		else if (x == 0) {
			nome = JOptionPane.showInputDialog("Nome Cliente ");
			clientes.add(nome);
			
			endereco = JOptionPane.showInputDialog("Endereço ");
			clientes.add(endereco);
			
			telefone = JOptionPane.showInputDialog("Telefone ");
			clientes.add(telefone);

			email = JOptionPane.showInputDialog("E-mail ");
			clientes.add(email);
		}
	}
	public void mostraCliente() {
		JOptionPane.showMessageDialog(null, "Nome    : "+  nome +"\n" + "Endereço: "+  endereco +"\n"
		+"Telefone: "+  telefone +"\n"+"E-mail  : "+  email);
	}

}
