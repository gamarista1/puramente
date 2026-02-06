package x6;

import M5.d;
import Sg.p;
import android.net.Uri;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x6.a  reason: case insensitive filesystem */
public final class C4171a implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0752a f49475c = new C0752a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f49476a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49477b;

    /* renamed from: x6.a$a  reason: collision with other inner class name */
    public static final class C0752a {
        public /* synthetic */ C0752a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0752a() {
        }
    }

    public C4171a(int i10, boolean z10) {
        this.f49476a = z10;
        this.f49477b = "anim://" + i10;
    }

    public String a() {
        return this.f49477b;
    }

    public boolean b(Uri uri) {
        C6496s.h(uri, "uri");
        String uri2 = uri.toString();
        C6496s.g(uri2, "toString(...)");
        return p.J(uri2, this.f49477b, false, 2, (Object) null);
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!this.f49476a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C6496s.c(C4171a.class, obj.getClass())) {
            return false;
        }
        return C6496s.c(this.f49477b, ((C4171a) obj).f49477b);
    }

    public int hashCode() {
        if (!this.f49476a) {
            return super.hashCode();
        }
        return this.f49477b.hashCode();
    }
}
