package com.google.gson.internal.bind;

import Pc.C;
import Pc.t;
import Pc.w;
import Sc.c;
import com.google.gson.e;
import com.google.gson.u;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final t f58202a;

    private static final class a extends com.google.gson.t {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.gson.t f58203a;

        /* renamed from: b  reason: collision with root package name */
        private final C f58204b;

        public a(com.google.gson.t tVar, C c10) {
            this.f58203a = tVar;
            this.f58204b = c10;
        }

        /* renamed from: a */
        public Collection read(Sc.a aVar) {
            if (aVar.I0() == Sc.b.NULL) {
                aVar.t0();
                return null;
            }
            Collection collection = (Collection) this.f58204b.a();
            aVar.b();
            while (aVar.M()) {
                collection.add(this.f58203a.read(aVar));
            }
            aVar.t();
            return collection;
        }

        /* renamed from: b */
        public void write(c cVar, Collection collection) {
            if (collection == null) {
                cVar.T();
                return;
            }
            cVar.n();
            for (Object write : collection) {
                this.f58203a.write(cVar, write);
            }
            cVar.t();
        }
    }

    public b(t tVar) {
        this.f58202a = tVar;
    }

    public com.google.gson.t create(e eVar, com.google.gson.reflect.a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = w.h(type, rawType);
        return new a(new n(eVar, eVar.o(com.google.gson.reflect.a.get(h10)), h10), this.f58202a.u(aVar, false));
    }
}
