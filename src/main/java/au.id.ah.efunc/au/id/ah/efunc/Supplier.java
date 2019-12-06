package au.id.ah.efunc;

/**
 * Created by Anthony on 16/02/2015.
 */
@FunctionalInterface
public interface Supplier<R,E extends Throwable> {
    R get() throws E;
}
