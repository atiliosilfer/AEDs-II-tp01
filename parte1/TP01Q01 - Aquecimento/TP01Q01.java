class TP01Q01 {
//funcao para conferir se char e' maiuscula
  public static boolean maiuscula (char c) {
  	return (c >= 'A' && c <= 'Z');
  }//fim maiuscula
  
//funcao para contar quantas letras maiusculas tem na string
  public static int contarMaiusculas (String s) {
  //definir dados
  	int n = 0;
  //iniciar repeticao
  	for (int i = 0; i < s.length ( ); i = i+1) {
		if (maiuscula (s.charAt (i))) {
		n = n+1;
		}//fim if
	}//fim repeticao
  //retornar quantidade de maiusculas
   return (n);
  }//fim contarMaiusculas

//funcao para comparar se duas Strings sao iguais
 public static boolean stringIgual (String s1,String s2) {
 //definir dados
	boolean resp = true;
 //iniciar testes
  if (s1.length ( ) != s2.length ( )) {
	resp = false;
  }//fim if
  else {
  //iniciar repeticao
   for (int i = 0; i < s1.length ( ); i = i+1) {
	//testar se diferentes
 	 if (s1.charAt (i) != s2.charAt (i)) {
	  resp = false;
	  i = s1.length ( );	
	 }//fim if
    }//fim repeticao
  }//fim else
 //retornar se igual ou nao
 return (resp);
 }//fim stringIgual

//main
 public static void main (String [] args){
  String [] palavra = new String [1000];
  int npalavra = 0;
 //iniciar repeticao para leitura de palavras
 do {
  palavra [npalavra] = MyIO.readLine ();
  npalavra = npalavra + 1;
 }while ( stringIgual (palavra [npalavra-1],"FIM") == false);//fim do while
 npalavra = npalavra -1; //desconsiderar palavra "FIM"
 //contar quantas maiusculas em cada palavra lida
  for (int i = 0; i < npalavra; i = i+1) {
   MyIO.println (contarMaiusculas (palavra [i]));
  }//fim for
 }//fim main
}//fim TP01Q01
