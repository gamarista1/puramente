package Fa;

import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: Fa.b  reason: case insensitive filesystem */
public class C4287b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f50774a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f50775b = Executors.defaultThreadFactory();

    public C4287b(String str) {
        C4536s.m(str, "Name must not be null");
        this.f50774a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50775b.newThread(new C4288c(runnable, 0));
        newThread.setName(this.f50774a);
        return newThread;
    }
}
