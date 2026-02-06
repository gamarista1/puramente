package Db;

import com.google.firebase.auth.C4816w;

public final class B0 extends C4816w {

    /* renamed from: a  reason: collision with root package name */
    private String f50435a;

    /* renamed from: b  reason: collision with root package name */
    private String f50436b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50437c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50438d = false;

    public final void a(boolean z10) {
        this.f50438d = z10;
    }

    public final void b(boolean z10) {
        this.f50437c = z10;
    }

    public final void c(String str, String str2) {
        this.f50435a = str;
        this.f50436b = str2;
    }

    public final String d() {
        return this.f50435a;
    }

    public final String e() {
        return this.f50436b;
    }

    public final boolean f() {
        return this.f50438d;
    }

    public final boolean g() {
        if (this.f50435a == null || this.f50436b == null) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        return this.f50437c;
    }
}
