import java.util.Random;

class TP01Q06 {

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
 * Funcao para conferir se String tem apenas vogais
 * */ 
 public static boolean vogais (String s)
 {
  //definir dados
    boolean resp = true;
  //repeticao para conferir cada char
   for (int i = 0; i < s.length (); i = i+1)
   {
    //conferir se a String tem letras fora vogais
     if (s.charAt (i) != 'a' &&
	 s.charAt (i) != 'e' &&
	 s.charAt (i) != 'i' &&
	 s.charAt (i) != 'o' &&
	 s.charAt (i) != 'u' &&
	 s.charAt (i) != 'A' &&
	 s.charAt (i) != 'E' &&
	 s.charAt (i) != 'I' &&
	 s.charAt (i) != 'O' &&
	 s.charAt (i) != 'U' )
	     resp = false;
   }//fim for
  return (resp);
 }//fim vogais

/*
  * funcao para conferir se String tem somente consoantes
  * */
 public static boolean consoantes (String s)
 {
  //definir dados
   boolean resp = true;
 //repeticao para conferir cada char
   for (int i = 0; i < s.length (); i = i+1)
   {
	if (!(s.charAt (i) >= 'b' && s.charAt (i) <= 'z' || 
      	    s.charAt (i) >= 'B' && s.charAt (i) <= 'Z')) 
	       resp = false;	
    //conferir se a String tem letras fora vogais
	else if (s.charAt (i) == 'e' ||
         	s.charAt (i) == 'i' ||
         	s.charAt (i) == 'o' ||
         	s.charAt (i) == 'u' ||
         	s.charAt (i) == 'E' ||
         	s.charAt (i) == 'I' ||
         	s.charAt (i) == 'O' ||
         	s.charAt (i) == 'U' )
             resp = false;
   }//fim for
  //retornar respota
   return (resp); 
 }//fim consoantes

 /*
  * Funcao para dizer de uma Sting representa um numero inteiro
  * */
 public static boolean inteiro (String s)
 {
  //definir dados
   boolean resp = true;
  //repeticao ara conferir cada char
   for (int i = 0; i < s.length ( ); i = i+1)
    {
	if (s.charAt (i) < '0' || s.charAt (i) > '9')
		resp = false;
    }//fim for
  return (resp);
 }//fim inteiro

 /*
  * Funcao para dizer de uma Sting representa um numero real
  * */
 public static boolean real (String s)
 {
  //definir dados
   boolean resp = true;
   int contador = 0;
  //repeticao ara conferir cada char
   for (int i = 0; i < s.length ( ); i = i+1)
    {
    if (i==0 && s.charAt(0) == '-' ) 
     {
       //nao fazer nada
     }	
	else if (s.charAt (i) == ',' || s.charAt (i) == '.')
	{
	 if (contador > 1)
	 {
	         i = s.length ( );
		 resp = false;
	 }
 	 else
		 contador = contador + 2;	 
	}
	else if (s.charAt (i) < '0' || s.charAt (i) > '9')
                resp = false;
    }//fim for
  return (resp);
 }//fim real

/*
 * funcao para rtornar SIM ou NAO
 * */
  public static String SN (boolean r)
  {
   //definir dados
    String resp;
   if (r)
   {
	   resp = "SIM";
   }//fim if
   else
   {
	   resp = "NAO";
   }//fim else
   return resp;
  }//fim SN

//main
 public static void main (String [] args){
 //definir dados
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
	 MyIO.println (SN(vogais (palavra [i]))+" "+SN(consoantes (palavra[i]))
		+" " +SN(inteiro (palavra [i])) +" "+ SN(real (palavra [i])));
  }//fim for
 }//fim main
}//fim TP01Q06
