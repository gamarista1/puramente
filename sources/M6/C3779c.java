package m6;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: m6.c  reason: case insensitive filesystem */
public class C3779c {

    /* renamed from: b  reason: collision with root package name */
    private static final C3779c f46474b = new C3779c();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f46475c = true;

    /* renamed from: a  reason: collision with root package name */
    private final Queue f46476a = new ArrayBlockingQueue(20);

    /* renamed from: m6.c$a */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C3779c() {
    }

    public static C3779c a() {
        if (f46475c) {
            return new C3779c();
        }
        return f46474b;
    }

    public void b(a aVar) {
        if (f46475c) {
            int i10 = 5;
            while (!this.f46476a.offer(aVar) && i10 > 0) {
                this.f46476a.poll();
                i10--;
            }
        }
    }

    public String toString() {
        return this.f46476a.toString();
    }
}
