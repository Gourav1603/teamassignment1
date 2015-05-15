


import teamassignment1.order;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0655617
 */
public class queue {
   
    Queue<order> orderQueue = new ArrayDeque<>();
    
    public void add(order ordr) {
        orderQueue.add(ordr);
        ordr.setTimeReceived(new Date());
    }
}

