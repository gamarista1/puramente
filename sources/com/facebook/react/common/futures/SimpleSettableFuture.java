package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.C6496s;

public final class SimpleSettableFuture implements Future {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f40593a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private Object f40594b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f40595c;

    private final void a() {
        if (this.f40593a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final Object b() {
        try {
            return get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void c(Object obj) {
        a();
        this.f40594b = obj;
        this.f40593a.countDown();
    }

    public boolean cancel(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final void d(Exception exc) {
        C6496s.h(exc, "exception");
        a();
        this.f40595c = exc;
        this.f40593a.countDown();
    }

    public Object get() {
        this.f40593a.await();
        if (this.f40595c == null) {
            return this.f40594b;
        }
        throw new ExecutionException(this.f40595c);
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        if (this.f40593a.getCount() == 0) {
            return true;
        }
        return false;
    }

    public Object get(long j10, TimeUnit timeUnit) {
        C6496s.h(timeUnit, "unit");
        if (!this.f40593a.await(j10, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        } else if (this.f40595c == null) {
            return this.f40594b;
        } else {
            throw new ExecutionException(this.f40595c);
        }
    }
}
