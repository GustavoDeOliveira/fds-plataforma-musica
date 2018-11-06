package plataforma.entidades;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "comentario")
public class Comentario extends Entidade {
    
    @Column(nullable = false)
    private String conteudo;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "musica_id")
    private Musica musica;
    
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "autor_id")
    private Usuario autor;


    
    
    // GETTERS / SETTERS
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    
    public String getDataString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return format.format(data);
    }
    
    public void setData(String data) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        try {
            this.data = format.parse(data);
        } catch (ParseException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
