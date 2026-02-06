package sh;

import java.util.concurrent.ThreadFactory;

/* renamed from: sh.d  reason: case insensitive filesystem */
public final /* synthetic */ class C6725d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f73538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f73539b;

    public /* synthetic */ C6725d(String str, boolean z10) {
        this.f73538a = str;
        this.f73539b = z10;
    }

    public final Thread newThread(Runnable runnable) {
        return C6726e.O(this.f73538a, this.f73539b, runnable);
    }
}
