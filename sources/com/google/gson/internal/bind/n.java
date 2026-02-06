package com.google.gson.internal.bind;

import Sc.a;
import Sc.c;
import com.google.gson.e;
import com.google.gson.internal.bind.l;
import com.google.gson.t;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class n extends t {

    /* renamed from: a  reason: collision with root package name */
    private final e f58272a;

    /* renamed from: b  reason: collision with root package name */
    private final t f58273b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f58274c;

    n(e eVar, t tVar, Type type) {
        this.f58272a = eVar;
        this.f58273b = tVar;
        this.f58274c = type;
    }

    private static Type a(Type type, Object obj) {
        if (obj == null) {
            return type;
        }
        if ((type instanceof Class) || (type instanceof TypeVariable)) {
            return obj.getClass();
        }
        return type;
    }

    private static boolean b(t tVar) {
        t a10;
        while ((tVar instanceof m) && (a10 = ((m) tVar).a()) != tVar) {
            tVar = a10;
        }
        return tVar instanceof l.c;
    }

    public Object read(a aVar) {
        return this.f58273b.read(aVar);
    }

    public void write(c cVar, Object obj) {
        t tVar = this.f58273b;
        Type a10 = a(this.f58274c, obj);
        if (a10 != this.f58274c) {
            tVar = this.f58272a.o(com.google.gson.reflect.a.get(a10));
            if ((tVar instanceof l.c) && !b(this.f58273b)) {
                tVar = this.f58273b;
            }
        }
        tVar.write(cVar, obj);
    }
}
