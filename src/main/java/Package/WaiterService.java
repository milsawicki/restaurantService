package Package;

import Package.Entities.Waiter;
import Package.Repositories.WaiterRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milan on 20.01.2017.
 */

@Service
public class WaiterService {

    @Autowired
    WaiterRepository waiterRepository;

    public List<Waiter> getAll() {
        List<Waiter> waiters = new ArrayList<>();
        waiterRepository.findAll().forEach(waiters::add);
        System.out.println(waiters);
        return waiters;
    }

    public void addWaiter(Waiter waiter) {
        waiterRepository.save(waiter);
    }

    public Waiter getWaiter(long waiterId) {
       return waiterRepository.findByWaiterId(waiterId);
    }
}
