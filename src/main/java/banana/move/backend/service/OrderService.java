package banana.move.backend.service;

import banana.move.backend.model.Order;
import banana.move.backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        List<Order> orderRecords = new ArrayList<>();
        orderRepository.findAll().forEach(orderRecords::add);
        return orderRecords;
    }

    public Order addOrder(Order order)
    {
        return orderRepository.save(order);
    }
    public Order updateOrder(Order order)
    {
        return orderRepository.save(order);
    }
    public Order getOrder(int id)
    {
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()) {
            return order.get();
        }
        else
            return null;
    }
    public void deleteOrder(int id)
    {
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()) {
            orderRepository.delete(order.get());
        }
    }
}
