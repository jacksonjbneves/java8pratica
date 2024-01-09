/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java8pratica;

import java.util.Scanner;

/**
 *
 * @author Jackson
 */
public class Java8Pratica {

    public static void main(String[] args) {
        
        /* String valor = "Aprendendo a programar em Java";
        System.out.println(valor.contains("Java"));*/
        
        System.out.println("Digite o seu Nome");
        
        String palavra;
        Scanner entrada = new Scanner(System.in); //pegar as entradas das chars
        palavra = entrada.next(); //aqui vai pegar as chars digitadas        
        
        System.out.println("Nome: "+palavra);
        //System.out.println("\n\n\n Aplicando Conhecimentos do Livro: Java 8 Prática!");
        
        
    }
}
