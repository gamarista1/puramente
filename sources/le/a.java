package le;

import kotlin.enums.EnumEntries;
import sf.C6714a;

public enum a {
    StartObserving("startObserving"),
    StopObserving("stopObserving");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f61037a;

    static {
        a[] a10;
        f61036e = C6714a.a(a10);
    }

    private a(String str) {
        this.f61037a = str;
    }

    public static EnumEntries b() {
        return f61036e;
    }

    public final String c() {
        return this.f61037a;
    }
}
