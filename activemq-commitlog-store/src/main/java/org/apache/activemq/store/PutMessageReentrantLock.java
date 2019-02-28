package org.apache.activemq.store;

import java.util.concurrent.locks.ReentrantLock;

public class PutMessageReentrantLock implements PutMessageLock{
    private ReentrantLock putMessageNormalLock = new ReentrantLock(); // NonfairSync

    @Override
    public void lock() {
        putMessageNormalLock.lock();
    }

    @Override
    public void unlock() {
        putMessageNormalLock.unlock();
    }
}
