package c2;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private int f19270a;

    /* renamed from: b  reason: collision with root package name */
    private b f19271b;

    /* renamed from: c  reason: collision with root package name */
    private Context f19272c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19273d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19274e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19275f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19276g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19277h = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            c.this.o();
        }
    }

    public interface b {
        void a(c cVar, Object obj);
    }

    public c(Context context) {
        this.f19272c = context.getApplicationContext();
    }

    public void a() {
        this.f19274e = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f19277h = false;
    }

    public String d(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        if (obj == null) {
            sb2.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void f(Object obj) {
        b bVar = this.f19271b;
        if (bVar != null) {
            bVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f19270a);
        printWriter.print(" mListener=");
        printWriter.println(this.f19271b);
        if (this.f19273d || this.f19276g || this.f19277h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f19273d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f19276g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f19277h);
        }
        if (this.f19274e || this.f19275f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f19274e);
            printWriter.print(" mReset=");
            printWriter.println(this.f19275f);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f19272c;
    }

    public boolean j() {
        return this.f19274e;
    }

    public boolean k() {
        return this.f19275f;
    }

    public boolean l() {
        return this.f19273d;
    }

    /* access modifiers changed from: protected */
    public abstract boolean n();

    public void o() {
        if (this.f19273d) {
            h();
        } else {
            this.f19276g = true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void r();

    public void t(int i10, b bVar) {
        if (this.f19271b == null) {
            this.f19271b = bVar;
            this.f19270a = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f19270a);
        sb2.append("}");
        return sb2.toString();
    }

    public void u() {
        q();
        this.f19275f = true;
        this.f19273d = false;
        this.f19274e = false;
        this.f19276g = false;
        this.f19277h = false;
    }

    public void v() {
        if (this.f19277h) {
            o();
        }
    }

    public final void w() {
        this.f19273d = true;
        this.f19275f = false;
        this.f19274e = false;
        r();
    }

    public void x() {
        this.f19273d = false;
        s();
    }

    public boolean y() {
        boolean z10 = this.f19276g;
        this.f19276g = false;
        this.f19277h |= z10;
        return z10;
    }

    public void z(b bVar) {
        b bVar2 = this.f19271b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f19271b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void e() {
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public void s() {
    }
}
