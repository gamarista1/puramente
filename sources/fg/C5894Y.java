package fg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: fg.Y  reason: case insensitive filesystem */
public final class C5894Y {

    /* renamed from: a  reason: collision with root package name */
    private final C5915j0 f67614a;

    /* renamed from: b  reason: collision with root package name */
    private final List f67615b;

    /* renamed from: c  reason: collision with root package name */
    private final String f67616c;

    /* renamed from: d  reason: collision with root package name */
    private final C5894Y f67617d;

    public C5894Y(C5915j0 j0Var, List list, String str) {
        C5915j0 j0Var2;
        C5915j0 j0Var3;
        C6496s.h(list, "parametersInfo");
        this.f67614a = j0Var;
        this.f67615b = list;
        this.f67616c = str;
        C5894Y y10 = null;
        if (str != null) {
            if (j0Var != null) {
                j0Var2 = j0Var.a();
            } else {
                j0Var2 = null;
            }
            Iterable<C5915j0> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (C5915j0 j0Var4 : iterable) {
                if (j0Var4 != null) {
                    j0Var3 = j0Var4.a();
                } else {
                    j0Var3 = null;
                }
                arrayList.add(j0Var3);
            }
            y10 = new C5894Y(j0Var2, arrayList, (String) null);
        }
        this.f67617d = y10;
    }

    public final String a() {
        return this.f67616c;
    }

    public final List b() {
        return this.f67615b;
    }

    public final C5915j0 c() {
        return this.f67614a;
    }

    public final C5894Y d() {
        return this.f67617d;
    }
}
