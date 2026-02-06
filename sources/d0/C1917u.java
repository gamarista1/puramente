package d0;

import f0.C1957a;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: d0.u  reason: case insensitive filesystem */
public abstract class C1917u implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f19434a = C1916t.f19425e.a().p();

    /* renamed from: b  reason: collision with root package name */
    private int f19435b;

    /* renamed from: c  reason: collision with root package name */
    private int f19436c;

    public final Object a() {
        C1957a.a(g());
        return this.f19434a[this.f19436c];
    }

    public final C1916t b() {
        C1957a.a(j());
        Object obj = this.f19434a[this.f19436c];
        C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (C1916t) obj;
    }

    /* access modifiers changed from: protected */
    public final Object[] c() {
        return this.f19434a;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return this.f19436c;
    }

    public final boolean g() {
        if (this.f19436c < this.f19435b) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return g();
    }

    public final boolean j() {
        boolean z10;
        if (this.f19436c >= this.f19435b) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1957a.a(z10);
        if (this.f19436c < this.f19434a.length) {
            return true;
        }
        return false;
    }

    public final void k() {
        C1957a.a(g());
        this.f19436c += 2;
    }

    public final void l() {
        C1957a.a(j());
        this.f19436c++;
    }

    public final void n(Object[] objArr, int i10) {
        o(objArr, i10, 0);
    }

    public final void o(Object[] objArr, int i10, int i11) {
        this.f19434a = objArr;
        this.f19435b = i10;
        this.f19436c = i11;
    }

    /* access modifiers changed from: protected */
    public final void q(int i10) {
        this.f19436c = i10;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
