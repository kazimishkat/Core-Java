
//Answer No. 3

package midevdpart2;
import java.util.List;
public interface DaoServiceInterface<E>{
    void save(E e);
    List<E> findAll();
    void update(E e);
    E findById(int id);
    void delete(int id);
    
}

