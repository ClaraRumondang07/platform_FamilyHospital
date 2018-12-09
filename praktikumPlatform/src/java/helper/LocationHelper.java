/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author clara
 */
import util.RsKuHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Location;

public class LocationHelper {

    public LocationHelper() {
    }

    public List<Location> getLocation() {
        Session session = RsKuHibernateUtil.getSessionFactory().openSession();
        String query = "from Location";
        Query q = session.createQuery(query);
        List<Location> list = q.list();
        return list;
    }

    public void addNewLocation(double lat, double lng, String name) {
        Session session = RsKuHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Location location = new Location(lat, lng, name);
        session.saveOrUpdate(location);
        transaction.commit();
        session.close();
    }

}
