
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;


public class Hibernate {
    private SessionFactory sessionFactory;

    public Hibernate() {
        setUp();
    }

    private void setUp() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }


    public List<Vehicle> data() {
        Session session = sessionFactory.openSession();
        List<Vehicle> items = session.createQuery("from Vehicle", Vehicle.class).list();
        session.close();

        return items;
    }

    public List findItem(String model) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Vehicle> criteria = cb.createQuery(Vehicle.class);
        Root<Vehicle> root = criteria.from(Vehicle.class);
        criteria.select(root);
        criteria.where(cb.equal(root.get("Model"), model));

        return session.createQuery((CriteriaDelete) criteria).getResultList();
    }
    public List<CarShowroom> showrooms() {
        Session session = sessionFactory.openSession();
        List<CarShowroom> showrooms = session.createQuery("from CarShowroom", org.openjfx.CarShowroom.class).list();
        session.close();

        return showrooms;
    }
    public List<Vehicle> buyItem(int id) {
        Session session = sessionFactory.openSession();

        Vehicle item = session.get( Vehicle.class, id );
        List<Vehicle> items = new ArrayList<>();
        items.add(item);
        item.setState("zamowiony"); //czemu sie nie zmieniasz
        session.save(item);
        session.close();
        return items;
    }
    public List<Vehicle> getpojemnosc(int id) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Vehicle> criteria = cb.createQuery(Vehicle.class);
        Root<Vehicle> root = criteria.from(Vehicle.class);
        criteria.select(root);
        criteria.groupBy(root.get("ID"));

        return session.createQuery(criteria).getResultList();
    }

}