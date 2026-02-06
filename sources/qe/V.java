package qe;

import Ff.d;
import Tg.a;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import ne.c;
import pe.i;
import qe.E;
import xf.C6781a;

public final class V {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f61406a;

    /* renamed from: b  reason: collision with root package name */
    private final E f61407b;

    public V(d dVar) {
        E e10;
        C6496s.h(dVar, "klass");
        this.f61406a = dVar;
        if (C6496s.c(dVar, O.b(C6514M.class))) {
            e10 = new E.q();
        } else if (C6496s.c(dVar, O.b(Bundle.class))) {
            e10 = new E.e();
        } else if (C6496s.c(dVar, O.b(int[].class))) {
            e10 = new E.m();
        } else if (C6496s.c(dVar, O.b(float[].class))) {
            e10 = new E.l();
        } else if (C6496s.c(dVar, O.b(double[].class))) {
            e10 = new E.h();
        } else if (C6496s.c(dVar, O.b(boolean[].class))) {
            e10 = new E.d();
        } else if (C6496s.c(dVar, O.b(byte[].class))) {
            e10 = new E.f();
        } else if (C6496s.c(dVar, O.b(URI.class))) {
            e10 = new E.t();
        } else if (C6496s.c(dVar, O.b(URL.class))) {
            e10 = new E.u();
        } else if (C6496s.c(dVar, O.b(Uri.class))) {
            e10 = new E.a();
        } else if (C6496s.c(dVar, O.b(File.class))) {
            e10 = new E.k();
        } else if (C6496s.c(dVar, O.b(Pair.class))) {
            e10 = new E.p();
        } else if (C6496s.c(dVar, O.b(Long.TYPE))) {
            e10 = new E.n();
        } else if (C6496s.c(dVar, O.b(a.class))) {
            e10 = new E.i();
        } else if (C6496s.c(dVar, O.b(Object.class))) {
            e10 = new E.b();
        } else {
            e10 = null;
        }
        if (e10 == null) {
            if (Map.class.isAssignableFrom(C6781a.b(this.f61406a))) {
                e10 = new E.o();
            } else {
                if (Enum.class.isAssignableFrom(C6781a.b(this.f61406a))) {
                    e10 = new E.j();
                } else {
                    if (c.class.isAssignableFrom(C6781a.b(this.f61406a))) {
                        e10 = new E.s();
                    } else {
                        if (i.class.isAssignableFrom(C6781a.b(this.f61406a))) {
                            e10 = new E.r();
                        } else {
                            if (Object[].class.isAssignableFrom(C6781a.b(this.f61406a))) {
                                e10 = new E.c();
                            } else {
                                if (Collection.class.isAssignableFrom(C6781a.b(this.f61406a))) {
                                    e10 = new E.g();
                                } else {
                                    e10 = new E.q();
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f61407b = e10;
    }

    public final Object b(Object obj) {
        return this.f61407b.a(obj);
    }
}
