package souro.repository;

import org.springframework.stereotype.Repository;
import souro.models.Post;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PostRepository {

    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory entityManagerFactory;

    public List<Post> getAllPosts(){


        EntityManager em = entityManagerFactory.createEntityManager();
        TypedQuery<Post> query= em.createQuery("SELECT p from Post p",Post.class);
        List<Post> resultList = query.getResultList();


        return resultList;
    }


    public Post getLatestPost(){
        EntityManager em = entityManagerFactory.createEntityManager();
        Post post = em.find(Post.class,3);
        return post;
    }

}
