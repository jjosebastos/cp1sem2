package org.example;

import java.util.*;

public class Inventario {
    public static void main(String[] args) {
        Inventario in = new Inventario();
        in.criarInventario();
    }

    private String produto;
    private int quantidade;

    public Inventario(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    private static List<Inventario> inventario;
    public Inventario(){
        this.inventario = new ArrayList<>();
    }

    public static Object criarInventario(){
        Scanner in = new Scanner(System.in);

        String resp = "sim";
        while(resp.equalsIgnoreCase("sim")){
            System.out.println("Informe o produto: ");
            String produto = in.next();

            System.out.println("Informe a quantidade: ");
            int quantidade = in.nextInt();

            inventario.add(new Inventario(produto, quantidade));

            System.out.println("Deseja continuar cadastrando? ");
            resp = in.next();
        }
        
        retornarInventario();
        return inventario;
    }

    public static void retornarInventario(){
        HashSet<Inventario> inventarioHash = new HashSet<>(inventario);
        System.out.println(inventarioHash);
    }

    @Override
    public String toString() {
        return  '{'+
                "Produto: " + produto +
                ", Quantidade: " + quantidade +
                '}';
    }

}
