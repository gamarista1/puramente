package i2;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class K implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22071a;

    public /* synthetic */ K(String str) {
        this.f22071a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return L.I0(this.f22071a, runnable);
    }
}
