package C;

import C.C1101t;
import H0.C1193n;
import H0.E;
import H0.U;
import androidx.collection.C1598l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;
import yf.p;

/* renamed from: C.u  reason: case insensitive filesystem */
public final class C1102u {

    /* renamed from: a  reason: collision with root package name */
    private final C1101t.a f1053a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1054b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1055c;

    /* renamed from: d  reason: collision with root package name */
    private int f1056d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f1057e;

    /* renamed from: f  reason: collision with root package name */
    private E f1058f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public U f1059g;

    /* renamed from: h  reason: collision with root package name */
    private E f1060h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public U f1061i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C1598l f1062j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C1598l f1063k;

    /* renamed from: l  reason: collision with root package name */
    private p f1064l;

    /* renamed from: C.u$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1065a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                C.t$a[] r0 = C.C1101t.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                C.t$a r1 = C.C1101t.a.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                C.t$a r1 = C.C1101t.a.Clip     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                C.t$a r1 = C.C1101t.a.ExpandIndicator     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                C.t$a r1 = C.C1101t.a.ExpandOrCollapseIndicator     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f1065a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C.C1102u.a.<clinit>():void");
        }
    }

    /* renamed from: C.u$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1102u f1066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1104w f1067b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1102u uVar, C1104w wVar) {
            super(1);
            this.f1066a = uVar;
            this.f1067b = wVar;
        }

        public final void a(U u10) {
            int i10;
            int i11;
            if (u10 != null) {
                C1104w wVar = this.f1067b;
                i10 = wVar.d(u10);
                i11 = wVar.i(u10);
            } else {
                i10 = 0;
                i11 = 0;
            }
            this.f1066a.f1062j = C1598l.a(C1598l.b(i10, i11));
            this.f1066a.f1059g = u10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: C.u$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1102u f1068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1104w f1069b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1102u uVar, C1104w wVar) {
            super(1);
            this.f1068a = uVar;
            this.f1069b = wVar;
        }

        public final void a(U u10) {
            int i10;
            int i11;
            if (u10 != null) {
                C1104w wVar = this.f1069b;
                i10 = wVar.d(u10);
                i11 = wVar.i(u10);
            } else {
                i10 = 0;
                i11 = 0;
            }
            this.f1068a.f1063k = C1598l.a(C1598l.b(i10, i11));
            this.f1068a.f1061i = u10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U) obj);
            return C6514M.f71813a;
        }
    }

    public C1102u(C1101t.a aVar, int i10, int i11) {
        this.f1053a = aVar;
        this.f1054b = i10;
        this.f1055c = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final C.C1099q.a e(boolean r12, int r13, int r14) {
        /*
            r11 = this;
            C.t$a r0 = r11.f1053a
            int[] r1 = C.C1102u.a.f1065a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0086
            r3 = 2
            if (r0 == r3) goto L_0x0086
            r3 = 3
            if (r0 == r3) goto L_0x001e
            r3 = 4
            if (r0 != r3) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            lf.s r12 = new lf.s
            r12.<init>()
            throw r12
        L_0x001e:
            if (r12 == 0) goto L_0x0046
            yf.p r12 = r11.f1064l
            if (r12 == 0) goto L_0x0036
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            int r14 = r11.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.invoke(r13, r14)
            H0.E r12 = (H0.E) r12
            if (r12 != 0) goto L_0x0038
        L_0x0036:
            H0.E r12 = r11.f1058f
        L_0x0038:
            androidx.collection.l r13 = r11.f1062j
            yf.p r14 = r11.f1064l
            if (r14 != 0) goto L_0x0043
            H0.U r14 = r11.f1059g
        L_0x0040:
            r4 = r12
            r5 = r14
            goto L_0x0072
        L_0x0043:
            r4 = r12
            r5 = r2
            goto L_0x0072
        L_0x0046:
            int r12 = r11.f1054b
            int r12 = r12 - r1
            if (r13 < r12) goto L_0x0068
            int r12 = r11.f1055c
            if (r14 < r12) goto L_0x0068
            yf.p r12 = r11.f1064l
            if (r12 == 0) goto L_0x0065
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            int r14 = r11.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.invoke(r13, r14)
            H0.E r12 = (H0.E) r12
            if (r12 != 0) goto L_0x0069
        L_0x0065:
            H0.E r12 = r11.f1060h
            goto L_0x0069
        L_0x0068:
            r12 = r2
        L_0x0069:
            androidx.collection.l r13 = r11.f1063k
            yf.p r14 = r11.f1064l
            if (r14 != 0) goto L_0x0043
            H0.U r14 = r11.f1061i
            goto L_0x0040
        L_0x0072:
            if (r4 != 0) goto L_0x0075
            return r2
        L_0x0075:
            C.q$a r2 = new C.q$a
            kotlin.jvm.internal.C6496s.e(r13)
            long r6 = r13.i()
            r9 = 8
            r10 = 0
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r8, r9, r10)
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C1102u.e(boolean, int, int):C.q$a");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1102u)) {
            return false;
        }
        C1102u uVar = (C1102u) obj;
        if (this.f1053a == uVar.f1053a && this.f1054b == uVar.f1054b && this.f1055c == uVar.f1055c) {
            return true;
        }
        return false;
    }

    public final C1598l f(boolean z10, int i10, int i11) {
        int i12 = a.f1065a[this.f1053a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                throw new C6535s();
            } else if (z10) {
                return this.f1062j;
            } else {
                if (i10 + 1 < this.f1054b || i11 < this.f1055c) {
                    return null;
                }
                return this.f1063k;
            }
        } else if (z10) {
            return this.f1062j;
        } else {
            return null;
        }
    }

    public final int g() {
        return this.f1054b;
    }

    public final int h() {
        int i10 = this.f1056d;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    public int hashCode() {
        return (((this.f1053a.hashCode() * 31) + Integer.hashCode(this.f1054b)) * 31) + Integer.hashCode(this.f1055c);
    }

    public final C1101t.a i() {
        return this.f1053a;
    }

    public final void j(int i10) {
        this.f1057e = i10;
    }

    public final void k(int i10) {
        this.f1056d = i10;
    }

    public final void l(C1104w wVar, E e10, E e11, long j10) {
        J j11;
        if (wVar.l()) {
            j11 = J.Horizontal;
        } else {
            j11 = J.Vertical;
        }
        long f10 = M.f(M.e(M.c(j10, j11), 0, 0, 0, 0, 10, (Object) null), j11);
        if (e10 != null) {
            C1100s.k(e10, wVar, f10, new b(this, wVar));
            this.f1058f = e10;
        }
        if (e11 != null) {
            C1100s.k(e11, wVar, f10, new c(this, wVar));
            this.f1060h = e11;
        }
    }

    public final void m(C1193n nVar, C1193n nVar2, boolean z10, long j10) {
        J j11;
        E e10;
        E e11;
        if (z10) {
            j11 = J.Horizontal;
        } else {
            j11 = J.Vertical;
        }
        long c10 = M.c(j10, j11);
        if (nVar != null) {
            int i10 = C1100s.i(nVar, z10, c1.b.k(c10));
            this.f1062j = C1598l.a(C1598l.b(i10, C1100s.f(nVar, z10, i10)));
            if (nVar instanceof E) {
                e11 = (E) nVar;
            } else {
                e11 = null;
            }
            this.f1058f = e11;
            this.f1059g = null;
        }
        if (nVar2 != null) {
            int i11 = C1100s.i(nVar2, z10, c1.b.k(c10));
            this.f1063k = C1598l.a(C1598l.b(i11, C1100s.f(nVar2, z10, i11)));
            if (nVar2 instanceof E) {
                e10 = (E) nVar2;
            } else {
                e10 = null;
            }
            this.f1060h = e10;
            this.f1061i = null;
        }
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.f1053a + ", minLinesToShowCollapse=" + this.f1054b + ", minCrossAxisSizeToShowCollapse=" + this.f1055c + ')';
    }
}
