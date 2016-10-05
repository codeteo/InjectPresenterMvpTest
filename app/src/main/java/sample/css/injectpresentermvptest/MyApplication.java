package sample.css.injectpresentermvptest;

import android.app.Application;

import sample.css.injectpresentermvptest.main.DaggerDataRepositoryComponent;
import sample.css.injectpresentermvptest.main.DataRepositoryComponent;

/**
 * Application class for the Project. We use it to inject dependencies.
 */
public class MyApplication extends Application {

    private DataRepositoryComponent dataRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dataRepositoryComponent = DaggerDataRepositoryComponent
                .builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .dataRepositoryModule(new DataRepositoryModule())
                .build();
    }

    public DataRepositoryComponent getDataRepositoryComponent() {
        return dataRepositoryComponent;
    }

}
