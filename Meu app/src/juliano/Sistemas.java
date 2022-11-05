package juliano;

import javax.swing.JOptionPane;

public class Sistemas extends Produtos{
	private String cftv;
	private String alarme;
	private String cercaEletrica;
	private String interfonia;
	String sel;
	String sair;
	
	public String getSel() {
		return sel;
	}
	public void setSel(String sel) {
		this.sel = sel;
	}
	public String getCftv() {
		return cftv;
	}
	public void setCftv(String cftv) {
		this.cftv = cftv;
	}
	public String getAlarme() {
		return alarme;
	}
	public void setAlarme(String alarme) {
		this.alarme = alarme;
	}
	public String getCercaEletrica() {
		return cercaEletrica;
	}
	public void setCercaEletrica(String cercaEletrica) {
		this.cercaEletrica = cercaEletrica;
	}
	public String getInterfonia() {
		return interfonia;
	}
	public void setInterfonia(String interfonia) {
		this.interfonia = interfonia;
	}
	
	public void selSistemas() {
		while(sair != "n") {
			String [] a = {"SISTEMA DE CFTV","SISTEMA DE ALARME","CERCA ELETRICA","INTERFONIA","INFRA-ESTRUTURA"}; 
			String sistema =(String)JOptionPane.showInputDialog(null,"SERVIÇO:","BY RAFA E LUCAS",3,null,a,"");
			
			if (sistema == null) {
			    JOptionPane.showMessageDialog(null, "Cancelado...");
			    sair ="n";
			    sel = sair;
			    break;
			}
			else if(sistema.equals("SISTEMA DE CFTV")) {
				sel = "SISTEMA DE CFTV";
				JOptionPane.showMessageDialog(null,"\nSELECIONADO CFTV");
				break;
			}	
			else if(sistema.equals("SISTEMA DE ALARME")) {
				sel ="SISTEMA DE ALARME";
				JOptionPane.showMessageDialog(null,"\nSELECIONADO ALARME");
				break;
			}
			else if(sistema.equals("CERCA ELETRICA")) {
				sel = "CERCA ELETRICA";
				JOptionPane.showMessageDialog(null,"\nSELECIONADO CERCA ELÉTRICA");
				break;
			}
			else if (sistema.equals("INTERFONIA")){
				sel = "INTERFONIA";
				JOptionPane.showMessageDialog(null,"\nSELECIONADO INTERFÔNIA");
				break;
			}
			else if (sistema.equals("INFRA-ESTRUTURA")){
				sel = "INFRA-ESTRUTURA";
				JOptionPane.showMessageDialog(null,"\nSELECIONADO INFRA-ESTRUTURA");
				break;
			}
		
		}
	}
}
