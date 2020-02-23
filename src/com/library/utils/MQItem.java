/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.library.utils;

public class MQItem
{
  
   
   // properties
	private long       QueueId;
	private String     QueueName;
	private long     MinBatchSize;
	private long     MaxBatchSize;
 
   
   

   public MQItem() { }

   public MQItem(long id, String n, long minB, long maxB)
   {
      this.setQueueId(id);
      
      this.setQueueName(n);
      this.setMinBatchSize(minB);
      this.setMaxBatchSize(maxB);
	
   }

public Long getQueueId() {
	return QueueId;
}

public void setQueueId(Long queueId) {
	QueueId = queueId;
}


public String getQueueName() {
	return QueueName;
}

public void setQueueName(String queueName) {
	QueueName = queueName;
}

public Long getMinBatchSize() {
	return MinBatchSize;
}

public void setMinBatchSize(Long minBatchSize) {
	MinBatchSize = minBatchSize;
}

public Long getMaxBatchSize() {
	return MaxBatchSize;
}

public void setMaxBatchSize(Long maxBatchSize) {
	MaxBatchSize = maxBatchSize;
}

}
