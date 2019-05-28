/*
 * Aluno: Atilio Silva Ferreira
 * Matricula: 628510
 * */

//dependencias
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * Metodo para trocar ler n numeros e colocar em um arquivo
 */
  void arqC (int n)
  {
    //definir dados
     FILE *arquivo;
     double dados;
     long posicao;
    //testar quantidade
     if (n >= 0);
      {
       //abrir arquivo para guardar dados
	       arquivo = fopen ("Q10.txt","wb+");

        //ler os dados do teclado
	      for (int i = 0; i < n; i = i+1)
	       {
	         //ler um dado do teclado 
		         scanf ("%lf", &dados);
		      //guardar dado em arquivo
		         fprintf (arquivo, "%lf\n", dados);
               posicao = ((i+1)*sizeof(double));
               fseek(arquivo,posicao,SEEK_SET);
	       }//fim repeticao
       
         //definir dados
          posicao = (n-1)*sizeof(double);
          double x;
        //repeticao para printar dados
	      for (int i = 0; i < n; i = i+1)
	       { 
            //mover posicao para ultimo num
               fseek (arquivo,posicao,SEEK_SET);
            //voltar para ler o double
               fscanf (arquivo, "%lf", &x);
	            int y;
               y = x;
            //printar o numero na tela   
		         if (x == y)
		          {
		            printf ("%d\n",y);
	             }
	      	   else
	             {
		            printf ("%g\n",x);
	      	    }
               posicao = posicao - sizeof(double);
               fseek (arquivo,posicao,SEEK_SET);
	      }//fim for
         //fechar arquivo
           fclose (arquivo);
      }//fim if
  }//fim outFile

 
//main
 int main ( )
 {
 //definir dados
  int n;
  scanf ("%d", &n);
 //ler dados e gravar no arquivo
  arqC (n);
  return 0;
 }//fim main
