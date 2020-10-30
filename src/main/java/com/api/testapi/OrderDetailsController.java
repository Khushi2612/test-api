package com.api.testapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderDetailsController {
    @RequestMapping(value="/order/{orderNumber}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:9090")
    public OrderDetails getOrderDetails() {
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setAddress("bangalore");
        orderDetails.setUserMobile("8971276716");
        orderDetails.setOrderNumber("154685889");
        return orderDetails;
    }

    @RequestMapping(value="/order/cancel/{orderNumber}", method = RequestMethod.GET)
    public OrderDetails cancelOrder() {
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setAddress("bangalore");
        orderDetails.setUserMobile("8971276716");
        orderDetails.setOrderNumber("154685889");
        return orderDetails;
    }

    @PostMapping(value="/order/return/{orderNumber}")
    public ReturnRequest returnOrder(@RequestBody ReturnRequest returnRequest) {

     returnRequest.setReturnMethod(
                "You selected this return method: "+ returnRequest.getReturnMethod());
            return returnRequest;

    }


    @RequestMapping("/")
    public String busyunhi() {

        return "ye sahi jagah nahi h";
    }
}
