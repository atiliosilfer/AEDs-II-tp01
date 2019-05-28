/*
 * Autor: Atilio Silva Ferreira
 * Matricula: 628510
 * */

//importar dependencias

import java.net.URL;
import java.net.URI;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//iniciar classe TP01Q08 - Leitura de Pagina HTTP

class TP01Q08
{

//leitura de url
 public static String pegarHTTP (String endWeb, String nomePag)
 {
    String http = "";
    String resp = "";
    try {
    //definir dados
     int array [] = new int [26];
     URL url = new URL (endWeb);
     URI uri = url.toURI();
     BufferedReader br = new BufferedReader
         (new InputStreamReader (url.openStream ()) );
     while ((http = br.readLine()) != null) {
                for (int i = 0; i < http.length (); i++)
                {
                  if (http.charAt (i) == 'a')
                   {
                     array [1]++;
                   }//fim if
                  else if (http.charAt (i) == 'e')
                     {
                       array [2]++;
                     }//fim if
                  else if (http.charAt (i) == 'i')
                      {
                        array [3]++;
                      }//fim if
                  else if (http.charAt (i) == 'o')
                      {
                        array [4]++;
                      }//fim if
                  else if (http.charAt (i) == 'u')
                      {
                        array [5]++;
                      }//fim if
                  else  if (http.charAt (i) == 'á')
                     {
                       array [6]++;
                     }//fim if
                   else if (http.charAt (i) == 'é')
                      {
                        array [7]++;
                      }//fim if
                   else if (http.charAt (i) == 'í')
                       {
                         array [8]++;
                       }//fim if
                   else if (http.charAt (i) == 'ó')
                       {
                         array [9]++;
                       }//fim if
                   else if (http.charAt (i) == 'ú')
                      {
                        array [10]++;
                       }//fim if
                   else if (http.charAt (i) == 'à')
                    {
                        array [11]++;
                    }//fim if
                   else if (http.charAt (i) == 'è')
                      {
                        array [12]++;
                      }//fim if
                   else if (http.charAt (i) == 'ì')
                       {
                         array [13]++;
                       }//fim if
                   else if (http.charAt (i) == 'ò')
                       {
                         array [14]++;
                       }//fim if
                   else if (http.charAt (i) == 'ù')
                       {
                         array [15]++;
                       }//fim if
                  else if (http.charAt (i) == 'ã')
                     {
                         array [16]++;
                     }//fim if
                  else if (http.charAt (i) == 'õ')
                     {
                         array [17]++;
                     }//fim if
                  else if (http.charAt (i) == 'â')
                     {
                         array [18]++;
                     }//fim if
                  else if (http.charAt (i) == 'ê')
                     {
                          array [19]++;
                     }//fim if
                  else if (http.charAt (i) == 'î')
                      {
                        array [20]++;
                      }//fim if
                  else if (http.charAt (i) == 'ô')
                      {
                        array [21]++;
                      }//fim if
                  else if (http.charAt (i) == 'û')
                      {
                        array [22]++;
                      }//fim if
                  else if (http.charAt (i) >= 'a' && http.charAt (i) <= 'z')
                     {
                        array [23]++;
                     }//fim if
                  else if (http.charAt (i) == '<')
                     {
                        if (i+3 < http.length ())
                        {
                           if (http.charAt (i+1) == 'b' &&  http.charAt (i+2) == 'r' && http.charAt (i+3) == '>' )
                           {
                              array [24]++;
                              array [23] = array[23] - 2;
                           }
                        }//fim if
                      if (i+5 < http.length())
                     { 
                        if (http.charAt (i+1) == 't' && http.charAt (i+2) == 'a' &&  http.charAt (i+3) == 'b' &&
                             http.charAt (i+4) == 'l' && http.charAt (i+5) == 'e' && http.charAt (i+6) == '>' )
                        {
                        array [25]++;
                        array [23] = array [23] - 3;
                        array[1]--;
                        array[2]--;
                        }
                     }
                  }
                }//fim for
         }//fim while
     resp = "a("+array[1]+ ") e("+array[2]+") i("+array[3]+") o("+array[4]+") u("+array[5]+
        ") á("+array[6]+") é("+array[7]+") í("+array[8]+") ó("+array[9]+") ú("+array[10]+
        ") à("+array[11]+") è("+array[12]+") ì("+array[13]+") ò("+array[14]+") ù("+array[15]+
        ") ã("+array[16]+") õ("+array[17]+") â("+array[18]+") ê("+array[19]+") î("+array[20]+
        ") ô("+array[21]+") û("+array[22]+") consoante("+array[23]+
        ") <br>("+array[24]+") <table>("+array[25]+ ") " + nomePag; 
     br.close();
     } catch (MalformedURLException excecao) {
          excecao.printStackTrace();
      } catch (URISyntaxException excecao) {
          excecao.printStackTrace();
      } catch (IOException excecao) {
          excecao.printStackTrace();
      }
    return (resp);
 }//fim pegarHTTP


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
  String [] pagWeb = new String [10];
  String [] endWeb = new String [10];
  int npalavra = 0;
 //iniciar repeticao para leitura de palavras
 do {
  pagWeb [npalavra] = MyIO.readLine ();
  if (stringIgual (pagWeb [npalavra], "FIM") == false)
   endWeb [npalavra] = MyIO.readLine ();
  npalavra = npalavra + 1;
 }while ( stringIgual (pagWeb [npalavra-1],"FIM") == false);//fim do while
 npalavra = npalavra -1; //desconsiderar palavra "FIM"
 //conferir http
  for (int i = 0; i < npalavra; i = i+1) {
   System.out.println (pegarHTTP(endWeb [i], pagWeb [i]));
    }//fim for
 }//fim main
}//fim TP01Q08
