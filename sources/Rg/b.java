package Rg;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class b implements h, c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f64966a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f64967b;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f64968a;

        /* renamed from: b  reason: collision with root package name */
        private int f64969b;

        a(b bVar) {
            this.f64968a = bVar.f64966a.iterator();
            this.f64969b = bVar.f64967b;
        }

        private final void a() {
            while (this.f64969b > 0 && this.f64968a.hasNext()) {
                this.f64968a.next();
                this.f64969b--;
            }
        }

        public boolean hasNext() {
            a();
            return this.f64968a.hasNext();
        }

        public Object next() {
            a();
            return this.f64968a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h hVar, int i10) {
        C6496s.h(hVar, "sequence");
        this.f64966a = hVar;
        this.f64967b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public h a(int i10) {
        int i11 = this.f64967b + i10;
        if (i11 < 0) {
            return new b(this, i10);
        }
        return new b(this.f64966a, i11);
    }

    public h b(int i10) {
        int i11 = this.f64967b;
        int i12 = i11 + i10;
        if (i12 < 0) {
            return new r(this, i10);
        }
        return new q(this.f64966a, i11, i12);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
