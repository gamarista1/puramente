package zg;

import Fg.S;

/* renamed from: zg.a  reason: case insensitive filesystem */
public abstract class C6834a implements C6840g {

    /* renamed from: a  reason: collision with root package name */
    protected final S f73998a;

    /* renamed from: b  reason: collision with root package name */
    private final C6840g f73999b;

    public C6834a(S s10, C6840g gVar) {
        if (s10 == null) {
            b(0);
        }
        this.f73998a = s10;
        this.f73999b = gVar == null ? this : gVar;
    }

    private static /* synthetic */ void b(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 1 || i10 == 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 1 || i10 == 2) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i10 == 1 || i10 == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public S getType() {
        S s10 = this.f73998a;
        if (s10 == null) {
            b(1);
        }
        return s10;
    }
}
