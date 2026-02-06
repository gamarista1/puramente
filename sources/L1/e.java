package L1;

import L1.d;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class e {
    public static final d a() {
        return new a((Map) null, true, 1, (DefaultConstructorMarker) null);
    }

    public static final a b(d.b... bVarArr) {
        C6496s.h(bVarArr, "pairs");
        a aVar = new a((Map) null, false, 1, (DefaultConstructorMarker) null);
        aVar.g((d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return aVar;
    }
}
