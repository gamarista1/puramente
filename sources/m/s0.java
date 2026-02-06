package M;

import J.C1228y;
import M.q0;
import P.G;
import Q0.L;
import W0.C1450s;
import W0.I;
import W0.Q;
import W0.r;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.v1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import q0.C2423i;
import yf.C6787a;
import yf.C6798l;

public final class s0 implements L0 {

    /* renamed from: a  reason: collision with root package name */
    private final View f4257a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f4258b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C6798l f4259c = c.f4272a;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C6798l f4260d = d.f4273a;

    /* renamed from: e  reason: collision with root package name */
    private C1228y f4261e;

    /* renamed from: f  reason: collision with root package name */
    private G f4262f;

    /* renamed from: g  reason: collision with root package name */
    private v1 f4263g;

    /* renamed from: h  reason: collision with root package name */
    private Q f4264h = new Q("", Q0.Q.f5291b.a(), (Q0.Q) null, 4, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private C1450s f4265i = C1450s.f8604g.a();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List f4266j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f4267k = C6531o.a(C6534r.NONE, new a(this));

    /* renamed from: l  reason: collision with root package name */
    private Rect f4268l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final p0 f4269m;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s0 f4270a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s0 s0Var) {
            super(0);
            this.f4270a = s0Var;
        }

        /* renamed from: a */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.f4270a.i(), false);
        }
    }

    public static final class b implements k0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s0 f4271a;

        b(s0 s0Var) {
            this.f4271a = s0Var;
        }

        public void a(KeyEvent keyEvent) {
            this.f4271a.h().sendKeyEvent(keyEvent);
        }

        public void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f4271a.f4269m.b(z10, z11, z12, z13, z14, z15);
        }

        public void c(int i10) {
            this.f4271a.f4260d.invoke(r.j(i10));
        }

        public void d(List list) {
            this.f4271a.f4259c.invoke(list);
        }

        public void e(u0 u0Var) {
            int size = this.f4271a.f4266j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C6496s.c(((WeakReference) this.f4271a.f4266j.get(i10)).get(), u0Var)) {
                    this.f4271a.f4266j.remove(i10);
                    return;
                }
            }
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4272a = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return C6514M.f71813a;
        }

        public final void invoke(List list) {
        }
    }

    public s0(View view, C6798l lVar, l0 l0Var) {
        this.f4257a = view;
        this.f4258b = l0Var;
        this.f4269m = new p0(lVar, l0Var);
    }

    /* access modifiers changed from: private */
    public final BaseInputConnection h() {
        return (BaseInputConnection) this.f4267k.getValue();
    }

    private final void k() {
        this.f4258b.d();
    }

    /* renamed from: g */
    public u0 a(EditorInfo editorInfo) {
        C1284z.c(editorInfo, this.f4264h.h(), this.f4264h.g(), this.f4265i, (String[]) null, 8, (Object) null);
        r0.d(editorInfo);
        u0 u0Var = new u0(this.f4264h, new b(this), this.f4265i.b(), this.f4261e, this.f4262f, this.f4263g);
        this.f4266j.add(new WeakReference(u0Var));
        return u0Var;
    }

    public final View i() {
        return this.f4257a;
    }

    public final void j(C2423i iVar) {
        Rect rect;
        this.f4268l = new Rect(Af.a.d(iVar.i()), Af.a.d(iVar.l()), Af.a.d(iVar.j()), Af.a.d(iVar.e()));
        if (this.f4266j.isEmpty() && (rect = this.f4268l) != null) {
            this.f4257a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void l(Q q10, q0.a aVar, C1450s sVar, C6798l lVar, C6798l lVar2) {
        C1228y yVar;
        G g10;
        this.f4264h = q10;
        this.f4265i = sVar;
        this.f4259c = lVar;
        this.f4260d = lVar2;
        v1 v1Var = null;
        if (aVar != null) {
            yVar = aVar.E1();
        } else {
            yVar = null;
        }
        this.f4261e = yVar;
        if (aVar != null) {
            g10 = aVar.f1();
        } else {
            g10 = null;
        }
        this.f4262f = g10;
        if (aVar != null) {
            v1Var = aVar.getViewConfiguration();
        }
        this.f4263g = v1Var;
    }

    public final void m(Q q10, Q q11) {
        boolean z10;
        int i10;
        if (!Q0.Q.g(this.f4264h.g(), q11.g()) || !C6496s.c(this.f4264h.f(), q11.f())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4264h = q11;
        int size = this.f4266j.size();
        for (int i11 = 0; i11 < size; i11++) {
            u0 u0Var = (u0) ((WeakReference) this.f4266j.get(i11)).get();
            if (u0Var != null) {
                u0Var.g(q11);
            }
        }
        this.f4269m.a();
        if (C6496s.c(q10, q11)) {
            if (z10) {
                l0 l0Var = this.f4258b;
                int l10 = Q0.Q.l(q11.g());
                int k10 = Q0.Q.k(q11.g());
                Q0.Q f10 = this.f4264h.f();
                int i12 = -1;
                if (f10 != null) {
                    i10 = Q0.Q.l(f10.r());
                } else {
                    i10 = -1;
                }
                Q0.Q f11 = this.f4264h.f();
                if (f11 != null) {
                    i12 = Q0.Q.k(f11.r());
                }
                l0Var.c(l10, k10, i10, i12);
            }
        } else if (q10 == null || (C6496s.c(q10.h(), q11.h()) && (!Q0.Q.g(q10.g(), q11.g()) || C6496s.c(q10.f(), q11.f())))) {
            int size2 = this.f4266j.size();
            for (int i13 = 0; i13 < size2; i13++) {
                u0 u0Var2 = (u0) ((WeakReference) this.f4266j.get(i13)).get();
                if (u0Var2 != null) {
                    u0Var2.h(this.f4264h, this.f4258b);
                }
            }
        } else {
            k();
        }
    }

    public final void n(Q q10, I i10, L l10, C2423i iVar, C2423i iVar2) {
        this.f4269m.d(q10, i10, l10, iVar, iVar2);
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f4273a = new d();

        d() {
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
