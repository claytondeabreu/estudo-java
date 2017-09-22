
public class TestaAnoBissexto {

	public static void main(String[] args) {
		int anoInicial = 2010;
		int anoFinal = 2021;

		CalculaAno calcula = new CalculaAno();	
		for(int cont = anoInicial ;cont < anoFinal; cont++ ){
			calcula.calculaAno(cont);
		}
	}
}
