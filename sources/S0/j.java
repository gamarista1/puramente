package S0;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5834a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5835b;

    public j(CharSequence charSequence, i iVar) {
        this.f5834a = charSequence;
        this.f5835b = iVar;
    }

    public int a(int i10) {
        do {
            i10 = this.f5835b.n(i10);
            if (i10 == -1 || i10 == this.f5834a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f5834a.charAt(i10)));
        return i10;
    }

    public int b(int i10) {
        do {
            i10 = this.f5835b.o(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f5834a.charAt(i10)));
        return i10;
    }

    public int c(int i10) {
        do {
            i10 = this.f5835b.n(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f5834a.charAt(i10 - 1)));
        return i10;
    }

    public int d(int i10) {
        do {
            i10 = this.f5835b.o(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f5834a.charAt(i10 - 1)));
        return i10;
    }
}
