package W0;

/* renamed from: W0.h  reason: case insensitive filesystem */
public final class C1440h implements C1441i {

    /* renamed from: a  reason: collision with root package name */
    private final int f8576a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8577b;

    public C1440h(int i10, int i11) {
        this.f8576a = i10;
        this.f8577b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    public void a(C1444l lVar) {
        int i10 = this.f8576a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 < i10) {
                int i14 = i13 + 1;
                if (lVar.k() <= i14) {
                    i13 = lVar.k();
                    break;
                }
                if (C1442j.b(lVar.c((lVar.k() - i14) - 1), lVar.c(lVar.k() - i14))) {
                    i13 += 2;
                } else {
                    i13 = i14;
                }
                i12++;
            } else {
                break;
            }
        }
        int i15 = this.f8577b;
        int i16 = 0;
        while (true) {
            if (i11 >= i15) {
                break;
            }
            int i17 = i16 + 1;
            if (lVar.j() + i17 >= lVar.h()) {
                i16 = lVar.h() - lVar.j();
                break;
            }
            if (C1442j.b(lVar.c((lVar.j() + i17) - 1), lVar.c(lVar.j() + i17))) {
                i16 += 2;
            } else {
                i16 = i17;
            }
            i11++;
        }
        lVar.b(lVar.j(), lVar.j() + i16);
        lVar.b(lVar.k() - i13, lVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440h)) {
            return false;
        }
        C1440h hVar = (C1440h) obj;
        if (this.f8576a == hVar.f8576a && this.f8577b == hVar.f8577b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8576a * 31) + this.f8577b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f8576a + ", lengthAfterCursor=" + this.f8577b + ')';
    }
}
