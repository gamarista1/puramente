package Lb;

import Gb.c;
import Tb.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class l implements Iterable, Comparable {

    /* renamed from: d  reason: collision with root package name */
    private static final l f51757d = new l("");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b[] f51758a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f51759b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f51760c;

    class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        int f51761a;

        a() {
            this.f51761a = l.this.f51759b;
        }

        /* renamed from: a */
        public b next() {
            if (hasNext()) {
                b[] m10 = l.this.f51758a;
                int i10 = this.f51761a;
                b bVar = m10[i10];
                this.f51761a = i10 + 1;
                return bVar;
            }
            throw new NoSuchElementException("No more elements.");
        }

        public boolean hasNext() {
            if (this.f51761a < l.this.f51760c) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public l(b... bVarArr) {
        this.f51758a = (b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        this.f51759b = 0;
        this.f51760c = bVarArr.length;
        int length = bVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Ob.l.g(bVarArr[i10] != null, "Can't construct a path with a null value!");
        }
    }

    public static l D() {
        return f51757d;
    }

    public static l I(l lVar, l lVar2) {
        b E10 = lVar.E();
        b E11 = lVar2.E();
        if (E10 == null) {
            return lVar2;
        }
        if (E10.equals(E11)) {
            return I(lVar.N(), lVar2.N());
        }
        throw new c("INTERNAL ERROR: " + lVar2 + " is not contained in " + lVar);
    }

    public boolean A(l lVar) {
        if (size() > lVar.size()) {
            return false;
        }
        int i10 = this.f51759b;
        int i11 = lVar.f51759b;
        while (i10 < this.f51760c) {
            if (!this.f51758a[i10].equals(lVar.f51758a[i11])) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public b C() {
        if (!isEmpty()) {
            return this.f51758a[this.f51760c - 1];
        }
        return null;
    }

    public b E() {
        if (isEmpty()) {
            return null;
        }
        return this.f51758a[this.f51759b];
    }

    public l H() {
        if (isEmpty()) {
            return null;
        }
        return new l(this.f51758a, this.f51759b, this.f51760c - 1);
    }

    public l N() {
        int i10 = this.f51759b;
        if (!isEmpty()) {
            i10++;
        }
        return new l(this.f51758a, i10, this.f51760c);
    }

    public String P() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = this.f51759b; i10 < this.f51760c; i10++) {
            if (i10 > this.f51759b) {
                sb2.append("/");
            }
            sb2.append(this.f51758a[i10].b());
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        l lVar = (l) obj;
        if (size() != lVar.size()) {
            return false;
        }
        int i10 = this.f51759b;
        int i11 = lVar.f51759b;
        while (i10 < this.f51760c && i11 < lVar.f51760c) {
            if (!this.f51758a[i10].equals(lVar.f51758a[i11])) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public int hashCode() {
        int i10 = 0;
        for (int i11 = this.f51759b; i11 < this.f51760c; i11++) {
            i10 = (i10 * 37) + this.f51758a[i11].hashCode();
        }
        return i10;
    }

    public boolean isEmpty() {
        if (this.f51759b >= this.f51760c) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new a();
    }

    public List r() {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).b());
        }
        return arrayList;
    }

    public int size() {
        return this.f51760c - this.f51759b;
    }

    public l t(l lVar) {
        int size = size() + lVar.size();
        b[] bVarArr = new b[size];
        System.arraycopy(this.f51758a, this.f51759b, bVarArr, 0, size());
        System.arraycopy(lVar.f51758a, lVar.f51759b, bVarArr, size(), lVar.size());
        return new l(bVarArr, 0, size);
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = this.f51759b; i10 < this.f51760c; i10++) {
            sb2.append("/");
            sb2.append(this.f51758a[i10].b());
        }
        return sb2.toString();
    }

    public l x(b bVar) {
        int size = size();
        int i10 = size + 1;
        b[] bVarArr = new b[i10];
        System.arraycopy(this.f51758a, this.f51759b, bVarArr, 0, size);
        bVarArr[size] = bVar;
        return new l(bVarArr, 0, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(Lb.l r5) {
        /*
            r4 = this;
            int r0 = r4.f51759b
            int r1 = r5.f51759b
        L_0x0004:
            int r2 = r4.f51760c
            if (r0 >= r2) goto L_0x0020
            int r3 = r5.f51760c
            if (r1 >= r3) goto L_0x0020
            Tb.b[] r2 = r4.f51758a
            r2 = r2[r0]
            Tb.b[] r3 = r5.f51758a
            r3 = r3[r1]
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0020:
            if (r0 != r2) goto L_0x0028
            int r5 = r5.f51760c
            if (r1 != r5) goto L_0x0028
            r5 = 0
            return r5
        L_0x0028:
            if (r0 != r2) goto L_0x002c
            r5 = -1
            return r5
        L_0x002c:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Lb.l.compareTo(Lb.l):int");
    }

    public l(List list) {
        this.f51758a = new b[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f51758a[i10] = b.e((String) it.next());
            i10++;
        }
        this.f51759b = 0;
        this.f51760c = list.size();
    }

    public l(String str) {
        String[] split = str.split("/", -1);
        int i10 = 0;
        for (String length : split) {
            if (length.length() > 0) {
                i10++;
            }
        }
        this.f51758a = new b[i10];
        int i11 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                this.f51758a[i11] = b.e(str2);
                i11++;
            }
        }
        this.f51759b = 0;
        this.f51760c = this.f51758a.length;
    }

    private l(b[] bVarArr, int i10, int i11) {
        this.f51758a = bVarArr;
        this.f51759b = i10;
        this.f51760c = i11;
    }
}
