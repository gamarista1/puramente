package androidx.compose.foundation.relocation;

import H.b;
import a0.C1538b;
import kotlin.coroutines.jvm.internal.d;
import q0.C2423i;
import qf.C6658d;

final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f13108a = new C1538b(new e[16], 0);

    /* renamed from: androidx.compose.foundation.relocation.a$a  reason: collision with other inner class name */
    static final class C0246a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f13109a;

        /* renamed from: b  reason: collision with root package name */
        Object f13110b;

        /* renamed from: c  reason: collision with root package name */
        int f13111c;

        /* renamed from: d  reason: collision with root package name */
        int f13112d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f13113e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f13114f;

        /* renamed from: g  reason: collision with root package name */
        int f13115g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0246a(a aVar, C6658d dVar) {
            super(dVar);
            this.f13114f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13113e = obj;
            this.f13115g |= Integer.MIN_VALUE;
            return this.f13114f.b((C2423i) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r8 >= r2) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(q0.C2423i r8, qf.C6658d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.a.C0246a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C0246a) r0
            int r1 = r0.f13115g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13115g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f13113e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f13115g
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r8 = r0.f13112d
            int r2 = r0.f13111c
            java.lang.Object r4 = r0.f13110b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f13109a
            q0.i r5 = (q0.C2423i) r5
            lf.w.b(r9)
            r9 = r5
            goto L_0x0067
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            lf.w.b(r9)
            a0.b r9 = r7.f13108a
            int r2 = r9.q()
            if (r2 <= 0) goto L_0x006a
            java.lang.Object[] r9 = r9.p()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L_0x0052:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.e) r5
            r0.f13109a = r9
            r0.f13110b = r4
            r0.f13111c = r2
            r0.f13112d = r8
            r0.f13115g = r3
            java.lang.Object r5 = H.e.a(r5, r9, r0)
            if (r5 != r1) goto L_0x0067
            return r1
        L_0x0067:
            int r8 = r8 + r3
            if (r8 < r2) goto L_0x0052
        L_0x006a:
            lf.M r8 = lf.C6514M.f71813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.b(q0.i, qf.d):java.lang.Object");
    }

    public final C1538b c() {
        return this.f13108a;
    }
}
