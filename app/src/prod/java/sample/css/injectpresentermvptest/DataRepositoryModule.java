package sample.css.injectpresentermvptest;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module class for production data
 */
@Module
public class DataRepositoryModule {

    @Singleton
    @Provides
    DataSource provideDataSource(Context context) {
        return new DataSource();
    }

}