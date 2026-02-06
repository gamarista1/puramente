package S6;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0551a f33934a = new C0551a((DefaultConstructorMarker) null);

    /* renamed from: S6.a$a  reason: collision with other inner class name */
    public static final class C0551a {
        public /* synthetic */ C0551a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0551a() {
        }
    }

    public final void a(int[] iArr) {
        C6496s.h(iArr, "frameDurationMs");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] < 11) {
                iArr[i10] = 100;
            }
        }
    }

    public final int[] b(int[] iArr) {
        C6496s.h(iArr, "frameDurationsMs");
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = i10;
            i10 += iArr[i11];
        }
        return iArr2;
    }

    public final int c(int[] iArr) {
        C6496s.h(iArr, "frameDurationMs");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }
}
