package Xf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum O {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f66317b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f66323a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        O[] a10;
        f66322g = C6714a.a(a10);
        f66317b = new a((DefaultConstructorMarker) null);
    }

    private O(String str) {
        this.f66323a = str;
    }

    public final String b() {
        return this.f66323a;
    }

    public final boolean c() {
        if (this == IGNORE) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this == WARN) {
            return true;
        }
        return false;
    }
}
