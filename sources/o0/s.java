package O0;

import kotlin.jvm.internal.C6498u;
import lf.C6525i;
import yf.p;

public final class s extends C6498u implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final s f4654a = new s();

    public s() {
        super(2);
    }

    /* renamed from: a */
    public final a invoke(a aVar, a aVar2) {
        String str;
        C6525i iVar;
        if (aVar == null || (str = aVar.b()) == null) {
            str = aVar2.b();
        }
        if (aVar == null || (iVar = aVar.a()) == null) {
            iVar = aVar2.a();
        }
        return new a(str, iVar);
    }
}
