package m3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

/* renamed from: m3.p  reason: case insensitive filesystem */
public final class C2217p {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f24086a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f24087b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f24088c;

    /* renamed from: d  reason: collision with root package name */
    private final List f24089d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f24090e;

    public C2217p(C6798l lVar, C6787a aVar) {
        C6496s.h(lVar, "callbackInvoker");
        this.f24086a = lVar;
        this.f24087b = aVar;
        this.f24088c = new ReentrantLock();
        this.f24089d = new ArrayList();
    }

    public final int a() {
        return this.f24089d.size();
    }

    public final boolean b() {
        return this.f24090e;
    }

    public final boolean c() {
        if (this.f24090e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f24088c;
        try {
            reentrantLock.lock();
            if (this.f24090e) {
                return false;
            }
            this.f24090e = true;
            List<Object> e12 = C6565s.e1(this.f24089d);
            this.f24089d.clear();
            reentrantLock.unlock();
            C6798l lVar = this.f24086a;
            for (Object invoke : e12) {
                lVar.invoke(invoke);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(Object obj) {
        C6787a aVar = this.f24087b;
        boolean z10 = true;
        if (aVar != null && ((Boolean) aVar.invoke()).booleanValue()) {
            c();
        }
        if (this.f24090e) {
            this.f24086a.invoke(obj);
            return;
        }
        ReentrantLock reentrantLock = this.f24088c;
        try {
            reentrantLock.lock();
            if (!this.f24090e) {
                this.f24089d.add(obj);
                z10 = false;
            }
            if (z10) {
                this.f24086a.invoke(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(Object obj) {
        ReentrantLock reentrantLock = this.f24088c;
        try {
            reentrantLock.lock();
            this.f24089d.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2217p(C6798l lVar, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i10 & 2) != 0 ? null : aVar);
    }
}
