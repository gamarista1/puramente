package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1751y;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c  reason: case insensitive filesystem */
abstract class C1730c extends AbstractList implements C1751y.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16317a = true;

    C1730c() {
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (!this.f16317a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }

    public void clear() {
        a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final void l() {
        this.f16317a = false;
    }

    public boolean o() {
        return this.f16317a;
    }

    public boolean remove(Object obj) {
        a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }

    public boolean addAll(int i10, Collection collection) {
        a();
        return super.addAll(i10, collection);
    }
}
