package plataforma.persistencia;

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
    @JoinTable(name = "publicacoes")
    private List<Musica> publicacoes;

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
}
