package Tg;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f65173a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal[] f65174b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f65174b = threadLocalArr;
    }

    public static final boolean a() {
        return f65173a;
    }
}
