package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExemploArray {
    public static void main(String[] args) {
        // Cria um array de Strings com 5 posições
        String[] frutas = {"Maçã", "Banana", "Laranja", "Manga", "Uva"};

        // Imprime todos os elementos do array
        System.out.println("Frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        // Busca por uma fruta específica no array
        String buscarFruta = "Manga";
        boolean encontrou = false;
        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals(buscarFruta)) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println(buscarFruta + " encontrada no array!");
        } else {
            System.out.println(buscarFruta + " não encontrada no array.");
        }
    }
}
