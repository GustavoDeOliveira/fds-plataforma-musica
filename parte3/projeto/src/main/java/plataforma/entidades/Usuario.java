package plataforma.entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

@Table(name = "usuario")
public class Usuario extends Entidade {
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String senha;
    
    @ManyToMany
    private List<Musica> publicacoes;
    
    @ManyToMany
    @JoinTable(name = "favoritas")
    private List<Musica> favoritas;
    
    @ManyToMany
    @JoinTable(name = "denuncias")
    private List<Musica> denuncias;
    
    @ManyToMany
    @JoinTable(name = "usuario_etiqueta")
    private List<Etiqueta> etiquetas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Musica> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Musica> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public List<Musica> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(List<Musica> favoritas) {
        this.favoritas = favoritas;
    }

    public List<Musica> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(List<Musica> denuncias) {
        this.denuncias = denuncias;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }
}
