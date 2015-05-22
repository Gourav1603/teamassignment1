/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teamassignment1;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

/**
 *
 * @author c0654032
 */
public class OrderQueue {
    Queue<Order> orderQueue = new ArrayDeque<>();
    public void add(Order order) {
        orderQueue.add(order);
        order.setTimeReceived(new Date());
    }
}
