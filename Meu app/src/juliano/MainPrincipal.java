		package juliano;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import javax.swing.JOptionPane;

public class MainPrincipal {

public static void main(String[] args){

		
		Clientes c1 = new Clientes();
		c1.cadCliente();
		Sistemas s1 = new Sistemas();
		s1.selSistemas();
		Produtos p1 = new Produtos();
	
		if(s1.getSel().equals("SISTEMA DE CFTV")) {
			p1.produtoscftv();
		}
		else if(s1.getSel().equals("SISTEMA DE ALARME")) {
			p1.produtosAlarme();
		}
		else if (s1.getSel().equals("CERCA ELETRICA")) {
			p1.cercaEletrica();
		}
		else if(s1.getSel().equals("INTERFONIA")) {
			p1.interfonia();
		}
		else if(s1.getSel().equals("INFRA-ESTRUTURA")) {
			p1.infraEstrutura();
		}
		
		//else if(s1.getSel().equals("INFRA-ESTRUTURA")) {
		//	p1.infraestrutura();
		//}
		//c1.mostraCliente();
		//System.out.println();
		//p1.listaProdutos();
		
		FileWriter arquivo;
		try {
		
			arquivo = new FileWriter(new File("C:\\Users\\julia\\Desktop\\"+c1.getNome() +".txt"));
			String texto = "\n\n    Carpes Sistemas Eletrônicos de Segurança\n"
					+ "             Cnpj: 25.425.988/0001-61\n"
					+ "             Watssap:(48)9-8469-9201\n\n"
					+ "ORÇAMENTO "+s1.getSel()+"\n\n";
			arquivo.write(texto);
			String texto1 ="Cliente:\n"
					+ "------------------------------------------------\n";
			arquivo.write(texto1);
			arquivo.write(("Nome    : " + c1.getNome() +"\n" + "Endereço: " + c1.getEndereco()+"\n"
					+ "E-mail  : " + c1.getEmail()+"\n" + "Telefone: " + c1.getTelefone() +"\n"));
			String texto2 = "----------------Produtos------------------------\n\n";
			String texto3 = "\n\n--------------------FIM-------------------------";
			arquivo.write(texto2);
			for (Object lista : p1.listaProduto) {
				arquivo.write(" " + lista);
			}
			arquivo.write(texto3);
			arquivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path local = Paths.get("C:\\Users\\JULIANO\\Desktop\\Orçamento.txt");
		try {
			byte[] texto5 = Files.readAllBytes(local);
			String ler = new String(texto5);
			
			JOptionPane.showMessageDialog(null, ler);
		} catch (Exception erro) {
			
		}
		finally {
			JOptionPane.showMessageDialog(null,"Programa Encerrado...");
		}
		
	}
	
	

}
