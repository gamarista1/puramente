package io.invertase.firebase.perf;

import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71456b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f71457c;

    public /* synthetic */ k(String str, String str2, int i10) {
        this.f71455a = str;
        this.f71456b = str2;
        this.f71457c = i10;
    }

    public final Object call() {
        return q.o(this.f71455a, this.f71456b, this.f71457c);
    }
}
