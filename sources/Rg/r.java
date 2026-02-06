package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class r implements h, c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f65009a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f65010b;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f65011a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator f65012b;

        a(r rVar) {
            this.f65011a = rVar.f65010b;
            this.f65012b = rVar.f65009a.iterator();
        }

        public boolean hasNext() {
            if (this.f65011a <= 0 || !this.f65012b.hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            int i10 = this.f65011a;
            if (i10 != 0) {
                this.f65011a = i10 - 1;
                return this.f65012b.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(h hVar, int i10) {
        C6496s.h(hVar, "sequence");
        this.f65009a = hVar;
        this.f65010b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public h a(int i10) {
        int i11 = this.f65010b;
        if (i10 >= i11) {
            return k.e();
        }
        return new q(this.f65009a, i10, i11);
    }

    public h b(int i10) {
        if (i10 >= this.f65010b) {
            return this;
        }
        return new r(this.f65009a, i10);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
