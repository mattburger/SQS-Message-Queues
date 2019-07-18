package SQS.Message.Queues;

import java.util.Scanner;

public class QPDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Queue name: ");
        String queueName = scanner.nextLine();
        QueuePublisher qp = new QueuePublisher(queueName);

        Scanner in = new Scanner(System.in);
        String userInput;
        while(in.nextLine() != "q") {
            qp.publishToQueue();
            userInput = in.nextLine();
        }

        return;
    }
}