package com.google.firebase.storage;

import Kc.c;
import Lc.e;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.firebase.storage.d  reason: case insensitive filesystem */
public class C4848d extends D {

    /* renamed from: l  reason: collision with root package name */
    private final Uri f58047l;

    /* renamed from: m  reason: collision with root package name */
    private long f58048m;

    /* renamed from: n  reason: collision with root package name */
    private o f58049n;

    /* renamed from: o  reason: collision with root package name */
    private c f58050o;

    /* renamed from: p  reason: collision with root package name */
    private long f58051p = -1;

    /* renamed from: q  reason: collision with root package name */
    private String f58052q = null;

    /* renamed from: r  reason: collision with root package name */
    private volatile Exception f58053r = null;

    /* renamed from: s  reason: collision with root package name */
    private long f58054s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f58055t;

    /* renamed from: com.google.firebase.storage.d$a */
    public class a extends D.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f58056c;

        a(Exception exc, long j10) {
            super(exc);
            this.f58056c = j10;
        }

        public long c() {
            return this.f58056c;
        }

        public long d() {
            return C4848d.this.m0();
        }
    }

    C4848d(o oVar, Uri uri) {
        this.f58049n = oVar;
        this.f58047l = uri;
        C4849e t10 = oVar.t();
        this.f58050o = new c(t10.a().m(), t10.c(), t10.b(), t10.k());
    }

    private int l0(InputStream inputStream, byte[] bArr) {
        int read;
        int i10 = 0;
        boolean z10 = false;
        while (i10 != bArr.length && (read = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            try {
                i10 += read;
                z10 = true;
            } catch (IOException e10) {
                this.f58053r = e10;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    private boolean n0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    private boolean o0(e eVar) {
        FileOutputStream fileOutputStream;
        InputStream t10 = eVar.t();
        if (t10 != null) {
            File file = new File(this.f58047l.getPath());
            if (!file.exists()) {
                if (this.f58054s > 0) {
                    throw new IOException("The file to download to has been deleted.");
                } else if (!file.createNewFile()) {
                    Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
                }
            }
            boolean z10 = true;
            if (this.f58054s > 0) {
                Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f58054s);
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                byte[] bArr = new byte[262144];
                while (z10) {
                    int l02 = l0(t10, bArr);
                    if (l02 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, l02);
                    this.f58048m += (long) l02;
                    if (this.f58053r != null) {
                        Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f58053r);
                        this.f58053r = null;
                        z10 = false;
                    }
                    if (!j0(4, false)) {
                        z10 = false;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                t10.close();
                return z10;
            } catch (Throwable th2) {
                fileOutputStream.flush();
                fileOutputStream.close();
                t10.close();
                throw th2;
            }
        } else {
            this.f58053r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public o I() {
        return this.f58049n;
    }

    /* access modifiers changed from: protected */
    public void U() {
        this.f58050o.a();
        this.f58053r = m.c(Status.f53911j);
    }

    /* access modifiers changed from: package-private */
    public void e0() {
        Exception exc;
        boolean z10;
        String str;
        if (this.f58053r != null) {
            j0(64, false);
        } else if (j0(4, false)) {
            do {
                this.f58048m = 0;
                this.f58053r = null;
                this.f58050o.c();
                Lc.c cVar = new Lc.c(this.f58049n.u(), this.f58049n.f(), this.f58054s);
                this.f58050o.e(cVar, false);
                this.f58055t = cVar.o();
                if (cVar.f() != null) {
                    exc = cVar.f();
                } else {
                    exc = this.f58053r;
                }
                this.f58053r = exc;
                if (n0(this.f58055t) && this.f58053r == null && B() == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f58051p = ((long) cVar.r()) + this.f58054s;
                    String q10 = cVar.q("ETag");
                    if (TextUtils.isEmpty(q10) || (str = this.f58052q) == null || str.equals(q10)) {
                        this.f58052q = q10;
                        try {
                            z10 = o0(cVar);
                        } catch (IOException e10) {
                            Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e10);
                            this.f58053r = e10;
                        }
                    } else {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f58054s = 0;
                        this.f58052q = null;
                        cVar.C();
                        f0();
                        return;
                    }
                }
                cVar.C();
                if (z10 && this.f58053r == null && B() == 4) {
                    j0(128, false);
                    return;
                }
                File file = new File(this.f58047l.getPath());
                if (file.exists()) {
                    this.f58054s = file.length();
                } else {
                    this.f58054s = 0;
                }
                if (B() == 8) {
                    j0(16, false);
                    return;
                } else if (B() == 32) {
                    if (!j0(256, false)) {
                        Log.w("FileDownloadTask", "Unable to change download task to final state from " + B());
                        return;
                    }
                    return;
                }
            } while (this.f58048m > 0);
            j0(64, false);
        }
    }

    /* access modifiers changed from: protected */
    public void f0() {
        F.b().g(E());
    }

    /* access modifiers changed from: package-private */
    public long m0() {
        return this.f58051p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public a h0() {
        return new a(m.e(this.f58053r, this.f58055t), this.f58048m + this.f58054s);
    }
}
