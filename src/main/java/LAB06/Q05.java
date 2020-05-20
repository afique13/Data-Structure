/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB06;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Packet> packetPriorityEnqueue = new PriorityQueue<>();
        PriorityQueue<Packet> packetPriorityDequeue = new PriorityQueue<>();
        Random rand = new Random();
        Packet newPacket;

        System.out.println();
        System.out.println("________________");
        System.out.println("                ");
        System.out.println("Priority Enqueue");
        System.out.println("________________");
        System.out.println();
        System.out.println("10 packets arrived");
        for (int i = 0; i < 10; i++) {
            newPacket = new Packet(rand.nextInt(3), (i+1));
            System.out.println(newPacket.toString());
            packetPriorityEnqueue.priorityEnqueue(newPacket);
        }

        System.out.println();
        System.out.println("Processing 10 network packets");
        while (!packetPriorityEnqueue.isEmpty()) {
            newPacket = packetPriorityEnqueue.priorityDequeue();
            System.out.println(newPacket.toString() + (" (Priority=" + newPacket.getPriority() + ")"));
        }

        System.out.println();
        System.out.println("________________");
        System.out.println("                ");
        System.out.println("Priority Dequeue");
        System.out.println("________________");
        System.out.println();
        System.out.println("10 packets arrived");
        for (int i = 0; i < 10; i++) {
            newPacket = new Packet(rand.nextInt(3), (i+1));
            System.out.println(newPacket.toString());
            packetPriorityDequeue.enqueue(newPacket);
        }

        System.out.println();
        System.out.println("Processing 10 network packets");
        while (!packetPriorityDequeue.isEmpty()) {
            newPacket = packetPriorityDequeue.priorityDequeue();
            System.out.println(newPacket.toString() + (" (Priority=" + newPacket.getPriority() + ")"));
        }
    }
    }
    

