package plataforma.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinTable;
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
    @JoinTable(name = "publicacoes")
    private List<Usuario> autores;
    
    @ManyToMany
    @JoinTable(name = "musica_etiqueta")
    private List<Etiqueta> etiquetas;

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

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Usuario> getAutores() {
        return autores;
    }

    public void setAutores(List<Usuario> autores) {
        this.autores = autores;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }
}
