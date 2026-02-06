package p1;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: p1.d  reason: case insensitive filesystem */
public final class C2388d {

    /* renamed from: e  reason: collision with root package name */
    public static final C2388d f25149e = new C2388d(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f25150a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25151b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25152c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25153d;

    /* renamed from: p1.d$a */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private C2388d(int i10, int i11, int i12, int i13) {
        this.f25150a = i10;
        this.f25151b = i11;
        this.f25152c = i12;
        this.f25153d = i13;
    }

    public static C2388d a(C2388d dVar, C2388d dVar2) {
        return b(Math.max(dVar.f25150a, dVar2.f25150a), Math.max(dVar.f25151b, dVar2.f25151b), Math.max(dVar.f25152c, dVar2.f25152c), Math.max(dVar.f25153d, dVar2.f25153d));
    }

    public static C2388d b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f25149e;
        }
        return new C2388d(i10, i11, i12, i13);
    }

    public static C2388d c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C2388d d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f25150a, this.f25151b, this.f25152c, this.f25153d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2388d.class != obj.getClass()) {
            return false;
        }
        C2388d dVar = (C2388d) obj;
        if (this.f25153d == dVar.f25153d && this.f25150a == dVar.f25150a && this.f25152c == dVar.f25152c && this.f25151b == dVar.f25151b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f25150a * 31) + this.f25151b) * 31) + this.f25152c) * 31) + this.f25153d;
    }

    public String toString() {
        return "Insets{left=" + this.f25150a + ", top=" + this.f25151b + ", right=" + this.f25152c + ", bottom=" + this.f25153d + '}';
    }
}
