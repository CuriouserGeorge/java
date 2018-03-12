/*
    11-2 controlling the main method
 */


public class UseMain {
    public static void main(String args[]){
        Thread thrd;

        // get the main thread
        thrd = Thread.currentThread();

        //display main thread's name.
        System.out.println("Main thread is called: "  + thrd.getName());

        //display main threads priority
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        //set the name and the priority
        System.out.println("Setting name and priority");

        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY +3);

        System.out.println("Main thread is now called: " + thrd.getName());
        System.out.println("Priority is now: " + thrd.getPriority());

    }
}
