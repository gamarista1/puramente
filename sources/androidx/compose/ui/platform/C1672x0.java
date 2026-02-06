package androidx.compose.ui.platform;

import W0.C1457z;
import W0.H;
import a0.C1538b;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

/* renamed from: androidx.compose.ui.platform.x0  reason: case insensitive filesystem */
final class C1672x0 {

    /* renamed from: a  reason: collision with root package name */
    private final L0 f14082a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6787a f14083b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f14084c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C1538b f14085d = new C1538b(new WeakReference[16], 0);

    /* renamed from: e  reason: collision with root package name */
    private boolean f14086e;

    /* renamed from: androidx.compose.ui.platform.x0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1672x0 f14087a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1672x0 x0Var) {
            super(1);
            this.f14087a = x0Var;
        }

        public final void a(C1457z zVar) {
            int i10;
            zVar.a();
            C1538b a10 = this.f14087a.f14085d;
            int q10 = a10.q();
            if (q10 > 0) {
                Object[] p10 = a10.p();
                i10 = 0;
                while (true) {
                    if (C6496s.c((WeakReference) p10[i10], zVar)) {
                        break;
                    }
                    i10++;
                    if (i10 >= q10) {
                        break;
                    }
                }
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                this.f14087a.f14085d.y(i10);
            }
            if (this.f14087a.f14085d.s()) {
                this.f14087a.f14083b.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1457z) obj);
            return C6514M.f71813a;
        }
    }

    public C1672x0(L0 l02, C6787a aVar) {
        this.f14082a = l02;
        this.f14083b = aVar;
    }

    public final InputConnection c(EditorInfo editorInfo) {
        synchronized (this.f14084c) {
            if (this.f14086e) {
                return null;
            }
            C1457z a10 = H.a(this.f14082a.a(editorInfo), new a(this));
            this.f14085d.b(new WeakReference(a10));
            return a10;
        }
    }

    public final void d() {
        synchronized (this.f14084c) {
            try {
                this.f14086e = true;
                C1538b bVar = this.f14085d;
                int q10 = bVar.q();
                if (q10 > 0) {
                    Object[] p10 = bVar.p();
                    int i10 = 0;
                    do {
                        C1457z zVar = (C1457z) ((WeakReference) p10[i10]).get();
                        if (zVar != null) {
                            zVar.a();
                        }
                        i10++;
                    } while (i10 < q10);
                }
                this.f14085d.i();
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.f14086e;
    }
}
