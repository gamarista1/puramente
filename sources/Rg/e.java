package Rg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import zf.C6828a;

public final class e implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f64971a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f64972b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6798l f64973c;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f64974a;

        /* renamed from: b  reason: collision with root package name */
        private int f64975b = -1;

        /* renamed from: c  reason: collision with root package name */
        private Object f64976c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f64977d;

        a(e eVar) {
            this.f64977d = eVar;
            this.f64974a = eVar.f64971a.iterator();
        }

        private final void a() {
            while (this.f64974a.hasNext()) {
                Object next = this.f64974a.next();
                if (((Boolean) this.f64977d.f64973c.invoke(next)).booleanValue() == this.f64977d.f64972b) {
                    this.f64976c = next;
                    this.f64975b = 1;
                    return;
                }
            }
            this.f64975b = 0;
        }

        public boolean hasNext() {
            if (this.f64975b == -1) {
                a();
            }
            if (this.f64975b == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f64975b == -1) {
                a();
            }
            if (this.f64975b != 0) {
                Object obj = this.f64976c;
                this.f64976c = null;
                this.f64975b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(h hVar, boolean z10, C6798l lVar) {
        C6496s.h(hVar, "sequence");
        C6496s.h(lVar, "predicate");
        this.f64971a = hVar;
        this.f64972b = z10;
        this.f64973c = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
