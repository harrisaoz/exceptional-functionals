package au.id.ah.efunc;

/**
 * Created by Anthony on 16/02/2015.
 */
@FunctionalInterface
public interface Block<E extends Throwable> {
    void apply() throws E;
}

