package c2;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import u1.l;

/* renamed from: c2.a  reason: case insensitive filesystem */
public abstract class C1893a extends c {

    /* renamed from: i  reason: collision with root package name */
    private Executor f19254i;

    /* renamed from: j  reason: collision with root package name */
    private volatile C0333a f19255j;

    /* renamed from: k  reason: collision with root package name */
    private volatile C0333a f19256k;

    /* renamed from: l  reason: collision with root package name */
    private long f19257l;

    /* renamed from: m  reason: collision with root package name */
    private long f19258m = -10000;

    /* renamed from: n  reason: collision with root package name */
    private Handler f19259n;

    /* renamed from: c2.a$a  reason: collision with other inner class name */
    final class C0333a extends d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        boolean f19260f;

        C0333a() {
        }

        /* access modifiers changed from: protected */
        public Object b() {
            try {
                return C1893a.this.I();
            } catch (l e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        /* access modifiers changed from: protected */
        public void g(Object obj) {
            C1893a.this.B(this, obj);
        }

        /* access modifiers changed from: protected */
        public void h(Object obj) {
            C1893a.this.C(this, obj);
        }

        public void run() {
            this.f19260f = false;
            C1893a.this.D();
        }
    }

    public C1893a(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void B(C0333a aVar, Object obj) {
        H(obj);
        if (this.f19256k == aVar) {
            v();
            this.f19258m = SystemClock.uptimeMillis();
            this.f19256k = null;
            e();
            D();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(C0333a aVar, Object obj) {
        if (this.f19255j != aVar) {
            B(aVar, obj);
        } else if (j()) {
            H(obj);
        } else {
            c();
            this.f19258m = SystemClock.uptimeMillis();
            this.f19255j = null;
            f(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        if (this.f19256k == null && this.f19255j != null) {
            if (this.f19255j.f19260f) {
                this.f19255j.f19260f = false;
                this.f19259n.removeCallbacks(this.f19255j);
            }
            if (this.f19257l <= 0 || SystemClock.uptimeMillis() >= this.f19258m + this.f19257l) {
                if (this.f19254i == null) {
                    this.f19254i = E();
                }
                this.f19255j.c(this.f19254i);
                return;
            }
            this.f19255j.f19260f = true;
            this.f19259n.postAtTime(this.f19255j, this.f19258m + this.f19257l);
        }
    }

    /* access modifiers changed from: protected */
    public Executor E() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean F() {
        if (this.f19256k != null) {
            return true;
        }
        return false;
    }

    public abstract Object G();

    /* access modifiers changed from: protected */
    public Object I() {
        return G();
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f19255j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f19255j);
            printWriter.print(" waiting=");
            printWriter.println(this.f19255j.f19260f);
        }
        if (this.f19256k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f19256k);
            printWriter.print(" waiting=");
            printWriter.println(this.f19256k.f19260f);
        }
        if (this.f19257l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f19257l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f19258m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f19258m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        if (this.f19255j == null) {
            return false;
        }
        if (!l()) {
            o();
        }
        if (this.f19256k != null) {
            if (this.f19255j.f19260f) {
                this.f19255j.f19260f = false;
                this.f19259n.removeCallbacks(this.f19255j);
            }
            this.f19255j = null;
            return false;
        } else if (this.f19255j.f19260f) {
            this.f19255j.f19260f = false;
            this.f19259n.removeCallbacks(this.f19255j);
            this.f19255j = null;
            return false;
        } else {
            boolean a10 = this.f19255j.a(false);
            if (a10) {
                this.f19256k = this.f19255j;
                A();
            }
            this.f19255j = null;
            return a10;
        }
    }

    /* access modifiers changed from: protected */
    public void p() {
        super.p();
        b();
        this.f19255j = new C0333a();
        D();
    }

    public void A() {
    }

    public void H(Object obj) {
    }
}
