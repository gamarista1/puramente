package Vg;

import Ef.m;
import Ug.A0;
import Ug.C5559b0;
import Ug.C5582n;
import Ug.L0;
import Ug.U;
import Ug.Z;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.g;
import yf.C6798l;

public final class d extends e implements U {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Handler f65423c;

    /* renamed from: d  reason: collision with root package name */
    private final String f65424d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f65425e;

    /* renamed from: f  reason: collision with root package name */
    private final d f65426f;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f65427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f65428b;

        public a(C5582n nVar, d dVar) {
            this.f65427a = nVar;
            this.f65428b = dVar;
        }

        public final void run() {
            this.f65427a.G(this.f65428b, C6514M.f71813a);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f65430b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Runnable runnable) {
            super(1);
            this.f65429a = dVar;
            this.f65430b = runnable;
        }

        public final void a(Throwable th2) {
            this.f65429a.f65423c.removeCallbacks(this.f65430b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    private d(Handler handler, String str, boolean z10) {
        super((DefaultConstructorMarker) null);
        d dVar;
        this.f65423c = handler;
        this.f65424d = str;
        this.f65425e = z10;
        if (z10) {
            dVar = this;
        } else {
            dVar = new d(handler, str, true);
        }
        this.f65426f = dVar;
    }

    private final void I1(g gVar, Runnable runnable) {
        A0.d(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Z.b().z1(gVar, runnable);
    }

    /* access modifiers changed from: private */
    public static final void K1(d dVar, Runnable runnable) {
        dVar.f65423c.removeCallbacks(runnable);
    }

    public boolean B1(g gVar) {
        if (!this.f65425e || !C6496s.c(Looper.myLooper(), this.f65423c.getLooper())) {
            return true;
        }
        return false;
    }

    public C5559b0 I0(long j10, Runnable runnable, g gVar) {
        if (this.f65423c.postDelayed(runnable, m.i(j10, 4611686018427387903L))) {
            return new c(this, runnable);
        }
        I1(gVar, runnable);
        return L0.f65320a;
    }

    /* renamed from: J1 */
    public d F1() {
        return this.f65426f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f65423c == this.f65423c && dVar.f65425e == this.f65425e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void g0(long j10, C5582n nVar) {
        a aVar = new a(nVar, this);
        if (this.f65423c.postDelayed(aVar, m.i(j10, 4611686018427387903L))) {
            nVar.s(new b(this, aVar));
        } else {
            I1(nVar.getContext(), aVar);
        }
    }

    public int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f65423c);
        if (this.f65425e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return identityHashCode ^ i10;
    }

    public String toString() {
        String E12 = E1();
        if (E12 != null) {
            return E12;
        }
        String str = this.f65424d;
        if (str == null) {
            str = this.f65423c.toString();
        }
        if (!this.f65425e) {
            return str;
        }
        return str + ".immediate";
    }

    public void z1(g gVar, Runnable runnable) {
        if (!this.f65423c.post(runnable)) {
            I1(gVar, runnable);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
