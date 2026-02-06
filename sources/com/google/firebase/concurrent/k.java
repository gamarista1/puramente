package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f57102b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f57103c;

    public /* synthetic */ k(o oVar, Callable callable, p.b bVar) {
        this.f57101a = oVar;
        this.f57102b = callable;
        this.f57103c = bVar;
    }

    public final Object call() {
        return this.f57101a.q(this.f57102b, this.f57103c);
    }
}
