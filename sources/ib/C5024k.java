package ib;

import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: ib.k  reason: case insensitive filesystem */
public class C5024k {

    /* renamed from: m  reason: collision with root package name */
    public static final C5016c f60725m = new C5022i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    C5017d f60726a;

    /* renamed from: b  reason: collision with root package name */
    C5017d f60727b;

    /* renamed from: c  reason: collision with root package name */
    C5017d f60728c;

    /* renamed from: d  reason: collision with root package name */
    C5017d f60729d;

    /* renamed from: e  reason: collision with root package name */
    C5016c f60730e;

    /* renamed from: f  reason: collision with root package name */
    C5016c f60731f;

    /* renamed from: g  reason: collision with root package name */
    C5016c f60732g;

    /* renamed from: h  reason: collision with root package name */
    C5016c f60733h;

    /* renamed from: i  reason: collision with root package name */
    C5019f f60734i;

    /* renamed from: j  reason: collision with root package name */
    C5019f f60735j;

    /* renamed from: k  reason: collision with root package name */
    C5019f f60736k;

    /* renamed from: l  reason: collision with root package name */
    C5019f f60737l;

    /* renamed from: ib.k$c */
    public interface c {
        C5016c a(C5016c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C5014a((float) i12));
    }

    private static b d(Context context, int i10, int i11, C5016c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, j.f53195j4);
        try {
            int i12 = obtainStyledAttributes.getInt(j.f53203k4, 0);
            int i13 = obtainStyledAttributes.getInt(j.f53227n4, i12);
            int i14 = obtainStyledAttributes.getInt(j.f53235o4, i12);
            int i15 = obtainStyledAttributes.getInt(j.f53219m4, i12);
            int i16 = obtainStyledAttributes.getInt(j.f53211l4, i12);
            C5016c m10 = m(obtainStyledAttributes, j.f53243p4, cVar);
            C5016c m11 = m(obtainStyledAttributes, j.f53267s4, m10);
            C5016c m12 = m(obtainStyledAttributes, j.f53275t4, m10);
            C5016c m13 = m(obtainStyledAttributes, j.f53259r4, m10);
            return new b().z(i13, m11).E(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, j.f53251q4, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C5014a((float) i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, C5016c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53234o3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(j.f53242p3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(j.f53250q3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static C5016c m(TypedArray typedArray, int i10, C5016c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new C5014a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new C5022i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public C5019f h() {
        return this.f60736k;
    }

    public C5017d i() {
        return this.f60729d;
    }

    public C5016c j() {
        return this.f60733h;
    }

    public C5017d k() {
        return this.f60728c;
    }

    public C5016c l() {
        return this.f60732g;
    }

    public C5019f n() {
        return this.f60737l;
    }

    public C5019f o() {
        return this.f60735j;
    }

    public C5019f p() {
        return this.f60734i;
    }

    public C5017d q() {
        return this.f60726a;
    }

    public C5016c r() {
        return this.f60730e;
    }

    public C5017d s() {
        return this.f60727b;
    }

    public C5016c t() {
        return this.f60731f;
    }

    public boolean u(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        Class<C5019f> cls = C5019f.class;
        if (!this.f60737l.getClass().equals(cls) || !this.f60735j.getClass().equals(cls) || !this.f60734i.getClass().equals(cls) || !this.f60736k.getClass().equals(cls)) {
            z10 = false;
        } else {
            z10 = true;
        }
        float a10 = this.f60730e.a(rectF);
        if (this.f60731f.a(rectF) == a10 && this.f60733h.a(rectF) == a10 && this.f60732g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(this.f60727b instanceof C5023j) || !(this.f60726a instanceof C5023j) || !(this.f60728c instanceof C5023j) || !(this.f60729d instanceof C5023j)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public C5024k w(float f10) {
        return v().o(f10).m();
    }

    public C5024k x(C5016c cVar) {
        return v().p(cVar).m();
    }

    public C5024k y(c cVar) {
        return v().C(cVar.a(r())).H(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private C5024k(b bVar) {
        this.f60726a = bVar.f60738a;
        this.f60727b = bVar.f60739b;
        this.f60728c = bVar.f60740c;
        this.f60729d = bVar.f60741d;
        this.f60730e = bVar.f60742e;
        this.f60731f = bVar.f60743f;
        this.f60732g = bVar.f60744g;
        this.f60733h = bVar.f60745h;
        this.f60734i = bVar.f60746i;
        this.f60735j = bVar.f60747j;
        this.f60736k = bVar.f60748k;
        this.f60737l = bVar.f60749l;
    }

    /* renamed from: ib.k$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C5017d f60738a = C5021h.b();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C5017d f60739b = C5021h.b();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public C5017d f60740c = C5021h.b();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C5017d f60741d = C5021h.b();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public C5016c f60742e = new C5014a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C5016c f60743f = new C5014a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public C5016c f60744g = new C5014a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public C5016c f60745h = new C5014a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public C5019f f60746i = C5021h.c();
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public C5019f f60747j = C5021h.c();
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public C5019f f60748k = C5021h.c();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public C5019f f60749l = C5021h.c();

        public b() {
        }

        private static float n(C5017d dVar) {
            if (dVar instanceof C5023j) {
                return ((C5023j) dVar).f60724a;
            }
            if (dVar instanceof C5018e) {
                return ((C5018e) dVar).f60672a;
            }
            return -1.0f;
        }

        public b A(C5017d dVar) {
            this.f60738a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                B(n10);
            }
            return this;
        }

        public b B(float f10) {
            this.f60742e = new C5014a(f10);
            return this;
        }

        public b C(C5016c cVar) {
            this.f60742e = cVar;
            return this;
        }

        public b D(int i10, float f10) {
            return F(C5021h.a(i10)).G(f10);
        }

        public b E(int i10, C5016c cVar) {
            return F(C5021h.a(i10)).H(cVar);
        }

        public b F(C5017d dVar) {
            this.f60739b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                G(n10);
            }
            return this;
        }

        public b G(float f10) {
            this.f60743f = new C5014a(f10);
            return this;
        }

        public b H(C5016c cVar) {
            this.f60743f = cVar;
            return this;
        }

        public C5024k m() {
            return new C5024k(this);
        }

        public b o(float f10) {
            return B(f10).G(f10).w(f10).s(f10);
        }

        public b p(C5016c cVar) {
            return C(cVar).H(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, C5016c cVar) {
            return r(C5021h.a(i10)).t(cVar);
        }

        public b r(C5017d dVar) {
            this.f60741d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f60745h = new C5014a(f10);
            return this;
        }

        public b t(C5016c cVar) {
            this.f60745h = cVar;
            return this;
        }

        public b u(int i10, C5016c cVar) {
            return v(C5021h.a(i10)).x(cVar);
        }

        public b v(C5017d dVar) {
            this.f60740c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f60744g = new C5014a(f10);
            return this;
        }

        public b x(C5016c cVar) {
            this.f60744g = cVar;
            return this;
        }

        public b y(int i10, float f10) {
            return A(C5021h.a(i10)).B(f10);
        }

        public b z(int i10, C5016c cVar) {
            return A(C5021h.a(i10)).C(cVar);
        }

        public b(C5024k kVar) {
            this.f60738a = kVar.f60726a;
            this.f60739b = kVar.f60727b;
            this.f60740c = kVar.f60728c;
            this.f60741d = kVar.f60729d;
            this.f60742e = kVar.f60730e;
            this.f60743f = kVar.f60731f;
            this.f60744g = kVar.f60732g;
            this.f60745h = kVar.f60733h;
            this.f60746i = kVar.f60734i;
            this.f60747j = kVar.f60735j;
            this.f60748k = kVar.f60736k;
            this.f60749l = kVar.f60737l;
        }
    }

    public C5024k() {
        this.f60726a = C5021h.b();
        this.f60727b = C5021h.b();
        this.f60728c = C5021h.b();
        this.f60729d = C5021h.b();
        this.f60730e = new C5014a(0.0f);
        this.f60731f = new C5014a(0.0f);
        this.f60732g = new C5014a(0.0f);
        this.f60733h = new C5014a(0.0f);
        this.f60734i = C5021h.c();
        this.f60735j = C5021h.c();
        this.f60736k = C5021h.c();
        this.f60737l = C5021h.c();
    }
}
