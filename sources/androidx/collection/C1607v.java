package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import u.C2664a;
import u.C2667d;

/* renamed from: androidx.collection.v  reason: case insensitive filesystem */
public class C1607v implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f12211a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ long[] f12212b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f12213c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ int f12214d;

    public C1607v() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public void a() {
        int i10 = this.f12214d;
        Object[] objArr = this.f12213c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f12214d = 0;
        this.f12211a = false;
    }

    /* renamed from: c */
    public C1607v clone() {
        Object clone = super.clone();
        C6496s.f(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1607v vVar = (C1607v) clone;
        vVar.f12212b = (long[]) this.f12212b.clone();
        vVar.f12213c = (Object[]) this.f12213c.clone();
        return vVar;
    }

    public boolean d(long j10) {
        if (g(j10) >= 0) {
            return true;
        }
        return false;
    }

    public Object e(long j10) {
        int b10 = C2664a.b(this.f12212b, this.f12214d, j10);
        if (b10 < 0 || this.f12213c[b10] == C1608w.f12215a) {
            return null;
        }
        return this.f12213c[b10];
    }

    public int g(long j10) {
        if (this.f12211a) {
            int i10 = this.f12214d;
            long[] jArr = this.f12212b;
            Object[] objArr = this.f12213c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C1608w.f12215a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12211a = false;
            this.f12214d = i11;
        }
        return C2664a.b(this.f12212b, this.f12214d, j10);
    }

    public boolean h() {
        if (m() == 0) {
            return true;
        }
        return false;
    }

    public long i(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f12214d) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C2667d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f12211a) {
            int i11 = this.f12214d;
            long[] jArr = this.f12212b;
            Object[] objArr = this.f12213c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C1608w.f12215a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f12211a = false;
            this.f12214d = i12;
        }
        return this.f12212b[i10];
    }

    public void j(long j10, Object obj) {
        int b10 = C2664a.b(this.f12212b, this.f12214d, j10);
        if (b10 >= 0) {
            this.f12213c[b10] = obj;
            return;
        }
        int i10 = ~b10;
        if (i10 >= this.f12214d || this.f12213c[i10] != C1608w.f12215a) {
            if (this.f12211a) {
                int i11 = this.f12214d;
                long[] jArr = this.f12212b;
                if (i11 >= jArr.length) {
                    Object[] objArr = this.f12213c;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        Object obj2 = objArr[i13];
                        if (obj2 != C1608w.f12215a) {
                            if (i13 != i12) {
                                jArr[i12] = jArr[i13];
                                objArr[i12] = obj2;
                                objArr[i13] = null;
                            }
                            i12++;
                        }
                    }
                    this.f12211a = false;
                    this.f12214d = i12;
                    i10 = ~C2664a.b(this.f12212b, i12, j10);
                }
            }
            int i14 = this.f12214d;
            if (i14 >= this.f12212b.length) {
                int f10 = C2664a.f(i14 + 1);
                long[] copyOf = Arrays.copyOf(this.f12212b, f10);
                C6496s.g(copyOf, "copyOf(this, newSize)");
                this.f12212b = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f12213c, f10);
                C6496s.g(copyOf2, "copyOf(this, newSize)");
                this.f12213c = copyOf2;
            }
            int i15 = this.f12214d;
            if (i15 - i10 != 0) {
                long[] jArr2 = this.f12212b;
                int i16 = i10 + 1;
                C6559l.l(jArr2, jArr2, i16, i10, i15);
                Object[] objArr2 = this.f12213c;
                C6559l.m(objArr2, objArr2, i16, i10, this.f12214d);
            }
            this.f12212b[i10] = j10;
            this.f12213c[i10] = obj;
            this.f12214d++;
            return;
        }
        this.f12212b[i10] = j10;
        this.f12213c[i10] = obj;
    }

    public void k(long j10) {
        int b10 = C2664a.b(this.f12212b, this.f12214d, j10);
        if (b10 >= 0 && this.f12213c[b10] != C1608w.f12215a) {
            this.f12213c[b10] = C1608w.f12215a;
            this.f12211a = true;
        }
    }

    public void l(int i10) {
        if (this.f12213c[i10] != C1608w.f12215a) {
            this.f12213c[i10] = C1608w.f12215a;
            this.f12211a = true;
        }
    }

    public int m() {
        if (this.f12211a) {
            int i10 = this.f12214d;
            long[] jArr = this.f12212b;
            Object[] objArr = this.f12213c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C1608w.f12215a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12211a = false;
            this.f12214d = i11;
        }
        return this.f12214d;
    }

    public Object o(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f12214d) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C2667d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f12211a) {
            int i11 = this.f12214d;
            long[] jArr = this.f12212b;
            Object[] objArr = this.f12213c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C1608w.f12215a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f12211a = false;
            this.f12214d = i12;
        }
        return this.f12213c[i10];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12214d * 28);
        sb2.append('{');
        int i10 = this.f12214d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            Object o10 = o(i11);
            if (o10 != sb2) {
                sb2.append(o10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public C1607v(int i10) {
        if (i10 == 0) {
            this.f12212b = C2664a.f26374b;
            this.f12213c = C2664a.f26375c;
            return;
        }
        int f10 = C2664a.f(i10);
        this.f12212b = new long[f10];
        this.f12213c = new Object[f10];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1607v(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
