

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationManager {

    /**
     * Method called to send notifications out.
     * @param tasks List of NotificationTasks tasks to be run
     */
    public void sendSaleNotificationsOut(List<NotificationTask> tasks) {
        //Implement this method
        ExecutorService service = Executors.newCachedThreadPool();
        for (NotificationTask task : tasks) {
            service.execute(task);
        }
        service.shutdown();



    }

}
