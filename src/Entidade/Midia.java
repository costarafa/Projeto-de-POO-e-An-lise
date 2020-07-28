
package Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String formatoFilme;
    @OneToMany
    private Filme filme;
   //Uma midia pode ter varios filmes

    public String getFormatoFilme() {
        return formatoFilme;
    }

    public void setFormatoFilme(String formatoFilme) {
        this.formatoFilme = formatoFilme;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
}
