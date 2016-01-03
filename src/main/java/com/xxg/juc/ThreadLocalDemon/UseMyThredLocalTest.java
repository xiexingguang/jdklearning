package com.xxg.juc.ThreadLocalDemon;

/**
 * Created by ecuser on 2015/12/11.
 */
public class UseMyThredLocalTest implements  Sequence{


    private static MyThreadLocal<Integer> numberMap = new MyThreadLocal<Integer>();

    @Override
    public int getNumber() {
        numberMap.set(numberMap.get()+1);
        return numberMap.get();
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceB();

        ClientThread thread1 = new ClientThread(sequence);
        ClientThread thread2 = new ClientThread(sequence);
        ClientThread thread3 = new ClientThread(sequence);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
