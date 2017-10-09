package producer_consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* A classical producer-consumer design approach.
 * 
 * In producer-consumer design approach, we have two different entities using a common shared resource.
 * 
 * Using this approach helps when you have a process(s) that keeps generating a continuous feed of data and
 * you require these data to be used as an input to your Business Logic.
 *
 * Producer-consumer design allows you to de-couple the entities that are generating the data and trying to
 * process the data.
 * 
 * Entity which tries to produce the data is a producer
 * Entity which tries to consume the data is a consumer
 * De-coupling between the produce and consumer is achieved by creating a shared resource
 * 
 * 
 */


public class Producer {
	
	public Record mRecord;
	
	public BlockingQueue<Record> mQueue = new LinkedBlockingQueue<>();
	
	


}
