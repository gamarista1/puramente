package c7;

import O6.c;
import O6.e;
import T5.k;
import T5.n;
import W5.h;
import W5.j;
import W6.b;
import X5.a;
import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.Pair;
import m7.C3784d;
import m7.C3786f;
import m7.i;

/* renamed from: c7.i  reason: case insensitive filesystem */
public class C3189i implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    private static boolean f36539n;

    /* renamed from: a  reason: collision with root package name */
    private final a f36540a;

    /* renamed from: b  reason: collision with root package name */
    private final n f36541b;

    /* renamed from: c  reason: collision with root package name */
    private c f36542c;

    /* renamed from: d  reason: collision with root package name */
    private int f36543d;

    /* renamed from: e  reason: collision with root package name */
    private int f36544e;

    /* renamed from: f  reason: collision with root package name */
    private int f36545f;

    /* renamed from: g  reason: collision with root package name */
    private int f36546g;

    /* renamed from: h  reason: collision with root package name */
    private int f36547h;

    /* renamed from: i  reason: collision with root package name */
    private int f36548i;

    /* renamed from: j  reason: collision with root package name */
    private b f36549j;

    /* renamed from: k  reason: collision with root package name */
    private ColorSpace f36550k;

    /* renamed from: l  reason: collision with root package name */
    private String f36551l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36552m;

    public C3189i(a aVar) {
        this.f36542c = c.f33387d;
        this.f36543d = -1;
        this.f36544e = 0;
        this.f36545f = -1;
        this.f36546g = -1;
        this.f36547h = 1;
        this.f36548i = -1;
        k.b(Boolean.valueOf(a.T(aVar)));
        this.f36540a = aVar.o();
        this.f36541b = null;
    }

    private void U() {
        Pair pair;
        c d10 = e.d(E());
        this.f36542c = d10;
        if (O6.b.b(d10)) {
            pair = x0();
        } else {
            pair = t0().b();
        }
        if (d10 == O6.b.f33373b && this.f36543d == -1) {
            if (pair != null) {
                int b10 = C3786f.b(E());
                this.f36544e = b10;
                this.f36543d = C3786f.a(b10);
            }
        } else if (d10 == O6.b.f33383l && this.f36543d == -1) {
            int a10 = C3784d.a(E());
            this.f36544e = a10;
            this.f36543d = C3786f.a(a10);
        } else if (this.f36543d == -1) {
            this.f36543d = 0;
        }
    }

    public static C3189i b(C3189i iVar) {
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    public static void f(C3189i iVar) {
        if (iVar != null) {
            iVar.close();
        }
    }

    public static boolean f0(C3189i iVar) {
        if (iVar.f36543d < 0 || iVar.f36545f < 0 || iVar.f36546g < 0) {
            return false;
        }
        return true;
    }

    public static boolean h0(C3189i iVar) {
        if (iVar == null || !iVar.g0()) {
            return false;
        }
        return true;
    }

    private void o0() {
        if (this.f36545f < 0 || this.f36546g < 0) {
            j0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[SYNTHETIC, Splitter:B:15:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m7.C3785e t0() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.E()     // Catch:{ all -> 0x0035 }
            m7.e r1 = m7.C3783c.e(r0)     // Catch:{ all -> 0x002d }
            android.graphics.ColorSpace r2 = r1.a()     // Catch:{ all -> 0x002d }
            r4.f36550k = r2     // Catch:{ all -> 0x002d }
            kotlin.Pair r2 = r1.b()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002f
            java.lang.Object r3 = r2.a()     // Catch:{ all -> 0x002d }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002d }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002d }
            r4.f36545f = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r2 = r2.b()     // Catch:{ all -> 0x002d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002d }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002d }
            r4.f36546g = r2     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r1 = move-exception
            goto L_0x0037
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r1
        L_0x0035:
            r1 = move-exception
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C3189i.t0():m7.e");
    }

    private Pair x0() {
        InputStream E10 = E();
        if (E10 == null) {
            return null;
        }
        Pair f10 = i.f(E10);
        if (f10 != null) {
            this.f36545f = ((Integer) f10.a()).intValue();
            this.f36546g = ((Integer) f10.b()).intValue();
        }
        return f10;
    }

    public void B0(b bVar) {
        this.f36549j = bVar;
    }

    public InputStream E() {
        n nVar = this.f36541b;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        a t10 = a.t(this.f36540a);
        if (t10 == null) {
            return null;
        }
        try {
            return new j((h) t10.I());
        } finally {
            a.E(t10);
        }
    }

    public void E0(int i10) {
        this.f36544e = i10;
    }

    public InputStream F() {
        return (InputStream) k.g(E());
    }

    public int I() {
        return this.f36547h;
    }

    public void I0(int i10) {
        this.f36546g = i10;
    }

    public void L0(c cVar) {
        this.f36542c = cVar;
    }

    public int M() {
        a aVar = this.f36540a;
        if (aVar == null || aVar.I() == null) {
            return this.f36548i;
        }
        return ((h) this.f36540a.I()).size();
    }

    public int M0() {
        o0();
        return this.f36543d;
    }

    public void P0(int i10) {
        this.f36543d = i10;
    }

    public String Q() {
        return this.f36551l;
    }

    public void R0(int i10) {
        this.f36547h = i10;
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return this.f36552m;
    }

    public boolean V(int i10) {
        c cVar = this.f36542c;
        if ((cVar != O6.b.f33373b && cVar != O6.b.f33384m) || this.f36541b != null) {
            return true;
        }
        k.g(this.f36540a);
        h hVar = (h) this.f36540a.I();
        if (i10 < 2) {
            return false;
        }
        if (hVar.r(i10 - 2) == -1 && hVar.r(i10 - 1) == -39) {
            return true;
        }
        return false;
    }

    public void W0(String str) {
        this.f36551l = str;
    }

    public C3189i a() {
        C3189i iVar;
        n nVar = this.f36541b;
        if (nVar != null) {
            iVar = new C3189i(nVar, this.f36548i);
        } else {
            a t10 = a.t(this.f36540a);
            if (t10 == null) {
                iVar = null;
            } else {
                try {
                    iVar = new C3189i(t10);
                } catch (Throwable th2) {
                    a.E(t10);
                    throw th2;
                }
            }
            a.E(t10);
        }
        if (iVar != null) {
            iVar.n(this);
        }
        return iVar;
    }

    public void close() {
        a.E(this.f36540a);
    }

    public int d() {
        o0();
        return this.f36546g;
    }

    public int e() {
        o0();
        return this.f36545f;
    }

    public synchronized boolean g0() {
        boolean z10;
        if (a.T(this.f36540a) || this.f36541b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public void j0() {
        if (!f36539n) {
            U();
        } else if (!this.f36552m) {
            U();
            this.f36552m = true;
        }
    }

    public void n(C3189i iVar) {
        this.f36542c = iVar.y();
        this.f36545f = iVar.e();
        this.f36546g = iVar.d();
        this.f36543d = iVar.M0();
        this.f36544e = iVar.y0();
        this.f36547h = iVar.I();
        this.f36548i = iVar.M();
        this.f36549j = iVar.q();
        this.f36550k = iVar.t();
        this.f36552m = iVar.T();
    }

    public void n1(int i10) {
        this.f36545f = i10;
    }

    public a o() {
        return a.t(this.f36540a);
    }

    public b q() {
        return this.f36549j;
    }

    public ColorSpace t() {
        o0();
        return this.f36550k;
    }

    public String v(int i10) {
        a o10 = o();
        if (o10 == null) {
            return "";
        }
        int min = Math.min(M(), i10);
        byte[] bArr = new byte[min];
        try {
            h hVar = (h) o10.I();
            if (hVar == null) {
                return "";
            }
            hVar.c(0, bArr, 0, min);
            o10.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i11 = 0; i11 < min; i11++) {
                sb2.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i11])}));
            }
            return sb2.toString();
        } finally {
            o10.close();
        }
    }

    public c y() {
        o0();
        return this.f36542c;
    }

    public int y0() {
        o0();
        return this.f36544e;
    }

    public C3189i(n nVar) {
        this.f36542c = c.f33387d;
        this.f36543d = -1;
        this.f36544e = 0;
        this.f36545f = -1;
        this.f36546g = -1;
        this.f36547h = 1;
        this.f36548i = -1;
        k.g(nVar);
        this.f36540a = null;
        this.f36541b = nVar;
    }

    public C3189i(n nVar, int i10) {
        this(nVar);
        this.f36548i = i10;
    }
}
