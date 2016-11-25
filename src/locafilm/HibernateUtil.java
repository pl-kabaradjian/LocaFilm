package locafilm;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

/**
 * Singleton qui d�marre Hibernate et fournit l'objet SessionFactory
 */
public class HibernateUtil {

  private static SessionFactory sessionFactory;

  static {
    try {
       Configuration config = new Configuration();
       config.configure();
       ServiceRegistry s = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
       sessionFactory = config.buildSessionFactory(s);
    } catch (Throwable ex) {
       throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory() {
      return sessionFactory;
  }

  public static void shutdown() {
      // Ferme les ant�m�moires et les bassins (pool) de connexions
      getSessionFactory().close();
  }
}
