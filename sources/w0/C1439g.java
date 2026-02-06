package W0;

/* renamed from: W0.g  reason: case insensitive filesystem */
public final class C1439g implements C1441i {

    /* renamed from: a  reason: collision with root package name */
    private final int f8574a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8575b;

    public C1439g(int i10, int i11) {
        this.f8574a = i10;
        this.f8575b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    public void a(C1444l lVar) {
        int j10 = lVar.j();
        int i10 = this.f8575b;
        int i11 = j10 + i10;
        if (((j10 ^ i11) & (i10 ^ i11)) < 0) {
            i11 = lVar.h();
        }
        lVar.b(lVar.j(), Math.min(i11, lVar.h()));
        int k10 = lVar.k();
        int i12 = this.f8574a;
        int i13 = k10 - i12;
        if (((k10 ^ i13) & (i12 ^ k10)) < 0) {
            i13 = 0;
        }
        lVar.b(Math.max(0, i13), lVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1439g)) {
            return false;
        }
        C1439g gVar = (C1439g) obj;
        if (this.f8574a == gVar.f8574a && this.f8575b == gVar.f8575b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8574a * 31) + this.f8575b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f8574a + ", lengthAfterCursor=" + this.f8575b + ')';
    }
}
