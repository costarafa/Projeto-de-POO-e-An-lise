
package Entidade;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Cliente extends Pessoa{

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cpf;
    private String rg;
    private String dataNasc;
    private String email;
    private String sexo;
    //Muitos Clientes podem ter apenas uma cidade, e uma cidade pode ter vários clientes

 
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
