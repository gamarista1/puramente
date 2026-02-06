package Ug;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class Z0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f65344a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f65345b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f65346c;

    public /* synthetic */ Z0(int i10, String str, AtomicInteger atomicInteger) {
        this.f65344a = i10;
        this.f65345b = str;
        this.f65346c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return a1.c(this.f65344a, this.f65345b, this.f65346c, runnable);
    }
}
