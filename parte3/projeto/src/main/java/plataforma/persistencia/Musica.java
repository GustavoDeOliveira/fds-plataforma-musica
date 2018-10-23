package plataforma.persistencia;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "musica")
public class Musica extends Entidade {
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String descricao;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comentario")
    private List<Comentario> comentarios;
    
    @ManyToMany(mappedBy = "musica")
    private List<Usuario> autores;

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
}
