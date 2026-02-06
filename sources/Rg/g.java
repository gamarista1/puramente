package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;
import yf.C6798l;
import zf.C6828a;

final class g implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6787a f64985a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f64986b;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private Object f64987a;

        /* renamed from: b  reason: collision with root package name */
        private int f64988b = -2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f64989c;

        a(g gVar) {
            this.f64989c = gVar;
        }

        private final void a() {
            Object obj;
            int i10;
            if (this.f64988b == -2) {
                obj = this.f64989c.f64985a.invoke();
            } else {
                C6798l d10 = this.f64989c.f64986b;
                Object obj2 = this.f64987a;
                C6496s.e(obj2);
                obj = d10.invoke(obj2);
            }
            this.f64987a = obj;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f64988b = i10;
        }

        public boolean hasNext() {
            if (this.f64988b < 0) {
                a();
            }
            if (this.f64988b == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f64988b < 0) {
                a();
            }
            if (this.f64988b != 0) {
                Object obj = this.f64987a;
                C6496s.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f64988b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(C6787a aVar, C6798l lVar) {
        C6496s.h(aVar, "getInitialValue");
        C6496s.h(lVar, "getNextValue");
        this.f64985a = aVar;
        this.f64986b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
