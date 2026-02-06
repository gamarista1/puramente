package a8;

import Gh.C5407h;
import android.os.Handler;
import android.os.Looper;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.I;
import rh.J;

public final class e extends J {

    /* renamed from: i  reason: collision with root package name */
    private static final String f36165i = "e";

    /* renamed from: a  reason: collision with root package name */
    private final String f36166a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f36167b;

    /* renamed from: c  reason: collision with root package name */
    private final C6703A f36168c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36169d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36170e;

    /* renamed from: f  reason: collision with root package name */
    private I f36171f;

    /* renamed from: g  reason: collision with root package name */
    private c f36172g;

    /* renamed from: h  reason: collision with root package name */
    private b f36173h;

    class a implements Runnable {
        a() {
        }

        public void run() {
            e.this.f();
        }
    }

    public interface b {
        void a();

        void onConnected();
    }

    public interface c {
        void a(C5407h hVar);

        void onMessage(String str);
    }

    public e(String str, c cVar, b bVar) {
        this.f36166a = str;
        this.f36172g = cVar;
        this.f36173h = bVar;
        this.f36167b = new Handler(Looper.getMainLooper());
        C6703A.a aVar = new C6703A.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f36168c = aVar.f(10, timeUnit).W(10, timeUnit).S(0, TimeUnit.MINUTES).c();
    }

    private void b(String str, Throwable th2) {
        String str2 = f36165i;
        U5.a.n(str2, "Error occurred, shutting down websocket connection: " + str, th2);
        d();
    }

    private void d() {
        I i10 = this.f36171f;
        if (i10 != null) {
            try {
                i10.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.f36171f = null;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f36169d) {
            e();
        }
    }

    private void g() {
        if (!this.f36169d) {
            if (!this.f36170e) {
                String str = f36165i;
                U5.a.I(str, "Couldn't connect to \"" + this.f36166a + "\", will silently retry");
                this.f36170e = true;
            }
            this.f36167b.postDelayed(new a(), 2000);
            return;
        }
        throw new IllegalStateException("Can't reconnect closed client");
    }

    public void c() {
        this.f36169d = true;
        d();
        this.f36172g = null;
        b bVar = this.f36173h;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void e() {
        if (!this.f36169d) {
            this.f36168c.C(new C.a().l(this.f36166a).b(), this);
            return;
        }
        throw new IllegalStateException("Can't connect closed client");
    }

    public synchronized void h(String str) {
        I i10 = this.f36171f;
        if (i10 != null) {
            i10.send(str);
        } else {
            throw new ClosedChannelException();
        }
    }

    public synchronized void onClosed(I i10, int i11, String str) {
        try {
            this.f36171f = null;
            if (!this.f36169d) {
                b bVar = this.f36173h;
                if (bVar != null) {
                    bVar.a();
                }
                g();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void onFailure(I i10, Throwable th2, E e10) {
        try {
            if (this.f36171f != null) {
                b("Websocket exception", th2);
            }
            if (!this.f36169d) {
                b bVar = this.f36173h;
                if (bVar != null) {
                    bVar.a();
                }
                g();
            }
        } catch (Throwable th3) {
            while (true) {
                throw th3;
            }
        }
    }

    public synchronized void onMessage(I i10, String str) {
        c cVar = this.f36172g;
        if (cVar != null) {
            cVar.onMessage(str);
        }
    }

    public synchronized void onOpen(I i10, E e10) {
        this.f36171f = i10;
        this.f36170e = false;
        b bVar = this.f36173h;
        if (bVar != null) {
            bVar.onConnected();
        }
    }

    public synchronized void onMessage(I i10, C5407h hVar) {
        c cVar = this.f36172g;
        if (cVar != null) {
            cVar.a(hVar);
        }
    }
}
