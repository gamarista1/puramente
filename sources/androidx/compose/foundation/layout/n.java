package androidx.compose.foundation.layout;

import C.N;
import C.P;
import androidx.compose.ui.platform.B0;
import c1.h;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

public abstract class n {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f12868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f12869b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f12870c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f12871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f12868a = f10;
            this.f12869b = f11;
            this.f12870c = f12;
            this.f12871d = f13;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f12872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f12873b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f12872a = f10;
            this.f12873b = f11;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f12874a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f12874a = f10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f12875a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N n10) {
            super(1);
            this.f12875a = n10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    public static final N a(float f10) {
        return new P(f10, f10, f10, f10, (DefaultConstructorMarker) null);
    }

    public static final N b(float f10, float f11) {
        return new P(f10, f11, f10, f11, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ N c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.j((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.j((float) 0);
        }
        return b(f10, f11);
    }

    public static final N d(float f10, float f11, float f12, float f13) {
        return new P(f10, f11, f12, f13, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ N e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.j((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.j((float) 0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.j((float) 0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.j((float) 0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(N n10, t tVar) {
        if (tVar == t.Ltr) {
            return n10.b(tVar);
        }
        return n10.c(tVar);
    }

    public static final float g(N n10, t tVar) {
        if (tVar == t.Ltr) {
            return n10.c(tVar);
        }
        return n10.b(tVar);
    }

    public static final i h(i iVar, N n10) {
        return iVar.h(new PaddingValuesElement(n10, new d(n10)));
    }

    public static final i i(i iVar, float f10) {
        return iVar.h(new PaddingElement(f10, f10, f10, f10, true, new c(f10), (DefaultConstructorMarker) null));
    }

    public static final i j(i iVar, float f10, float f11) {
        return iVar.h(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i k(i iVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.j((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.j((float) 0);
        }
        return j(iVar, f10, f11);
    }

    public static final i l(i iVar, float f10, float f11, float f12, float f13) {
        return iVar.h(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i m(i iVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.j((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.j((float) 0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.j((float) 0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.j((float) 0);
        }
        return l(iVar, f10, f11, f12, f13);
    }
}
