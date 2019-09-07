package br.edu.ifsul.Control;


import br.edu.ifsul.Model.Produto;

import java.util.*;
//import java.util.Map;

public class ProdutoController {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setEstoque(10);
        produto.setValor(2000.90);
        produto.setNome("mesa");
        produto.setId(0);
        produto.setDescricao("importada de madeira de lei");
        System.out.println(produto);
        System.out.println("Nome: "+ produto.getNome());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Estoque: " +produto.getEstoque());
        System.out.println("Id: " + produto.getId());

        //adicionando LIST

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        System.out.println(produtos);
        Produto produto2 = new Produto();
        produto2.setEstoque(20);
        produto2.setValor(200);
        produto2.setNome("cadeira");
        produto2.setId(1);
        produto2.setDescricao("cadeira plástica");
        produtos.add(produto2); //lembrar de add o objeto na List após criá-lo
        Produto produto3 = new Produto();
        produto3.setEstoque(20);
        produto3.setValor(200);
        produto3.setNome("cadeira");
        produto3.setId(1);
        produto3.setDescricao("cadeira plástica");
        produtos.add(produto3);
        System.out.println(produtos);

        //verificar se são iguais
        System.out.println("Os produtos são iguais? ");
        System.out.println(produto2.equals(produto3)); //retorna false e permite q dois objetos iguais sejam inseridos

        // imprimir os objetos da coleção pegando-os atraves do índice
        System.out.println(produtos.get(0) +" "+ produtos.get(1));

        //buscar objetos na List com FOR
        for (Produto p : produtos){
            if(p.getId() == 1){
                System.out.println("O produto existe");
                System.out.println(p);
            }
        }

        //buscar objetos na List com FOREACH
        produtos.forEach(p ->{
            System.out.println(p);
            if (p.getId() == 1){
                System.out.println("O produto existe");
            }
        });

        //ordenação com Collections
        Collections.sort(produtos);
        System.out.println("********* Lista ordenada pela implementação de interface\n" + produtos);
        //ordena a List inline
        produtos.sort((p1, p2) -> {
            if(p1.getId() < p2.getId()){
                return 1;
            }else if(p1.getId() > p2.getId()){
                return -1;
            }
            return 0;
        });
        System.out.println("********* Lista ordenada inline\n" + produtos);

        //reverter lista
        System.out.println("LISTA INVERTIDA");
        List<Produto> reverseprodutos = new ArrayList<>();
        reverseprodutos = produtos;
        Collections.reverse(reverseprodutos);
        System.out.println(reverseprodutos);


        //Collection MAP
       // Map<>
        Map<Integer, Produto> produtoMap = new HashMap<>();
        produtoMap.put(produto.hashCode(), produto);
        produtoMap.put(produto2.hashCode(), produto2);
        produtoMap.put(produto3.hashCode(), produto3);
        System.out.println("\n********* Map *********");
        System.out.println(produtoMap);

    }
}