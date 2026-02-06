package mg;

import java.util.Arrays;
import kg.C6434a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mg.e  reason: case insensitive filesystem */
public final class C6577e extends C6434a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f72096h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final C6577e f72097i;

    /* renamed from: j  reason: collision with root package name */
    public static final C6577e f72098j;

    /* renamed from: k  reason: collision with root package name */
    public static final C6577e f72099k = new C6577e(new int[0]);

    /* renamed from: g  reason: collision with root package name */
    private final boolean f72100g;

    /* renamed from: mg.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C6577e eVar = new C6577e(2, 0, 0);
        f72097i = eVar;
        f72098j = eVar.m();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6577e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        C6496s.h(iArr, "versionArray");
        this.f72100g = z10;
    }

    private final boolean i(C6577e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(C6577e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        if (a() >= eVar.a() && b() > eVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean h(C6577e eVar) {
        C6496s.h(eVar, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            C6577e eVar2 = f72097i;
            if (eVar2.a() == 1 && eVar2.b() == 8) {
                return true;
            }
        }
        return i(eVar.k(this.f72100g));
    }

    public final boolean j() {
        return this.f72100g;
    }

    public final C6577e k(boolean z10) {
        C6577e eVar;
        if (z10) {
            eVar = f72097i;
        } else {
            eVar = f72098j;
        }
        if (eVar.l(this)) {
            return eVar;
        }
        return this;
    }

    public final C6577e m() {
        if (a() == 1 && b() == 9) {
            return new C6577e(2, 0, 0);
        }
        return new C6577e(a(), b() + 1, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6577e(int... iArr) {
        this(iArr, false);
        C6496s.h(iArr, "numbers");
    }
}
