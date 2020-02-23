/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.library.utils;

public class MTItem
{
  
   
   // properties
   private String MessageTraceGUID;
   private long       TraceId;
   private long	StateCode;
   private long SequenceId;
   private String OutboundCRMGUID;
   private String ParentMessageTraceGUID;
   private long OutboundTraceId;
   private String ProviderCRMGUID;
   private String Message;
   private long QueueItemId;
   private String RequestId;
   private long MessageStatusCode;
   private String MessageStatusDescription;
   private String CreateBy;
   private String SysCreateDate;
   private String NotificationID;

   
   public MTItem() { }
   
public String getMessageTraceGUID() {
	return MessageTraceGUID;
}
public void setMessageTraceGUID(String messageTraceGUID) {
	MessageTraceGUID = messageTraceGUID;
}
public long getTraceId() {
	return TraceId;
}
public void setTraceId(long traceId) {
	TraceId = traceId;
}
public long getStatusCode() {
	return StateCode;
}
public void setStateCode(long stateCode) {
	StateCode = stateCode;
}
public long getSequenceId() {
	return SequenceId;
}
public void setSequenceId(long sequenceId) {
	SequenceId = sequenceId;
}
public String getOutboundCRMGUID() {
	return OutboundCRMGUID;
}
public void setOutboundCRMGUID(String outboundCRMGUID) {
	OutboundCRMGUID = outboundCRMGUID;
}
public long getOutboundTraceId() {
	return OutboundTraceId;
}
public void setOutboundTraceId(long outboundTraceId) {
	OutboundTraceId = outboundTraceId;
}
public String getParentMessageTraceGUID() {
	return ParentMessageTraceGUID;
}
public void setParentMessageTraceGUID(String parentMessageTraceGUID) {
	ParentMessageTraceGUID = parentMessageTraceGUID;
}
public String getProviderCRMGUID() {
	return ProviderCRMGUID;
}
public void setProviderCRMGUID(String providerCRMGUID) {
	ProviderCRMGUID = providerCRMGUID;
}
public String getMessage() {
	return Message;
}
public void setMessage(String message) {
	Message = message;
}
public long getQueueItemId() {
	return QueueItemId;
}
public void setQueueItemId(long queueItemId) {
	QueueItemId = queueItemId;
}
public String getRequestId() {
	return RequestId;
}
public void setRequestId(String requestId) {
	RequestId = requestId;
}
public long getMessageStatusCode() {
	return MessageStatusCode;
}
public void setMessageStatusCode(long messageStatusCode) {
	MessageStatusCode = messageStatusCode;
}
public String getMessageStatusDescription() {
	return MessageStatusDescription;
}
public void setMessageStatusDescription(String messageStatusDescription) {
	MessageStatusDescription = messageStatusDescription;
}
public String getCreateBy() {
	return CreateBy;
}
public void setCreateBy(String createBy) {
	CreateBy = createBy;
}
public String getSysCreateDate() {
	return SysCreateDate;
}
public void setSysCreateDate(String sysCreateDate) {
	SysCreateDate = sysCreateDate;
}
public String getNotificationID() {
	return NotificationID;
}
public void setNotificationID(String notificationID) {
	NotificationID = notificationID;
}


}
