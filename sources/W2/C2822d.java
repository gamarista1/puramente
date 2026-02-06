package w2;

import android.os.Handler;
import i2.C2076a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.x;

/* renamed from: w2.d  reason: case insensitive filesystem */
public interface C2822d {

    /* renamed from: w2.d$a */
    public interface a {

        /* renamed from: w2.d$a$a  reason: collision with other inner class name */
        public static final class C0461a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList f27713a = new CopyOnWriteArrayList();

            /* renamed from: w2.d$a$a$a  reason: collision with other inner class name */
            private static final class C0462a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f27714a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f27715b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f27716c;

                public C0462a(Handler handler, a aVar) {
                    this.f27714a = handler;
                    this.f27715b = aVar;
                }

                public void d() {
                    this.f27716c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                C2076a.e(handler);
                C2076a.e(aVar);
                e(aVar);
                this.f27713a.add(new C0462a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                Iterator it = this.f27713a.iterator();
                while (it.hasNext()) {
                    C0462a aVar = (C0462a) it.next();
                    if (!aVar.f27716c) {
                        aVar.f27714a.post(new C2821c(aVar, i10, j10, j11));
                    }
                }
            }

            public void e(a aVar) {
                Iterator it = this.f27713a.iterator();
                while (it.hasNext()) {
                    C0462a aVar2 = (C0462a) it.next();
                    if (aVar2.f27715b == aVar) {
                        aVar2.d();
                        this.f27713a.remove(aVar2);
                    }
                }
            }
        }

        void w(int i10, long j10, long j11);
    }

    x a();

    void c(Handler handler, a aVar);

    void d(a aVar);
}
