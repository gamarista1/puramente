package ih;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public abstract class h {

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f68497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f68498b;

        a(f fVar) {
            this.f68498b = fVar;
            this.f68497a = fVar.d();
        }

        /* renamed from: a */
        public f next() {
            f fVar = this.f68498b;
            int d10 = fVar.d();
            int i10 = this.f68497a;
            this.f68497a = i10 - 1;
            return fVar.g(d10 - i10);
        }

        public boolean hasNext() {
            if (this.f68497a > 0) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f68499a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f68500b;

        b(f fVar) {
            this.f68500b = fVar;
            this.f68499a = fVar.d();
        }

        /* renamed from: a */
        public String next() {
            f fVar = this.f68500b;
            int d10 = fVar.d();
            int i10 = this.f68499a;
            this.f68499a = i10 - 1;
            return fVar.e(d10 - i10);
        }

        public boolean hasNext() {
            if (this.f68499a > 0) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f68501a;

        public c(f fVar) {
            this.f68501a = fVar;
        }

        public Iterator iterator() {
            return new a(this.f68501a);
        }
    }

    public static final class d implements Iterable, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f68502a;

        public d(f fVar) {
            this.f68502a = fVar;
        }

        public Iterator iterator() {
            return new b(this.f68502a);
        }
    }

    public static final Iterable a(f fVar) {
        C6496s.h(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        C6496s.h(fVar, "<this>");
        return new d(fVar);
    }
}
