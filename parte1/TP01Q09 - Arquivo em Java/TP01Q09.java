/*
 * Aluno: Atilio Silva Ferreira
 * Matricula: 628510
 * */

import java.io.*;

class TP01Q09 {

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

/*Metodo para trocar ler n numeros e colocar em um arquivo
 */
 public static void FILE (int n)
  {
    //definir dados
     RandomAccessFile arquivo;
     double dados;
    //testar quantidade
     if (n >= 0);
      {
	try {
    	      //criar arquivo para guardar dados
	    arquivo = new RandomAccessFile ("Q9.txt","rw");
	  //ler os dados do teclado
	    for (int i = 0; i < n; i = i+1)
	      {
	         //ler um dado do teclado 
		  dados = MyIO.readDouble ();
		 //guardar dado em arquivo
		  arquivo.writeDouble (dados);
	      }//fim repeticao
	    for (int i = 0; i < n; i = i+1)
	      { 
		long posicao = arquivo.getFilePointer ( );
	   	arquivo.seek (posicao-8);//ir para prox numero
		double x = arquivo.readDouble (); arquivo.seek (posicao-8);
	        int y = (int) x;
		if (x == y)
		{
		 MyIO.println (y);
		}
		else
		{
		 MyIO.println (x);
		}
	      }//fim for
       //fechar arquivo
        arquivo.close ( );
	} catch (IOException Cleber) 
	{MyIO.println ("SEU COMPUTADOR SE AUTO DESTRUIRA EM 3... 2... 1...");}
      }//fim if
  }//fim outFile

 
//main
 public static void main (String [] args)
 {
 //definir dados
  int n = MyIO.readInt ();
 //ler dados e gravar no arquivo
  FILE (n);
 }//fim main
}//fim TP01Q09
