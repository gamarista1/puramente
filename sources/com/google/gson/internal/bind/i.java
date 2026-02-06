package com.google.gson.internal.bind;

import Pc.C;
import Pc.G;
import Pc.t;
import Pc.w;
import Pc.y;
import Sc.b;
import Sc.c;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.u;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class i implements u {

    /* renamed from: a  reason: collision with root package name */
    private final t f58232a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f58233b;

    private final class a extends com.google.gson.t {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.gson.t f58234a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.gson.t f58235b;

        /* renamed from: c  reason: collision with root package name */
        private final C f58236c;

        public a(com.google.gson.t tVar, com.google.gson.t tVar2, C c10) {
            this.f58234a = tVar;
            this.f58235b = tVar2;
            this.f58236c = c10;
        }

        private String a(h hVar) {
            if (hVar.n()) {
                m d10 = hVar.d();
                if (d10.H()) {
                    return String.valueOf(d10.C());
                }
                if (d10.D()) {
                    return Boolean.toString(d10.v());
                }
                if (d10.I()) {
                    return d10.g();
                }
                throw new AssertionError();
            } else if (hVar.k()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        public Map read(Sc.a aVar) {
            b I02 = aVar.I0();
            if (I02 == b.NULL) {
                aVar.t0();
                return null;
            }
            Map map = (Map) this.f58236c.a();
            if (I02 == b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.M()) {
                    aVar.b();
                    Object read = this.f58234a.read(aVar);
                    if (map.put(read, this.f58235b.read(aVar)) == null) {
                        aVar.t();
                    } else {
                        throw new n("duplicate key: " + read);
                    }
                }
                aVar.t();
            } else {
                aVar.f();
                while (aVar.M()) {
                    y.f52236a.a(aVar);
                    Object read2 = this.f58234a.read(aVar);
                    if (map.put(read2, this.f58235b.read(aVar)) != null) {
                        throw new n("duplicate key: " + read2);
                    }
                }
                aVar.v();
            }
            return map;
        }

        /* renamed from: c */
        public void write(c cVar, Map map) {
            boolean z10;
            if (map == null) {
                cVar.T();
            } else if (!i.this.f58233b) {
                cVar.o();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.M(String.valueOf(entry.getKey()));
                    this.f58235b.write(cVar, entry.getValue());
                }
                cVar.v();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z11 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    h jsonTree = this.f58234a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (jsonTree.h() || jsonTree.m()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 |= z10;
                }
                if (z11) {
                    cVar.n();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.n();
                        G.a((h) arrayList.get(i10), cVar);
                        this.f58235b.write(cVar, arrayList2.get(i10));
                        cVar.t();
                        i10++;
                    }
                    cVar.t();
                    return;
                }
                cVar.o();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.M(a((h) arrayList.get(i10)));
                    this.f58235b.write(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.v();
            }
        }
    }

    public i(t tVar, boolean z10) {
        this.f58232a = tVar;
        this.f58233b = z10;
    }

    private com.google.gson.t a(e eVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return o.f58304f;
        }
        return eVar.o(com.google.gson.reflect.a.get(type));
    }

    public com.google.gson.t create(e eVar, com.google.gson.reflect.a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j10 = w.j(type, rawType);
        Type type2 = j10[0];
        Type type3 = j10[1];
        return new a(new n(eVar, a(eVar, type2), type2), new n(eVar, eVar.o(com.google.gson.reflect.a.get(type3)), type3), this.f58232a.u(aVar, false));
    }
}
