package P9;

import P9.g;
import android.util.SparseArray;
import ia.C3610h;
import ja.B;
import ja.C3645a;
import ja.M;
import k9.C3717q0;
import q9.C3962B;
import q9.C3968c;
import q9.j;
import q9.k;
import q9.l;
import q9.m;
import q9.y;
import q9.z;

public final class e implements m, g {

    /* renamed from: j  reason: collision with root package name */
    public static final g.a f33582j = new d();

    /* renamed from: k  reason: collision with root package name */
    private static final y f33583k = new y();

    /* renamed from: a  reason: collision with root package name */
    private final k f33584a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33585b;

    /* renamed from: c  reason: collision with root package name */
    private final C3717q0 f33586c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray f33587d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    private boolean f33588e;

    /* renamed from: f  reason: collision with root package name */
    private g.b f33589f;

    /* renamed from: g  reason: collision with root package name */
    private long f33590g;

    /* renamed from: h  reason: collision with root package name */
    private z f33591h;

    /* renamed from: i  reason: collision with root package name */
    private C3717q0[] f33592i;

    private static final class a implements C3962B {

        /* renamed from: a  reason: collision with root package name */
        private final int f33593a;

        /* renamed from: b  reason: collision with root package name */
        private final int f33594b;

        /* renamed from: c  reason: collision with root package name */
        private final C3717q0 f33595c;

        /* renamed from: d  reason: collision with root package name */
        private final j f33596d = new j();

        /* renamed from: e  reason: collision with root package name */
        public C3717q0 f33597e;

        /* renamed from: f  reason: collision with root package name */
        private C3962B f33598f;

        /* renamed from: g  reason: collision with root package name */
        private long f33599g;

        public a(int i10, int i11, C3717q0 q0Var) {
            this.f33593a = i10;
            this.f33594b = i11;
            this.f33595c = q0Var;
        }

        public void b(B b10, int i10, int i11) {
            ((C3962B) M.j(this.f33598f)).d(b10, i10);
        }

        public void c(C3717q0 q0Var) {
            C3717q0 q0Var2 = this.f33595c;
            if (q0Var2 != null) {
                q0Var = q0Var.j(q0Var2);
            }
            this.f33597e = q0Var;
            ((C3962B) M.j(this.f33598f)).c(this.f33597e);
        }

        public int e(C3610h hVar, int i10, boolean z10, int i11) {
            return ((C3962B) M.j(this.f33598f)).a(hVar, i10, z10);
        }

        public void f(long j10, int i10, int i11, int i12, C3962B.a aVar) {
            long j11 = this.f33599g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f33598f = this.f33596d;
            }
            ((C3962B) M.j(this.f33598f)).f(j10, i10, i11, i12, aVar);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f33598f = this.f33596d;
                return;
            }
            this.f33599g = j10;
            C3962B d10 = bVar.d(this.f33593a, this.f33594b);
            this.f33598f = d10;
            C3717q0 q0Var = this.f33597e;
            if (q0Var != null) {
                d10.c(q0Var);
            }
        }
    }

    public e(k kVar, int i10, C3717q0 q0Var) {
        this.f33584a = kVar;
        this.f33585b = i10;
        this.f33586c = q0Var;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [w9.e] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ P9.g g(int r6, k9.C3717q0 r7, boolean r8, java.util.List r9, q9.C3962B r10, l9.s0 r11) {
        /*
            java.lang.String r11 = r7.f45769k
            boolean r0 = ja.w.r(r11)
            if (r0 == 0) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            boolean r11 = ja.w.q(r11)
            if (r11 == 0) goto L_0x0017
            w9.e r8 = new w9.e
            r9 = 1
            r8.<init>(r9)
            goto L_0x0028
        L_0x0017:
            if (r8 == 0) goto L_0x001c
            r8 = 4
        L_0x001a:
            r1 = r8
            goto L_0x001e
        L_0x001c:
            r8 = 0
            goto L_0x001a
        L_0x001e:
            y9.g r8 = new y9.g
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0028:
            P9.e r9 = new P9.e
            r9.<init>(r8, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P9.e.g(int, k9.q0, boolean, java.util.List, q9.B, l9.s0):P9.g");
    }

    public boolean a(l lVar) {
        boolean z10;
        int i10 = this.f33584a.i(lVar, f33583k);
        if (i10 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public C3968c b() {
        z zVar = this.f33591h;
        if (zVar instanceof C3968c) {
            return (C3968c) zVar;
        }
        return null;
    }

    public C3717q0[] c() {
        return this.f33592i;
    }

    public C3962B d(int i10, int i11) {
        boolean z10;
        C3717q0 q0Var;
        a aVar = (a) this.f33587d.get(i10);
        if (aVar == null) {
            if (this.f33592i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            if (i11 == this.f33585b) {
                q0Var = this.f33586c;
            } else {
                q0Var = null;
            }
            aVar = new a(i10, i11, q0Var);
            aVar.g(this.f33589f, this.f33590g);
            this.f33587d.put(i10, aVar);
        }
        return aVar;
    }

    public void e(g.b bVar, long j10, long j11) {
        this.f33589f = bVar;
        this.f33590g = j11;
        if (!this.f33588e) {
            this.f33584a.f(this);
            if (j10 != -9223372036854775807L) {
                this.f33584a.a(0, j10);
            }
            this.f33588e = true;
            return;
        }
        k kVar = this.f33584a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.a(0, j10);
        for (int i10 = 0; i10 < this.f33587d.size(); i10++) {
            ((a) this.f33587d.valueAt(i10)).g(bVar, j11);
        }
    }

    public void k() {
        C3717q0[] q0VarArr = new C3717q0[this.f33587d.size()];
        for (int i10 = 0; i10 < this.f33587d.size(); i10++) {
            q0VarArr[i10] = (C3717q0) C3645a.h(((a) this.f33587d.valueAt(i10)).f33597e);
        }
        this.f33592i = q0VarArr;
    }

    public void q(z zVar) {
        this.f33591h = zVar;
    }

    public void release() {
        this.f33584a.release();
    }
}
