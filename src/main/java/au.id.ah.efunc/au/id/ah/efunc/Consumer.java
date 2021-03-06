package au.id.ah.efunc;

/**
 * Created by Anthony on 16/02/2015.
 */
@FunctionalInterface
public interface Consumer<D, E extends Throwable> {
    void accept(D arg) throws E;
}
