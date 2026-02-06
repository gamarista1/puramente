package x0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

public final class n extends p implements Iterable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final String f28171a;

    /* renamed from: b  reason: collision with root package name */
    private final float f28172b;

    /* renamed from: c  reason: collision with root package name */
    private final float f28173c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28174d;

    /* renamed from: e  reason: collision with root package name */
    private final float f28175e;

    /* renamed from: f  reason: collision with root package name */
    private final float f28176f;

    /* renamed from: g  reason: collision with root package name */
    private final float f28177g;

    /* renamed from: h  reason: collision with root package name */
    private final float f28178h;

    /* renamed from: i  reason: collision with root package name */
    private final List f28179i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final List f28180j;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f28181a;

        a(n nVar) {
            this.f28181a = nVar.f28180j.iterator();
        }

        /* renamed from: a */
        public p next() {
            return (p) this.f28181a.next();
        }

        public boolean hasNext() {
            return this.f28181a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        super((DefaultConstructorMarker) null);
        this.f28171a = str;
        this.f28172b = f10;
        this.f28173c = f11;
        this.f28174d = f12;
        this.f28175e = f13;
        this.f28176f = f14;
        this.f28177g = f15;
        this.f28178h = f16;
        this.f28179i = list;
        this.f28180j = list2;
    }

    public final float A() {
        return this.f28177g;
    }

    public final float C() {
        return this.f28178h;
    }

    public final p b(int i10) {
        return (p) this.f28180j.get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (C6496s.c(this.f28171a, nVar.f28171a) && this.f28172b == nVar.f28172b && this.f28173c == nVar.f28173c && this.f28174d == nVar.f28174d && this.f28175e == nVar.f28175e && this.f28176f == nVar.f28176f && this.f28177g == nVar.f28177g && this.f28178h == nVar.f28178h && C6496s.c(this.f28179i, nVar.f28179i) && C6496s.c(this.f28180j, nVar.f28180j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List g() {
        return this.f28179i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f28171a.hashCode() * 31) + Float.hashCode(this.f28172b)) * 31) + Float.hashCode(this.f28173c)) * 31) + Float.hashCode(this.f28174d)) * 31) + Float.hashCode(this.f28175e)) * 31) + Float.hashCode(this.f28176f)) * 31) + Float.hashCode(this.f28177g)) * 31) + Float.hashCode(this.f28178h)) * 31) + this.f28179i.hashCode()) * 31) + this.f28180j.hashCode();
    }

    public Iterator iterator() {
        return new a(this);
    }

    public final String k() {
        return this.f28171a;
    }

    public final float n() {
        return this.f28173c;
    }

    public final float r() {
        return this.f28174d;
    }

    public final float t() {
        return this.f28172b;
    }

    public final float v() {
        return this.f28175e;
    }

    public final float x() {
        return this.f28176f;
    }

    public final int z() {
        return this.f28180j.size();
    }
}
