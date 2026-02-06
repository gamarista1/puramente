package Sd;

import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final List f52460a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52461b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52462c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52463d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f52464e;

    public k(List list, int i10, String str, String str2, boolean z10) {
        C6496s.h(list, "headers");
        C6496s.h(str, "statusText");
        C6496s.h(str2, "url");
        this.f52460a = list;
        this.f52461b = i10;
        this.f52462c = str;
        this.f52463d = str2;
        this.f52464e = z10;
    }

    public final List a() {
        return this.f52460a;
    }

    public final boolean b() {
        return this.f52464e;
    }

    public final int c() {
        return this.f52461b;
    }

    public final String d() {
        return this.f52462c;
    }

    public final String e() {
        return this.f52463d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (C6496s.c(this.f52460a, kVar.f52460a) && this.f52461b == kVar.f52461b && C6496s.c(this.f52462c, kVar.f52462c) && C6496s.c(this.f52463d, kVar.f52463d) && this.f52464e == kVar.f52464e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f52460a.hashCode() * 31) + Integer.hashCode(this.f52461b)) * 31) + this.f52462c.hashCode()) * 31) + this.f52463d.hashCode()) * 31) + Boolean.hashCode(this.f52464e);
    }

    public String toString() {
        List list = this.f52460a;
        int i10 = this.f52461b;
        String str = this.f52462c;
        String str2 = this.f52463d;
        boolean z10 = this.f52464e;
        return "NativeResponseInit(headers=" + list + ", status=" + i10 + ", statusText=" + str + ", url=" + str2 + ", redirected=" + z10 + ")";
    }
}
