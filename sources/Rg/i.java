package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import zf.C6828a;

final class i extends j implements Iterator, C6658d, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private int f64990a;

    /* renamed from: b  reason: collision with root package name */
    private Object f64991b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator f64992c;

    /* renamed from: d  reason: collision with root package name */
    private C6658d f64993d;

    private final Throwable g() {
        int i10 = this.f64990a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f64990a);
    }

    private final Object j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public Object b(Object obj, C6658d dVar) {
        this.f64991b = obj;
        this.f64990a = 3;
        this.f64993d = dVar;
        Object f10 = C6680b.f();
        if (f10 == C6680b.f()) {
            h.c(dVar);
        }
        if (f10 == C6680b.f()) {
            return f10;
        }
        return C6514M.f71813a;
    }

    public Object e(Iterator it, C6658d dVar) {
        if (!it.hasNext()) {
            return C6514M.f71813a;
        }
        this.f64992c = it;
        this.f64990a = 2;
        this.f64993d = dVar;
        Object f10 = C6680b.f();
        if (f10 == C6680b.f()) {
            h.c(dVar);
        }
        if (f10 == C6680b.f()) {
            return f10;
        }
        return C6514M.f71813a;
    }

    public g getContext() {
        return qf.h.f72645a;
    }

    public boolean hasNext() {
        while (true) {
            int i10 = this.f64990a;
            if (i10 != 0) {
                if (i10 == 1) {
                    Iterator it = this.f64992c;
                    C6496s.e(it);
                    if (it.hasNext()) {
                        this.f64990a = 2;
                        return true;
                    }
                    this.f64992c = null;
                } else if (i10 == 2 || i10 == 3) {
                    return true;
                } else {
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
            }
            this.f64990a = 5;
            C6658d dVar = this.f64993d;
            C6496s.e(dVar);
            this.f64993d = null;
            v.a aVar = v.f71841b;
            dVar.resumeWith(v.b(C6514M.f71813a));
        }
    }

    public final void k(C6658d dVar) {
        this.f64993d = dVar;
    }

    public Object next() {
        int i10 = this.f64990a;
        if (i10 == 0 || i10 == 1) {
            return j();
        }
        if (i10 == 2) {
            this.f64990a = 1;
            Iterator it = this.f64992c;
            C6496s.e(it);
            return it.next();
        } else if (i10 == 3) {
            this.f64990a = 0;
            Object obj = this.f64991b;
            this.f64991b = null;
            return obj;
        } else {
            throw g();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        w.b(obj);
        this.f64990a = 4;
    }
}
