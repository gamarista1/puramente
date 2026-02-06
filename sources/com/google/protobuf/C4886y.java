package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y  reason: case insensitive filesystem */
public class C4886y extends C4865c implements C4887z, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final C4886y f58683c;

    /* renamed from: d  reason: collision with root package name */
    public static final C4887z f58684d;

    /* renamed from: b  reason: collision with root package name */
    private final List f58685b;

    static {
        C4886y yVar = new C4886y();
        f58683c = yVar;
        yVar.l();
        f58684d = yVar;
    }

    public C4886y() {
        this(10);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4868f) {
            return ((C4868f) obj).E();
        }
        return C4881t.i((byte[]) obj);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public void add(int i10, String str) {
        a();
        this.f58685b.add(i10, str);
        this.modCount++;
    }

    public void clear() {
        a();
        this.f58685b.clear();
        this.modCount++;
    }

    public List e() {
        return Collections.unmodifiableList(this.f58685b);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public String get(int i10) {
        Object obj = this.f58685b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4868f) {
            C4868f fVar = (C4868f) obj;
            String E10 = fVar.E();
            if (fVar.n()) {
                this.f58685b.set(i10, E10);
            }
            return E10;
        }
        byte[] bArr = (byte[]) obj;
        String i11 = C4881t.i(bArr);
        if (C4881t.g(bArr)) {
            this.f58685b.set(i10, i11);
        }
        return i11;
    }

    /* renamed from: h */
    public C4886y c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f58685b);
            return new C4886y(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public C4887z j() {
        if (o()) {
            return new j0(this);
        }
        return this;
    }

    /* renamed from: k */
    public String remove(int i10) {
        a();
        Object remove = this.f58685b.remove(i10);
        this.modCount++;
        return d(remove);
    }

    /* renamed from: m */
    public String set(int i10, String str) {
        a();
        return d(this.f58685b.set(i10, str));
    }

    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public Object s(int i10) {
        return this.f58685b.get(i10);
    }

    public int size() {
        return this.f58685b.size();
    }

    public void u(C4868f fVar) {
        a();
        this.f58685b.add(fVar);
        this.modCount++;
    }

    public C4886y(int i10) {
        this(new ArrayList(i10));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof C4887z) {
            collection = ((C4887z) collection).e();
        }
        boolean addAll = this.f58685b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C4886y(ArrayList arrayList) {
        this.f58685b = arrayList;
    }
}
