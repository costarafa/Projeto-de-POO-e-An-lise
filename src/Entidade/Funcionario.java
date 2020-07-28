
 
package Entidade;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Funcionario extends Pessoa {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cpf;
    private String rg;
    private String dataNasc;
    private String sexo;
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
