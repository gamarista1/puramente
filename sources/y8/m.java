package Y8;

import c9.C3193a;
import java.util.concurrent.Executor;

class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f35764a;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f35765a;

        a(Runnable runnable) {
            this.f35765a = runnable;
        }

        public void run() {
            try {
                this.f35765a.run();
            } catch (Exception e10) {
                C3193a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f35764a = executor;
    }

    public void execute(Runnable runnable) {
        this.f35764a.execute(new a(runnable));
    }
}
