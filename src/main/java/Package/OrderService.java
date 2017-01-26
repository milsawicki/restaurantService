package Package;

import Package.Entities.Test;
import Package.Entities.Waiter;
import Package.Repositories.OrderRepository;
import Package.Repositories.WaiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milan on 19.01.2017.
 */

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private WaiterRepository waiterRepository;

    public List<Test> getAllOrders() {
        List<Test> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }

    public void addOrder(Test order, long waiterId) {
        Waiter waiter = waiterRepository.findByWaiterId(waiterId);
        order.setWaiter(waiter);
        orderRepository.save(order);
    }

    public List<Test> getOrdersForWaiter(long waiterId) {
        Waiter waiter = waiterRepository.findByWaiterId(waiterId);
        List<Test> orders = orderRepository.findByWaiter(waiter);
        return orders;
    }

    public Test getOrderDetails(long testId) {
        return  orderRepository.findByTestId(testId);
//        return new Test();
    }
}
