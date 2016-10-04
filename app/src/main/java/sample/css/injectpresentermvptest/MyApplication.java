package sample.css.injectpresentermvptest;

import android.app.Application;

/**
 * Application class for the Project. We use it to inject dependencies.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /*
    public TasksRepositoryComponent getTasksRepositoryComponent() {
        return mRepositoryComponent;
    }*/


}
