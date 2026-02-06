package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import zf.C6828a;

public final class s implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f65013a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f65014b;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f65015a;

        /* renamed from: b  reason: collision with root package name */
        private int f65016b = -1;

        /* renamed from: c  reason: collision with root package name */
        private Object f65017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s f65018d;

        a(s sVar) {
            this.f65018d = sVar;
            this.f65015a = sVar.f65013a.iterator();
        }

        private final void a() {
            if (this.f65015a.hasNext()) {
                Object next = this.f65015a.next();
                if (((Boolean) this.f65018d.f65014b.invoke(next)).booleanValue()) {
                    this.f65016b = 1;
                    this.f65017c = next;
                    return;
                }
            }
            this.f65016b = 0;
        }

        public boolean hasNext() {
            if (this.f65016b == -1) {
                a();
            }
            if (this.f65016b == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f65016b == -1) {
                a();
            }
            if (this.f65016b != 0) {
                Object obj = this.f65017c;
                this.f65017c = null;
                this.f65016b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(h hVar, C6798l lVar) {
        C6496s.h(hVar, "sequence");
        C6496s.h(lVar, "predicate");
        this.f65013a = hVar;
        this.f65014b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
