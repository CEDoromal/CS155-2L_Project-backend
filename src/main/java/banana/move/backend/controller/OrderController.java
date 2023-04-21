package banana.move.backend.controller;

import banana.move.backend.model.Order;
import banana.move.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/orders")
    public List<Order> getAllOrders() { return orderService.getAllOrders(); }

    @RequestMapping(value="/orders/{id}")
    public Order getOrder(@PathVariable int id) { return orderService.getOrder(id); }

    @RequestMapping(value="/orders/add", method = RequestMethod.POST)
    public Order addOrder(@RequestBody Order order) { return orderService.addOrder(order); }

    @RequestMapping(value="/orders/update", method = RequestMethod.PUT)
    public Order updateOrder(@RequestBody Order order) { return orderService.updateOrder(order); }

    @RequestMapping(value="/orders/delete/{id}", method = RequestMethod.DELETE)
    public void deleteOrder(@PathVariable int id) { orderService.deleteOrder(id); }

    @RequestMapping(value="/accounts/{id}/orders")
    public List<Order> getAllOrdersByAccountID(@PathVariable int id) { return orderService.getAllOrdersByAccountID(id); }
}
