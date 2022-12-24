package sia.shawarmacloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import sia.shawarmacloud.entity.ShawarmaOrder;
import sia.shawarmacloud.repository.OrderRepository;

import javax.validation.Valid;

@Slf4j
@RequestMapping("/orders")
@Controller
@SessionAttributes("shawarmaOrder")
public class OrderController {

    private OrderRepository orderRepo;

    @Autowired
    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid ShawarmaOrder shawarmaOrder, Errors errors,
                               SessionStatus status) {
        if (errors.hasErrors()) {
            return "orderForm";
        }
        orderRepo.save(shawarmaOrder);
        status.setComplete();
        return "redirect:/";
    }
}
