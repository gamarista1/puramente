package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import zf.C6828a;

public final class f implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f64978a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f64979b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6798l f64980c;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f64981a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator f64982b;

        /* renamed from: c  reason: collision with root package name */
        private int f64983c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f64984d;

        a(f fVar) {
            this.f64984d = fVar;
            this.f64981a = fVar.f64978a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f64982b;
            if (it == null || !it.hasNext()) {
                while (this.f64981a.hasNext()) {
                    Iterator it2 = (Iterator) this.f64984d.f64980c.invoke(this.f64984d.f64979b.invoke(this.f64981a.next()));
                    if (it2.hasNext()) {
                        this.f64982b = it2;
                        this.f64983c = 1;
                        return true;
                    }
                }
                this.f64983c = 2;
                this.f64982b = null;
                return false;
            }
            this.f64983c = 1;
            return true;
        }

        public boolean hasNext() {
            int i10 = this.f64983c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        public Object next() {
            int i10 = this.f64983c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            } else if (i10 != 0 || a()) {
                this.f64983c = 0;
                Iterator it = this.f64982b;
                C6496s.e(it);
                return it.next();
            } else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar, C6798l lVar, C6798l lVar2) {
        C6496s.h(hVar, "sequence");
        C6496s.h(lVar, "transformer");
        C6496s.h(lVar2, "iterator");
        this.f64978a = hVar;
        this.f64979b = lVar;
        this.f64980c = lVar2;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
