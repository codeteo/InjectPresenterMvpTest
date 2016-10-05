package sample.css.injectpresentermvptest.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * In Dagger, an unscoped component cannot depend on a scoped component. As
 * {@link sample.css.injectpresentermvptest.main.DataRepositoryComponent} is a scoped component ({@code @Singleton}, we create a custom
 * scope to be used by all activities components. Additionally, a component with a specific scope
 * cannot have a sub component with the same scope.
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MainActivityScoped {

}
