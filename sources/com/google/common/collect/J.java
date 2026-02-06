package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nb.o;
import nb.u;

public abstract class J {

    private static class a extends C4752c {
        private static final long serialVersionUID = 0;

        /* renamed from: g  reason: collision with root package name */
        transient u f56621g;

        a(Map map, u uVar) {
            super(map);
            this.f56621g = (u) o.j(uVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            this.f56621g = (u) readObject;
            Object readObject2 = objectInputStream.readObject();
            Objects.requireNonNull(readObject2);
            y((Map) readObject2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f56621g);
            objectOutputStream.writeObject(r());
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public List s() {
            return (List) this.f56621g.get();
        }

        /* access modifiers changed from: package-private */
        public Map d() {
            return u();
        }

        /* access modifiers changed from: package-private */
        public Set f() {
            return v();
        }
    }

    static abstract class b extends AbstractCollection {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract H a();

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return a().size();
        }
    }

    static boolean a(H h10, Object obj) {
        if (obj == h10) {
            return true;
        }
        if (obj instanceof H) {
            return h10.asMap().equals(((H) obj).asMap());
        }
        return false;
    }

    public static D b(Map map, u uVar) {
        return new a(map, uVar);
    }
}
