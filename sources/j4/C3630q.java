package j4;

import Ug.C5600w0;
import X3.g;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C1790m;
import k4.C3661c;
import k4.C3666h;
import k4.C3667i;
import kotlin.jvm.internal.C6496s;
import l4.C3737c;
import l4.C3738d;
import mf.C6559l;
import o4.C3876B;
import o4.C3878a;
import o4.h;
import o4.k;
import o4.l;
import o4.v;
import o4.z;

/* renamed from: j4.q  reason: case insensitive filesystem */
public final class C3630q {

    /* renamed from: a  reason: collision with root package name */
    private final g f44772a;

    /* renamed from: b  reason: collision with root package name */
    private final C3876B f44773b;

    /* renamed from: c  reason: collision with root package name */
    private final v f44774c;

    public C3630q(g gVar, C3876B b10, z zVar) {
        this.f44772a = gVar;
        this.f44773b = b10;
        this.f44774c = h.a(zVar);
    }

    private final boolean b(C3627n nVar) {
        if (!C3878a.d(nVar.f()) || this.f44774c.a()) {
            return true;
        }
        return false;
    }

    private final boolean d(C3622i iVar, C3667i iVar2) {
        if (!C3878a.d(iVar.j())) {
            return true;
        }
        if (!c(iVar, iVar.j()) || !this.f44774c.b(iVar2)) {
            return false;
        }
        return true;
    }

    private final boolean e(C3622i iVar) {
        if (iVar.O().isEmpty() || C6559l.W(l.o(), iVar.j())) {
            return true;
        }
        return false;
    }

    public final C3619f a(C3622i iVar, Throwable th2) {
        Drawable drawable;
        if (th2 instanceof C3625l) {
            drawable = iVar.u();
            if (drawable == null) {
                drawable = iVar.t();
            }
        } else {
            drawable = iVar.t();
        }
        return new C3619f(drawable, iVar, th2);
    }

    public final boolean c(C3622i iVar, Bitmap.Config config) {
        if (!C3878a.d(config)) {
            return true;
        }
        if (!iVar.h()) {
            return false;
        }
        C3737c M10 = iVar.M();
        if (M10 instanceof C3738d) {
            View a10 = ((C3738d) M10).a();
            if (!a10.isAttachedToWindow() || a10.isHardwareAccelerated()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final C3627n f(C3622i iVar, C3667i iVar2) {
        Bitmap.Config config;
        C3666h hVar;
        boolean z10;
        if (!e(iVar) || !d(iVar, iVar2)) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = iVar.j();
        }
        Bitmap.Config config2 = config;
        C3661c d10 = iVar2.d();
        C3661c.b bVar = C3661c.b.f45104a;
        if (C6496s.c(d10, bVar) || C6496s.c(iVar2.c(), bVar)) {
            hVar = C3666h.FIT;
        } else {
            hVar = iVar.J();
        }
        C3666h hVar2 = hVar;
        if (!iVar.i() || !iVar.O().isEmpty() || config2 == Bitmap.Config.ALPHA_8) {
            z10 = false;
        } else {
            z10 = true;
        }
        return new C3627n(iVar.l(), config2, iVar.k(), iVar2, hVar2, k.a(iVar), z10, iVar.I(), iVar.r(), iVar.x(), iVar.L(), iVar.E(), iVar.C(), iVar.s(), iVar.D());
    }

    public final C3629p g(C3622i iVar, C5600w0 w0Var) {
        C1790m z10 = iVar.z();
        C3737c M10 = iVar.M();
        if (!(M10 instanceof C3738d)) {
            return new C3614a(z10, w0Var);
        }
        return new C3635v(this.f44772a, iVar, (C3738d) M10, z10, w0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.C3627n h(j4.C3627n r23) {
        /*
            r22 = this;
            android.graphics.Bitmap$Config r0 = r23.f()
            j4.b r1 = r23.k()
            boolean r2 = r22.b(r23)
            r3 = 1
            if (r2 != 0) goto L_0x0014
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r6 = r0
            r2 = r3
            goto L_0x0016
        L_0x0014:
            r2 = 0
            r6 = r0
        L_0x0016:
            j4.b r0 = r23.k()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x002f
            r0 = r22
            o4.B r4 = r0.f44773b
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x0031
            j4.b r1 = j4.C3615b.DISABLED
            r19 = r1
            goto L_0x0034
        L_0x002f:
            r0 = r22
        L_0x0031:
            r19 = r1
            r3 = r2
        L_0x0034:
            if (r3 == 0) goto L_0x0051
            r20 = 16381(0x3ffd, float:2.2955E-41)
            r21 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r4 = r23
            j4.n r1 = j4.C3627n.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x0051:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C3630q.h(j4.n):j4.n");
    }
}
