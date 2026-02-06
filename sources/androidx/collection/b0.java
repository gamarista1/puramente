package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.L;
import zf.C6828a;

public abstract class b0 {

    public static final class a extends L {

        /* renamed from: a  reason: collision with root package name */
        private int f12161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z f12162b;

        a(Z z10) {
            this.f12162b = z10;
        }

        public int a() {
            Z z10 = this.f12162b;
            int i10 = this.f12161a;
            this.f12161a = i10 + 1;
            return z10.j(i10);
        }

        public boolean hasNext() {
            if (this.f12161a < this.f12162b.o()) {
                return true;
            }
            return false;
        }
    }

    public static final class b implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f12163a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z f12164b;

        b(Z z10) {
            this.f12164b = z10;
        }

        public boolean hasNext() {
            if (this.f12163a < this.f12164b.o()) {
                return true;
            }
            return false;
        }

        public Object next() {
            Z z10 = this.f12164b;
            int i10 = this.f12163a;
            this.f12163a = i10 + 1;
            return z10.p(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final L a(Z z10) {
        C6496s.h(z10, "<this>");
        return new a(z10);
    }

    public static final Iterator b(Z z10) {
        C6496s.h(z10, "<this>");
        return new b(z10);
    }
}
