package q8;

import X7.a;
import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q8.a  reason: case insensitive filesystem */
public class C3959a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0719a f47776f = new C0719a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f47777a;

    /* renamed from: b  reason: collision with root package name */
    private final a f47778b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f47779c;

    /* renamed from: d  reason: collision with root package name */
    private final double f47780d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47781e;

    /* renamed from: q8.a$a  reason: collision with other inner class name */
    public static final class C0719a {
        public /* synthetic */ C0719a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3959a a(Context context) {
            C6496s.h(context, "context");
            return new C3959a(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", 0.0d, 0.0d, a.DEFAULT, 12, (DefaultConstructorMarker) null);
        }

        private C0719a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3959a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, (a) null, 28, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    private final Uri a(Context context) {
        this.f47781e = true;
        return c.f47785b.a().g(context, this.f47777a);
    }

    private final Uri b(Context context) {
        try {
            Uri parse = Uri.parse(this.f47777a);
            if (parse.getScheme() == null) {
                return a(context);
            }
            return parse;
        } catch (NullPointerException unused) {
            return a(context);
        }
    }

    public final a c() {
        return this.f47778b;
    }

    public final double d() {
        return this.f47780d;
    }

    public final String e() {
        return this.f47777a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C6496s.c(getClass(), obj.getClass())) {
            return false;
        }
        C3959a aVar = (C3959a) obj;
        if (Double.compare(aVar.f47780d, this.f47780d) == 0 && g() == aVar.g() && C6496s.c(f(), aVar.f()) && C6496s.c(this.f47777a, aVar.f47777a) && this.f47778b == aVar.f47778b) {
            return true;
        }
        return false;
    }

    public Uri f() {
        return this.f47779c;
    }

    public boolean g() {
        return this.f47781e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{f(), this.f47777a, Double.valueOf(this.f47780d), Boolean.valueOf(g()), this.f47778b});
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3959a(Context context, String str, double d10, double d11) {
        this(context, str, d10, d11, (a) null, 16, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    public C3959a(Context context, String str, double d10, double d11, a aVar) {
        C6496s.h(context, "context");
        C6496s.h(aVar, "cacheControl");
        this.f47777a = str;
        this.f47778b = aVar;
        this.f47779c = b(context);
        this.f47780d = d10 * d11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3959a(Context context, String str, double d10, double d11, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11, (i10 & 16) != 0 ? a.DEFAULT : aVar);
    }
}
