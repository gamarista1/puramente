package w5;

import java.util.TimerTask;

/* renamed from: w5.i  reason: case insensitive filesystem */
public final /* synthetic */ class C4137i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4140l f49192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TimerTask f49193b;

    public /* synthetic */ C4137i(C4140l lVar, TimerTask timerTask) {
        this.f49192a = lVar;
        this.f49193b = timerTask;
    }

    public final void run() {
        C4140l.i(this.f49192a, this.f49193b);
    }
}
