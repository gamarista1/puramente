package ja;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class L implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f44980a;

    public /* synthetic */ L(String str) {
        this.f44980a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return M.z0(this.f44980a, runnable);
    }
}
