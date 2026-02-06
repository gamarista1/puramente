package pg;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: pg.m  reason: case insensitive filesystem */
public class C6651m extends AbstractList implements RandomAccess, n {

    /* renamed from: b  reason: collision with root package name */
    public static final n f72551b = new C6651m().j();

    /* renamed from: a  reason: collision with root package name */
    private final List f72552a;

    public C6651m() {
        this.f72552a = new ArrayList();
    }

    private static C6642d b(Object obj) {
        if (obj instanceof C6642d) {
            return (C6642d) obj;
        }
        if (obj instanceof String) {
            return C6642d.k((String) obj);
        }
        return C6642d.g((byte[]) obj);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C6642d) {
            return ((C6642d) obj).H();
        }
        return C6648j.b((byte[]) obj);
    }

    public C6642d G(int i10) {
        Object obj = this.f72552a.get(i10);
        C6642d b10 = b(obj);
        if (b10 != obj) {
            this.f72552a.set(i10, b10);
        }
        return b10;
    }

    /* renamed from: a */
    public void add(int i10, String str) {
        this.f72552a.add(i10, str);
        this.modCount++;
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        this.f72552a.clear();
        this.modCount++;
    }

    public void d0(C6642d dVar) {
        this.f72552a.add(dVar);
        this.modCount++;
    }

    public List e() {
        return Collections.unmodifiableList(this.f72552a);
    }

    /* renamed from: g */
    public String get(int i10) {
        Object obj = this.f72552a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C6642d) {
            C6642d dVar = (C6642d) obj;
            String H10 = dVar.H();
            if (dVar.v()) {
                this.f72552a.set(i10, H10);
            }
            return H10;
        }
        byte[] bArr = (byte[]) obj;
        String b10 = C6648j.b(bArr);
        if (C6648j.a(bArr)) {
            this.f72552a.set(i10, b10);
        }
        return b10;
    }

    /* renamed from: h */
    public String remove(int i10) {
        Object remove = this.f72552a.remove(i10);
        this.modCount++;
        return d(remove);
    }

    public n j() {
        return new w(this);
    }

    /* renamed from: k */
    public String set(int i10, String str) {
        return d(this.f72552a.set(i10, str));
    }

    public int size() {
        return this.f72552a.size();
    }

    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).e();
        }
        boolean addAll = this.f72552a.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public C6651m(n nVar) {
        this.f72552a = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
