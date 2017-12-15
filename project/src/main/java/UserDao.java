import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public interface UserDao extends CrudDao<User> {

    User findOneByName(String name);


}
