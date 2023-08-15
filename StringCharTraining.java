class Main{
	public static void main(String[] args) {
		//Um string inicial
        String s = "Este é um teste de getChars.";
        
        // int contendo o início do index do substring
        int start = 10;
        
        // int contendo o final do index do substring
        int end = 27;
        
        // array de caracteres com tamanho igual ao último index menos o primeiro
        char[] chrs = new char[end - start];
        
        // método getChars chamado por s contendo o primeiro e último índice de s
        // e passando para o array target 'chrs' e o index do começo da subtring
        s.getChars(start, end, chrs, 0);
        
        // array de bytes contendo s convertido para bytes
        byte[] byteArray = s.getBytes();
        
        // laço for usado para exibir cada byte no console
        for(int i = 0; i < byteArray.length; i++){
            System.out.print(byteArray[i] + ", ");
        } 
	  }
}
