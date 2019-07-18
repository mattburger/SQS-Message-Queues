package SQS.Message.Queues;

import java.util.Scanner;

public class QPDriver {

    public static void main(String[] args) {

        System.out.println("This driver method runs on the assumption that" +
                "you have THREE queues running on SQS");
        String[] sqsQueues = new String[3];
        QueuePublisher[] queuePublishers = new QueuePublisher[sqsQueues.length];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < sqsQueues.length; i++) {
            System.out.print("Enter Queue " + (i + 1) +" name: ");
            sqsQueues[i] = scanner.nextLine();
        }

        for(int i = 0; i < queuePublishers.length; i++) {
           queuePublishers[i] = new QueuePublisher(sqsQueues[i]);
        }

        // user must either ctrl
        while(true) {
            queuePublishers[0].publishToQueue();
            queuePublishers[1].publishToQueue();
            queuePublishers[2].publishToQueue();
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println("Error!!!");
            }
        }
    }
}