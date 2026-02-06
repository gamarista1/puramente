package W0;

import kotlin.jvm.internal.C6496s;
import mf.C6559l;

/* renamed from: W0.o  reason: case insensitive filesystem */
final class C1447o {

    /* renamed from: a  reason: collision with root package name */
    private int f8589a;

    /* renamed from: b  reason: collision with root package name */
    private char[] f8590b;

    /* renamed from: c  reason: collision with root package name */
    private int f8591c;

    /* renamed from: d  reason: collision with root package name */
    private int f8592d;

    public C1447o(char[] cArr, int i10, int i11) {
        this.f8589a = cArr.length;
        this.f8590b = cArr;
        this.f8591c = i10;
        this.f8592d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f8591c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f8590b;
            C6559l.i(cArr, cArr, this.f8592d - i13, i11, i12);
            this.f8591c = i10;
            this.f8592d -= i13;
        } else if (i10 >= i12 || i11 < i12) {
            int c10 = i10 + c();
            int c11 = i11 + c();
            int i14 = this.f8592d;
            char[] cArr2 = this.f8590b;
            C6559l.i(cArr2, cArr2, this.f8591c, i14, c10);
            this.f8591c += c10 - i14;
            this.f8592d = c11;
        } else {
            this.f8592d = i11 + c();
            this.f8591c = i10;
        }
    }

    private final int c() {
        return this.f8592d - this.f8591c;
    }

    private final void f(int i10) {
        if (i10 > c()) {
            int c10 = i10 - c();
            int i11 = this.f8589a;
            do {
                i11 *= 2;
            } while (i11 - this.f8589a < c10);
            char[] cArr = new char[i11];
            C6559l.i(this.f8590b, cArr, 0, 0, this.f8591c);
            int i12 = this.f8589a;
            int i13 = this.f8592d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            C6559l.i(this.f8590b, cArr, i15, i13, i14 + i13);
            this.f8590b = cArr;
            this.f8589a = i11;
            this.f8592d = i15;
        }
    }

    public final void a(StringBuilder sb2) {
        sb2.append(this.f8590b, 0, this.f8591c);
        C6496s.g(sb2, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f8590b;
        int i10 = this.f8592d;
        sb2.append(cArr, i10, this.f8589a - i10);
        C6496s.g(sb2, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char d(int i10) {
        int i11 = this.f8591c;
        if (i10 < i11) {
            return this.f8590b[i10];
        }
        return this.f8590b[(i10 - i11) + this.f8592d];
    }

    public final int e() {
        return this.f8589a - c();
    }

    public final void g(int i10, int i11, String str) {
        f(str.length() - (i11 - i10));
        b(i10, i11);
        C1448p.b(str, this.f8590b, this.f8591c);
        this.f8591c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb2);
        return sb2.toString();
    }
}
