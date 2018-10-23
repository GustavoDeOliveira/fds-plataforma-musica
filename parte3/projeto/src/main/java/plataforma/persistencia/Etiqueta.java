package plataforma.persistencia;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "etiqueta")
public class Etiqueta extends Entidade {
    
    @Column(nullable = false, unique = true)
    private String nome;
    
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
