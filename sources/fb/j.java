package Fb;

import java.util.concurrent.Executor;

public abstract class j {

    private enum a implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor, int i10) {
        return new l(executor, i10);
    }

    public static Executor c(Executor executor) {
        return new m(executor);
    }
}
