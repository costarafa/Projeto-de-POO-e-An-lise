package Principal;

import DAO.daoGenerico;
import Entidade.Cargo;
import Entidade.Cidade;
import Entidade.Cliente;
import Entidade.Dependente;
import Entidade.Distribuidora;
import Entidade.Estado;
import Entidade.Filme;
import Entidade.Funcionario;
import Entidade.ItensLocados;
import Entidade.Locacao;
import Entidade.Midia;
import Entidade.Pessoa;

public class Costa {

   
    
    public static void main(String[] args) {

      Estado estado = new Estado();
      estado.setNome("Paraná");
      estado.setSigla("PR");
      
      daoGenerico <Estado> dao = new daoGenerico <>();
      dao.salvar(estado); 
      
      Cidade cidade = new Cidade();
      cidade.setNome("São João do Caiuá");
      cidade.setEstado(estado);
      
      
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Rafaela Costa");
      pessoa.setBairro("Centro");
      pessoa.setRua("Maringá");
      pessoa.setNumero(869);
      pessoa.setTelefone(988263683);
      pessoa.setStatus(true);
      
      Cargo cargo = new Cargo();
      cargo.setFuncao("Gerente");
      cargo.setSalario(1500);
      
      Funcionario funcionario = new Funcionario();
      funcionario.setCpf("4565897646");
      funcionario.setRg("6737987699");
      funcionario.setDataNasc("11/02/2000");
      funcionario.setSexo("Feminino");
      
      Cliente cliente = new Cliente();
      cliente.setCpf("56565656");
      cliente.setRg("787878787");
      cliente.setDataNasc("12/02/1998");
      cliente.setEmail("lorena.silva@gmail.com");
      cliente.setSexo("Feminino");
      
      Dependente dependente = new Dependente();
      dependente.setNomeDepend("Gabriel Junior");
      dependente.setDataNasc("23/009/1990");
      
      Filme filme = new Filme();
      filme.setTituloOriginal("The movie");
      filme.setTituloPort("O filme");
      filme.setPais("Inglaterra");
      filme.setAno(1990);
      filme.setDuracao("Duas Horas");
      filme.setGenero("Suspense");
      filme.setProdutora("Warner Bross");
      
      Midia midia = new Midia();
      midia.setFormatoFilme("Blue-Ray");     
      
      Distribuidora distribuidora = new Distribuidora();
      distribuidora.setCnpj("8898989898");
      
      Locacao locacao = new Locacao();
      locacao.setDataLoc("12/04/2015");
      locacao.setHoraLoc("21:27");
      
     ItensLocados itens = new ItensLocados();
     itens.setValor(30);
     itens.setQtdeFilmes(3);
      
      
      
      
      daoGenerico <Cidade> dao1 = new daoGenerico <>();
      dao1.salvar(cidade);
      
      daoGenerico <Pessoa> dao2 = new daoGenerico <>();
      dao2.salvar (pessoa);
      
      daoGenerico <Cargo> dao3 = new daoGenerico <>();
      dao3.salvar(cargo);
      
      daoGenerico <Funcionario> dao4=  new daoGenerico <>();
      dao4.salvar(funcionario);
      
      daoGenerico <Cliente> dao5=  new daoGenerico <>();
      dao5.salvar(cliente);
      
      daoGenerico <Dependente> dao6 = new daoGenerico <>();
      dao6.salvar(dependente);
      
      daoGenerico <Filme> dao7 = new daoGenerico <> ();
      dao7.salvar(filme);
      
      daoGenerico<Distribuidora> dao8 = new daoGenerico <>();
      dao8.salvar(distribuidora);
      
      daoGenerico<Locacao> dao9 = new daoGenerico <>();
      dao9.salvar(locacao);
      
      daoGenerico<Midia> dao10 = new daoGenerico <> ();
      dao10.salvar(midia);
      
      daoGenerico<ItensLocados> dao11 = new daoGenerico <>();
      dao11.salvar(itens);
              
      Estado e = dao.consultar (Estado.class, 1);
      System.out.println("Estado:" +e.getNome());
      
      Estado e1 = dao.consultar(Estado.class,2);
      System.out.println("Estado:" +e1.getNome());
      
        
    
    }
}
