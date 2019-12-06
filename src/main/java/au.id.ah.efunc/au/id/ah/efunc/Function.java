package au.id.ah.efunc;

/**
 * Created by Anthony on 16/02/2015.
 */
@FunctionalInterface
public interface Function<D,R,E extends Throwable> {
    R apply(D arg) throws E;
}
