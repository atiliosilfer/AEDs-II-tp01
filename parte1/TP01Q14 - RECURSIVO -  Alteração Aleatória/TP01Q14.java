import java.util.Random;

class TP01Q14 {

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

/*
 * Funcao para chamar metodo recursivo trocaChar
 * */
   public static String trocaChar (char c1, char c2, String s)
   {
    return (trocaChar (c1,c2,s,0));
   }//fim trocaChar

/*Metodo para trocar 1 char por outro 
char em  uma String */
 public static String trocaChar (char c1, char c2, String s, int i)
  {
    //definir dados
     String trocada = "";
    //testar se valido
     if (i >= 0 && i < s.length ())
 	{
	 //testar a letra na posicao
	  if (s.charAt (i) == c1)
	   {
	    trocada = trocada + c2;
	   }//fim if
	  else
     {
	   trocada = trocada + s.charAt (i);
     }//fim else
     //passar para proxima letra
      trocada = trocada + trocaChar (c1,c2,s,i+1);
	}//fim if
    //retornar String com letras trocadas
     return (trocada);
  }//fim trocaChar

//main
 public static void main (String [] args){
 //definir dados
  char a,b;
  String [] palavra = new String [1000];
  int npalavra = 0;
  Random gerador = new Random ();
  gerador.setSeed (4);
 //iniciar repeticao para leitura de palavras
 do {
  palavra [npalavra] = MyIO.readLine ();
  npalavra = npalavra + 1;
 }while ( stringIgual (palavra [npalavra-1],"FIM") == false);//fim do while
 npalavra = npalavra -1; //desconsiderar palavra "FIM"
 //contar quantas maiusculas em cada palavra lida
  for (int i = 0; i < npalavra; i = i+1) {
    { 
	//mudar char
	a = ( ( char ) ( 'a' + (Math. abs ( gerador . nextInt ( ) ) % 26 ) ) ) ;
	b = ( ( char ) ( 'a' + (Math. abs ( gerador . nextInt ( ) ) % 26 ) ) ) ; 
	//trocar char na string    
	MyIO.println (trocaChar (a,b,palavra[i]));
    }//fim se
  }//fim for
 }//fim main
}//fim TP01Q14
