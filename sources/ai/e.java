package ai;

import Ph.a;
import Ph.b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static /* synthetic */ Throwable f67115a;

    /* renamed from: b  reason: collision with root package name */
    public static /* synthetic */ e f67116b;

    static {
        try {
            f67116b = new e();
        } catch (Throwable th2) {
            f67115a = th2;
        }
    }

    public static e b() {
        e eVar = f67116b;
        if (eVar != null) {
            return eVar;
        }
        throw new b("org.mp4parser.support.RequiresParseDetailAspect", f67115a);
    }

    public void c(a aVar) {
        if (!(aVar.a() instanceof a)) {
            throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
        } else if (!((a) aVar.a()).g()) {
            ((a) aVar.a()).i();
        }
    }
}
