package br.edu.ifsul.Model;

public class Produto implements Comparable {
    private int id;
    private int estoque;
    private String nome;
    private String descricao;
    private double valor;

    public Produto(){
    }

    public Produto(int id, int estoque, String nome, String descricao, double valor){
        this.id = id;
        this.estoque = estoque;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //imprimir com método toString
    @Override
    public String toString(){
        return "Produto{" +
                "Id:" + id +
                " Nome:" + nome +
                " Descrição:" + descricao +
                " Valor:" + valor +
                " Estoque:" + estoque +
                "}";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

