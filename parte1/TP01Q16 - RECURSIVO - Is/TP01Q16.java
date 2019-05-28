class TP01Q16 {

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
 * Funcao para chamar metodo vogais
 * */
 public static boolean vogais (String s)
 {
  //chamar metodo recursivo
   return (vogais (s, 0));
 }

/*
 * Funcao para conferir se String tem apenas vogais
 * */ 
 public static boolean vogais (String s, int i)
 {
  //definir dados
    boolean resp;
  //Conferir se valido
   if (s == null || i < 0 || s.length () < 0)
	   resp = false;
   else
   {
    //conferir se a String tem letras fora vogais
     if (s.charAt (i) == 'a' ||
	 s.charAt (i) == 'e' ||
	 s.charAt (i) == 'i' ||
	 s.charAt (i) == 'o' ||
	 s.charAt (i) == 'u' ||
	 s.charAt (i) == 'A' ||
	 s.charAt (i) == 'E' ||
	 s.charAt (i) == 'I' ||
	 s.charAt (i) == 'O' ||
	 s.charAt (i) == 'U' )
	     resp = true;
     else
	     resp = false;
     if (resp && i +1 < s.length())
	     resp = (resp && vogais (s, i +1));
   }//fim else
   return resp;
 }//fim vogais

/*
 * Funcao para chamar metodo consoantes 
 * */
 public static boolean consoantes (String s)
 {
  //chamar metodo recursivo
   return (consoantes (s, 0));
 }//fim consoantes

/*
  * funcao para conferir se String tem somente consoantes
  * */
 public static boolean consoantes (String s, int i)
 {
  //definir dados
   boolean resp;
 //repeticao para conferir cada char
  if (s == null || i < 0 || s.length () < 0)
     resp = false;	  
  else {
    //conferir se char e' consoante
	if (s.charAt (i) >= 'b' && s.charAt (i) <= 'z' ||
	    s.charAt (i) >= 'B' && s.charAt (i) <='Z' 
	 	)
            resp = true;
	else
	    resp = false;
	if  (s.charAt (i) == 'E' ||
              s.charAt (i) == 'I' ||
              s.charAt (i) == 'O' ||
              s.charAt (i) == 'U' ||
              s.charAt (i) == 'e' ||
              s.charAt (i) == 'i' ||
              s.charAt (i) == 'o' ||
              s.charAt (i) == 'u' )
		resp = false;
	if (resp && s.length () > i +1)
		resp = (resp && consoantes (s, i +1));
	}//fim else
  //retornar respota
   return (resp); 
 }//fim consoantes

/*
 * Funcao para chamar funcao inteiro
 * */
 public static boolean inteiro (String s)
 {
 //retornar chamando funcao recursiva
  return (inteiro (s, 0));
 }//fim inteiro

 /*
  * Funcao para dizer de uma String representa um numero inteiro
  * */
 public static boolean inteiro (String s, int i)
 {
  //definir dados
   boolean resp;
  //conferir se s valido
   if (s == null || i < 0 || s.length ( ) < 0)
	   resp = false;
   else
   {
	if (s.charAt (i) >= '0' && s.charAt (i) <= '9')
		resp = true;
	else
		resp = false;
	if (resp && i + 1 < s.length ())
	    resp = (resp && inteiro (s, i +1));
   }//fim else
  return (resp);
 }//fim inteiro

/*
 * Funcao para chemar metodo real recursivo
 * */
 public static boolean real (String s) 
 {
 //retornar funcao real
  return (real (s, 0, 0));
 }

 /*
  * Funcao para dizer de uma Sting representa um numero real
  * */
 public static boolean real (String s, int i, int controle)
 {
  //definir dados
   boolean resp;
  //conferir se valido 
  if (s == null || i < 0 || s.length () < 0)
  {
     resp = false;	 
  }
  else
    {
      if (s.charAt (i) == ',' || s.charAt (i) == '.' )
    {   
            controle++;
    }
    if (s.charAt (i) >= '0' && '9' >= s.charAt (i) 
	|| s.charAt (i) == ',' || s.charAt (i) == '.' )
	resp = true;
    else
     {
	resp = false;
     }
     if (controle > 1)
	     resp = false;
    if (resp && i+1 < s.length ())
 	resp = resp && real (s, i + 1, controle);
    }//fim else
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
}//fim TP01Q16
