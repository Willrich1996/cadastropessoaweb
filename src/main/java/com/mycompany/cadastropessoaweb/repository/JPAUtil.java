package com.mycompany.cadastropessoaweb.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static EntityManagerFactory factory;
    static{
    Persistence.createEntityManagerFactory("CadastroPessoaPU");
    }
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
