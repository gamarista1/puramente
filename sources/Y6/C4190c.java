package y6;

import U6.d;
import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v6.C4106a;
import w6.C4142b;
import w6.C4143c;

/* renamed from: y6.c  reason: case insensitive filesystem */
public final class C4190c implements C4189b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f49543a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4143c f49544b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap.Config f49545c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f49546d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Class f49547e = C4190c.class;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray f49548f = new SparseArray();

    /* renamed from: y6.c$a */
    private final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C4106a f49549a;

        /* renamed from: b  reason: collision with root package name */
        private final C4142b f49550b;

        /* renamed from: c  reason: collision with root package name */
        private final int f49551c;

        /* renamed from: d  reason: collision with root package name */
        private final int f49552d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4190c f49553e;

        public a(C4190c cVar, C4106a aVar, C4142b bVar, int i10, int i11) {
            C6496s.h(aVar, "animationBackend");
            C6496s.h(bVar, "bitmapFrameCache");
            this.f49553e = cVar;
            this.f49549a = aVar;
            this.f49550b = bVar;
            this.f49551c = i10;
            this.f49552d = i11;
        }

        private final boolean a(int i10, int i11) {
            X5.a aVar;
            int i12 = 2;
            if (i11 == 1) {
                aVar = this.f49550b.c(i10, this.f49549a.e(), this.f49549a.c());
            } else if (i11 != 2) {
                X5.a.E((X5.a) null);
                return false;
            } else {
                try {
                    aVar = this.f49553e.f49543a.b(this.f49549a.e(), this.f49549a.c(), this.f49553e.f49545c);
                    i12 = -1;
                } catch (RuntimeException e10) {
                    U5.a.F(this.f49553e.f49547e, "Failed to create frame bitmap", e10);
                    X5.a.E((X5.a) null);
                    return false;
                } catch (Throwable th2) {
                    X5.a.E((X5.a) null);
                    throw th2;
                }
            }
            boolean b10 = b(i10, aVar, i11);
            X5.a.E(aVar);
            if (b10 || i12 == -1) {
                return b10;
            }
            return a(i10, i12);
        }

        private final boolean b(int i10, X5.a aVar, int i11) {
            if (X5.a.T(aVar) && aVar != null) {
                C4143c c10 = this.f49553e.f49544b;
                Object I10 = aVar.I();
                C6496s.g(I10, "get(...)");
                if (c10.a(i10, (Bitmap) I10)) {
                    U5.a.y(this.f49553e.f49547e, "Frame %d ready.", Integer.valueOf(i10));
                    synchronized (this.f49553e.f49548f) {
                        this.f49550b.a(i10, aVar, i11);
                        C6514M m10 = C6514M.f71813a;
                    }
                    return true;
                }
            }
            return false;
        }

        public void run() {
            try {
                if (this.f49550b.p(this.f49551c)) {
                    U5.a.y(this.f49553e.f49547e, "Frame %d is cached already.", Integer.valueOf(this.f49551c));
                    SparseArray d10 = this.f49553e.f49548f;
                    C4190c cVar = this.f49553e;
                    synchronized (d10) {
                        cVar.f49548f.remove(this.f49552d);
                        C6514M m10 = C6514M.f71813a;
                    }
                    return;
                }
                if (a(this.f49551c, 1)) {
                    U5.a.y(this.f49553e.f49547e, "Prepared frame %d.", Integer.valueOf(this.f49551c));
                } else {
                    U5.a.k(this.f49553e.f49547e, "Could not prepare frame %d.", Integer.valueOf(this.f49551c));
                }
                SparseArray d11 = this.f49553e.f49548f;
                C4190c cVar2 = this.f49553e;
                synchronized (d11) {
                    cVar2.f49548f.remove(this.f49552d);
                    C6514M m11 = C6514M.f71813a;
                }
            } catch (Throwable th2) {
                SparseArray d12 = this.f49553e.f49548f;
                C4190c cVar3 = this.f49553e;
                synchronized (d12) {
                    cVar3.f49548f.remove(this.f49552d);
                    C6514M m12 = C6514M.f71813a;
                    throw th2;
                }
            }
        }
    }

    public C4190c(d dVar, C4143c cVar, Bitmap.Config config, ExecutorService executorService) {
        C6496s.h(dVar, "platformBitmapFactory");
        C6496s.h(cVar, "bitmapFrameRenderer");
        C6496s.h(config, "bitmapConfig");
        C6496s.h(executorService, "executorService");
        this.f49543a = dVar;
        this.f49544b = cVar;
        this.f49545c = config;
        this.f49546d = executorService;
    }

    private final int g(C4106a aVar, int i10) {
        return (aVar.hashCode() * 31) + i10;
    }

    public boolean a(C4142b bVar, C4106a aVar, int i10) {
        C6496s.h(bVar, "bitmapFrameCache");
        C6496s.h(aVar, "animationBackend");
        int g10 = g(aVar, i10);
        synchronized (this.f49548f) {
            if (this.f49548f.get(g10) != null) {
                U5.a.y(this.f49547e, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                return true;
            } else if (bVar.p(i10)) {
                U5.a.y(this.f49547e, "Frame %d is cached already.", Integer.valueOf(i10));
                return true;
            } else {
                a aVar2 = new a(this, aVar, bVar, i10, g10);
                this.f49548f.put(g10, aVar2);
                this.f49546d.execute(aVar2);
                C6514M m10 = C6514M.f71813a;
                return true;
            }
        }
    }
}
