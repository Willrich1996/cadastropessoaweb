package com.mycompany.cadastropessoaweb.repository;

import com.mycompany.cadastropessoaweb.model.Pessoa;
import jakarta.persistence.EntityManager;
import java.util.List;


    public class PessoaRepository {
        public List<Pessoa>listaTodos(){
            EntityManager em = JPAUtil.getEntityManager();
            try{
                return em.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
            } catch (Exception e ) {
                e.printStackTrace();
                return null;
            }finally{
                em.close();
            }
        }
    
    
    public void exclui(Pessoa pessoa){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            
            Pessoa pessoaParaRemover =  em.find(Pessoa.class, pessoa.getId());
            if (pessoaParaRemover != null) {
            em.remove(pessoaParaRemover);
            }
            
            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            } throw  e;
        }finally{
            em.close();
        }
    }
    
    
    
    public void salva(Pessoa pessoa){
        EntityManager em  = JPAUtil.getEntityManager();
    try{
        em.getTransaction().begin();
        
        if (pessoa.getId() == null) {
            em.persist(pessoa); // Novo
        } else {
            em.merge(pessoa);   // Existente
        }
   
        em.getTransaction().commit();
    } catch (Exception e) {
        if (em.getTransaction().isActive()){
        em.getTransaction().rollback();
    }   throw  e;    
    }finally{
        em.close();
    }
    
}

}
