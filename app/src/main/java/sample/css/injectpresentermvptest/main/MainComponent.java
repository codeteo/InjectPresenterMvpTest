package sample.css.injectpresentermvptest.main;

import dagger.Component;
import sample.css.injectpresentermvptest.utils.MainActivityScoped;

/**
 * Adds Scope of {@link MainActivityScoped} to depend to a scoped Component.
 * The component {@link DataRepositoryComponent} is scoped with {@code @Singleton}
 *
 */
@MainActivityScoped
@Component(dependencies = DataRepositoryComponent.class, modules = MainPresenterModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
