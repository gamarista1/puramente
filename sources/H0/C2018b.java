package h0;

import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import i0.q;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: h0.b  reason: case insensitive filesystem */
public abstract class C2018b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f21097a = 36;

    /* renamed from: h0.b$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2026j f21098a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2026j jVar) {
            super(2);
            this.f21098a = jVar;
        }

        /* renamed from: a */
        public final C1510r0 invoke(C2028l lVar, C1510r0 r0Var) {
            if (r0Var instanceof q) {
                Object a10 = this.f21098a.a(lVar, r0Var.getValue());
                if (a10 == null) {
                    return null;
                }
                o1 d10 = ((q) r0Var).d();
                C6496s.f(d10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return p1.h(a10, d10);
            }
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
    }

    /* renamed from: h0.b$b  reason: collision with other inner class name */
    static final class C0353b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2026j f21099a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0353b(C2026j jVar) {
            super(1);
            this.f21099a = jVar;
        }

        /* renamed from: a */
        public final C1510r0 invoke(C1510r0 r0Var) {
            Object obj;
            if (r0Var instanceof q) {
                if (r0Var.getValue() != null) {
                    C2026j jVar = this.f21099a;
                    Object value = r0Var.getValue();
                    C6496s.e(value);
                    obj = jVar.b(value);
                } else {
                    obj = null;
                }
                o1 d10 = ((q) r0Var).d();
                C6496s.f(d10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
                C1510r0 h10 = p1.h(obj, d10);
                C6496s.f(h10, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
                return h10;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* renamed from: h0.b$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2019c f21100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2026j f21101b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2023g f21102c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f21103d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f21104e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object[] f21105f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2019c cVar, C2026j jVar, C2023g gVar, String str, Object obj, Object[] objArr) {
            super(0);
            this.f21100a = cVar;
            this.f21101b = jVar;
            this.f21102c = gVar;
            this.f21103d = str;
            this.f21104e = obj;
            this.f21105f = objArr;
        }

        public final void invoke() {
            this.f21100a.i(this.f21101b, this.f21102c, this.f21103d, this.f21104e, this.f21105f);
        }
    }

    public static final String b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final C2026j c(C2026j jVar) {
        C6496s.f(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return C2027k.a(new a(jVar), new C0353b(jVar));
    }

    public static final C1510r0 d(Object[] objArr, C2026j jVar, String str, C6787a aVar, C1500m mVar, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (C1506p.H()) {
            C1506p.Q(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        C1510r0 r0Var = (C1510r0) e(Arrays.copyOf(objArr, objArr.length), c(jVar), str2, aVar, mVar, i10 & 8064, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return r0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (r0 == r7.a()) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(java.lang.Object[] r9, h0.C2026j r10, java.lang.String r11, yf.C6787a r12, Y.C1500m r13, int r14, int r15) {
        /*
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0008
            h0.j r10 = h0.C2027k.b()
        L_0x0008:
            r15 = r15 & 4
            r0 = 0
            if (r15 == 0) goto L_0x000e
            r11 = r0
        L_0x000e:
            boolean r15 = Y.C1506p.H()
            if (r15 == 0) goto L_0x001d
            r15 = -1
            java.lang.String r1 = "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)"
            r2 = 441892779(0x1a56bfab, float:4.440899E-23)
            Y.C1506p.Q(r2, r14, r15, r1)
        L_0x001d:
            r15 = 0
            int r1 = Y.C1494j.a(r13, r15)
            if (r11 == 0) goto L_0x002a
            int r2 = r11.length()
            if (r2 != 0) goto L_0x0039
        L_0x002a:
            int r11 = f21097a
            int r11 = Sg.C5538a.a(r11)
            java.lang.String r11 = java.lang.Integer.toString(r1, r11)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.C6496s.g(r11, r1)
        L_0x0039:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            kotlin.jvm.internal.C6496s.f(r10, r1)
            Y.I0 r1 = h0.C2025i.d()
            java.lang.Object r1 = r13.m(r1)
            r6 = r1
            h0.g r6 = (h0.C2023g) r6
            java.lang.Object r1 = r13.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r2 = r7.a()
            if (r1 != r2) goto L_0x0076
            if (r6 == 0) goto L_0x0061
            java.lang.Object r1 = r6.f(r11)
            if (r1 == 0) goto L_0x0061
            java.lang.Object r0 = r10.b(r1)
        L_0x0061:
            if (r0 != 0) goto L_0x0067
            java.lang.Object r0 = r12.invoke()
        L_0x0067:
            r4 = r0
            h0.c r8 = new h0.c
            r0 = r8
            r1 = r10
            r2 = r6
            r3 = r11
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r13.r(r8)
            r1 = r8
        L_0x0076:
            h0.c r1 = (h0.C2019c) r1
            java.lang.Object r0 = r1.g(r9)
            if (r0 != 0) goto L_0x0082
            java.lang.Object r0 = r12.invoke()
        L_0x0082:
            r12 = r0
            boolean r0 = r13.C(r1)
            r2 = r14 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 32
            if (r2 <= r3) goto L_0x0095
            boolean r2 = r13.C(r10)
            if (r2 != 0) goto L_0x0099
        L_0x0095:
            r14 = r14 & 48
            if (r14 != r3) goto L_0x009b
        L_0x0099:
            r14 = 1
            goto L_0x009c
        L_0x009b:
            r14 = r15
        L_0x009c:
            r14 = r14 | r0
            boolean r0 = r13.C(r6)
            r14 = r14 | r0
            boolean r0 = r13.S(r11)
            r14 = r14 | r0
            boolean r0 = r13.C(r12)
            r14 = r14 | r0
            boolean r0 = r13.C(r9)
            r14 = r14 | r0
            java.lang.Object r0 = r13.A()
            if (r14 != 0) goto L_0x00bd
            java.lang.Object r14 = r7.a()
            if (r0 != r14) goto L_0x00cb
        L_0x00bd:
            h0.b$c r14 = new h0.b$c
            r0 = r14
            r2 = r10
            r3 = r6
            r4 = r11
            r5 = r12
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.r(r14)
        L_0x00cb:
            yf.a r0 = (yf.C6787a) r0
            Y.P.h(r0, r13, r15)
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x00d9
            Y.C1506p.P()
        L_0x00d9:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C2018b.e(java.lang.Object[], h0.j, java.lang.String, yf.a, Y.m, int, int):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void f(C2023g gVar, Object obj) {
        String str;
        if (obj != null && !gVar.a(obj)) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (qVar.d() == p1.j() || qVar.d() == p1.q() || qVar.d() == p1.n()) {
                    str = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = b(obj);
            }
            throw new IllegalArgumentException(str);
        }
    }
}
