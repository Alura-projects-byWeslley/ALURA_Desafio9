package models;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){return this.nome;}
    
    public int compareTo(Titulo e){
        return this.getNome().compareTo(e.getNome());
    }
}
