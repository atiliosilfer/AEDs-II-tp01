class TP01Q03 { 

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

//funcao para decodificar a cifra de cesar
 public static String decrypt (String s) {
  //definir dados
    String decodificada = "";
    int tamanho = s.length ( );
  //repeticao para decodificar
    for (int i = 0; i < tamanho; i = i+1){
     decodificada = decodificada + (char)(s.charAt (i) + 3);
    }
 //retornar decodificada
  return (decodificada);
 }//decrypt

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
    {
	MyIO.println (decrypt (palavra [i]));
    }//fim se
  }//fim for
 }//fim main
}//fim TP01Q02
