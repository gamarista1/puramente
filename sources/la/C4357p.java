package La;

/* renamed from: La.p  reason: case insensitive filesystem */
public enum C4357p implements C4333a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f51627a;

    private C4357p(int i10) {
        this.f51627a = i10;
    }

    public int a() {
        return this.f51627a;
    }
}
