import java.util.concurrent.Executor;

/**
 * Created by Alasdair on 13.02.2017.
 */
public class ThreadPerTask implements Executor{

    @Override
    public void execute(Runnable r) {
        Thread t = new Thread(r);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
