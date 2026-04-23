package com.mycompany.cadastropessoaweb.repository;

import com.mycompany.cadastropessoaweb.model.Pessoa;
import jakarta.persistence.EntityManager;


    public class PessoaRepository {
        public void listaTodos(Pessoa pessoa){
            EntityManager em = JPAUtil.getEntityManager();
            try{
            em.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();

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
