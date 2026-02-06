package com.amazon.a.b;

import android.os.Build;
import com.amazon.a.a.n.a.a.d;
import com.amazon.a.a.n.a.a.g;
import com.amazon.a.a.n.a.a.h;
import java.util.HashMap;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends com.amazon.a.a.d.b>, c<? extends com.amazon.a.a.d.b>> f37603a = new HashMap();

    private static final class a implements c<com.amazon.a.a.n.a.a.f> {

        /* renamed from: a  reason: collision with root package name */
        final Map<String, com.amazon.a.a.i.c> f37606a;

        private a() {
            this.f37606a = new HashMap<String, com.amazon.a.a.i.c>() {
                {
                    put("NO_INTERNET", e.f37596d);
                    put("INVALID_CONTENT_ID", e.f37597e);
                    put("INTERNAL_SERVICE_ERROR", e.f37598f);
                }
            };
        }

        public com.amazon.a.a.i.c a(com.amazon.a.a.n.a.a.f fVar) {
            com.amazon.a.a.i.c cVar = this.f37606a.get(fVar.b());
            if (cVar != null) {
                return cVar;
            }
            return e.f37597e;
        }
    }

    private static final class b implements c<com.amazon.a.b.a.a> {
        private b() {
        }

        public com.amazon.a.a.i.c a(com.amazon.a.b.a.a aVar) {
            if (aVar.d().a(h.EXPIRATION)) {
                return e.f37596d;
            }
            return e.f37597e;
        }
    }

    private interface c<T extends com.amazon.a.a.d.b> {
        com.amazon.a.a.i.c a(T t10);
    }

    public f() {
        Class<com.amazon.a.a.n.a.a.c> cls = com.amazon.a.a.n.a.a.c.class;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            a((Class<? extends com.amazon.a.a.d.b>) cls, e.f37594b);
        } else {
            a((Class<? extends com.amazon.a.a.d.b>) cls, e.f37593a);
        }
        com.amazon.a.a.i.c cVar = e.f37594b;
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.a.n.a.a.b.class, cVar);
        a((Class<? extends com.amazon.a.a.d.b>) d.class, cVar);
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.a.n.a.a.a.class, e.f37595c);
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.a.n.a.a.f.class, (c<? extends com.amazon.a.a.d.b>) new a());
        com.amazon.a.a.i.c cVar2 = e.f37597e;
        a((Class<? extends com.amazon.a.a.d.b>) g.class, cVar2);
        a((Class<? extends com.amazon.a.a.d.b>) h.class, cVar2);
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.b.a.a.class, (c<? extends com.amazon.a.a.d.b>) new b());
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.a.o.b.a.a.class, e.f37599g);
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.a.o.b.a.b.class, cVar2);
        a((Class<? extends com.amazon.a.a.d.b>) com.amazon.a.a.o.b.a.c.class, cVar2);
    }

    private void a(Class<? extends com.amazon.a.a.d.b> cls, final com.amazon.a.a.i.c cVar) {
        a(cls, (c<? extends com.amazon.a.a.d.b>) new c<com.amazon.a.a.d.b>() {
            public com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar) {
                return cVar;
            }
        });
    }

    private void a(Class<? extends com.amazon.a.a.d.b> cls, c<? extends com.amazon.a.a.d.b> cVar) {
        boolean containsKey = this.f37603a.containsKey(cls);
        com.amazon.a.a.o.a.a.b(containsKey, "mapping exists for type: " + cls);
        this.f37603a.put(cls, cVar);
    }

    public com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar) {
        c cVar = this.f37603a.get(bVar.getClass());
        if (cVar == null) {
            return null;
        }
        return cVar.a(bVar);
    }
}
