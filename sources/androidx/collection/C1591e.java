package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import u.C2667d;

/* renamed from: androidx.collection.e  reason: case insensitive filesystem */
public final class C1591e {

    /* renamed from: a  reason: collision with root package name */
    private int[] f12165a;

    /* renamed from: b  reason: collision with root package name */
    private int f12166b;

    /* renamed from: c  reason: collision with root package name */
    private int f12167c;

    /* renamed from: d  reason: collision with root package name */
    private int f12168d;

    public C1591e() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final void c() {
        int[] iArr = this.f12165a;
        int length = iArr.length;
        int i10 = this.f12166b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            int[] iArr2 = new int[i12];
            C6559l.k(iArr, iArr2, 0, i10, length);
            C6559l.k(this.f12165a, iArr2, i11, 0, this.f12166b);
            this.f12165a = iArr2;
            this.f12166b = 0;
            this.f12167c = length;
            this.f12168d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void a(int i10) {
        int[] iArr = this.f12165a;
        int i11 = this.f12167c;
        iArr[i11] = i10;
        int i12 = this.f12168d & (i11 + 1);
        this.f12167c = i12;
        if (i12 == this.f12166b) {
            c();
        }
    }

    public final void b() {
        this.f12167c = this.f12166b;
    }

    public final boolean d() {
        if (this.f12166b == this.f12167c) {
            return true;
        }
        return false;
    }

    public final int e() {
        int i10 = this.f12166b;
        if (i10 != this.f12167c) {
            int i11 = this.f12165a[i10];
            this.f12166b = (i10 + 1) & this.f12168d;
            return i11;
        }
        C1592f fVar = C1592f.f12169a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public C1591e(int i10) {
        boolean z10 = false;
        if (!(i10 >= 1)) {
            C2667d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824 ? true : z10)) {
            C2667d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f12168d = i10 - 1;
        this.f12165a = new int[i10];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1591e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
