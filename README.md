# SQS-Message-Queues
## Overview
This Application publishes messages to three different SQS instances [QPDriver.java](https://github.com/mattburger/SQS-Message-Queues/blob/master/src/main/java/SQS/Message/Queues/QPDriver.java)

## Setup
You must first ensure that you have SQS instances running on your AWS console. The following link steps you through the setup process [SQS setup](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-setting-up.html);

## Running Application
- You have to have your AWS credientals setup on you machine first using the following [instructions](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-install.html).
- The application can be run either in an IDE environment by running the QPDriver and QCDriver files respectfully. 
- You can also run the application in the terminal/command line using the following command:
  - to be added
  
- You can play with the speed of publishing  messages by increasing or decreasing the integer value within the ```Thread.sleep()``` method. If you manipulate the code, you must recomplie before running in order to see the changes.

- Upon running the QPDriver, you'll be prompted to enter the names of three SQS instances (of queues you already created). After that random messages will be added to all three SQS instances.
- Either stop the application via the stop function in your IDE or by typing ```control + c``` in your terminal.