package W0;

import D0.P;
import Q0.L;
import Q0.Q;
import a0.C1538b;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import q0.C2423i;
import yf.C6787a;
import yf.C6798l;

public final class V implements L {

    /* renamed from: a  reason: collision with root package name */
    private final View f8515a;

    /* renamed from: b  reason: collision with root package name */
    private final C1452u f8516b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f8517c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8518d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C6798l f8519e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C6798l f8520f;

    /* renamed from: g  reason: collision with root package name */
    private Q f8521g;

    /* renamed from: h  reason: collision with root package name */
    private C1450s f8522h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List f8523i;

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f8524j;

    /* renamed from: k  reason: collision with root package name */
    private Rect f8525k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final C1437e f8526l;

    /* renamed from: m  reason: collision with root package name */
    private final C1538b f8527m;

    /* renamed from: n  reason: collision with root package name */
    private Runnable f8528n;

    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8534a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                W0.V$a[] r0 = W0.V.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                W0.V$a r1 = W0.V.a.StartInput     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                W0.V$a r1 = W0.V.a.StopInput     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                W0.V$a r1 = W0.V.a.ShowKeyboard     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                W0.V$a r1 = W0.V.a.HideKeyboard     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f8534a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: W0.V.b.<clinit>():void");
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ V f8535a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(V v10) {
            super(0);
            this.f8535a = v10;
        }

        /* renamed from: a */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.f8535a.q(), false);
        }
    }

    public static final class d implements C1451t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ V f8536a;

        d(V v10) {
            this.f8536a = v10;
        }

        public void a(KeyEvent keyEvent) {
            this.f8536a.p().sendKeyEvent(keyEvent);
        }

        public void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f8536a.f8526l.b(z10, z11, z12, z13, z14, z15);
        }

        public void c(int i10) {
            this.f8536a.f8520f.invoke(r.j(i10));
        }

        public void d(List list) {
            this.f8536a.f8519e.invoke(list);
        }

        public void e(M m10) {
            int size = this.f8536a.f8523i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C6496s.c(((WeakReference) this.f8536a.f8523i.get(i10)).get(), m10)) {
                    this.f8536a.f8523i.remove(i10);
                    return;
                }
            }
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f8537a = new e();

        e() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return C6514M.f71813a;
        }

        public final void invoke(List list) {
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8539a = new g();

        g() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return C6514M.f71813a;
        }

        public final void invoke(List list) {
        }
    }

    public V(View view, P p10, C1452u uVar, Executor executor) {
        this.f8515a = view;
        this.f8516b = uVar;
        this.f8517c = executor;
        this.f8519e = e.f8537a;
        this.f8520f = f.f8538a;
        this.f8521g = new Q("", Q.f5291b.a(), (Q) null, 4, (DefaultConstructorMarker) null);
        this.f8522h = C1450s.f8604g.a();
        this.f8523i = new ArrayList();
        this.f8524j = C6531o.a(C6534r.NONE, new c(this));
        this.f8526l = new C1437e(p10, uVar);
        this.f8527m = new C1538b(new a[16], 0);
    }

    /* access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.f8524j.getValue();
    }

    private final void s() {
        N n10 = new N();
        N n11 = new N();
        C1538b bVar = this.f8527m;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i10 = 0;
            do {
                t((a) p10[i10], n10, n11);
                i10++;
            } while (i10 < q10);
        }
        this.f8527m.i();
        if (C6496s.c(n10.f71759a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) n11.f71759a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (C6496s.c(n10.f71759a, Boolean.FALSE)) {
            u();
        }
    }

    private static final void t(a aVar, N n10, N n11) {
        int i10 = b.f8534a[aVar.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            Boolean bool = Boolean.TRUE;
            n10.f71759a = bool;
            n11.f71759a = bool;
        } else if (i10 == 2) {
            Boolean bool2 = Boolean.FALSE;
            n10.f71759a = bool2;
            n11.f71759a = bool2;
        } else if ((i10 == 3 || i10 == 4) && !C6496s.c(n10.f71759a, Boolean.FALSE)) {
            if (aVar != a.ShowKeyboard) {
                z10 = false;
            }
            n11.f71759a = Boolean.valueOf(z10);
        }
    }

    private final void u() {
        this.f8516b.d();
    }

    private final void v(a aVar) {
        this.f8527m.b(aVar);
        if (this.f8528n == null) {
            U u10 = new U(this);
            this.f8517c.execute(u10);
            this.f8528n = u10;
        }
    }

    /* access modifiers changed from: private */
    public static final void w(V v10) {
        v10.f8528n = null;
        v10.s();
    }

    private final void x(boolean z10) {
        if (z10) {
            this.f8516b.f();
        } else {
            this.f8516b.g();
        }
    }

    public void a() {
        v(a.StartInput);
    }

    public void b(C2423i iVar) {
        Rect rect;
        this.f8525k = new Rect(Af.a.d(iVar.i()), Af.a.d(iVar.l()), Af.a.d(iVar.j()), Af.a.d(iVar.e()));
        if (this.f8523i.isEmpty() && (rect = this.f8525k) != null) {
            this.f8515a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public void c(Q q10, C1450s sVar, C6798l lVar, C6798l lVar2) {
        this.f8518d = true;
        this.f8521g = q10;
        this.f8522h = sVar;
        this.f8519e = lVar;
        this.f8520f = lVar2;
        v(a.StartInput);
    }

    public void d() {
        this.f8518d = false;
        this.f8519e = g.f8539a;
        this.f8520f = h.f8540a;
        this.f8525k = null;
        v(a.StopInput);
    }

    public void e(Q q10, I i10, L l10, C6798l lVar, C2423i iVar, C2423i iVar2) {
        this.f8526l.d(q10, i10, l10, lVar, iVar, iVar2);
    }

    public void f() {
        v(a.HideKeyboard);
    }

    public void g() {
        v(a.ShowKeyboard);
    }

    public void h(Q q10, Q q11) {
        boolean z10;
        int i10;
        if (!Q.g(this.f8521g.g(), q11.g()) || !C6496s.c(this.f8521g.f(), q11.f())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8521g = q11;
        int size = this.f8523i.size();
        for (int i11 = 0; i11 < size; i11++) {
            M m10 = (M) ((WeakReference) this.f8523i.get(i11)).get();
            if (m10 != null) {
                m10.f(q11);
            }
        }
        this.f8526l.a();
        if (C6496s.c(q10, q11)) {
            if (z10) {
                C1452u uVar = this.f8516b;
                int l10 = Q.l(q11.g());
                int k10 = Q.k(q11.g());
                Q f10 = this.f8521g.f();
                int i12 = -1;
                if (f10 != null) {
                    i10 = Q.l(f10.r());
                } else {
                    i10 = -1;
                }
                Q f11 = this.f8521g.f();
                if (f11 != null) {
                    i12 = Q.k(f11.r());
                }
                uVar.c(l10, k10, i10, i12);
            }
        } else if (q10 == null || (C6496s.c(q10.h(), q11.h()) && (!Q.g(q10.g(), q11.g()) || C6496s.c(q10.f(), q11.f())))) {
            int size2 = this.f8523i.size();
            for (int i13 = 0; i13 < size2; i13++) {
                M m11 = (M) ((WeakReference) this.f8523i.get(i13)).get();
                if (m11 != null) {
                    m11.g(this.f8521g, this.f8516b);
                }
            }
        } else {
            u();
        }
    }

    public final InputConnection o(EditorInfo editorInfo) {
        if (!this.f8518d) {
            return null;
        }
        Y.h(editorInfo, this.f8522h, this.f8521g);
        Y.i(editorInfo);
        M m10 = new M(this.f8521g, new d(this), this.f8522h.b());
        this.f8523i.add(new WeakReference(m10));
        return m10;
    }

    public final View q() {
        return this.f8515a;
    }

    public final boolean r() {
        return this.f8518d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(View view, P p10, C1452u uVar, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, p10, uVar, (i10 & 8) != 0 ? Y.d(Choreographer.getInstance()) : executor);
    }

    public V(View view, P p10) {
        this(view, p10, new C1453v(view), (Executor) null, 8, (DefaultConstructorMarker) null);
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f8538a = new f();

        f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return C6514M.f71813a;
        }

        public final void a(int i10) {
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f8540a = new h();

        h() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return C6514M.f71813a;
        }

        public final void a(int i10) {
        }
    }
}
