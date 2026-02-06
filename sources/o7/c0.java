package o7;

import com.facebook.M;
import com.facebook.S;
import java.util.concurrent.CountDownLatch;
import o7.b0;

public final /* synthetic */ class c0 implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String[] f47226a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f47227b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0.e f47228c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f47229d;

    public /* synthetic */ c0(String[] strArr, int i10, b0.e eVar, CountDownLatch countDownLatch) {
        this.f47226a = strArr;
        this.f47227b = i10;
        this.f47228c = eVar;
        this.f47229d = countDownLatch;
    }

    public final void a(S s10) {
        b0.e.c(this.f47226a, this.f47227b, this.f47228c, this.f47229d, s10);
    }
}
