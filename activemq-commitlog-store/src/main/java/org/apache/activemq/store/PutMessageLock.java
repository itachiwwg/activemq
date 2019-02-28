package org.apache.activemq.store;

public interface PutMessageLock {

    void lock();

    void unlock();
}
