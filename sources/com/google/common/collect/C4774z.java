package com.google.common.collect;

import com.google.common.collect.A;
import com.google.common.collect.C4771w;
import com.google.common.collect.C4772x;
import com.google.common.collect.C4773y;
import com.google.common.collect.X;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import nb.C5114i;

/* renamed from: com.google.common.collect.z  reason: case insensitive filesystem */
public class C4774z extends C4772x implements Y {
    private static final long serialVersionUID = 0;

    /* renamed from: g  reason: collision with root package name */
    private final transient C4773y f56787g;

    /* renamed from: h  reason: collision with root package name */
    private transient C4773y f56788h;

    /* renamed from: com.google.common.collect.z$a */
    public static final class a extends C4772x.c {
        public C4774z a() {
            Collection entrySet = this.f56776a.entrySet();
            Comparator comparator = this.f56777b;
            if (comparator != null) {
                entrySet = O.b(comparator).e().c(entrySet);
            }
            return C4774z.s(entrySet, this.f56778c);
        }
    }

    /* renamed from: com.google.common.collect.z$b */
    private static final class b extends C4773y {

        /* renamed from: c  reason: collision with root package name */
        private final transient C4774z f56789c;

        b(C4774z zVar) {
            this.f56789c = zVar;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f56789c.b(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return false;
        }

        /* renamed from: m */
        public g0 iterator() {
            return this.f56789c.h();
        }

        public int size() {
            return this.f56789c.size();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* renamed from: com.google.common.collect.z$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final X.b f56790a = X.a(C4774z.class, "emptySet");
    }

    C4774z(C4771w wVar, int i10, Comparator comparator) {
        super(wVar, i10);
        this.f56787g = q(comparator);
    }

    private static C4773y q(Comparator comparator) {
        if (comparator == null) {
            return C4773y.D();
        }
        return A.c0(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C4771w.a a10 = C4771w.a();
            int i10 = 0;
            int i11 = 0;
            while (i10 < readInt) {
                Object readObject = objectInputStream.readObject();
                Objects.requireNonNull(readObject);
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C4773y.a x10 = x(comparator);
                    for (int i12 = 0; i12 < readInt2; i12++) {
                        Object readObject2 = objectInputStream.readObject();
                        Objects.requireNonNull(readObject2);
                        x10.a(readObject2);
                    }
                    C4773y l10 = x10.l();
                    if (l10.size() == readInt2) {
                        a10.f(readObject, l10);
                        i11 += readInt2;
                        i10++;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                C4772x.e.f56780a.b(this, a10.c());
                C4772x.e.f56781b.a(this, i11);
                c.f56790a.b(this, q(comparator));
            } catch (IllegalArgumentException e10) {
                throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    static C4774z s(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return u();
        }
        C4771w.a aVar = new C4771w.a(collection.size());
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            C4773y w10 = w(comparator, (Collection) entry.getValue());
            if (!w10.isEmpty()) {
                aVar.f(key, w10);
                i10 += w10.size();
            }
        }
        return new C4774z(aVar.c(), i10, comparator);
    }

    public static C4774z u() {
        return C4765p.f56739i;
    }

    private static C4773y w(Comparator comparator, Collection collection) {
        if (comparator == null) {
            return C4773y.x(collection);
        }
        return A.W(comparator, collection);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(v());
        X.b(this, objectOutputStream);
    }

    private static C4773y.a x(Comparator comparator) {
        if (comparator == null) {
            return new C4773y.a();
        }
        return new A.a(comparator);
    }

    /* renamed from: r */
    public C4773y a() {
        C4773y yVar = this.f56788h;
        if (yVar != null) {
            return yVar;
        }
        b bVar = new b(this);
        this.f56788h = bVar;
        return bVar;
    }

    /* renamed from: t */
    public C4773y get(Object obj) {
        return (C4773y) C5114i.a((C4773y) this.f56767e.get(obj), this.f56787g);
    }

    /* access modifiers changed from: package-private */
    public Comparator v() {
        C4773y yVar = this.f56787g;
        if (yVar instanceof A) {
            return ((A) yVar).comparator();
        }
        return null;
    }
}
