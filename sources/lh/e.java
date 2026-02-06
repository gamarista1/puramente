package lh;

import kotlin.jvm.internal.C6496s;
import nh.C6624e;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f71961a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f71962b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f71963c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f71964d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f71965e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71966f;

    /* renamed from: g  reason: collision with root package name */
    private String f71967g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f71968h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f71969i;

    /* renamed from: j  reason: collision with root package name */
    private String f71970j;

    /* renamed from: k  reason: collision with root package name */
    private C6537a f71971k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f71972l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f71973m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f71974n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f71975o;

    /* renamed from: p  reason: collision with root package name */
    private C6624e f71976p;

    public e(C6538b bVar) {
        C6496s.h(bVar, "json");
        this.f71961a = bVar.f().h();
        this.f71962b = bVar.f().i();
        this.f71963c = bVar.f().j();
        this.f71964d = bVar.f().p();
        this.f71965e = bVar.f().b();
        this.f71966f = bVar.f().l();
        this.f71967g = bVar.f().m();
        this.f71968h = bVar.f().f();
        this.f71969i = bVar.f().o();
        this.f71970j = bVar.f().d();
        this.f71971k = bVar.f().e();
        this.f71972l = bVar.f().a();
        this.f71973m = bVar.f().n();
        bVar.f().k();
        this.f71974n = bVar.f().g();
        this.f71975o = bVar.f().c();
        this.f71976p = bVar.a();
    }

    public final g a() {
        if (this.f71969i) {
            if (!C6496s.c(this.f71970j, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            } else if (this.f71971k != C6537a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (!this.f71966f) {
            if (!C6496s.c(this.f71967g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!C6496s.c(this.f71967g, "    ")) {
            String str = this.f71967g;
            int i10 = 0;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f71967g).toString());
                }
            }
        }
        return new g(this.f71961a, this.f71963c, this.f71964d, this.f71965e, this.f71966f, this.f71962b, this.f71967g, this.f71968h, this.f71969i, this.f71970j, this.f71972l, this.f71973m, (s) null, this.f71974n, this.f71975o, this.f71971k);
    }

    public final C6624e b() {
        return this.f71976p;
    }

    public final void c(String str) {
        C6496s.h(str, "<set-?>");
        this.f71970j = str;
    }

    public final void d(boolean z10) {
        this.f71961a = z10;
    }

    public final void e(boolean z10) {
        this.f71962b = z10;
    }

    public final void f(boolean z10) {
        this.f71963c = z10;
    }

    public final void g(boolean z10) {
        this.f71964d = z10;
    }

    public final void h(C6624e eVar) {
        C6496s.h(eVar, "<set-?>");
        this.f71976p = eVar;
    }
}
