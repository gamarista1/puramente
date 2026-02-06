package com.google.common.collect;

import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

abstract class X {

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Field f56651a;

        /* access modifiers changed from: package-private */
        public void a(Object obj, int i10) {
            try {
                this.f56651a.set(obj, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(Object obj, Object obj2) {
            try {
                this.f56651a.set(obj, obj2);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        private b(Field field) {
            this.f56651a = field;
            field.setAccessible(true);
        }
    }

    static b a(Class cls, String str) {
        try {
            return new b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    static void b(H h10, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(h10.asMap().size());
        for (Map.Entry entry : h10.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }
}
