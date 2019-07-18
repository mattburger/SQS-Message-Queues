package SQS.Message.Queues;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;

public class QueuePublisher {

    private AmazonSQS sqs;
    private String queueName;
    private String queueURL;

    public QueuePublisher(String queueName) {
        this.sqs = AmazonSQSClientBuilder.defaultClient();
        this.queueName = queueName;
        this.queueURL = this.sqs.getQueueUrl(this.queueName).getQueueUrl();
    }

    public void publishToQueue() {
        double randNum = Math.random() * 1000;
        int intRandNum = (int) randNum;

        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(this.queueURL)
                .withMessageBody("Message with a random #: " + intRandNum)
                .withDelaySeconds(5);
        sqs.sendMessage(send_msg_request);
    }

}