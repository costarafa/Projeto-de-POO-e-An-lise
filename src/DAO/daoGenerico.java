package DAO;
import Fabrica.Fabrica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class daoGenerico <T> {
    public T salvar(T entidade){
        EntityManager em = Fabrica.get().createEntityManager();
        EntityTransaction t = em.getTransaction();
        //Transação é uma unidade que será salva no banco de dados
        //Um conjunto de operações que representam uma coisa só
        
        try{ //começa
           t.begin();
           em.persist(entidade); 
           t.commit(); //termina
        }catch(Exception e){//se der erro capture
            t.rollback();//cancela a transação
            e.printStackTrace();//imprima o erro
            
        }finally{
            em.close();
        }return entidade;
    }
    public T consultar(Class c, int Id){ //busca uma entidade passada pelo id pelo parametro
        EntityManager em = Fabrica.get().createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        try{//tente
        return (T) em.find (c, Id);
        }catch(Exception e){//se der erro capture
        e.printStackTrace();  
        return null;
        }finally{
        em.close();
        }
    }
    
    public List<T> consultar(Class c){//busca todas as entidades
        EntityManager em = Fabrica.get().createEntityManager();
        try{
            return em.createQuery("from "+c.getSimpleName()).getResultList();
        
        }catch(Exception e){//se der erro capture
                 e.printStackTrace();  
                 return null;
        }finally{
            em.close();
        }
    }
        public boolean alterar (T entidade){
            
            EntityManager em = Fabrica.get().createEntityManager();
            EntityTransaction t = em.getTransaction();
            
            try{//tente
                t.begin();
                em.merge(entidade);
                t.commit();
                return true;
            }catch(Exception e){//se der erro capture
                  
                 t.rollback();
                 e.printStackTrace();
                 return false;
            }finally{
            em.close(); 
            }
        }
        public boolean excluir(Class c, int id){
            
            EntityManager em = Fabrica.get().createEntityManager();
            EntityTransaction t = em.getTransaction();
        
            try{//tente
                t.begin();
                T entidade = (T) em.find(c, id);
                em.remove(entidade);
                t.commit();
                return true;
            }catch(Exception e){//se der erro capture
                  
                 t.rollback();
                 e.printStackTrace();
                 return false;
            }finally{
            em.close();
            }
        }
}
    




