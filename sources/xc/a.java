package Xc;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f53503h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f53504i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f53505j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f53506k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f53507l = new a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f53508m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f53509n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f53510o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f53511a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f53512b;

    /* renamed from: c  reason: collision with root package name */
    private final b f53513c;

    /* renamed from: d  reason: collision with root package name */
    private final b f53514d;

    /* renamed from: e  reason: collision with root package name */
    private final int f53515e;

    /* renamed from: f  reason: collision with root package name */
    private final int f53516f;

    /* renamed from: g  reason: collision with root package name */
    private final int f53517g;

    static {
        a aVar = new a(67, 64, 1);
        f53505j = aVar;
        a aVar2 = new a(301, 256, 1);
        f53508m = aVar2;
        f53509n = aVar2;
        f53510o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f53516f = i10;
        this.f53515e = i11;
        this.f53517g = i12;
        this.f53511a = new int[i11];
        this.f53512b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f53511a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f53512b[this.f53511a[i15]] = i15;
        }
        this.f53513c = new b(this, new int[]{0});
        this.f53514d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* access modifiers changed from: package-private */
    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f53513c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f53511a[i10];
    }

    public int d() {
        return this.f53517g;
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.f53513c;
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        if (i10 != 0) {
            return this.f53511a[(this.f53515e - this.f53512b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        if (i10 != 0) {
            return this.f53512b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f53511a;
        int[] iArr2 = this.f53512b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f53515e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f53516f) + ',' + this.f53515e + ')';
    }
}
