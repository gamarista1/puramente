package com.google.gson.internal.bind;

import Sc.b;
import Sc.c;
import com.google.gson.e;
import com.google.gson.t;
import com.google.gson.u;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class d extends t {

    /* renamed from: d  reason: collision with root package name */
    static final u f58210d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map f58211a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f58212b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f58213c;

    class a implements u {
        a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            Class<? super Enum> rawType = aVar.getRawType();
            Class<Enum> cls = Enum.class;
            if (!cls.isAssignableFrom(rawType) || rawType == cls) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new d(rawType, (a) null);
        }
    }

    /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    /* renamed from: a */
    public Enum read(Sc.a aVar) {
        if (aVar.I0() == b.NULL) {
            aVar.t0();
            return null;
        }
        String B02 = aVar.B0();
        Enum enumR = (Enum) this.f58211a.get(B02);
        if (enumR == null) {
            return (Enum) this.f58212b.get(B02);
        }
        return enumR;
    }

    /* renamed from: b */
    public void write(c cVar, Enum enumR) {
        String str;
        if (enumR == null) {
            str = null;
        } else {
            str = (String) this.f58213c.get(enumR);
        }
        cVar.P0(str);
    }

    private d(Class cls) {
        this.f58211a = new HashMap();
        this.f58212b = new HashMap();
        this.f58213c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum enumR = (Enum) field2.get((Object) null);
                String name = enumR.name();
                String str = enumR.toString();
                Oc.c cVar = (Oc.c) field2.getAnnotation(Oc.c.class);
                if (cVar != null) {
                    name = cVar.value();
                    for (String put : cVar.alternate()) {
                        this.f58211a.put(put, enumR);
                    }
                }
                this.f58211a.put(name, enumR);
                this.f58212b.put(str, enumR);
                this.f58213c.put(enumR, name);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
