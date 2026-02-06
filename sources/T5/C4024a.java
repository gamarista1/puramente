package t5;

import com.facebook.C3286a;
import com.facebook.I;
import java.io.Serializable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;

/* renamed from: t5.a  reason: case insensitive filesystem */
public final class C4024a implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final C0726a f48209c = new C0726a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private final String f48210a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48211b;

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    public static final class C0726a {
        public /* synthetic */ C0726a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0726a() {
        }
    }

    /* renamed from: t5.a$b */
    public static final class b implements Serializable {

        /* renamed from: c  reason: collision with root package name */
        public static final C0727a f48212c = new C0727a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a  reason: collision with root package name */
        private final String f48213a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48214b;

        /* renamed from: t5.a$b$a  reason: collision with other inner class name */
        public static final class C0727a {
            public /* synthetic */ C0727a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0727a() {
            }
        }

        public b(String str, String str2) {
            C6496s.h(str2, "appId");
            this.f48213a = str;
            this.f48214b = str2;
        }

        private final Object readResolve() {
            return new C4024a(this.f48213a, this.f48214b);
        }
    }

    public C4024a(String str, String str2) {
        C6496s.h(str2, "applicationId");
        this.f48210a = str2;
        this.f48211b = W.e0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new b(this.f48211b, this.f48210a);
    }

    public final String a() {
        return this.f48211b;
    }

    public final String b() {
        return this.f48210a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4024a)) {
            return false;
        }
        C4024a aVar = (C4024a) obj;
        if (!W.e(aVar.f48211b, this.f48211b) || !W.e(aVar.f48210a, this.f48210a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        String str = this.f48211b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i10 ^ this.f48210a.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4024a(C3286a aVar) {
        this(aVar.n(), I.m());
        C6496s.h(aVar, "accessToken");
    }
}
