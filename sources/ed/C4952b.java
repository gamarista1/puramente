package ed;

/* renamed from: ed.b  reason: case insensitive filesystem */
public enum C4952b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: a  reason: collision with root package name */
    private final int[] f60090a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60091b;

    private C4952b(int[] iArr, int i10) {
        this.f60090a = iArr;
        this.f60091b = i10;
    }

    public int a() {
        return this.f60091b;
    }

    public int b(C4953c cVar) {
        char c10;
        int f10 = cVar.f();
        if (f10 <= 9) {
            c10 = 0;
        } else if (f10 <= 26) {
            c10 = 1;
        } else {
            c10 = 2;
        }
        return this.f60090a[c10];
    }
}
