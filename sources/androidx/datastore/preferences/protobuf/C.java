package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class C extends C1730c implements D, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final C f16262c;

    /* renamed from: d  reason: collision with root package name */
    public static final D f16263d;

    /* renamed from: b  reason: collision with root package name */
    private final List f16264b;

    static {
        C c10 = new C();
        f16262c = c10;
        c10.l();
        f16263d = c10;
    }

    public C() {
        this(10);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1734g) {
            return ((C1734g) obj).I();
        }
        return C1751y.j((byte[]) obj);
    }

    public void X(C1734g gVar) {
        a();
        this.f16264b.add(gVar);
        this.modCount++;
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public void add(int i10, String str) {
        a();
        this.f16264b.add(i10, str);
        this.modCount++;
    }

    public void clear() {
        a();
        this.f16264b.clear();
        this.modCount++;
    }

    public List e() {
        return Collections.unmodifiableList(this.f16264b);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public String get(int i10) {
        Object obj = this.f16264b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1734g) {
            C1734g gVar = (C1734g) obj;
            String I10 = gVar.I();
            if (gVar.t()) {
                this.f16264b.set(i10, I10);
            }
            return I10;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = C1751y.j(bArr);
        if (C1751y.g(bArr)) {
            this.f16264b.set(i10, j10);
        }
        return j10;
    }

    /* renamed from: h */
    public C c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f16264b);
            return new C(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public D j() {
        if (o()) {
            return new o0(this);
        }
        return this;
    }

    /* renamed from: k */
    public String remove(int i10) {
        a();
        Object remove = this.f16264b.remove(i10);
        this.modCount++;
        return d(remove);
    }

    /* renamed from: m */
    public String set(int i10, String str) {
        a();
        return d(this.f16264b.set(i10, str));
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
        return this.f16264b.get(i10);
    }

    public int size() {
        return this.f16264b.size();
    }

    public C(int i10) {
        this(new ArrayList(i10));
    }

    public boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).e();
        }
        boolean addAll = this.f16264b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C(ArrayList arrayList) {
        this.f16264b = arrayList;
    }
}
