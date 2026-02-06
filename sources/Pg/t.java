package pg;

import com.google.android.gms.common.api.a;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import pg.C6642d;

class t extends C6642d {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f72558h;

    /* renamed from: b  reason: collision with root package name */
    private final int f72559b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f72560c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C6642d f72561d;

    /* renamed from: e  reason: collision with root package name */
    private final int f72562e;

    /* renamed from: f  reason: collision with root package name */
    private final int f72563f;

    /* renamed from: g  reason: collision with root package name */
    private int f72564g;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Stack f72565a;

        private b() {
            this.f72565a = new Stack();
        }

        /* access modifiers changed from: private */
        public C6642d b(C6642d dVar, C6642d dVar2) {
            c(dVar);
            c(dVar2);
            C6642d dVar3 = (C6642d) this.f72565a.pop();
            while (!this.f72565a.isEmpty()) {
                dVar3 = new t((C6642d) this.f72565a.pop(), dVar3);
            }
            return dVar3;
        }

        private void c(C6642d dVar) {
            if (dVar.t()) {
                e(dVar);
            } else if (dVar instanceof t) {
                t tVar = (t) dVar;
                c(tVar.f72560c);
                c(tVar.f72561d);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(t.f72558h, i10);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        private void e(C6642d dVar) {
            int d10 = d(dVar.size());
            int i10 = t.f72558h[d10 + 1];
            if (this.f72565a.isEmpty() || ((C6642d) this.f72565a.peek()).size() >= i10) {
                this.f72565a.push(dVar);
                return;
            }
            int i11 = t.f72558h[d10];
            C6642d dVar2 = (C6642d) this.f72565a.pop();
            while (!this.f72565a.isEmpty() && ((C6642d) this.f72565a.peek()).size() < i11) {
                dVar2 = new t((C6642d) this.f72565a.pop(), dVar2);
            }
            t tVar = new t(dVar2, dVar);
            while (!this.f72565a.isEmpty()) {
                if (((C6642d) this.f72565a.peek()).size() >= t.f72558h[d(tVar.size()) + 1]) {
                    break;
                }
                tVar = new t((C6642d) this.f72565a.pop(), tVar);
            }
            this.f72565a.push(tVar);
        }
    }

    private static class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private final Stack f72566a;

        /* renamed from: b  reason: collision with root package name */
        private o f72567b;

        private o a(C6642d dVar) {
            while (dVar instanceof t) {
                t tVar = (t) dVar;
                this.f72566a.push(tVar);
                dVar = tVar.f72560c;
            }
            return (o) dVar;
        }

        private o b() {
            while (!this.f72566a.isEmpty()) {
                o a10 = a(((t) this.f72566a.pop()).f72561d);
                if (!a10.isEmpty()) {
                    return a10;
                }
            }
            return null;
        }

        /* renamed from: c */
        public o next() {
            o oVar = this.f72567b;
            if (oVar != null) {
                this.f72567b = b();
                return oVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f72567b != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(C6642d dVar) {
            this.f72566a = new Stack();
            this.f72567b = a(dVar);
        }
    }

    private class d implements C6642d.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f72568a;

        /* renamed from: b  reason: collision with root package name */
        private C6642d.a f72569b;

        /* renamed from: c  reason: collision with root package name */
        int f72570c;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public boolean hasNext() {
            if (this.f72570c > 0) {
                return true;
            }
            return false;
        }

        public byte nextByte() {
            if (!this.f72569b.hasNext()) {
                this.f72569b = this.f72568a.next().iterator();
            }
            this.f72570c--;
            return this.f72569b.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(t.this);
            this.f72568a = cVar;
            this.f72569b = cVar.next().iterator();
            this.f72570c = t.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.valueOf(a.e.API_PRIORITY_OTHER));
        f72558h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f72558h;
            if (i13 < iArr.length) {
                iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                i13++;
            } else {
                return;
            }
        }
    }

    static C6642d S(C6642d dVar, C6642d dVar2) {
        t tVar;
        if (dVar instanceof t) {
            tVar = (t) dVar;
        } else {
            tVar = null;
        }
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return W(dVar, dVar2);
            }
            if (tVar != null && tVar.f72561d.size() + dVar2.size() < 128) {
                dVar2 = new t(tVar.f72560c, W(tVar.f72561d, dVar2));
            } else if (tVar == null || tVar.f72560c.r() <= tVar.f72561d.r() || tVar.r() <= dVar2.r()) {
                if (size >= f72558h[Math.max(dVar.r(), dVar2.r()) + 1]) {
                    return new t(dVar, dVar2);
                }
                return new b().b(dVar, dVar2);
            } else {
                dVar2 = new t(tVar.f72560c, new t(tVar.f72561d, dVar2));
            }
        }
        return dVar2;
    }

    private static o W(C6642d dVar, C6642d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[(size + size2)];
        dVar.m(bArr, 0, 0, size);
        dVar2.m(bArr, 0, size, size2);
        return new o(bArr);
    }

    private boolean Z(C6642d dVar) {
        boolean z10;
        c cVar = new c(this);
        o oVar = (o) cVar.next();
        c cVar2 = new c(dVar);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int min = Math.min(size, size2);
            if (i10 == 0) {
                z10 = oVar.P(oVar2, i11, min);
            } else {
                z10 = oVar2.P(oVar, i10, min);
            }
            if (!z10) {
                return false;
            }
            i12 += min;
            int i13 = this.f72559b;
            if (i12 < i13) {
                if (min == size) {
                    oVar = (o) cVar.next();
                    i10 = 0;
                } else {
                    i10 += min;
                }
                if (min == size2) {
                    oVar2 = (o) cVar2.next();
                    i11 = 0;
                } else {
                    i11 += min;
                }
            } else if (i12 == i13) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public int A(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f72562e;
        if (i13 <= i14) {
            return this.f72560c.A(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f72561d.A(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f72561d.A(this.f72560c.A(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public int C() {
        return this.f72564g;
    }

    public String E(String str) {
        return new String(D(), str);
    }

    /* access modifiers changed from: package-private */
    public void N(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f72562e;
        if (i12 <= i13) {
            this.f72560c.N(outputStream, i10, i11);
        } else if (i10 >= i13) {
            this.f72561d.N(outputStream, i10 - i13, i11);
        } else {
            int i14 = i13 - i10;
            this.f72560c.N(outputStream, i10, i14);
            this.f72561d.N(outputStream, 0, i11 - i14);
        }
    }

    /* renamed from: a0 */
    public C6642d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int C10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6642d)) {
            return false;
        }
        C6642d dVar = (C6642d) obj;
        if (this.f72559b != dVar.size()) {
            return false;
        }
        if (this.f72559b == 0) {
            return true;
        }
        if (this.f72564g == 0 || (C10 = dVar.C()) == 0 || this.f72564g == C10) {
            return Z(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f72564g;
        if (i10 == 0) {
            int i11 = this.f72559b;
            i10 = z(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f72564g = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void n(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f72562e;
        if (i13 <= i14) {
            this.f72560c.n(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.f72561d.n(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.f72560c.n(bArr, i10, i11, i15);
            this.f72561d.n(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* access modifiers changed from: protected */
    public int r() {
        return this.f72563f;
    }

    public int size() {
        return this.f72559b;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        if (this.f72559b >= f72558h[this.f72563f]) {
            return true;
        }
        return false;
    }

    public boolean v() {
        int A10 = this.f72560c.A(0, 0, this.f72562e);
        C6642d dVar = this.f72561d;
        if (dVar.A(A10, 0, dVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int z(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f72562e;
        if (i13 <= i14) {
            return this.f72560c.z(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f72561d.z(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f72561d.z(this.f72560c.z(i10, i11, i15), 0, i12 - i15);
    }

    private t(C6642d dVar, C6642d dVar2) {
        this.f72564g = 0;
        this.f72560c = dVar;
        this.f72561d = dVar2;
        int size = dVar.size();
        this.f72562e = size;
        this.f72559b = size + dVar2.size();
        this.f72563f = Math.max(dVar.r(), dVar2.r()) + 1;
    }
}
