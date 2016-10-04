package sample.css.injectpresentermvptest.main;

import dagger.Component;

/**
 * Created by css on 10/4/16.
 */
@Component(modules = MainPresenterModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
