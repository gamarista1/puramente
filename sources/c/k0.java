package C;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f979a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f980b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f981c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f982d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f983e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f984f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f985g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f986h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f987i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f988j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f989k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final int f990l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f991m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k0.f980b;
        }

        public final int b() {
            return k0.f982d;
        }

        public final int c() {
            return k0.f981c;
        }

        public final int d() {
            return k0.f983e;
        }

        public final int e() {
            return k0.f987i;
        }

        public final int f() {
            return k0.f990l;
        }

        public final int g() {
            return k0.f986h;
        }

        private a() {
        }
    }

    static {
        int h10 = h(8);
        f980b = h10;
        int h11 = h(4);
        f981c = h11;
        int h12 = h(2);
        f982d = h12;
        int h13 = h(1);
        f983e = h13;
        f984f = l(h10, h13);
        f985g = l(h11, h12);
        int h14 = h(16);
        f986h = h14;
        int h15 = h(32);
        f987i = h15;
        int l10 = l(h10, h12);
        f988j = l10;
        int l11 = l(h11, h13);
        f989k = l11;
        f990l = l(l10, l11);
        f991m = l(h14, h15);
    }

    public static final boolean i(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean j(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int l(int i10, int i11) {
        return h(i10 | i11);
    }

    public static String m(int i10) {
        return "WindowInsetsSides(" + n(i10) + ')';
    }

    private static final String n(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f984f;
        if ((i10 & i11) == i11) {
            o(sb2, "Start");
        }
        int i12 = f988j;
        if ((i10 & i12) == i12) {
            o(sb2, "Left");
        }
        int i13 = f986h;
        if ((i10 & i13) == i13) {
            o(sb2, "Top");
        }
        int i14 = f985g;
        if ((i10 & i14) == i14) {
            o(sb2, "End");
        }
        int i15 = f989k;
        if ((i10 & i15) == i15) {
            o(sb2, "Right");
        }
        int i16 = f987i;
        if ((i10 & i16) == i16) {
            o(sb2, "Bottom");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final void o(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    private static int h(int i10) {
        return i10;
    }
}
