package y7;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum G {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f49607b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f49611a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G a(String str) {
            for (G g10 : G.values()) {
                if (C6496s.c(g10.toString(), str)) {
                    return g10;
                }
            }
            return G.FACEBOOK;
        }

        private a() {
        }
    }

    static {
        f49607b = new a((DefaultConstructorMarker) null);
    }

    private G(String str) {
        this.f49611a = str;
    }

    public String toString() {
        return this.f49611a;
    }
}
