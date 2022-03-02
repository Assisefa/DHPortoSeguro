package PortoSeguro;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente novo = new Cliente("Eduardo","Av.Timóteo Penteado,1415","12345678910",925648623,50,20,20);
		novo.imprimirInfo();
		novo.validarCondição();
		
	}

}
