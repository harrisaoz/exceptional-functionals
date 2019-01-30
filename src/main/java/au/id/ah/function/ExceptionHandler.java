package au.id.ah.function;

import java.lang.Throwable;

/**
 * Created by Anthony on 16/02/2015.
 */
public class ExceptionHandler {
    public static <E extends Throwable> void doUnsafeBlock(Block<E> block) {
        try {
            block.apply();
        } catch (Throwable t) {}
    }

    public static <E extends Throwable> void dub(Block<E> block) {
        ExceptionHandler.doUnsafeBlock(block);
    }

    public static <R, E extends Throwable> R getUnsafeSupplier(Supplier<R,E> supplier) {
        try {
            return supplier.get();
        } catch (Throwable t) {
            return null;
        }
    }

    public static <R, E extends Throwable> R gus(Supplier<R, E> supplier) {
        return ExceptionHandler.getUnsafeSupplier(supplier);
    }
}
