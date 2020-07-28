
package Entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tituloOriginal;
    private String tituloPort;
    private String pais;
    private int ano;
    private String duracao;
    private String genero;
    private String produtora;
    
    
    
    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPort() {
        return tituloPort;
    }

    public void setTituloPort(String tituloPort) {
        this.tituloPort = tituloPort;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    
    
}
