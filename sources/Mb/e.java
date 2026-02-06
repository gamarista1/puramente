package Mb;

import Ob.l;
import Qb.h;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final e f52043d = new e(a.User, (h) null, false);

    /* renamed from: e  reason: collision with root package name */
    public static final e f52044e = new e(a.Server, (h) null, false);

    /* renamed from: a  reason: collision with root package name */
    private final a f52045a;

    /* renamed from: b  reason: collision with root package name */
    private final h f52046b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52047c;

    private enum a {
        User,
        Server
    }

    public e(a aVar, h hVar, boolean z10) {
        boolean z11;
        this.f52045a = aVar;
        this.f52046b = hVar;
        this.f52047c = z10;
        if (!z10 || c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        l.f(z11);
    }

    public static e a(h hVar) {
        return new e(a.Server, hVar, true);
    }

    public h b() {
        return this.f52046b;
    }

    public boolean c() {
        if (this.f52045a == a.Server) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.f52045a == a.User) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f52047c;
    }

    public String toString() {
        return "OperationSource{source=" + this.f52045a + ", queryParams=" + this.f52046b + ", tagged=" + this.f52047c + '}';
    }
}
