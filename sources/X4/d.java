package X4;

import X4.a;
import java.io.File;

public abstract class d implements a.C0566a {

    /* renamed from: a  reason: collision with root package name */
    private final long f34999a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35000b;

    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f34999a = j10;
        this.f35000b = aVar;
    }

    public a f() {
        File a10 = this.f35000b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return e.c(a10, this.f34999a);
        }
        return null;
    }
}
