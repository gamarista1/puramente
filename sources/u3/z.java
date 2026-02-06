package u3;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C6496s;
import y3.h;

public final class z implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f26782a;

    /* renamed from: b  reason: collision with root package name */
    private final File f26783b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable f26784c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f26785d;

    public z(String str, File file, Callable callable, h.c cVar) {
        C6496s.h(cVar, "mDelegate");
        this.f26782a = str;
        this.f26783b = file;
        this.f26784c = callable;
        this.f26785d = cVar;
    }

    public h a(h.b bVar) {
        C6496s.h(bVar, "configuration");
        return new y(bVar.f28732a, this.f26782a, this.f26783b, this.f26784c, bVar.f28734c.f28730a, this.f26785d.a(bVar));
    }
}
