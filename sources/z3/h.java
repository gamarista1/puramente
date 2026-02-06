package Z3;

import H0.C1187h;
import X3.g;
import Y.C1500m;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.ui.platform.A0;
import j4.C3622i;
import k4.C3659a;
import k4.C3661c;
import k4.C3667i;
import lf.C6527k;
import n4.C3857d;
import q0.C2427m;
import r0.H1;
import t0.C2605f;
import w0.C2817c;
import x0.C2891d;
import yf.C6798l;

public abstract class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f10466a = new a();

    public static final class a implements C3857d {
        a() {
        }

        public Drawable b() {
            return null;
        }
    }

    public static final f c(Object obj, g gVar, C6798l lVar, C6798l lVar2, C1187h hVar, int i10, p pVar, C1500m mVar, int i11, int i12) {
        C6798l lVar3;
        C6798l lVar4;
        C1187h hVar2;
        int i13;
        p pVar2;
        mVar.z(1645646697);
        if ((i12 & 4) != 0) {
            lVar3 = f.f10429v.a();
        } else {
            lVar3 = lVar;
        }
        if ((i12 & 8) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        if ((i12 & 16) != 0) {
            hVar2 = C1187h.f2609a.d();
        } else {
            hVar2 = hVar;
        }
        if ((i12 & 32) != 0) {
            i13 = C2605f.f25940d0.b();
        } else {
            i13 = i10;
        }
        if ((i12 & 64) != 0) {
            pVar2 = q.a();
        } else {
            pVar2 = pVar;
        }
        Object obj2 = obj;
        g gVar2 = gVar;
        f d10 = d(new i(obj, pVar2, gVar), lVar3, lVar4, hVar2, i13, mVar, (i11 >> 3) & 65520);
        mVar.R();
        return d10;
    }

    private static final f d(i iVar, C6798l lVar, C6798l lVar2, C1187h hVar, int i10, C1500m mVar, int i11) {
        mVar.z(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C3622i k10 = z.k(iVar.b(), mVar, 8);
            h(k10);
            mVar.z(1094691773);
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = new f(k10, iVar.a());
                mVar.r(A10);
            }
            f fVar = (f) A10;
            mVar.R();
            fVar.N(lVar);
            fVar.I(lVar2);
            fVar.F(hVar);
            fVar.G(i10);
            fVar.K(((Boolean) mVar.m(A0.a())).booleanValue());
            fVar.H(iVar.a());
            fVar.L(k10);
            fVar.b();
            mVar.R();
            Trace.endSection();
            return fVar;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static final C3667i e(long j10) {
        C3661c cVar;
        C3661c cVar2;
        if (j10 == C2427m.f25341b.a()) {
            return C3667i.f45119d;
        }
        if (!z.h(j10)) {
            return null;
        }
        float k10 = C2427m.k(j10);
        if (Float.isInfinite(k10) || Float.isNaN(k10)) {
            cVar = C3661c.b.f45104a;
        } else {
            cVar = C3659a.a(Af.a.d(C2427m.k(j10)));
        }
        float i10 = C2427m.i(j10);
        if (Float.isInfinite(i10) || Float.isNaN(i10)) {
            cVar2 = C3661c.b.f45104a;
        } else {
            cVar2 = C3659a.a(Af.a.d(C2427m.i(j10)));
        }
        return new C3667i(cVar, cVar2);
    }

    private static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void g(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    private static final void h(C3622i iVar) {
        Object m10 = iVar.m();
        if (m10 instanceof C3622i.a) {
            f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new C6527k();
        } else if (m10 instanceof H1) {
            g("ImageBitmap", (String) null, 2, (Object) null);
            throw new C6527k();
        } else if (m10 instanceof C2891d) {
            g("ImageVector", (String) null, 2, (Object) null);
            throw new C6527k();
        } else if (m10 instanceof C2817c) {
            g("Painter", (String) null, 2, (Object) null);
            throw new C6527k();
        } else if (iVar.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
