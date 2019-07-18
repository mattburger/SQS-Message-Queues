package SQS.Message.Queues;

import com.amazonaws.services.sqs.model.Message;

import java.util.Scanner;

public class QCDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Queue name: ");
        String queueName = scanner.nextLine();
        QueueClient qc = new QueueClient(queueName);

        Scanner in = new Scanner(System.in);
        String userInput;
        while(in.nextLine() != "q") {
            qc.retrieveFromQueue();
            userInput = in.nextLine();
            for(Message msg: qc.getMessages()) {
                System.out.println(msg.getBody());
            }
        }

        return;
    }
}
