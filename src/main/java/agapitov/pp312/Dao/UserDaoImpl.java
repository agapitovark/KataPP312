package agapitov.pp312.Dao;



import agapitov.pp312.model.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;
    private List<User> users;


    public List<User> getAllUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    public User getUserByID(int id) {
        return em.find(User.class, id);
    }

    public void saveUser(User user) {

        em.persist(user);

    }

    public void removeUser(int id) {
        User user = em.find(User.class,id);
        em.remove(user);
    }

    public void changeUser(User updateUser) {
        em.merge(updateUser);
    }
}