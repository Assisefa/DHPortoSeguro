package PortoSeguro;

public class TesteEmpregado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado1 emp = new Empregado1("Eduardo Farias", "Av.Timóteo Penteado,1415",
				"359876543",95861241,50,055,25000,10);
		
		emp.ImprimirInfo();
		emp.calcularSalario();

	}

}
