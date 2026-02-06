package L1;

import I1.f;
import I1.g;
import J1.b;
import Ug.K;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import wf.k;
import yf.C6787a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4132a = new c();

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f4133a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6787a aVar) {
            super(0);
            this.f4133a = aVar;
        }

        /* renamed from: a */
        public final File invoke() {
            File file = (File) this.f4133a.invoke();
            String u10 = k.u(file);
            h hVar = h.f4138a;
            if (C6496s.c(u10, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final f a(b bVar, List list, K k10, C6787a aVar) {
        C6496s.h(list, "migrations");
        C6496s.h(k10, "scope");
        C6496s.h(aVar, "produceFile");
        return new b(g.f2700a.a(h.f4138a, bVar, list, k10, new a(aVar)));
    }
}
