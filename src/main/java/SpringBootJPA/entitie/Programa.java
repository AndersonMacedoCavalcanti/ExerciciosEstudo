package SpringBootJPA.entitie;

import SpringBootJPA.entitie.Dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String [] args){

       /* instanciando Pessoa
        Pessoa p1 = new Pessoa(null,"carlos","carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"rodrigo","rodrigo@gmail.com");
        Pessoa p3 = new Pessoa(null,"veronica","veronica@gmail.com");
        */

        /*  \/ -------------- Spring data faz isso automaticamente --------------------\/ */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        /*  \/ -------------- Spring data faz isso automaticamente --------------------\/ */
        EntityManager em = emf.createEntityManager();

        /* Buscar pessoa, comando padrão de busca por id
        Pessoa p = em.find(Pessoa.class,3);
        */

        /* Remoção
        Pessoa p = em.find(Pessoa.class,2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        */


        em.close();
        emf.close();


        /* Inserindo os objetos no banco de dados
        em.getTransaction().begin(); -------------- Spring data faz a transação automaticamente
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit(); -------------- Spring data faz a transação automaticamente
        */

    }
}
