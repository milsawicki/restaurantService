package Package.Repositories;

import Package.Entities.Test;
import Package.Entities.Waiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by milan on 19.01.2017.
 */
@Repository
public interface OrderRepository extends CrudRepository<Test, String> {

    public List<Test> findByWaiter(Waiter waiter);
    public Test findByTestId(long testId);
}
