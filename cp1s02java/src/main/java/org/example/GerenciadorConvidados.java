package org.example;

import java.util.*;

public class GerenciadorConvidados {

    private List<String> convidados;

    public GerenciadorConvidados(){
        this.convidados = new LinkedList<>();
    }

    public void adicionarConvidado(String nome){
        convidados.add(nome);
    }

    public void print(){
        Set<String> convidadosSet = new HashSet<>(convidados);
        System.out.println(convidadosSet);
    }
}
