package Eg;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class d implements k {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f62839b;

    public d(Lock lock) {
        C6496s.h(lock, "lock");
        this.f62839b = lock;
    }

    /* access modifiers changed from: protected */
    public final Lock a() {
        return this.f62839b;
    }

    public void lock() {
        this.f62839b.lock();
    }

    public void unlock() {
        this.f62839b.unlock();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
