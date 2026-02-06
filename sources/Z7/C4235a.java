package z7;

/* renamed from: z7.a  reason: case insensitive filesystem */
public final class C4235a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4235a f50083a = new C4235a();

    private C4235a() {
    }

    public static final int a(int i10, Object obj) {
        int i11;
        int i12 = i10 * 31;
        if (obj != null) {
            i11 = obj.hashCode();
        } else {
            i11 = 0;
        }
        return i12 + i11;
    }
}
