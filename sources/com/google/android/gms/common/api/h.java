package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public abstract class h {

    public interface a {
        void a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract k await(long j10, TimeUnit timeUnit);
}
