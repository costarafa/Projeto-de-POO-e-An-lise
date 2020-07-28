
package Entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class ItensLocados {
  @Id  
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private float valor;
  private int qtdeFilmes;
  @OneToMany
  private List<Filme> filmes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
  

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdeFilmes() {
        return qtdeFilmes;
    }

    public void setQtdeFilmes(int qtdeFilmes) {
        this.qtdeFilmes = qtdeFilmes;
    }
  
  }
