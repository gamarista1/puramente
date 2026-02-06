package Cg;

import Bg.C5334u;
import Dg.C5357s;
import Eg.n;
import Of.H;
import ig.m;
import java.io.InputStream;
import jg.C6429a;
import jg.C6431c;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vg.C6755e;

public final class c extends C5334u implements Lf.c {

    /* renamed from: o  reason: collision with root package name */
    public static final a f62635o = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private final boolean f62636n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(ng.c cVar, n nVar, H h10, InputStream inputStream, boolean z10) {
            C6496s.h(cVar, "fqName");
            C6496s.h(nVar, "storageManager");
            C6496s.h(h10, "module");
            C6496s.h(inputStream, "inputStream");
            Pair a10 = C6431c.a(inputStream);
            m mVar = (m) a10.a();
            C6429a aVar = (C6429a) a10.b();
            if (mVar != null) {
                return new c(cVar, nVar, h10, mVar, aVar, z10, (DefaultConstructorMarker) null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C6429a.f71505h + ", actual " + aVar + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ c(ng.c cVar, n nVar, H h10, m mVar, C6429a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, h10, mVar, aVar, z10);
    }

    public String toString() {
        return "builtins package fragment for " + f() + " from " + C6755e.s(this);
    }

    private c(ng.c cVar, n nVar, H h10, m mVar, C6429a aVar, boolean z10) {
        super(cVar, nVar, h10, mVar, aVar, (C5357s) null);
        this.f62636n = z10;
    }
}
