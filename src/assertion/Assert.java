package assertion;

class Assert {
	// usando assertivas
	public static void main(String args[]) {
		int taxajuros = 2;
		assert teste() : "algum programador mudou o valor da int taxajuros na linha 6";
		assert taxajuros-- > 3 :teste();
		System.out.println("FIM");
	}
	
	public static boolean teste(){
		return true;
	}
}
