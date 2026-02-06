package com.amazon.a.a.h;

import com.amazon.a.a.o.c;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37187a = new c("MetricsManagerImpl");

    /* renamed from: b  reason: collision with root package name */
    private b f37188b = new b();

    public synchronized void a(a aVar) {
        try {
            if (c.f37534a) {
                c cVar = f37187a;
                cVar.a("Recording Metric: " + aVar);
            }
            this.f37188b.a(aVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized b a() {
        if (this.f37188b.a()) {
            return this.f37188b;
        }
        b bVar = this.f37188b;
        this.f37188b = new b();
        return bVar;
    }
}
