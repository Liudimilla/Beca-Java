package AulaJdkJre;

public class TestaPontoFlutuante {
	public static void main( String [] args) {
		double salario,saude,transporte,desconto,adiantamento,decimoTerceiro;
		salario = 1250.70;
		saude = 900.00;
		transporte = 180.00;
		desconto = 180.00/0.10;
		adiantamento = 1250.70/2;
		decimoTerceiro = 1250/12;
		
		
		System.out.println("Sua carta Oferta e :");
		System.out.println ("Salario "+salario);
		System.out.println("Plano de saude no valor"+saude);
		System.out.println("Vale transporte no valor de "+transporte+"Com desconto em folha de"+desconto);
		System.out.println("Com adiantamento 15 de cada mes "+adiantamento);
		System.out.println("Decimo Teceiro "+decimoTerceiro);
	}
	

}
