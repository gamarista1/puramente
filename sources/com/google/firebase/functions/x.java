package com.google.firebase.functions;

import com.google.android.gms.tasks.Task;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class x {

    /* renamed from: a  reason: collision with root package name */
    private final n f57272a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57273b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f57274c;

    /* renamed from: d  reason: collision with root package name */
    final v f57275d;

    x(n nVar, String str, v vVar) {
        this.f57272a = nVar;
        this.f57273b = str;
        this.f57274c = null;
        this.f57275d = vVar;
    }

    public Task a(Object obj) {
        String str = this.f57273b;
        if (str != null) {
            return this.f57272a.h(str, obj, this.f57275d);
        }
        return this.f57272a.i(this.f57274c, obj, this.f57275d);
    }

    public void b(long j10, TimeUnit timeUnit) {
        this.f57275d.c(j10, timeUnit);
    }

    x(n nVar, URL url, v vVar) {
        this.f57272a = nVar;
        this.f57273b = null;
        this.f57274c = url;
        this.f57275d = vVar;
    }
}
