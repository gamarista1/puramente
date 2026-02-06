package com.th3rdwave.safeareacontext;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.J;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f60017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f60018b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Condition f60019c;

    public /* synthetic */ j(ReentrantLock reentrantLock, J j10, Condition condition) {
        this.f60017a = reentrantLock;
        this.f60018b = j10;
        this.f60019c = condition;
    }

    public final void run() {
        k.s(this.f60017a, this.f60018b, this.f60019c);
    }
}
