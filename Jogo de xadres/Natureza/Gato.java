package Natureza;

public class Gato extends App{
     String nome;

     public Gato(String reino, String filo, String classe, String familia, String genero, String especie, String ordem,
               int idade, String nome) {
          super();
          this.nome = nome;
     }

     String getGato() {
          return nome;
     }

}