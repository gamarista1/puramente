package com.google.firebase.remoteconfig.internal;

import Dc.c;
import Dc.d;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import jc.C5046e;
import ub.C5230g;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Set f57900a;

    /* renamed from: b  reason: collision with root package name */
    private final t f57901b;

    /* renamed from: c  reason: collision with root package name */
    private final m f57902c;

    /* renamed from: d  reason: collision with root package name */
    private final C5230g f57903d;

    /* renamed from: e  reason: collision with root package name */
    private final C5046e f57904e;

    /* renamed from: f  reason: collision with root package name */
    private final f f57905f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f57906g;

    /* renamed from: h  reason: collision with root package name */
    private final String f57907h;

    /* renamed from: i  reason: collision with root package name */
    private final p f57908i;

    /* renamed from: j  reason: collision with root package name */
    private final ScheduledExecutorService f57909j;

    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c f57910a;

        public a(c cVar) {
            this.f57910a = cVar;
        }

        public void remove() {
            q.this.d(this.f57910a);
        }
    }

    public q(C5230g gVar, C5046e eVar, m mVar, f fVar, Context context, String str, p pVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f57900a = linkedHashSet;
        this.f57901b = new t(gVar, eVar, mVar, fVar, context, str, linkedHashSet, pVar, scheduledExecutorService);
        this.f57903d = gVar;
        this.f57902c = mVar;
        this.f57904e = eVar;
        this.f57905f = fVar;
        this.f57906g = context;
        this.f57907h = str;
        this.f57908i = pVar;
        this.f57909j = scheduledExecutorService;
    }

    private synchronized void c() {
        if (!this.f57900a.isEmpty()) {
            this.f57901b.C();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void d(c cVar) {
        this.f57900a.remove(cVar);
    }

    public synchronized d b(c cVar) {
        this.f57900a.add(cVar);
        c();
        return new a(cVar);
    }

    public synchronized void e(boolean z10) {
        this.f57901b.z(z10);
        if (!z10) {
            c();
        }
    }
}
