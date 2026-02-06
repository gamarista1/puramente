package Eg;

import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62867a = a.f62868a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f62868a = new a();

        private a() {
        }

        public final d a(Runnable runnable, C6798l lVar) {
            if (runnable == null || lVar == null) {
                return new d((Lock) null, 1, (DefaultConstructorMarker) null);
            }
            return new c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
