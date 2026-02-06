package y7;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f49853d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Set f49854a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49855b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49856c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ v(java.util.Collection r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0011
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.C6496s.g(r2, r3)
        L_0x0011:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.v.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String a() {
        return this.f49856c;
    }

    public final String b() {
        return this.f49855b;
    }

    public final Set c() {
        return this.f49854a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(Collection collection, String str) {
        this(collection, str, K.c());
        C6496s.h(str, "nonce");
    }

    public v(Collection collection, String str, String str2) {
        HashSet hashSet;
        C6496s.h(str, "nonce");
        C6496s.h(str2, "codeVerifier");
        if (!J.a(str) || !K.d(str2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (collection == null) {
            hashSet = new HashSet();
        }
        hashSet.add("openid");
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C6496s.g(unmodifiableSet, "unmodifiableSet(permissions)");
        this.f49854a = unmodifiableSet;
        this.f49855b = str;
        this.f49856c = str2;
    }
}
