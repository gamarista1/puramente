package androidx.media3.exoplayer;

import androidx.media3.exoplayer.T;
import f2.H;
import i2.C2076a;
import i2.L;
import i2.p;
import java.util.HashMap;
import n2.u1;
import t2.C2615C;
import t2.j0;
import v2.x;
import w2.C2820b;
import w2.C2823e;

/* renamed from: androidx.media3.exoplayer.f  reason: case insensitive filesystem */
public class C1808f implements T {

    /* renamed from: a  reason: collision with root package name */
    private final C2823e f17668a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17669b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17670c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17671d;

    /* renamed from: e  reason: collision with root package name */
    private final long f17672e;

    /* renamed from: f  reason: collision with root package name */
    private final int f17673f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17674g;

    /* renamed from: h  reason: collision with root package name */
    private final long f17675h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17676i;

    /* renamed from: j  reason: collision with root package name */
    private final HashMap f17677j;

    /* renamed from: k  reason: collision with root package name */
    private long f17678k;

    /* renamed from: androidx.media3.exoplayer.f$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17679a;

        /* renamed from: b  reason: collision with root package name */
        public int f17680b;

        private b() {
        }
    }

    public C1808f() {
        this(new C2823e(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    private static void j(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.b(z10, str + " cannot be less than " + str2);
    }

    private static int m(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void n(u1 u1Var) {
        if (this.f17677j.remove(u1Var) != null) {
            p();
        }
    }

    private void o(u1 u1Var) {
        b bVar = (b) C2076a.e((b) this.f17677j.get(u1Var));
        int i10 = this.f17673f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f17680b = i10;
        bVar.f17679a = false;
    }

    private void p() {
        if (this.f17677j.isEmpty()) {
            this.f17668a.g();
        } else {
            this.f17668a.h(l());
        }
    }

    public C2820b a() {
        return this.f17668a;
    }

    public boolean b(T.a aVar) {
        long j10;
        long g02 = L.g0(aVar.f17538e, aVar.f17539f);
        if (aVar.f17541h) {
            j10 = this.f17672e;
        } else {
            j10 = this.f17671d;
        }
        long j11 = aVar.f17542i;
        if (j11 != -9223372036854775807L) {
            j10 = Math.min(j11 / 2, j10);
        }
        if (j10 <= 0 || g02 >= j10 || (!this.f17674g && this.f17668a.f() >= l())) {
            return true;
        }
        return false;
    }

    public long c(u1 u1Var) {
        return this.f17675h;
    }

    public void d(u1 u1Var, H h10, C2615C.b bVar, q0[] q0VarArr, j0 j0Var, x[] xVarArr) {
        b bVar2 = (b) C2076a.e((b) this.f17677j.get(u1Var));
        int i10 = this.f17673f;
        if (i10 == -1) {
            i10 = k(q0VarArr, xVarArr);
        }
        bVar2.f17680b = i10;
        p();
    }

    public boolean e(u1 u1Var) {
        return this.f17676i;
    }

    public void f(u1 u1Var) {
        n(u1Var);
    }

    public boolean g(T.a aVar) {
        boolean z10;
        b bVar = (b) C2076a.e((b) this.f17677j.get(aVar.f17534a));
        boolean z11 = true;
        if (this.f17668a.f() >= l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f17669b;
        float f10 = aVar.f17539f;
        if (f10 > 1.0f) {
            j10 = Math.min(L.b0(j10, f10), this.f17670c);
        }
        long max = Math.max(j10, 500000);
        long j11 = aVar.f17538e;
        if (j11 < max) {
            if (!this.f17674g && z10) {
                z11 = false;
            }
            bVar.f17679a = z11;
            if (!z11 && j11 < 500000) {
                p.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f17670c || z10) {
            bVar.f17679a = false;
        }
        return bVar.f17679a;
    }

    public void h(u1 u1Var) {
        n(u1Var);
        if (this.f17677j.isEmpty()) {
            this.f17678k = -1;
        }
    }

    public void i(u1 u1Var) {
        boolean z10;
        long id2 = Thread.currentThread().getId();
        long j10 = this.f17678k;
        if (j10 == -1 || j10 == id2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.h(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f17678k = id2;
        if (!this.f17677j.containsKey(u1Var)) {
            this.f17677j.put(u1Var, new b());
        }
        o(u1Var);
    }

    /* access modifiers changed from: protected */
    public int k(q0[] q0VarArr, x[] xVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < q0VarArr.length; i11++) {
            if (xVarArr[i11] != null) {
                i10 += m(q0VarArr[i11].e());
            }
        }
        return Math.max(13107200, i10);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        int i10 = 0;
        for (b bVar : this.f17677j.values()) {
            i10 += bVar.f17680b;
        }
        return i10;
    }

    protected C1808f(C2823e eVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", "0");
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", "0");
        this.f17668a = eVar;
        this.f17669b = L.L0((long) i10);
        this.f17670c = L.L0((long) i11);
        this.f17671d = L.L0((long) i12);
        this.f17672e = L.L0((long) i13);
        this.f17673f = i14;
        this.f17674g = z10;
        this.f17675h = L.L0((long) i15);
        this.f17676i = z11;
        this.f17677j = new HashMap();
        this.f17678k = -1;
    }
}
