
package Entidade;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Dependente extends Cliente{
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String nomeDepend;
    private String dataNasc;

    public String getNomeDepend() {
        return nomeDepend;
    }

    public void setNomeDepend(String nomeDepend) {
        this.nomeDepend = nomeDepend;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }


   
}
