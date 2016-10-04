package sample.css.injectpresentermvptest.main;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger Module for {@link MainActivity}
 */
@Module
public class MainPresenterModule {

    private final MainMVP.View mView;
//    private final DataSource dataSource;

    public MainPresenterModule(MainMVP.View view) {
        this.mView = view;
//        this.dataSource = dataSource;
    }

    @Provides
    MainMVP.View provideMainView() {
        return mView;
    }

    /*
    @Provides
    DataSource provideDataSource() {
        return dataSource;
    }
    */
}
