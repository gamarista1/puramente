package o4;

import X3.i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import i4.e;
import i4.g;
import i4.h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o4.B  reason: case insensitive filesystem */
public final class C3876B implements ComponentCallbacks2, g.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f46981f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f46982a;

    /* renamed from: b  reason: collision with root package name */
    private Context f46983b;

    /* renamed from: c  reason: collision with root package name */
    private g f46984c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46985d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46986e = true;

    /* renamed from: o4.B$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3876B(i iVar) {
        this.f46982a = new WeakReference(iVar);
    }

    private final synchronized void d() {
        g gVar;
        try {
            i iVar = (i) this.f46982a.get();
            if (iVar == null) {
                e();
            } else if (this.f46984c == null) {
                if (iVar.j().d()) {
                    Context h10 = iVar.h();
                    iVar.i();
                    gVar = h.a(h10, this, (z) null);
                } else {
                    gVar = new e();
                }
                this.f46984c = gVar;
                this.f46986e = gVar.a();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void a(boolean z10) {
        try {
            i iVar = (i) this.f46982a.get();
            if (iVar != null) {
                iVar.i();
                this.f46986e = z10;
            } else {
                e();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized boolean b() {
        d();
        return this.f46986e;
    }

    public final synchronized void c() {
        try {
            i iVar = (i) this.f46982a.get();
            if (iVar == null) {
                e();
            } else if (this.f46983b == null) {
                Context h10 = iVar.h();
                this.f46983b = h10;
                h10.registerComponentCallbacks(this);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void e() {
        try {
            if (!this.f46985d) {
                this.f46985d = true;
                Context context = this.f46983b;
                if (context != null) {
                    context.unregisterComponentCallbacks(this);
                }
                g gVar = this.f46984c;
                if (gVar != null) {
                    gVar.shutdown();
                }
                this.f46982a.clear();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void onConfigurationChanged(Configuration configuration) {
        if (((i) this.f46982a.get()) == null) {
            e();
        }
    }

    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    public synchronized void onTrimMemory(int i10) {
        try {
            i iVar = (i) this.f46982a.get();
            if (iVar != null) {
                iVar.i();
                iVar.n(i10);
            } else {
                e();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
