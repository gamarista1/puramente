package f0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f0.b  reason: case insensitive filesystem */
public final class C1958b {

    /* renamed from: a  reason: collision with root package name */
    private int f19591a;

    public C1958b(int i10) {
        this.f19591a = i10;
    }

    public final int a() {
        return this.f19591a;
    }

    public final void b(int i10) {
        this.f19591a += i10;
    }

    public final void c(int i10) {
        this.f19591a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1958b) && this.f19591a == ((C1958b) obj).f19591a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19591a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f19591a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1958b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
