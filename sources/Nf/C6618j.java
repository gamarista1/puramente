package nf;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6555h;
import zf.C6833f;

/* renamed from: nf.j  reason: case insensitive filesystem */
public final class C6618j extends C6555h implements Set, Serializable, C6833f {

    /* renamed from: b  reason: collision with root package name */
    private static final a f72272b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C6618j f72273c = new C6618j(C6612d.f72243n.e());

    /* renamed from: a  reason: collision with root package name */
    private final C6612d f72274a;

    /* renamed from: nf.j$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6618j(C6612d dVar) {
        C6496s.h(dVar, "backing");
        this.f72274a = dVar;
    }

    private final Object writeReplace() {
        if (this.f72274a.L()) {
            return new C6616h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public int a() {
        return this.f72274a.size();
    }

    public boolean add(Object obj) {
        if (this.f72274a.n(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72274a.r();
        return super.addAll(collection);
    }

    public final Set b() {
        this.f72274a.q();
        if (size() > 0) {
            return this;
        }
        return f72273c;
    }

    public void clear() {
        this.f72274a.clear();
    }

    public boolean contains(Object obj) {
        return this.f72274a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f72274a.isEmpty();
    }

    public Iterator iterator() {
        return this.f72274a.M();
    }

    public boolean remove(Object obj) {
        return this.f72274a.V(obj);
    }

    public boolean removeAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72274a.r();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72274a.r();
        return super.retainAll(collection);
    }

    public C6618j() {
        this(new C6612d());
    }

    public C6618j(int i10) {
        this(new C6612d(i10));
    }
}
