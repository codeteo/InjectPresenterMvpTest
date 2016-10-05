package sample.css.injectpresentermvptest.main;

import javax.inject.Singleton;

import dagger.Component;
import sample.css.injectpresentermvptest.DataRepositoryModule;
import sample.css.injectpresentermvptest.ApplicationModule;
import sample.css.injectpresentermvptest.DataSource;

/**
 * Created by css on 10/5/16.
 */
@Singleton
@Component(modules = {DataRepositoryModule.class, ApplicationModule.class})
public interface DataRepositoryComponent {

    DataSource getDataSource();
}
