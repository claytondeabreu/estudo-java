/**
 * Calcula se o ano inserido é bissexto
 */
public class CalculaAno {
	private int verAno;

	public int getVerAno() {
		return verAno;
	}

	/**
	 * <p>Calcula se o ano é bissexto seguindo a seguinte regra:</p>
	 * <p>O ano deve ser divisível por 400 </p>
	 * <p>ou o ano deve ser divisível por 4 mas não por 100</p>
	 * 
	 * @param verAno
     * 		  recebe o ano que será calculado 	
     */
	public void calculaAno(int verAno) {

		if (((verAno % 400) == 0) || (((verAno % 4) == 0)) && (verAno % 100) != 0) {
			System.out.println("O ano " + verAno + " é um ano bissexto!");
		} else {
			System.out.println("O ano " + verAno + " não é um ano bissexto!");
		}
	}
}
