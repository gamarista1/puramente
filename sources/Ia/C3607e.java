package ia;

import android.os.Handler;
import ja.C3645a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ia.e  reason: case insensitive filesystem */
public interface C3607e {

    /* renamed from: ia.e$a */
    public interface a {

        /* renamed from: ia.e$a$a  reason: collision with other inner class name */
        public static final class C0683a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList f44431a = new CopyOnWriteArrayList();

            /* renamed from: ia.e$a$a$a  reason: collision with other inner class name */
            private static final class C0684a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f44432a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f44433b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f44434c;

                public C0684a(Handler handler, a aVar) {
                    this.f44432a = handler;
                    this.f44433b = aVar;
                }

                public void d() {
                    this.f44434c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                C3645a.e(handler);
                C3645a.e(aVar);
                e(aVar);
                this.f44431a.add(new C0684a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                Iterator it = this.f44431a.iterator();
                while (it.hasNext()) {
                    C0684a aVar = (C0684a) it.next();
                    if (!aVar.f44434c) {
                        aVar.f44432a.post(new C3606d(aVar, i10, j10, j11));
                    }
                }
            }

            public void e(a aVar) {
                Iterator it = this.f44431a.iterator();
                while (it.hasNext()) {
                    C0684a aVar2 = (C0684a) it.next();
                    if (aVar2.f44433b == aVar) {
                        aVar2.d();
                        this.f44431a.remove(aVar2);
                    }
                }
            }
        }

        void w(int i10, long j10, long j11);
    }

    J a();

    long c() {
        return -9223372036854775807L;
    }

    long f();

    void g(Handler handler, a aVar);

    void h(a aVar);
}
