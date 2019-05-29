/*
 * Lista estatica
 * TP01P02Q05
 * @author Atílio Silva Ferreira
 * @version 1 09/2018
 * */

#define TAM 150
#include <stdio.h>
#include <stdlib.h>

typedef struct Instituicao{
 //definir dados
  int codigo;
  char nome [100];
  char sigla [10];
  int codigoMantenedora;
  char mantenedora [50];
  int categoria;
  int organizacao;
  int codigoMunicipio;
  char municipio [50];
  char uf [5];
  char regiao [20];
  int tecnico;
  int periodico;
  int livro;
  double receita;
  double transferencia;
  double outraReceita;
  double despesaDocente;
  double despesaTecnico;
  double despesaEncargo;
  double despesaCusteio;
  double despesaInvestimento;
  double despesaPesquisa;
  double despesaOutras;
}Instituicao;

Instituicao Lista [TAM];
int n = 0;

/*
 * 
 * */

/**
 * Inicializacoes
 * */
void start (){
   n = 0;
}//fim start

/**
 * Insere um elemento na primeira posicao da lista e move os demais * elementos para o fim da mesma.
 * @param x Instituicao a ser inserido
 
 * */
 void inserirInicio (Instituicao* x){
 int i;
 //validar insercao
 if ( n >= TAM){
    printf ("Erro ao inserir!");
    exit (1);
 }
 //levar elementos para o fim do array
 for (i = n; i > 0; i--){
   array [i] = array [i-1];
 }
   array [0] = x;
    n++;
 }//fim inserirInicio

/**
 * Insere um elemento na ultima posicao da Lista
 * @param x Instituicao a ser inserida
 */
 void inserirFim(Instituicao x) {
 
   //validar insercao
   if(n >= TAM){
      printf("Erro ao inserir!");
      exit(1);
   }
 
   array[n] = x;
   n++;
}

/**
 * Insere um elemento em uma posicao especifica e move os demais
 * elementos para o fim da fila
 * @param x Instituicao elemento a ser inserido.
 * @param pos Posicao de insercao.
 */
void inserir(Instituicao x, int pos) {
   int i;

   //validar insercao
   if(n >= TAM || pos < 0 || pos > n){
      printf("Erro ao inserir!");
      exit(1);
   }

   //levar elementos para o fim do array
   for(i = n; i > pos; i--){
      array[i] = array[i-1];
   }

   array[pos] = x;
   n++;
}//fim inserir

int main (){
   Instituicao Lista [200];



}//fim main
