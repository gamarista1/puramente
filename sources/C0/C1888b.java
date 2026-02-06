package c0;

import b0.C1865c;
import b0.C1867e;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.C6498u;
import mf.C6550c;
import yf.C6798l;

/* renamed from: c0.b  reason: case insensitive filesystem */
public abstract class C1888b extends C6550c implements C1867e {

    /* renamed from: c0.b$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f19176a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Collection collection) {
            super(1);
            this.f19176a = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f19176a.contains(obj));
        }
    }

    public C1867e addAll(Collection collection) {
        C1867e.a builder = builder();
        builder.addAll(collection);
        return builder.f();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public C1867e remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf != -1) {
            return y(indexOf);
        }
        return this;
    }

    public C1867e removeAll(Collection collection) {
        return J(new a(collection));
    }

    public C1865c subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
