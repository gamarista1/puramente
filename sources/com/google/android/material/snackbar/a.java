package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f56112c;

    /* renamed from: a  reason: collision with root package name */
    private final Object f56113a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f56114b = new Handler(Looper.getMainLooper(), new C0836a());

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    class C0836a implements Handler.Callback {
        C0836a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            android.support.v4.media.session.c.a(message.obj);
            aVar.c((c) null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f56112c == null) {
            f56112c = new a();
        }
        return f56112c;
    }

    private boolean d(b bVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this.f56113a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f56113a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f56113a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
