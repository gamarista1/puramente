package com.google.firebase.ktx;

import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.g;
import Eb.q;
import Ug.C5583n0;
import Ug.G;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;
import mf.C6565s;
import yb.C5292a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LEb/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Keep
@C6521e
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f57384a = new a();

        /* renamed from: b */
        public final G a(C4283d dVar) {
            Object d10 = dVar.d(E.a(C5292a.class, Executor.class));
            C6496s.g(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C5583n0.a((Executor) d10);
        }
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f57385a = new b();

        /* renamed from: b */
        public final G a(C4283d dVar) {
            Object d10 = dVar.d(E.a(yb.c.class, Executor.class));
            C6496s.g(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C5583n0.a((Executor) d10);
        }
    }

    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f57386a = new c();

        /* renamed from: b */
        public final G a(C4283d dVar) {
            Object d10 = dVar.d(E.a(yb.b.class, Executor.class));
            C6496s.g(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C5583n0.a((Executor) d10);
        }
    }

    public static final class d implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f57387a = new d();

        /* renamed from: b */
        public final G a(C4283d dVar) {
            Object d10 = dVar.d(E.a(yb.d.class, Executor.class));
            C6496s.g(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C5583n0.a((Executor) d10);
        }
    }

    public List<C4282c> getComponents() {
        Class<C5292a> cls = C5292a.class;
        Class<G> cls2 = G.class;
        Class<Executor> cls3 = Executor.class;
        C4282c d10 = C4282c.c(E.a(cls, cls2)).b(q.k(E.a(cls, cls3))).f(a.f57384a).d();
        C6496s.g(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<yb.c> cls4 = yb.c.class;
        C4282c d11 = C4282c.c(E.a(cls4, cls2)).b(q.k(E.a(cls4, cls3))).f(b.f57385a).d();
        C6496s.g(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<yb.b> cls5 = yb.b.class;
        C4282c d12 = C4282c.c(E.a(cls5, cls2)).b(q.k(E.a(cls5, cls3))).f(c.f57386a).d();
        C6496s.g(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<yb.d> cls6 = yb.d.class;
        C4282c d13 = C4282c.c(E.a(cls6, cls2)).b(q.k(E.a(cls6, cls3))).f(d.f57387a).d();
        C6496s.g(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C6565s.q(d10, d11, d12, d13);
    }
}
