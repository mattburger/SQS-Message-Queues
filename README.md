# SQS-Message-Queues
## Overview
This Application publishes messages to three different SQS instances [QPDriver.java]() and has the ability to receive messages from these instances [QCDriver.java]().

## Setup
You must first ensure that you have SQS instances running on your AWS console. The following link steps you through the setup process [SQS setup](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-setting-up.html);

## Running Application
- You have to have your AWS credientals setup on you machine first using the following [instructions](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-install.html).
- The application can be run either in an IDE environment by running the QPDriver and QCDriver files respectfully. 
- You can also run the application in the terminal/command line using the following commands to compile the two driver files:
  - ```javac QPDriver.java```
  - ```javac QCDriver.java```
- And the following commands to run the driver files
  - ```java QPDriver```
  - ```java QPDriver```

  
- You can play with the speed of publishing and retrieving messages by increasing or decreasing the integer value within the ```Thread.sleep()``` method. If you manipulate the code, you must recomplie before running in order to see the changes.

- Upon running the QPDriver, you'll be prompted to enter the names of three SQS instances you have