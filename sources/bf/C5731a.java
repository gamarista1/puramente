package bf;

import We.C5654u;
import We.E0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: bf.a  reason: case insensitive filesystem */
public abstract class C5731a {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f67117a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private final long f67118b;

    /* renamed from: c  reason: collision with root package name */
    private final C5654u f67119c;

    public C5731a(long j10, C5654u uVar) {
        this.f67118b = j10;
        this.f67119c = uVar;
    }

    public boolean a() {
        try {
            return this.f67117a.await(this.f67118b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f67119c.a(E0.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
