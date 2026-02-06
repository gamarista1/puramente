package com.google.firebase.storage;

import Db.C4253b;
import Ea.h;
import Kc.c;
import Kc.e;
import Kc.f;
import Kc.i;
import Lc.g;
import Lc.j;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.storage.D;
import com.google.firebase.storage.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;

public class L extends D {

    /* renamed from: E  reason: collision with root package name */
    private static final Random f58016E = new Random();

    /* renamed from: F  reason: collision with root package name */
    static e f58017F = new f();

    /* renamed from: G  reason: collision with root package name */
    static Ea.e f58018G = h.c();

    /* renamed from: A  reason: collision with root package name */
    private volatile String f58019A;

    /* renamed from: B  reason: collision with root package name */
    private volatile long f58020B;

    /* renamed from: C  reason: collision with root package name */
    private int f58021C;

    /* renamed from: D  reason: collision with root package name */
    private final int f58022D;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final o f58023l;

    /* renamed from: m  reason: collision with root package name */
    private final Uri f58024m;

    /* renamed from: n  reason: collision with root package name */
    private final long f58025n;

    /* renamed from: o  reason: collision with root package name */
    private final Kc.b f58026o;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicLong f58027p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C4253b f58028q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Cb.b f58029r;

    /* renamed from: s  reason: collision with root package name */
    private int f58030s;

    /* renamed from: t  reason: collision with root package name */
    private c f58031t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f58032u;

    /* renamed from: v  reason: collision with root package name */
    private volatile n f58033v;

    /* renamed from: w  reason: collision with root package name */
    private volatile Uri f58034w;

    /* renamed from: x  reason: collision with root package name */
    private volatile Exception f58035x;

    /* renamed from: y  reason: collision with root package name */
    private volatile Exception f58036y;

    /* renamed from: z  reason: collision with root package name */
    private volatile int f58037z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Lc.e f58038a;

        a(Lc.e eVar) {
            this.f58038a = eVar;
        }

        public void run() {
            this.f58038a.B(i.c(L.this.f58028q), i.b(L.this.f58029r), L.this.f58023l.f().m());
        }
    }

    public class b extends D.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f58040c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f58041d;

        /* renamed from: e  reason: collision with root package name */
        private final n f58042e;

        b(Exception exc, long j10, Uri uri, n nVar) {
            super(exc);
            this.f58040c = j10;
            this.f58041d = uri;
            this.f58042e = nVar;
        }

        public long c() {
            return this.f58040c;
        }

        public n d() {
            return this.f58042e;
        }

        public long e() {
            return L.this.q0();
        }
    }

    L(o oVar, n nVar, byte[] bArr) {
        this.f58027p = new AtomicLong(0);
        this.f58030s = 262144;
        this.f58034w = null;
        this.f58035x = null;
        this.f58036y = null;
        this.f58037z = 0;
        this.f58021C = 0;
        this.f58022D = 1000;
        C4536s.l(oVar);
        C4536s.l(bArr);
        C4849e t10 = oVar.t();
        this.f58025n = (long) bArr.length;
        this.f58023l = oVar;
        this.f58033v = nVar;
        C4253b c10 = t10.c();
        this.f58028q = c10;
        Cb.b b10 = t10.b();
        this.f58029r = b10;
        this.f58024m = null;
        this.f58026o = new Kc.b(new ByteArrayInputStream(bArr), 262144);
        this.f58032u = true;
        this.f58020B = t10.j();
        this.f58031t = new c(t10.a().m(), c10, b10, t10.k());
    }

    private void o0() {
        String str;
        JSONObject jSONObject = null;
        if (this.f58033v != null) {
            str = this.f58033v.w();
        } else {
            str = null;
        }
        if (this.f58024m != null && TextUtils.isEmpty(str)) {
            str = this.f58023l.t().a().m().getContentResolver().getType(this.f58024m);
        }
        if (TextUtils.isEmpty(str)) {
            str = "application/octet-stream";
        }
        Kc.h u10 = this.f58023l.u();
        C5230g f10 = this.f58023l.f();
        if (this.f58033v != null) {
            jSONObject = this.f58033v.q();
        }
        j jVar = new j(u10, f10, jSONObject, str);
        if (v0(jVar)) {
            String q10 = jVar.q("X-Goog-Upload-URL");
            if (!TextUtils.isEmpty(q10)) {
                this.f58034w = Uri.parse(q10);
            }
        }
    }

    private boolean p0(Lc.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.f58021C + " milliseconds");
            f58017F.a(this.f58021C + f58016E.nextInt(250));
            boolean u02 = u0(eVar);
            if (u02) {
                this.f58021C = 0;
            }
            return u02;
        } catch (InterruptedException e10) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f58036y = e10;
            return false;
        }
    }

    private boolean r0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    private boolean s0(Lc.e eVar) {
        int o10 = eVar.o();
        if (this.f58031t.b(o10)) {
            o10 = -2;
        }
        this.f58037z = o10;
        this.f58036y = eVar.f();
        this.f58019A = eVar.q("X-Goog-Upload-Status");
        if (!r0(this.f58037z) || this.f58036y != null) {
            return false;
        }
        return true;
    }

    private boolean t0(boolean z10) {
        long j10;
        Lc.i iVar = new Lc.i(this.f58023l.u(), this.f58023l.f(), this.f58034w);
        if ("final".equals(this.f58019A)) {
            return false;
        }
        if (z10) {
            if (!v0(iVar)) {
                return false;
            }
        } else if (!u0(iVar)) {
            return false;
        }
        if ("final".equals(iVar.q("X-Goog-Upload-Status"))) {
            this.f58035x = new IOException("The server has terminated the upload session");
            return false;
        }
        String q10 = iVar.q("X-Goog-Upload-Size-Received");
        if (!TextUtils.isEmpty(q10)) {
            j10 = Long.parseLong(q10);
        } else {
            j10 = 0;
        }
        long j11 = this.f58027p.get();
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 > 0) {
            this.f58035x = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        } else if (i10 >= 0) {
            return true;
        } else {
            try {
                long j12 = j10 - j11;
                if (((long) this.f58026o.a((int) j12)) != j12) {
                    this.f58035x = new IOException("Unexpected end of stream encountered.");
                    return false;
                } else if (this.f58027p.compareAndSet(j11, j10)) {
                    return true;
                } else {
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f58035x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                }
            } catch (IOException e10) {
                Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e10);
                this.f58035x = e10;
                return false;
            }
        }
    }

    private boolean u0(Lc.e eVar) {
        eVar.B(i.c(this.f58028q), i.b(this.f58029r), this.f58023l.f().m());
        return s0(eVar);
    }

    private boolean v0(Lc.e eVar) {
        this.f58031t.d(eVar);
        return s0(eVar);
    }

    private boolean w0() {
        if (!"final".equals(this.f58019A)) {
            return true;
        }
        if (this.f58035x == null) {
            this.f58035x = new IOException("The server has terminated the upload session", this.f58036y);
        }
        j0(64, false);
        return false;
    }

    private boolean x0() {
        boolean z10;
        if (B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f58035x = new InterruptedException();
            j0(64, false);
            return false;
        } else if (B() == 32) {
            j0(256, false);
            return false;
        } else if (B() == 8) {
            j0(16, false);
            return false;
        } else if (!w0()) {
            return false;
        } else {
            if (this.f58034w == null) {
                if (this.f58035x == null) {
                    this.f58035x = new IllegalStateException("Unable to obtain an upload URL.");
                }
                j0(64, false);
                return false;
            } else if (this.f58035x != null) {
                j0(64, false);
                return false;
            } else {
                if (this.f58036y != null || this.f58037z < 200 || this.f58037z >= 300) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long a10 = f58018G.a() + this.f58020B;
                long a11 = f58018G.a() + ((long) this.f58021C);
                if (z10) {
                    if (a11 > a10 || !t0(true)) {
                        if (w0()) {
                            j0(64, false);
                        }
                        return false;
                    }
                    this.f58021C = Math.max(this.f58021C * 2, 1000);
                }
                return true;
            }
        }
    }

    private void z0() {
        try {
            this.f58026o.d(this.f58030s);
            int min = Math.min(this.f58030s, this.f58026o.b());
            g gVar = new g(this.f58023l.u(), this.f58023l.f(), this.f58034w, this.f58026o.e(), this.f58027p.get(), min, this.f58026o.f());
            if (!p0(gVar)) {
                this.f58030s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f58030s);
                return;
            }
            this.f58027p.getAndAdd((long) min);
            if (!this.f58026o.f()) {
                this.f58026o.a(min);
                int i10 = this.f58030s;
                if (i10 < 33554432) {
                    this.f58030s = i10 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f58030s);
                    return;
                }
                return;
            }
            try {
                this.f58033v = new n.b(gVar.n(), this.f58023l).a();
                j0(4, false);
                j0(128, false);
            } catch (JSONException e10) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + gVar.m(), e10);
                this.f58035x = e10;
            }
        } catch (IOException e11) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e11);
            this.f58035x = e11;
        }
    }

    /* access modifiers changed from: package-private */
    public o I() {
        return this.f58023l;
    }

    /* access modifiers changed from: protected */
    public void U() {
        Lc.h hVar;
        this.f58031t.a();
        if (this.f58034w != null) {
            hVar = new Lc.h(this.f58023l.u(), this.f58023l.f(), this.f58034w);
        } else {
            hVar = null;
        }
        if (hVar != null) {
            F.b().f(new a(hVar));
        }
        this.f58035x = m.c(Status.f53911j);
        super.U();
    }

    /* access modifiers changed from: protected */
    public void c0() {
        this.f58035x = null;
        this.f58036y = null;
        this.f58037z = 0;
        this.f58019A = null;
    }

    /* access modifiers changed from: package-private */
    public void e0() {
        this.f58031t.c();
        if (!j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f58023l.p() == null) {
            this.f58035x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f58035x == null) {
            if (this.f58034w == null) {
                o0();
            } else {
                t0(false);
            }
            boolean x02 = x0();
            while (x02) {
                z0();
                x02 = x0();
                if (x02) {
                    j0(4, false);
                }
            }
            if (this.f58032u && B() != 16) {
                try {
                    this.f58026o.c();
                } catch (IOException e10) {
                    Log.e("UploadTask", "Unable to close stream.", e10);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void f0() {
        F.b().h(E());
    }

    /* access modifiers changed from: package-private */
    public long q0() {
        return this.f58025n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public b h0() {
        Exception exc;
        if (this.f58035x != null) {
            exc = this.f58035x;
        } else {
            exc = this.f58036y;
        }
        return new b(m.e(exc, this.f58037z), this.f58027p.get(), this.f58034w, this.f58033v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    L(com.google.firebase.storage.o r11, com.google.firebase.storage.n r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            r10 = this;
            java.lang.String r0 = "UploadTask"
            r10.<init>()
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = 0
            r1.<init>(r2)
            r10.f58027p = r1
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.f58030s = r1
            r2 = 0
            r10.f58034w = r2
            r10.f58035x = r2
            r10.f58036y = r2
            r3 = 0
            r10.f58037z = r3
            r10.f58021C = r3
            r3 = 1000(0x3e8, float:1.401E-42)
            r10.f58022D = r3
            com.google.android.gms.common.internal.C4536s.l(r11)
            com.google.android.gms.common.internal.C4536s.l(r13)
            com.google.firebase.storage.e r3 = r11.t()
            r10.f58023l = r11
            r10.f58033v = r12
            Db.b r6 = r3.c()
            r10.f58028q = r6
            Cb.b r7 = r3.b()
            r10.f58029r = r7
            r10.f58024m = r13
            long r4 = r3.j()
            r10.f58020B = r4
            Kc.c r12 = new Kc.c
            ub.g r4 = r11.f()
            android.content.Context r5 = r4.m()
            long r8 = r3.m()
            r4 = r12
            r4.<init>(r5, r6, r7, r8)
            r10.f58031t = r12
            r3 = -1
            com.google.firebase.storage.e r11 = r11.t()     // Catch:{ FileNotFoundException -> 0x00c3 }
            ub.g r11 = r11.a()     // Catch:{ FileNotFoundException -> 0x00c3 }
            android.content.Context r11 = r11.m()     // Catch:{ FileNotFoundException -> 0x00c3 }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00c3 }
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r12 = r11.openFileDescriptor(r13, r12)     // Catch:{ NullPointerException -> 0x0081, IOException -> 0x007e }
            if (r12 == 0) goto L_0x00a7
            long r5 = r12.getStatSize()     // Catch:{ NullPointerException -> 0x0081, IOException -> 0x007e }
            r12.close()     // Catch:{ NullPointerException -> 0x007c, IOException -> 0x007a }
            goto L_0x00a8
        L_0x007a:
            r12 = move-exception
            goto L_0x0084
        L_0x007c:
            r12 = move-exception
            goto L_0x00a2
        L_0x007e:
            r12 = move-exception
            r5 = r3
            goto L_0x0084
        L_0x0081:
            r12 = move-exception
            r5 = r3
            goto L_0x00a2
        L_0x0084:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x009f }
            r13.<init>()     // Catch:{ FileNotFoundException -> 0x009f }
            java.lang.String r7 = "could not retrieve file size for upload "
            r13.append(r7)     // Catch:{ FileNotFoundException -> 0x009f }
            android.net.Uri r7 = r10.f58024m     // Catch:{ FileNotFoundException -> 0x009f }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x009f }
            r13.append(r7)     // Catch:{ FileNotFoundException -> 0x009f }
            java.lang.String r13 = r13.toString()     // Catch:{ FileNotFoundException -> 0x009f }
            android.util.Log.w(r0, r13, r12)     // Catch:{ FileNotFoundException -> 0x009f }
            goto L_0x00a8
        L_0x009f:
            r11 = move-exception
            r3 = r5
            goto L_0x00c4
        L_0x00a2:
            java.lang.String r13 = "NullPointerException during file size calculation."
            android.util.Log.w(r0, r13, r12)     // Catch:{ FileNotFoundException -> 0x009f }
        L_0x00a7:
            r5 = r3
        L_0x00a8:
            android.net.Uri r12 = r10.f58024m     // Catch:{ FileNotFoundException -> 0x009f }
            java.io.InputStream r2 = r11.openInputStream(r12)     // Catch:{ FileNotFoundException -> 0x009f }
            if (r2 == 0) goto L_0x00e1
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x00bb
            int r11 = r2.available()     // Catch:{ IOException -> 0x00bb }
            if (r11 < 0) goto L_0x00bb
            long r5 = (long) r11
        L_0x00bb:
            r3 = r5
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00c3 }
            r11.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00c3 }
            r2 = r11
            goto L_0x00e0
        L_0x00c3:
            r11 = move-exception
        L_0x00c4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "could not locate file for uploading:"
            r12.append(r13)
            android.net.Uri r13 = r10.f58024m
            java.lang.String r13 = r13.toString()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r0, r12)
            r10.f58035x = r11
        L_0x00e0:
            r5 = r3
        L_0x00e1:
            r10.f58025n = r5
            Kc.b r11 = new Kc.b
            r11.<init>(r2, r1)
            r10.f58026o = r11
            r11 = 1
            r10.f58032u = r11
            r10.f58034w = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.L.<init>(com.google.firebase.storage.o, com.google.firebase.storage.n, android.net.Uri, android.net.Uri):void");
    }
}
