class TP01Q02 {
 
//funcao para comparar se duas Strings sao palindromas
 public static boolean palindroma (String s1) {
 //definir dados
  boolean resp = true;
  int tamanho = s1.length ( );
  int controle = tamanho-1;
 //iniciar repeticao
   for (int i = 0; i < tamanho/2; i = i+1) {
	//testar se diferentes
 	 if (s1.charAt (i) != s1.charAt (controle -i)) {
	  resp = false;
	  i = tamanho/2;
	 }
    }//fim repeticao
 //retornar se palindroma ou nao
 return (resp);
 }//fim palindroma

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
   if (palindroma (palavra [i]))
    {
	MyIO.println ("SIM");
    }//fim se
   else
    {
	MyIO.println ("NAO");
    }
  }//fim for
 }//fim main
}//fim TP01Q02
