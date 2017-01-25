package Package.Repositories;

import Package.Entities.Waiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by milan on 18.01.2017.
 */

@Repository
public interface WaiterRepository extends CrudRepository<Waiter, String> {

    public Waiter findByWaiterId(long id);

}
