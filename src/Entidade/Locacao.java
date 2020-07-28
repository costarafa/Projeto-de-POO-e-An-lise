
package Entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Locacao {
    @Id
    private String dataLoc;
    private String horaLoc;
    @OneToMany
    List <ItensLocados> itens;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;
    
    
    
    public String getDataLoc() {
        return dataLoc;
    }

    public void setDataLoc(String dataLoc) {
        this.dataLoc = dataLoc;
    }

    public String getHoraLoc() {
        return horaLoc;
    }

    public void setHoraLoc(String horaLoc) {
        this.horaLoc = horaLoc;
    }

    public List<ItensLocados> getItens() {
        return itens;
    }

    public void setItens(List<ItensLocados> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
