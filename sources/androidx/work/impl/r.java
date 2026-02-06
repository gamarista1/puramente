package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1860u f18944a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18945b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f18946c;

    public /* synthetic */ r(C1860u uVar, ArrayList arrayList, String str) {
        this.f18944a = uVar;
        this.f18945b = arrayList;
        this.f18946c = str;
    }

    public final Object call() {
        return this.f18944a.m(this.f18945b, this.f18946c);
    }
}
