package V;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Z {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7173b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f7174c = e("PrimaryNotEditable");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f7175d = e("PrimaryEditable");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f7176e = e("SecondaryEditable");

    /* renamed from: a  reason: collision with root package name */
    private final String f7177a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return Z.f7175d;
        }

        public final String b() {
            return Z.f7174c;
        }

        public final String c() {
            return Z.f7176e;
        }

        private a() {
        }
    }

    private /* synthetic */ Z(String str) {
        this.f7177a = str;
    }

    public static final /* synthetic */ Z d(String str) {
        return new Z(str);
    }

    public static boolean f(String str, Object obj) {
        if ((obj instanceof Z) && C6496s.c(str, ((Z) obj).j())) {
            return true;
        }
        return false;
    }

    public static final boolean g(String str, String str2) {
        return C6496s.c(str, str2);
    }

    public static int h(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return f(this.f7177a, obj);
    }

    public int hashCode() {
        return h(this.f7177a);
    }

    public final /* synthetic */ String j() {
        return this.f7177a;
    }

    public String toString() {
        return i(this.f7177a);
    }

    private static String e(String str) {
        return str;
    }

    public static String i(String str) {
        return str;
    }
}
