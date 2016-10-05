package sample.css.injectpresentermvptest.main;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger Module for {@link MainActivity}
 */
@Module
public class MainPresenterModule {

    private final MainMVP.View mView;

    public MainPresenterModule(MainMVP.View view) {
        this.mView = view;
    }

    @Provides
    MainMVP.View provideMainView() {
        return mView;
    }

}
