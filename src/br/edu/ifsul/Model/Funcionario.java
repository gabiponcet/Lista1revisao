package br.edu.ifsul.Model;

public class Funcionario implements Comparable {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(){

    }
    public Funcionario(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario=salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}