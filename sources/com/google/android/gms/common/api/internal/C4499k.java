package com.google.android.gms.common.api.internal;

import Fa.C4286a;
import android.os.Looper;
import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.k  reason: case insensitive filesystem */
public final class C4499k {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f54045a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f54046b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f54047c;

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f54048a;

        /* renamed from: b  reason: collision with root package name */
        private final String f54049b;

        a(Object obj, String str) {
            this.f54048a = obj;
            this.f54049b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f54048a != aVar.f54048a || !this.f54049b.equals(aVar.f54049b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f54048a) * 31) + this.f54049b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.k$b */
    public interface b {
        void notifyListener(Object obj);

        void onNotifyListenerFailed();
    }

    C4499k(Looper looper, Object obj, String str) {
        this.f54045a = new C4286a(looper);
        this.f54046b = C4536s.m(obj, "Listener must not be null");
        this.f54047c = new a(obj, C4536s.f(str));
    }

    public void a() {
        this.f54046b = null;
        this.f54047c = null;
    }

    public a b() {
        return this.f54047c;
    }

    public void c(b bVar) {
        C4536s.m(bVar, "Notifier must not be null");
        this.f54045a.execute(new W(this, bVar));
    }

    /* access modifiers changed from: package-private */
    public final void d(b bVar) {
        Object obj = this.f54046b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e10) {
            bVar.onNotifyListenerFailed();
            throw e10;
        }
    }
}
