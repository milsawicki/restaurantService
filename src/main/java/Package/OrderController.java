package Package;

import Package.Entities.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")

public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/all")
    public List<Test> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get/{waiterId}")
    public List<Test> getOrdersForWaiter(@PathVariable("waiterId") long waiterId) {
        return orderService.getOrdersForWaiter(waiterId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add/{waiterId}" )
    public void addOrder(@PathVariable("waiterId") long waiterId, @RequestBody Test order) {
        orderService.addOrder(order, waiterId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get/details/{testId}")
    public Test getOrderDetails(@PathVariable("testId") long testId) {
        return orderService.getOrderDetails(testId);
    }
}
