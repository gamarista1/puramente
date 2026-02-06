package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class q implements h, c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f65003a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f65004b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f65005c;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f65006a;

        /* renamed from: b  reason: collision with root package name */
        private int f65007b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f65008c;

        a(q qVar) {
            this.f65008c = qVar;
            this.f65006a = qVar.f65003a.iterator();
        }

        private final void a() {
            while (this.f65007b < this.f65008c.f65004b && this.f65006a.hasNext()) {
                this.f65006a.next();
                this.f65007b++;
            }
        }

        public boolean hasNext() {
            a();
            if (this.f65007b >= this.f65008c.f65005c || !this.f65006a.hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            a();
            if (this.f65007b < this.f65008c.f65005c) {
                this.f65007b++;
                return this.f65006a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(h hVar, int i10, int i11) {
        C6496s.h(hVar, "sequence");
        this.f65003a = hVar;
        this.f65004b = i10;
        this.f65005c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        } else if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
        }
    }

    private final int f() {
        return this.f65005c - this.f65004b;
    }

    public h a(int i10) {
        if (i10 >= f()) {
            return k.e();
        }
        return new q(this.f65003a, this.f65004b + i10, this.f65005c);
    }

    public h b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        h hVar = this.f65003a;
        int i11 = this.f65004b;
        return new q(hVar, i11, i10 + i11);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
