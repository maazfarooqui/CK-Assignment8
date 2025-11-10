public class ProduceConsumer {

    public static void main(String args[]){



    }


}


class Queue{

    private Integer data;
    void producer(int k) throws  InterruptedException{
        while(data!=null)
        {
            wait();
        }

        data=k;
        notify();
    }
}
