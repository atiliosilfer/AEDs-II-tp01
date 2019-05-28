/*
 * Aluno: Atilio Silva Ferreira
 * Matricula: 628510
 * */

//dependencias
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * Funcao para conferir se String e' palindroma
 * */

int palindroma (char *palavra)
{
   //definir dados
      int resp = 1; //1 = true   0 = false
      int tamanho = strlen (palavra);
      int controle = tamanho-1;
   //repeticao para conferir se palindroma
      for (int i = 0; i < tamanho; i = i+1)
      {
         if (palavra[i] != palavra [controle-i])
         {
            resp = 0;
         }//fim if
      }//fim for
      return (resp);
}//fim palindroma

//-------------------- MAIN --------------------------------
 
int main ()
{
   char palavra [1000];
   int stop = 0;
   //ler palavras
    do {
      scanf ("%[^\n]%*1[\n]", palavra);//ler ate o \n
      if (strcmp (palavra, "FIM") != 0)
      {
         if (palindroma(palavra))
         {
            printf ("SIM\n");
         }//fim if
         else
         {
            printf ("NAO\n");
         }//fim else
      }//fim if
      else
      {
         stop = 1;
      }//fim else
    }while (stop == 0);
    return (0);
}//fim main
