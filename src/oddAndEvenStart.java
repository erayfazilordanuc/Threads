public class oddAndEvenStart {

    public static void main(String[] args) throws InterruptedException {

        oddAndEvenFinderThreads finder1 = new oddAndEvenFinderThreads(1);
        oddAndEvenFinderThreads finder2 = new oddAndEvenFinderThreads(2);
        oddAndEvenFinderThreads finder3 = new oddAndEvenFinderThreads(3);
        oddAndEvenFinderThreads finder4 = new oddAndEvenFinderThreads(4);

        Thread t1 = new Thread(finder1);
        Thread t2 = new Thread(finder2);
        Thread t3 = new Thread(finder3);
        Thread t4 = new Thread(finder4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // try {
        //     t1.join();
        //     t2.join();
        //     t3.join();
        //     t4.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        Thread.sleep(3000);

        for(Integer i : finder1.odd){

            System.out.println(i);

        }

        for(Integer i : finder1.even){

            System.out.println(i);

        }

    }

}
