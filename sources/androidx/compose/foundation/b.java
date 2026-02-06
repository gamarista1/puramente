package androidx.compose.foundation;

import android.support.v4.media.session.c;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2514n0;
import r0.a2;
import r0.g2;
import yf.C6798l;

public abstract class b {

    public static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f12508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2514n0 f12509b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g2 f12510c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f10, C2514n0 n0Var, g2 g2Var) {
            super(1);
            this.f12508a = f10;
            this.f12509b = n0Var;
            this.f12510c = g2Var;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.foundation.b$b  reason: collision with other inner class name */
    public static final class C0231b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f12511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2 f12512b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0231b(long j10, g2 g2Var) {
            super(1);
            this.f12511a = j10;
            this.f12512b = g2Var;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    public static final i a(i iVar, C2514n0 n0Var, g2 g2Var, float f10) {
        C6798l a10;
        if (C1676z0.b()) {
            a10 = new a(f10, n0Var, g2Var);
        } else {
            a10 = C1676z0.a();
        }
        return iVar.h(new BackgroundElement(0, n0Var, f10, g2Var, a10, 1, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i b(i iVar, C2514n0 n0Var, g2 g2Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g2Var = a2.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(iVar, n0Var, g2Var, f10);
    }

    public static final i c(i iVar, long j10, g2 g2Var) {
        C6798l a10;
        if (C1676z0.b()) {
            a10 = new C0231b(j10, g2Var);
        } else {
            a10 = C1676z0.a();
        }
        return iVar.h(new BackgroundElement(j10, (C2514n0) null, 1.0f, g2Var, a10, 2, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i d(i iVar, long j10, g2 g2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g2Var = a2.a();
        }
        return c(iVar, j10, g2Var);
    }
}
