package SQS.Message.Queues;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageRequest;

import java.util.List;

public class QueueClient {

    private AmazonSQS sqs;
    private String queueName;
    private String queueURL;
    private List<Message> messages;

    public QueueClient(String queueName) {
        this.sqs = AmazonSQSClientBuilder.defaultClient();
        this.queueName = queueName;
        this.queueURL = this.sqs.getQueueUrl(this.queueName).getQueueUrl();
    }

    public void retrieveFromQueue() {
        messages = sqs.receiveMessage(this.queueURL).getMessages();
    }
}