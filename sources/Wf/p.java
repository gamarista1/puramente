package wf;

import Rg.h;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

final class p implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f73738a;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private String f73739a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f73740b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f73741c;

        a(p pVar) {
            this.f73741c = pVar;
        }

        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f73739a;
                this.f73739a = null;
                C6496s.e(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f73739a == null && !this.f73740b) {
                String readLine = this.f73741c.f73738a.readLine();
                this.f73739a = readLine;
                if (readLine == null) {
                    this.f73740b = true;
                }
            }
            if (this.f73739a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(BufferedReader bufferedReader) {
        C6496s.h(bufferedReader, "reader");
        this.f73738a = bufferedReader;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
