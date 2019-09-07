package br.edu.ifsul.Control;

import br.edu.ifsul.Model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario(2, "Paulo", 3000.00);
        System.out.println("\nFuncionários:");
        System.out.println("Funcionário1: " + funcionario1 + "Funcionário2:" + funcionario2);

        funcionario1.setId(1); //esse id vai ser alterado 'acidentalmente' no comando Funcionario carro5 = carro1;
        funcionario1.setNome("Luisa");
        funcionario1.setSalario(2000.00);
        System.out.println(funcionario1);

        //verificar se os objetos são iguais
        System.out.println("\nOS FUNCIONÁRIOS SÃO IGUAIS?\n");
        System.out.println(funcionario1.equals(funcionario2));

        Funcionario funcionario3 = new Funcionario(3, "Júlia", 3500.00);
        Funcionario funcionario4 = new Funcionario(4, "Maria", 4500.00);
        Funcionario funcionario5 = funcionario1; //faz uma cópia da referência, logo, os dois ponteiros estarão apontando para o mesmo objeto
        funcionario5.setId(5);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);
        funcionarioList.add(funcionario3);
        funcionarioList.add(funcionario4);
        funcionarioList.add(funcionario5);
        System.out.println(funcionarioList);

        System.out.println("\nORDENAÇÃO COM COMPARABLE\n");
        Collections.sort(funcionarioList);
        System.out.println("Lista ordenada com Comparable:\n");
        System.out.println(funcionarioList);

        //MAP
        System.out.println("\nMAP\n");
        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(funcionario1.hashCode(), funcionario1);
        funcionarioMap.put(funcionario2.hashCode(),funcionario2);
        funcionarioMap.put(funcionario3.hashCode(),funcionario3);
        funcionarioMap.put(funcionario4.hashCode(),funcionario4);
        funcionarioMap.put(funcionario5.hashCode(),funcionario5);
        System.out.println(funcionarioMap);
        //tentando add um mesmo objeto
        funcionarioMap.put(funcionario1.hashCode(),funcionario1);

        System.out.println("\nbusca e imprime um objeto pela hashCode\n");
        System.out.println(funcionarioMap.get(funcionario3.hashCode()));

    }
}
