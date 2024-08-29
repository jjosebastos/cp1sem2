package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorConvidados gc = new GerenciadorConvidados();

        gc.adicionarConvidado("Jose");
        gc.adicionarConvidado("Jose");
        gc.adicionarConvidado("Carla");
        gc.adicionarConvidado("Lucas");
        gc.adicionarConvidado("Pedro");
        gc.adicionarConvidado("Igor");
        gc.print();
    }
}