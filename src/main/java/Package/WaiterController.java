package Package;

import Package.Entities.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/waiter")

public class WaiterController {

    @Autowired
    private WaiterService waiterService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Waiter> getAll() {
        return waiterService.getAll();
    }

    @RequestMapping(value = "/get/{waiterId}", method = RequestMethod.GET)

    public Waiter getWaiter(@PathVariable("waiterId") long waiterId) {
        return waiterService.getWaiter(waiterId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addWaiter(@RequestBody Waiter waiter) {
        waiterService.addWaiter(waiter);
    }

}


