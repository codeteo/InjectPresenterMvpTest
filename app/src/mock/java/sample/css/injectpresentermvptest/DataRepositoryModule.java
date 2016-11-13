package sample.css.injectpresentermvptest;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger Module class to provide app with the DataSource of the mock sourceSet
 */
@Module
public class DataRepositoryModule {

    @Singleton
    @Provides
    DataSource provideDataSource(Context context) {
        return new DataSource();
    }

}