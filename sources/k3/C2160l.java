package k3;

import android.content.Context;
import android.os.Bundle;
import h0.C2026j;
import h0.C2027k;
import h0.C2028l;
import j3.x;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: k3.l  reason: case insensitive filesystem */
public abstract class C2160l {

    /* renamed from: k3.l$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23362a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Bundle invoke(C2028l lVar, x xVar) {
            return xVar.n0();
        }
    }

    /* renamed from: k3.l$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f23363a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(1);
            this.f23363a = context;
        }

        /* renamed from: a */
        public final x invoke(Bundle bundle) {
            x b10 = C2160l.c(this.f23363a);
            b10.l0(bundle);
            return b10;
        }
    }

    /* renamed from: k3.l$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f23364a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f23364a = context;
        }

        /* renamed from: a */
        public final x invoke() {
            return C2160l.c(this.f23364a);
        }
    }

    private static final C2026j a(Context context) {
        return C2027k.a(a.f23362a, new b(context));
    }

    /* access modifiers changed from: private */
    public static final x c(Context context) {
        x xVar = new x(context);
        xVar.J().b(new C2152d(xVar.J()));
        xVar.J().b(new C2153e());
        xVar.J().b(new C2157i());
        return xVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final j3.x d(j3.C2128E[] r8, Y.C1500m r9, int r10) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)"
            r2 = -312215566(0xffffffffed63f7f2, float:-4.4095528E27)
            Y.C1506p.Q(r2, r10, r0, r1)
        L_0x000f:
            Y.I0 r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r10 = r9.m(r10)
            android.content.Context r10 = (android.content.Context) r10
            int r0 = r8.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r0)
            h0.j r2 = a(r10)
            boolean r0 = r9.C(r10)
            java.lang.Object r3 = r9.A()
            if (r0 != 0) goto L_0x0034
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x003c
        L_0x0034:
            k3.l$c r3 = new k3.l$c
            r3.<init>(r10)
            r9.r(r3)
        L_0x003c:
            r4 = r3
            yf.a r4 = (yf.C6787a) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r9
            java.lang.Object r9 = h0.C2018b.e(r1, r2, r3, r4, r5, r6, r7)
            j3.x r9 = (j3.x) r9
            int r10 = r8.length
            r0 = 0
        L_0x004b:
            if (r0 >= r10) goto L_0x0059
            r1 = r8[r0]
            j3.F r2 = r9.J()
            r2.b(r1)
            int r0 = r0 + 1
            goto L_0x004b
        L_0x0059:
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x0062
            Y.C1506p.P()
        L_0x0062:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C2160l.d(j3.E[], Y.m, int):j3.x");
    }
}
