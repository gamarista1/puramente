package Q0;

import kotlin.jvm.internal.C6496s;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final C1335s f5380a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5381b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5382c;

    public r(C1335s sVar, int i10, int i11) {
        this.f5380a = sVar;
        this.f5381b = i10;
        this.f5382c = i11;
    }

    public final int a() {
        return this.f5382c;
    }

    public final C1335s b() {
        return this.f5380a;
    }

    public final int c() {
        return this.f5381b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (C6496s.c(this.f5380a, rVar.f5380a) && this.f5381b == rVar.f5381b && this.f5382c == rVar.f5382c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5380a.hashCode() * 31) + Integer.hashCode(this.f5381b)) * 31) + Integer.hashCode(this.f5382c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f5380a + ", startIndex=" + this.f5381b + ", endIndex=" + this.f5382c + ')';
    }
}
