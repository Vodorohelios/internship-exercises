package exercises02.concurrency.synchronization;

        import java.util.concurrent.*;
public class SynchronizedSheepManager {
    private int sheepCount = 0;
    private void incrementAndReport() {
        synchronized(this) {
            System.out.print((++sheepCount)+" ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SynchronizedSheepManager manager = new SynchronizedSheepManager();
            for(int i=0; i<10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
