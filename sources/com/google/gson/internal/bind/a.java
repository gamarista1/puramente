package com.google.gson.internal.bind;

import Pc.w;
import Sc.b;
import Sc.c;
import com.google.gson.e;
import com.google.gson.t;
import com.google.gson.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a extends t {

    /* renamed from: c  reason: collision with root package name */
    public static final u f58199c = new C0864a();

    /* renamed from: a  reason: collision with root package name */
    private final Class f58200a;

    /* renamed from: b  reason: collision with root package name */
    private final t f58201b;

    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    class C0864a implements u {
        C0864a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = w.g(type);
            return new a(eVar, eVar.o(com.google.gson.reflect.a.get(g10)), w.k(g10));
        }
    }

    public a(e eVar, t tVar, Class cls) {
        this.f58201b = new n(eVar, tVar, cls);
        this.f58200a = cls;
    }

    public Object read(Sc.a aVar) {
        if (aVar.I0() == b.NULL) {
            aVar.t0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.M()) {
            arrayList.add(this.f58201b.read(aVar));
        }
        aVar.t();
        int size = arrayList.size();
        if (!this.f58200a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f58200a, size));
        }
        Object newInstance = Array.newInstance(this.f58200a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.T();
            return;
        }
        cVar.n();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f58201b.write(cVar, Array.get(obj, i10));
        }
        cVar.t();
    }
}
