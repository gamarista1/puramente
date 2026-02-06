package androidx.appcompat.widget;

class Y {

    /* renamed from: a  reason: collision with root package name */
    private int f11751a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f11752b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f11753c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f11754d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f11755e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f11756f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11757g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11758h = false;

    Y() {
    }

    public int a() {
        if (this.f11757g) {
            return this.f11751a;
        }
        return this.f11752b;
    }

    public int b() {
        return this.f11751a;
    }

    public int c() {
        return this.f11752b;
    }

    public int d() {
        if (this.f11757g) {
            return this.f11752b;
        }
        return this.f11751a;
    }

    public void e(int i10, int i11) {
        this.f11758h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f11755e = i10;
            this.f11751a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f11756f = i11;
            this.f11752b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 != this.f11757g) {
            this.f11757g = z10;
            if (!this.f11758h) {
                this.f11751a = this.f11755e;
                this.f11752b = this.f11756f;
            } else if (z10) {
                int i10 = this.f11754d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f11755e;
                }
                this.f11751a = i10;
                int i11 = this.f11753c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f11756f;
                }
                this.f11752b = i11;
            } else {
                int i12 = this.f11753c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f11755e;
                }
                this.f11751a = i12;
                int i13 = this.f11754d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = this.f11756f;
                }
                this.f11752b = i13;
            }
        }
    }

    public void g(int i10, int i11) {
        this.f11753c = i10;
        this.f11754d = i11;
        this.f11758h = true;
        if (this.f11757g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f11751a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f11752b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f11751a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f11752b = i11;
        }
    }
}
