import java.util.List;
import java.util.ArrayList;

public class oddAndEvenFinderThreads implements Runnable{

    ArrayList<Integer> liste1 = new ArrayList<>();
    ArrayList<Integer> liste2 = new ArrayList<>();
    ArrayList<Integer> liste3 = new ArrayList<>();
    ArrayList<Integer> liste4 = new ArrayList<>();

    ArrayList<Integer> odd = new ArrayList<>();

    ArrayList<Integer> even = new ArrayList<>();

    int number;

    public oddAndEvenFinderThreads(int i){

        this.number = i;

    }

    @Override
    public synchronized void run() {
        
        makeList();

        addList();

    }

    public synchronized void addList(){

        switch(this.number){

            case 1 : find(liste1);
            break;

            case 2 : find(liste2);
            break;

            case 3 : find(liste3);
            break;

            case 4 : find(liste4);
            break;

        }

    }

    public synchronized void makeList(){

        for(int i=0; i<=250; i++){

            System.out.println(Thread.currentThread().getName() + " : " + i);

            this.liste1.add(i);

        }
        for(int i=251; i<=500; i++){

            System.out.println(Thread.currentThread().getName() + " : " + i);

            
            this.liste2.add(i);

        }
        for(int i=501; i<=750; i++){

            System.out.println(Thread.currentThread().getName() + " : " + i);

            
            this.liste3.add(i);

        }
        for(int i=751; i<=1000; i++){

            System.out.println(Thread.currentThread().getName() + " : " + i);

            
            this.liste4.add(i);

        }

    }

    public void find(ArrayList<Integer> liste){

        for(Integer i : liste){

            if(i%2!=0){
                this.odd.add(i);
            }else{
                this.even.add(i);
            }

        }

    }

}
