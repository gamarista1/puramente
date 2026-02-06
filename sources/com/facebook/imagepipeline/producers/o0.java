package com.facebook.imagepipeline.producers;

import android.os.Looper;
import d7.C3479a;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

public final class o0 implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f40014c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final d0 f40015a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f40016b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String c(e0 e0Var) {
            if (!C3479a.b()) {
                return null;
            }
            String id2 = e0Var.getId();
            return "ThreadHandoffProducer_produceResults_" + id2;
        }

        /* access modifiers changed from: private */
        public final boolean d(e0 e0Var) {
            if (e0Var.f().G().k() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }

    public static final class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f40017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0 f40018b;

        b(m0 m0Var, o0 o0Var) {
            this.f40017a = m0Var;
            this.f40018b = o0Var;
        }

        public void b() {
            this.f40017a.a();
            this.f40018b.d().a(this.f40017a);
        }
    }

    public static final class c extends m0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C3308n f40019f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g0 f40020g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e0 f40021h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ o0 f40022i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C3308n nVar, g0 g0Var, e0 e0Var, o0 o0Var) {
            super(nVar, g0Var, e0Var, "BackgroundThreadHandoffProducer");
            this.f40019f = nVar;
            this.f40020g = g0Var;
            this.f40021h = e0Var;
            this.f40022i = o0Var;
        }

        /* access modifiers changed from: protected */
        public void b(Object obj) {
        }

        /* access modifiers changed from: protected */
        public Object c() {
            return null;
        }

        /* access modifiers changed from: protected */
        public void f(Object obj) {
            this.f40020g.j(this.f40021h, "BackgroundThreadHandoffProducer", (Map) null);
            this.f40022i.c().b(this.f40019f, this.f40021h);
        }
    }

    public o0(d0 d0Var, p0 p0Var) {
        C6496s.h(d0Var, "inputProducer");
        C6496s.h(p0Var, "threadHandoffProducerQueue");
        this.f40015a = d0Var;
        this.f40016b = p0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        C6496s.h(nVar, "consumer");
        C6496s.h(e0Var, "context");
        if (!j7.b.d()) {
            g0 y10 = e0Var.y();
            a aVar = f40014c;
            if (aVar.d(e0Var)) {
                y10.d(e0Var, "BackgroundThreadHandoffProducer");
                y10.j(e0Var, "BackgroundThreadHandoffProducer", (Map) null);
                this.f40015a.b(nVar, e0Var);
                return;
            }
            c cVar = new c(nVar, y10, e0Var, this);
            e0Var.b(new b(cVar, this));
            this.f40016b.b(C3479a.a(cVar, aVar.c(e0Var)));
            return;
        }
        j7.b.a("ThreadHandoffProducer#produceResults");
        try {
            g0 y11 = e0Var.y();
            a aVar2 = f40014c;
            if (aVar2.d(e0Var)) {
                y11.d(e0Var, "BackgroundThreadHandoffProducer");
                y11.j(e0Var, "BackgroundThreadHandoffProducer", (Map) null);
                this.f40015a.b(nVar, e0Var);
                return;
            }
            c cVar2 = new c(nVar, y11, e0Var, this);
            e0Var.b(new b(cVar2, this));
            this.f40016b.b(C3479a.a(cVar2, aVar2.c(e0Var)));
            C6514M m10 = C6514M.f71813a;
            j7.b.b();
        } finally {
            j7.b.b();
        }
    }

    public final d0 c() {
        return this.f40015a;
    }

    public final p0 d() {
        return this.f40016b;
    }
}
