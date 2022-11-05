package juliano;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Produtos{
	private String produto;
	private double valor;
	private double venda; 
	private int quantidade; 
	private String qualProduto;
	private String quantos;
	private String valores;
	private String quebra ="\n";
	private String maoObra;
	private double margem;
	private String refMargem;
	private double soma;
	private String padrao = "######.00";
	private String sair;
	boolean fim = true;
	
	DecimalFormat df = new DecimalFormat(padrao);
	
	
	public boolean isFim() {
		return fim;
	}
	public void setFim(boolean fim) {
		this.fim = fim;
	}
	public String getSair() {
		return sair;
	}
	public void setSair(String sair) {
		this.sair = sair;
	}
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	public String getRefMargem() {
		return refMargem;
	}
	public void setRefMargem(String refMargem) {
		this.refMargem = refMargem;
	}
	public double getMargem() {
		return margem;
	}
	public void setMargem(double margem) {
		this.margem = margem;
	}
	public String getMaoObra() {
		return maoObra;
	}
	public void setMaoObra(String maoObra) {
		this.maoObra = maoObra;
	}
	public String getQuebra() {
		return quebra;
	}
	public void setQuebra(String quebra) {
		this.quebra = quebra;
	}
	public String getQualProduto() {
		return qualProduto;
	}
	public void setQualProduto(String qualProduto) {
		this.qualProduto = qualProduto;
	}
	public String getQuantos() {
		return quantos;
	}
	public void setQuantos(String quantos) {
		this.quantos = quantos;
	}
	public String getValores() {
		return valores;
	}
	public void setValores(String valores) {
		this.valores = valores;
	}
	
	List<Object> listaProduto = new ArrayList<Object>();
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getVenda() {
		return venda;
	}
	public void setVenda(double venda) {
		this.venda = venda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void produtoscftv() {
		
		while(true) 
		{
			String []a = {"DVRs","CAMERAS","CONECTORES","ARMAZENAMENTO","FONTES","CABOS","OUTROS ITENS"};
			String itensCftv = (String)JOptionPane.showInputDialog(null,"PRODUTOSCFTV:","BY RAFA E LUCAS",3,null,a,"");
			if (itensCftv == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
			    break;
			}
			switch (itensCftv) 
			{
			case "DVRs":
				String [] b = {"DVR 4 CANAIS INTELBRAS","DVR 8 CANAIS INTELBRAS","DVR 16 CANAIS INTELBRAS",
						"DVR 4 CANAIS HIKVISION","DVR 8 CANAIS HIKVISION","DVR 16 CANAIS HIKVISION"};
				String dvrs =(String)JOptionPane.showInputDialog(null,"DVRS:","BY RAFA E LUCAS",3,null,b,"");
				if (dvrs == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;	
				}
				switch (dvrs) {
				case "DVR 4 CANAIS INTELBRAS":
					produto= "DVR 04 CANAIS INTELBRAS";
					entradas();  
					break;
				case "DVR 8 CANAIS INTELBRAS":
					produto= "DVR 08 CANAIS INTELBRAS";
					entradas();
					break;
				case "DVR 16 CANAIS INTELBRAS":
					produto= "DVR 16 CANAIS INTELBRAS";
					entradas();
					break;
				case "DVR 4 CANAIS HIKVISION":
					produto= "DVR 04 CANAIS HIKVISION";
					entradas();
					break;
				case "DVR 8 CANAIS HIKVISION":
					produto= "DVR 08 CANAIS HIKVISION";
					entradas();
					break;
				case "DVR 16 CANAIS HIKVISION":
					produto= "DVR 16 CANAIS HIKVISION";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "CAMERAS":
				String [] c = {"CÂMERA HD 720P BULLET","CÂMERA HD 720P DOME","CÂMERA HD 1080P DOME","CÂMERA HD 1080P BULLET",
						"CÂMERA WIFI ROBO 2MP","CÂMERA WIFI 1MP","CÂMERA WIFI 2MP","CÂMERA VARIFOCAL HD"};
				String cameras = (String)JOptionPane.showInputDialog(null,"CÂMERAS:","BY RAFA E LUCAS",3,null,c,"");
				if (cameras == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (cameras) {
				case "CÂMERA HD 720P BULLET":
					produto= "CÂMERA HD 720P BULLET  ";
					entradas(); 
					break;
				case "CÂMERA HD 720P DOME":
					produto= "CÂMERA HD 720P DOME    ";
					entradas();
					break;
				case "CÂMERA HD 1080P DOME":
					produto= "CÂMERA HD 1080P DOME   ";
					entradas();
					break;
				case "CÂMERA HD 1080P BULLET":
					produto= "CÂMERA HD 1080P BULLET ";
					entradas();
					break;
				case "CÂMERA WIFI ROBO 2MP":
					produto= "CÂMERA WIFI ROBO 2MP   ";
					entradas();
					break;
				case "CÂMERA WIFI 1MP":
					produto= "CÂMERA WIFI 1MP        ";
					entradas();
					break;
				case "CÂMERA VARIFOCAL HD":
					produto = "CÂMERA VARIFOCAL HD    ";
					entradas();
					break;	
				default:
					break;
				}
				break;
			case "CONECTORES":
				String [] d = {"CONECTOR BNC MOLA", "CONECTOR P4 BORNE","CONECTOR BALOON","CONECTOR RJ 45"};
				String conectores = (String)JOptionPane.showInputDialog(null,"CONECTORES:","BY RAFA E LUCAS",3,null,d,"");
				if (conectores == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (conectores) {
				case "CONECTOR BNC MOLA":
					produto= "CONECTOR BNC MOLA      ";
					entradas(); 
					break;
				case "CONECTOR P4 BORNE":
					produto= "CONECTOR P4 ENERGIA    ";
					entradas();
					break;
				case "CONECTOR BALOON":
					produto= "CONECTOR BALOOM PAR HD ";
					entradas();
					break;
				case "CONECTOR RJ 45":
					produto= "CONECTOR RJ 45 REDE    ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "ARMAZENAMENTO":
				String[] e = {"HD 500 GB PC","HD 1 TERA PURPLE","HD 2 TERAS PURPLE","SSD 32 GB","SSD 64 GB"};
				String hds =(String) JOptionPane.showInputDialog(null,"ARMAZENAMENTO:","BY RAFA E LUCAS",3,null,e,"");
				if (hds == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (hds) {
				case "HD 500 GB PC":
					produto= "HD WESTDIGITAL 500 GB  ";
					entradas(); 
					break;
				case "HD 1 TERA PURPLE":
					produto= "HD PURPLE 1 TERA DVR   ";
					entradas();
					break;
				case "HD 2 TERAS PURPLE":
					produto= "HD PURPLE 2 TERA DVR   ";
					entradas();
					break;
				case "SSD 32 GB":
					produto= "CARTAO DE MEMORIA 32 GB";
					entradas();
					break;
				case "SSD 64 GB":
					produto= "CARTAO DE MEMORIA 32 GB";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "FONTES":
				String [] f = {"FONTE 12V 5A","FONTE 12V 10A","FONTE 12V 3A","FONTE 12V 2A","FONTE 12V 1A" };
				String fonte = (String)JOptionPane.showInputDialog(null,"FONTES:","BY RAFA E LUCAS",3,null,f,"");
				if (fonte == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (fonte) {
				case "FONTE 12V 5A":
					produto= "FONTE CHAV 12V 5 AMP   ";
					entradas(); 
					break;
				case "FONTE 12V 10A":
					produto= "FONTE CHAV 12V 10 AMP  ";
					entradas();
					break;
				case "FONTE 12V 3A":
					produto= "FONTE CHAV 12V 3 AMP   ";
					entradas();
					break;
				case "FONTE 12V 2A":
					produto= "FONTE CHAV 12V 2 AMP   ";
					entradas();
					break;
				case "FONTE 12V 1A":
					produto= "FONTE CHAV 12V 1 AMP   ";
					entradas();
					break;
				
				default:
					break;
				}
				break;
			case "CABOS":
				String [] g = {"CABO REDE P/ CFTV","CABO COAXIAL 80% M","CABO UTP BLINDADO","CABO DE REDE LAN"};
				String cabos = (String)JOptionPane.showInputDialog(null,"CABOS:","BY RAFA E LUCAS",3,null,g,"");
				if (cabos == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (cabos) {
				case "CABO REDE P/ CFTV":
					produto= "CABO DE REDE PARA CFTV ";
					entradas(); 
					break;
				case "CABO COAXIAL 80% M":
					produto= "CABO COAXIAL 80% MALHA ";
					entradas();
					break;
				case "CABO UTP BLINDADO":
					produto= "CABO REDE UTP BLINDADO ";
					entradas();
					break;
				case "CABO DE REDE LAN":
					produto= "CABO DE REDE LAN 100%  ";
					entradas();
					break;
				
				default:
					break;
				}
				break;
			case "OUTROS ITENS":
				String [] h = {"NOBREAK 600VA","REGUA TOMADAS","CAIXA PVC CFTV","CABO ENERGIA","PLUG MACHO/FEMEA"
						,"MICROFONE CFTV","ACESSORIOS INSTALAÇÃO"};
				String acessorios =(String) JOptionPane.showInputDialog(null,"OUTROS ITENS:","BY RAFA E LUCAS",3,null,h,"");
				if (acessorios == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				switch (acessorios) {
				case "NOBREAK 600VA":
					produto= "NOBREAK 600 VA 110/220 ";
					entradas(); 
					break;
				case "REGUA TOMADAS":
					produto= "REGUA FILTRO TOMADAS   ";
					entradas();
					break;
				case "CAIXA PVC CFTV":
					produto= "CAIXA PVC ACABAMENTO   ";
					entradas();
					break;
				case "CABO ENERGIA":
					produto= "CABO COBRE ENERGIA 1MM ";
					entradas();
					break;
				case "PLUG MACHO/FEMEA":
					produto= "PLUG ENERGIA MACHO/FEME";
					entradas();
					break;
				case "ACESSORIOS INSTALAÇÃO":
					produto= "ACESSORIOS INSTALAÇÃO  ";
					entradas();
					break;
				case "MICROFONE CFTV":
					produto= "MICROFONE CFTV         ";
					entradas();
					break;
				default:
					break;
				}
				break;
			}
			String []i= {"SIM","NÃO"};	
			int x = JOptionPane.showOptionDialog(null,"MAIS ALGUM PRODUTO: ?","BY RAFA E LUCAS",0,3,null,i,"" );
			if (x == 1) {
				entradaMao();
				break;
			}
			else {
				produtoscftv();
			}
			break;
		}
		
	}
	public void produtosAlarme() {
		while(sair !="n") 
		{
			String [] a = {"CENTRAIS DE ALARME","SENSORES","SIRENES","CABOS","ADICIONAIS"};
			String itensAlarme = (String)JOptionPane.showInputDialog(null,"ALARME:","BY RAFA E LUCAS",3,null,a,"");
			if (itensAlarme == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
				sair = "n";
			    break;
			}
			switch (itensAlarme) 
			{
			case "CENTRAIS DE ALARME":
				String [] b = {"AMN 24 NET INTELBRAS","AMT 2018E INTELBRAS","4010 SMART INTELBRAS","CENTRAL ACTVE 20 SMART",
						"CENTRAL WIFI SMART JFL"};
				String centrais = (String)JOptionPane.showInputDialog(null,"CENTRAIS:","BY RAFA E LUCAS",3,null,b,"");
				if (centrais == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair = "n";
				    break;	
				}
				switch (centrais) {
				case "AMN 24 NET INTELBRAS":
					produto= "AMN 24 NET INTELBRAS   ";
					entradas();  
					break;
				case "AMT 2018E INTELBRAS":
					produto= "AMT 2018E INTELBRAS    ";
					entradas();
					break;
				case "4010 SMART INTELBRAS":
					produto= "4010 SMART INTELBRAS   ";
					entradas();
					break;
				case "CENTRAL ACTVE 20 SMART":
					produto= "CENTRAL ACTVE 20 SMART ";
					entradas();
					break;
				case "CENTRAL WIFI SMART JFL":
					produto= "CENTRAL WIFI SMART JFL ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "SENSORES":
				String [] c = {"SENSOR IVP C/FIO","SENSOR IVP SEMI-ABERTO","SENSOR EXTERNO COM FIO","SENSOR IVP SEM FIO","SENSOR ABERTURA SEM FIO",
						"SENSOR IVA 30M","SENSOR IVA 60M","SENSOR IVA 100M"};
				String sensor = (String) JOptionPane.showInputDialog(null,"SENSORES:","BY RAFA E LUCAS",3,null,c,"");
				if (sensor == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (sensor) {
				case "SENSOR IVP C/FIO":
					produto= "SENSOR IVP COM FIO     ";
					entradas(); 
					break;
				case "SENSOR IVP SEMI-ABERTO":
					produto= "SENSOR IVP SEMI-ABERTO ";
					entradas();
					break;
				case "SENSOR EXTERNO COM FIO":
					produto= "SENSOR EXTERNO COM FIO ";
					entradas();
					break;
				case "SENSOR IVP SEM FIO":
					produto= "SENSOR IVP SEM FIO     ";
					entradas();
					break;
				case "SENSOR ABERTURA SEM FIO":
					produto= "SENSOR ABERTURA SEM FIO";
					entradas();
					break;
				case "SENSOR IVA 30M":
					produto= "SENSOR PERIMETRAL 30 M ";
					entradas();
					break;
				case "SENSOR IVA 60M":
					produto = "SENSOR PERIMETRAL 60 M ";
					entradas();
					break;
				case "SENSOR IVA 100M":
					produto = "SENSOR PERIMETRAL 100 M";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "SIRENES":
				String[] d = {"SIRENE 120 DB","CORNETA 1 AMP"};
				String sirenes = (String) JOptionPane.showInputDialog(null,"SIRENES: ","BY RAFA E LUCAS",3,null,d,"");
				if (sirenes == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair ="n";
				    break;
				}
				
				switch (sirenes) {
				case "SIRENE 120 DB":
					produto= "SIRENE 120 DB          ";
					entradas(); 
					break;
				case "CORNETA 1 AMP":
					produto= "SIRENE CORNETA 1 AMP   ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "CABOS":
				String [] e = {"CABO CCI 2 PARES","CABO DE REDE ALARME","CABO LAN 100 COBRE","CABO ENERGIA 1MM"};
				String cabo =(String) JOptionPane.showInputDialog(null,"CABOS :","by Rafa e Lucas",3,null,e,"");
				if (cabo == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair ="n";
				    break;
				}
				switch (cabo) {
				case "CABO CCI 2 PARES":
					produto= "CABO CC1 2 PARES 0,50MM";
					entradas(); 
					break;
				case "CABO DE REDE ALARME":
					produto= "CABO DE REDE UTP ALARME";
					entradas();
					break;
				case "CABO LAN 100 COBRE":
					produto= "CABO DE REDE LAN COBRE ";
					entradas();
					break;
				case "CABO ENERGIA 1MM":
					produto= "CABO ENERGIA PARALELO  ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "ADICIONAIS":
				String[] f = {"FONTE CARREGADORA","BATERIA 12V 7 AMP","CONTROLE ARME DESARME","PLACA REDE SMART 4010","RECEPTOR SIS SEM FIO",
						"TECLADO LED INTELBRAS","TECLADO LED JFL","PLACA SMART JFL","ARTICULADOR PARA IVP","SUPORTE SENSOR IVA",
						"PLACA EXPANSÃO INTELBRAS","ACESSORIOS INSTALAÇÃO"};
				String acessorio = (String)JOptionPane.showInputDialog(null,"ADICIONAIS :","by Rafa e Lucas",3,null,f,"");
				if (acessorio == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair = "n";
				    break;
				}
				
				switch (acessorio) {
				case "FONTE CARREGADORA":
					produto= "FONTE CARREGADORA      ";
					entradas(); 
					break;
				case "BATERIA 12V 7 AMP":
					produto= "BATERIA 12V 7 AMP      ";
					entradas();
					break;
				case "CONTROLE ARME DESARME":
					produto= "CONTROLE ARME DESARME  ";
					entradas();
					break;
				case "PLACA REDE SMART 4010":
					produto= "PLACA REDE 4010 SMART  ";
					entradas();
					break;
				case "RECEPTOR SIS SEM FIO":
					produto= "RECEPTOR SISTEMA S/ FIO";
					entradas();
					break;
				case "TECLADO LED INTELBRAS":
					produto= "TECLADO LED INTELBRAS  ";
					entradas();
					break;
				case "TECLADO LED JFL":
					produto= "TECLADO LED JFL        ";
					entradas();
					break;
				case "PLACA SMART JFL":
					produto= "PLACA SMART JFL        ";
					entradas();
					break;
				case "ARTICULADOR PARA IVP":
					produto= "ARTICULADOR PARA SENSOR";
					entradas();
					break;
				case "SUPORTE SENSOR IVA":
					produto= "SUPORTE SENSOR IVA     ";
					entradas();
					break;
				case "PLACA EXPANSÃO INTELBRAS":
					produto= "PLACA EXPANSORA INTELB ";
					entradas();
					break;
				case "ACESSORIOS INSTALAÇÃO":
					produto= "ACESSORIOS INSTALAÇÃO  ";
					entradas();
					break;
				default:
					break;
				}
				break;
			}
			String []i= {"SIM","NÃO"};	
			int x = JOptionPane.showOptionDialog(null,"MAIS ALGUM PRODUTO: ?","BY RAFA E LUCAS",0,3,null,i,"" );
			if (x == 1) {
				entradaMao();
				break;
			}
			else {
				produtosAlarme();
			}
			break;
		}
	}
	public void cercaEletrica() {
		while(sair !="n") 
		{
			String[] a = {"CENTRAL DE CERCA","HASTES ALUMINIO","CABOS","ACESSORIOS"};
			String itensCerca = (String)JOptionPane.showInputDialog(null,"PRODUTOS PARA CERCA:","by Rafa e Lucas",3,null,a,"");
			if (itensCerca == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
				sair = "n";
			    break;
			}
			switch (itensCerca) {
			case "CENTRAL DE CERCA":
				String[] b = {"CENTRAL 5001 INTELBRAS","CENTRAL 5002 INTELBRAS","CENTRAL JFL SMART ECR18"};
				String centrais = (String)JOptionPane.showInputDialog(null,"CENTRAIS:","by Rafa e Lucas",3,null,b,"");
				if (centrais == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair = "n";
				    break;	
				}
				switch (centrais) {
				case "CENTRAL 5001 INTELBRAS":
					produto= "CENTRAL 5001 INTELBRAS ";
					entradas();  
					break;
				case "CENTRAL 5002 INTELBRAS":
					produto= "CENTRAL 5002 INTELBRAS ";
					entradas();
					break;
				case "CENTRAL JFL SMART ECR18":
					produto= "CENTRAL JFL SMART ECR18";
					entradas();
					break;
				
				default:
					break;
				}
				break;
			case "HASTES ALUMINIO":
				String[] c = {"HASTE ESTRELA 4 ISOLAD","HASTE ESTRELA 6 ISOLAD","HASTE 8 CANTO SIMPLES","HASTE 12 CANTO SIMPLES",
						"HASTE ATERRAMENTO","HASTE BIG 4 ISLADORES","HASTE BIG 6 ISOLAD","HASTE CASTANHA 8 ISOLA","HASTE CASTANHA 12 ISOLA"};
				String hastes = (String)JOptionPane.showInputDialog(null,"HASTES:","by Rafa e Lucas",3,null,c,"");
				if (hastes == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair = "n";
				    break;
				}
				
				switch (hastes) {
				case "HASTE ESTRELA 4 ISOLAD":
					produto= "HASTE ESTRELA 4 ISOLAD ";
					entradas(); 
					break;
				case "HASTE ESTRELA 6 ISOLAD":
					produto= "HASTE ESTRELA 6 ISOLAD ";
					entradas();
					break;
				case "HASTE 8 CANTO SIMPLES":
					produto= "HASTE 8 CANTO SIMPLES  ";
					entradas();
					break;
				case "HASTE 12 CANTO SIMPLES":
					produto= "HASTE 12 CANTO SIMPLES ";
					entradas();
					break;
				case "HASTE ATERRAMENTO":
					produto= "HASTE ATERRAMENTO      ";
					entradas();
					break;
				case "HASTE BIG 4 ISLADORES":
					produto= "HASTE BIG 4 ISOLADORES ";
					entradas();
					break;
				case "HASTE BIG 6 ISOLAD":
					produto = "HASTE BIG 6 ISOLADORES ";
					entradas();
					break;
				case "HASTE CASTANHA 8 ISOLA":
					produto= "HASTE CASTANHA 8 ISOLAD";
					entradas();
					break;
				case "HASTE CASTANHA 12 ISOLA":
					produto = "HASTE CASTANHA 12 ISOLA";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "CABOS":
				String[]d = {"ARAME CERCA 0,70MM","CABO ALTA ISOLAÇAO","CABO CCI 2 PARES","CABO ENERGIA 1 MM"};
				String cabos = (String)JOptionPane.showInputDialog(null,"CABOS :","by Rafa e Lucas",3,null,d,"");
				if (cabos == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair ="n";
				    break;
				}
				switch (cabos) {
				case "ARAME CERCA 0,70MM":
					produto= "ARAME CERCA 0,70MM     ";
					entradas(); 
					break;
				case "CABO ALTA ISOLAÇAO":
					produto= "CABO ALTA ISOLAÇÃO     ";
					entradas();
					break;
				case "CABO CCI 2 PARES":
					produto= "CABO CCI 2 PARES       ";
					entradas();
					break;
				case "CABO ENERGIA 1 MM":
					produto= "CABO ENERGIA 1 MM      ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "ACESSORIOS":
				String[] e = {"BATERIA 12 V 7 AMPER","CONTROLE ARME DESARME","PLACA REDE SMART JFL","PLACA ADVERTENCIA","SIRENE 120 DB"};
				String acessorios = (String)JOptionPane.showInputDialog(null,"ACESSORIOS :","by Rafa e Lucas",3,null,e,"");
				if (acessorios == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
					sair= "n";
				    break;
				}
				
				switch (acessorios) {
				case "BATERIA 12 V 7 AMPER":
					produto= "BATERIA 12 V 7 AMPER   ";
					entradas(); 
					break;
				case "CONTROLE ARME DESARME":
					produto= "CONTROLE ARME DESARME  ";
					entradas();
					break;
				case "PLACA REDE SMART JFL":
					produto= "PLACA DE REDE SMART JFL";
					entradas();
					break;
				case "PLACA ADVERTENCIA":
					produto= "PLACA DE ADVERTENCIA   ";
					entradas();
					break;
				case "SIRENE 120 DB":
					produto= "SIRENE 120 DB          ";
					entradas();
					break;
				default:
					break;
				}
				break;
			}
			String []i= {"SIM","NÃO"};	
			int x = JOptionPane.showOptionDialog(null,"MAIS ALGUM PRODUTO: ?","BY RAFA E LUCAS",0,3,null,i,"" );
			if (x == 1) {
				entradaMao();
				break;
			}
			else {
				cercaEletrica();
			}
			break;
		}
	}
	public void interfonia() {
		String[]itens = {"CENTRAIS","PORTEIROS","FECHADURAS","FONTES","ACESSORIOS"};
		while(sair !="n") 
		{
			String interfonia = (String)JOptionPane.showInputDialog(null,"PRODUTOS PARA CERCA", "BY RAFA E LUCAS",3,null,itens,"");
			if (interfonia == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
				sair = "n";
			    break;
			}
			switch (interfonia) 
			{
			case "CENTRAIS":
				String[] a = {"CENTRAL COMUNIC 16","CENTRAL COMUNIC 48"};
				String centrais = (String) JOptionPane.showInputDialog(null,"CENTRAIS","BY RAFA E LUCAS",3,null,a,"");
				if (centrais == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;	
				}
				switch (centrais) {
				case "CENTRAL COMUNIC 16":
					produto= "CENTRAL COMUNIC 16     ";
					entradas();  
					break;
				case "CENTRAL COMUNIC 48":
					produto= "CENTRAL COMUNIC 48     ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "PORTEIROS":
				String[] b = {"INTERFONE IPR 8010 INTELB","INTERFONE SEM FIO 5010 INTELB","PORTEIRO WI-FI ALLO W3","PORTEIRO WI-FI ALLO W5"};
				String porteiro = (String) JOptionPane.showInputDialog(null,"PORTEIROS","BY LUCAS E RAFA",3,null,b,"");
				if (porteiro == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (porteiro) {
				case "INTERFONE IPR 8010 INTELB":
					produto= "INTERFONE IPR 8010 INTE";
					entradas(); 
					break;
				case "INTERFONE SEM FIO 5010 INTELB":
					produto= "INTERFONE SEM FIO 5010 ";
					entradas();
					break;
				case "PORTEIRO WI-FI ALLO W3":
					produto= "PORTEIRO WI-FI ALLO W3 ";
					entradas();
					break;
				case "PORTEIRO WI-FI ALLO W5":
					produto= "PORTEIRO WI-FI ALLO W5 ";
					entradas();
					break;
				
				default:
					break;
				}
				break;
			case "FECHADURAS":
				String []c = {"FECHADURA ELETROIMA","FECHADURA ELETRONICA"};
				String fechadura =(String) JOptionPane.showInputDialog(null,"FECHADURA","BY LUCAS E RAFA",3,null,c,"");
				if (fechadura == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (fechadura) {
				case "FECHADURA ELETROIMA":
					produto= "FECHADURA ELETROIMA    ";
					entradas(); 
					break;
				case "FECHADURA ELETRONICA":
					produto= "FECHADURA ELETRONICA   ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "FONTES":
				String [] d = {"FLUTUADOR CARREGADOR","FONTE 12 V 1 AMP","FONTE 12 V 2 AMP","BATERIA 12 V 7 AMP"}; 
				String fontes =(String)JOptionPane.showInputDialog(null,"FONTES","BY RAFA E LUCAS",3,null,d,"");
				if (fontes == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (fontes) {
				case "FLUTUADOR CARREGADOR":
					produto= "FLUTUADOR CARREGADOR   ";
					entradas(); 
					break;
				case "FONTE 12 V 1 AMP":
					produto= "FONTE 12 V 1 AMP       ";
					entradas();
					break;
				case "FONTE 12 V 2 AMP":
					produto= "FONTE 12 V 2 AMP       ";
					entradas();
					break;
				case "BATERIA 12 V 7 AMP":
					produto= "BATERIA 12 V 7AMP      ";
					entradas();
					break;
				default:
					break;
				}
				break;
			case "ACESSORIOS":
				String [] e = {"PLACA  4 RAMAIS","TDMI 300 FONE INTERNO","BOTOEIRA ABERTURA","CABO CC I 2 PARES","CABO DE REDE TIPO CFTV","CABO DE REDE BLINDADO",
						"ACESSORIOS INSTALAÇAO"}; 
				String acessorio =(String)JOptionPane.showInputDialog(null,"ACESSORIOS","BY RAFA E LUCAS",3,null,e,"");
				if (acessorio == null) {
					JOptionPane.showMessageDialog(null, "Cancelado...");
				    break;
				}
				
				switch (acessorio) {
				case "PLACA  4 RAMAIS":
					produto= "PLACA  4 RAMAIS        ";
					entradas(); 
					break;
				case "BOTOEIRA ABERTURA":
					produto= "BOTOEIRA ABERTURA      ";
					entradas();
					break;
				case "CABO CC I 2 PARES":
					produto= "CABO CC I 2 PARES      ";
					entradas();
					break;
				case "CABO DE REDE TIPO CFTV":
					produto= "CABO DE REDE TIPO CFTV ";
					entradas();
					break;
				case "CABO DE REDE BLINDADO":
					produto= "CABO DE REDE BLINDADO  ";
					entradas();
					break;
				case "TDMI 300 FONE INTERNO":
					produto= "TDMI 300 FONE INTERNO  ";
					entradas();
					break;
				case "ACESSORIOS INSTALAÇAO":
					produto= "ACESSORIOS INSTALAÇAO  ";
					entradas();
					break;
				default:
					break;
				}
				break;
			}
			
			String []i= {"SIM","NÃO"};	
			int x = JOptionPane.showOptionDialog(null,"MAIS ALGUM PRODUTO: ?","BY RAFA E LUCAS",0,3,null,i,"" );
			if (x == 1) {
				entradaMao();
				break;
			}
			else {
				interfonia();
			}
			break;
		}
	}
	public void infraEstrutura() {
		while(sair !="n") 
		{
			String[] a = {"BARRA ELETRODUTO 1/2","BARRA ELETRODUTO 3/4","BARRA ELETRODUTO 1P","ABRAÇADEIRAS PVC",
					"ADAPTADOR PVC","LUVA PVC","CURVA PVC","COTOVELO PVC","CAIXA 3/4 PVC","CAIXA 1P PVC","TAMPA CEGA",
					"TAMPA PARA RJ FEMEA","CANALETA DUPLA FACE","ACESSORIOS"};
			String infra = (String)JOptionPane.showInputDialog(null,"PRODUTOS PARA CERCA:","by Rafa e Lucas",3,null,a,"");
			if (infra == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
				sair = "n";
			    break;
			    }
			switch (infra) {
			case"BARRA ELETRODUTO 1/2":
				produto = "BARRA ELETRODUTO 1/2   ";
				entradas();
				break;
			case"BARRA ELETRODUTO 3/4":
				produto = "BARRA ELETRODUTO 3/4   ";
				entradas();
				break;
			case"BARRA ELETRODUTO 1P":
				produto = "BARRA ELETRODUTO 1P    ";
				entradas();
				break;
			case"ABRAÇADEIRAS PVC":
				produto = "ABRAÇADEIRAS PVC       ";
				entradas();
				break;
			case"ADAPTADOR PVC":
				produto = "ADAPTADOR PVC          ";
				entradas();
				break;
			case"LUVA PVC":
				produto = "LUVA PVC               ";
				entradas();
				break;
			case"CURVA PVC":
				produto = "CURVA PVC              ";
				entradas();
				break;
			case"COTOVELO PVC":
				produto = "COTOVELO PVC           ";
				entradas();
				break;
			case"CAIXA 3/4 PVC":
				produto = "CAIXA 3/4 PVC          ";
				entradas();
				break;
			case"CAIXA 1P PVC":
				produto = "CAIXA 1P PVC           ";
				entradas();
				break;
			case"TAMPA CEGA":
				produto = "TAMPA CEGA             ";
				entradas();
				break;
			case"TAMPA PARA RJ FEMEA":
				produto = "TAMPA PARA RJ FEMEA    ";
				entradas();
				break;
			case"CANALETA DUPLA FACE":
				produto = "CANALETA DUPLA FACE    ";
				entradas();
				break;
			case"ACESSORIOS":
				produto = "ACESSORIOS             ";
				entradas();
				break;

			default:
				break;
			}
			String []i= {"SIM","NÃO"};	
			int x = JOptionPane.showOptionDialog(null,"MAIS ALGUM PRODUTO: ?","BY RAFA E LUCAS",0,3,null,i,"" );
			if (x == 1) {
				entradaMao();
				break;
			}
			else {
				infraEstrutura();
			}
			break;
		}
	}
	
	public void entradas() {
		while(sair !="n") {
			String [] a= {"80%","70%","50%","SAIR"};
			int x = JOptionPane.showOptionDialog(null,"MARGEM DE LUCRO:","by Rafa e Lucas",0,3,null,a,"");
			if (x == 0) {
				 margem = 0.80;
			}
			else if (x == 1) {
				margem = 0.70;
			}
			else if (x == 2) {
				margem = 0.50;
			}
			else if(x == 3) {
				sair = "n";
				break;
			}
			break;
		}
		
		listaProduto.add(produto);
	
		while(true ) {
			quantos = (String) JOptionPane.showInputDialog("Quantidade: ");
			if(quantos == null) {
				JOptionPane.showMessageDialog(null, "Cancelado..");
				break;
			}
			quantidade = Integer.parseInt(quantos);
			listaProduto.add(quantidade +"  ");
			if (quantidade> 0 ) {
				break;
			}
			break;
		}
		while(true) {
			valores =JOptionPane.showInputDialog("Valor: ?"); 
			if (valores == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
				break;
			}
			if (valores.length()>= 1) {
				valor = Double.parseDouble(valores);
			break;
			}
			else if (valores.length() < 0);{
				JOptionPane.showMessageDialog(null, "Digite novamente");
			}
			break;
		}
		alinhaImpreValor();
		listaProduto.add( df.format(valor * margem + valor ));
		venda = ((valor *margem) + valor)* quantidade;
		
		alinhaImpreVenda();
		listaProduto.add(df.format(venda));
		listaProduto.add(quebra);
		soma += venda;
	}
	public void entradaMao() {
		sair = "s";
		while(sair == "s") {
			JOptionPane.showMessageDialog(null, "MÃO DE OBRA INSTALAÇÃO");
			produto ="MÃO DE OBRA INSTALAÇÃO "; 
			listaProduto.add(produto);
			
			quantidade = 1;
			listaProduto.add(quantidade +"  ");
			if (quantidade> 0 ) {
				sair ="n";
			}
			
		}
		
		while(true) {
			valores =JOptionPane.showInputDialog("Valor: ?"); 
			if (valores == null) {
				JOptionPane.showMessageDialog(null, "Cancelado...");
				break;
			}
			if (valores.length()>= 1) {
			valor = Double.parseDouble(valores);
			
			break;
			}
			else if (valores.length() < 0);{
				JOptionPane.showMessageDialog(null, "Digite novamente");
			}
			break;
			
		}
		alinhaImpreValor();
		double mao = valor;
		listaProduto.add(df.format(valor));
		venda = valor * quantidade;
		
		alinhaImpreVenda();
		listaProduto.add(df.format(venda));
		listaProduto.add(quebra);
		listaProduto.add("\n\n TOTAL DOS SERVIÇOS                       ");
		
		
		listaProduto.add(df.format(soma + mao));
		listaProduto.add(quebra);
		
	}
	public void alinhaImpreValor() {
		if(quantidade < 10) {
			if (valor * margem + valor > 0 && valor * margem + valor < 10) {
				listaProduto.add("     ");
			}
			else if (valor * margem + valor > 9 && valor * margem + valor <100 ) {
				listaProduto.add("    ");
			}
			else if (valor * margem + valor > 99 && valor * margem + valor <1000 ) {
				listaProduto.add("   ");
			}
			else if(valor * margem + valor > 999){
				listaProduto.add("  ");
			}
		}
		else if(quantidade >=10) {
			if (valor * margem + valor > 0 && valor * margem + valor < 10) {
				listaProduto.add("    ");
			}
			else if (valor * margem + valor > 9 && valor * margem + valor <100 ) {
				listaProduto.add("   ");
			}
			else if (valor * margem + valor > 99 && valor * margem + valor <1000 ) {
				listaProduto.add(" ");
			}
			else if(valor * margem + valor > 999){
				listaProduto.add(" ");
			}
		}
	}
	
	public void alinhaImpreVenda() {
		if(quantidade < 10) {
			if (venda > 0 && venda < 10) {
				listaProduto.add("    ");
			}
			else if (venda > 9 && venda <100 ) {
				listaProduto.add("   ");
			}
			else if (venda > 99 && venda <1000 ) {
				listaProduto.add("  ");
			}
			else if(venda  > 999){
				listaProduto.add(" ");
			}
		}
		else if(quantidade >=10) {
			if (venda  > 0 && venda < 10) {
				listaProduto.add("  ");
			}
			else if (venda  > 9 && venda  <100 ) {
				listaProduto.add("   ");
			}
			else if (venda  > 99 && venda  <1000 ) {
				listaProduto.add("  ");
			}
			else if(venda  > 999){
				listaProduto.add(" ");
			}
		}
	}
	

}
	
		
	
	

		
		
		
		
		
		
		
		
		
	