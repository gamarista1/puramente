package D;

import H0.G;
import Ug.L;
import c1.c;
import c1.f;
import c1.h;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;
import yf.C6787a;
import z.q;

public abstract class B {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f1197a = h.j((float) 1);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final r f1198b;

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1203b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, int i11) {
            super(0);
            this.f1202a = i10;
            this.f1203b = i11;
        }

        /* renamed from: a */
        public final A invoke() {
            return new A(this.f1202a, this.f1203b);
        }
    }

    static {
        a aVar = r0;
        a aVar2 = new a();
        f1198b = new r((s) null, 0, false, 0.0f, aVar, 0.0f, false, L.a(qf.h.f72645a), f.b(1.0f, 0.0f, 2, (Object) null), c.b(0, 0, 0, 0, 15, (Object) null), C6565s.n(), 0, 0, 0, false, q.Vertical, 0, 0, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final D.A c(int r10, int r11, Y.C1500m r12, int r13, int r14) {
        /*
            r0 = r14 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r10 = r1
        L_0x0006:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x000b
            r11 = r1
        L_0x000b:
            boolean r14 = Y.C1506p.H()
            if (r14 == 0) goto L_0x001a
            r14 = -1
            java.lang.String r0 = "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)"
            r2 = 1470655220(0x57a86af4, float:3.70354627E14)
            Y.C1506p.Q(r2, r13, r14, r0)
        L_0x001a:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            D.A$c r14 = D.A.f1150y
            h0.j r4 = r14.a()
            r14 = r13 & 14
            r14 = r14 ^ 6
            r0 = 4
            r2 = 1
            if (r14 <= r0) goto L_0x0030
            boolean r14 = r12.d(r10)
            if (r14 != 0) goto L_0x0034
        L_0x0030:
            r14 = r13 & 6
            if (r14 != r0) goto L_0x0036
        L_0x0034:
            r14 = r2
            goto L_0x0037
        L_0x0036:
            r14 = r1
        L_0x0037:
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r5 = 32
            if (r0 <= r5) goto L_0x0045
            boolean r0 = r12.d(r11)
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r13 = r13 & 48
            if (r13 != r5) goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r13 = r14 | r1
            java.lang.Object r14 = r12.A()
            if (r13 != 0) goto L_0x005a
            Y.m$a r13 = Y.C1500m.f10026a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x0062
        L_0x005a:
            D.B$b r14 = new D.B$b
            r14.<init>(r10, r11)
            r12.r(r14)
        L_0x0062:
            r6 = r14
            yf.a r6 = (yf.C6787a) r6
            r8 = 0
            r9 = 4
            r5 = 0
            r7 = r12
            java.lang.Object r10 = h0.C2018b.e(r3, r4, r5, r6, r7, r8, r9)
            D.A r10 = (D.A) r10
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0078
            Y.C1506p.P()
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: D.B.c(int, int, Y.m, int, int):D.A");
    }

    public static final class a implements G {

        /* renamed from: a  reason: collision with root package name */
        private final int f1199a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1200b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f1201c = O.i();

        a() {
        }

        public int d() {
            return this.f1200b;
        }

        public int e() {
            return this.f1199a;
        }

        public Map p() {
            return this.f1201c;
        }

        public void q() {
        }
    }
}
