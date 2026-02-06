package u4;

import java.util.HashMap;
import java.util.Map;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f48476a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final C4070j f48477b;

    /* renamed from: c  reason: collision with root package name */
    private final L f48478c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48479d = true;

    public c0(C4070j jVar) {
        this.f48477b = jVar;
        this.f48478c = null;
    }

    private void d() {
        C4070j jVar = this.f48477b;
        if (jVar != null) {
            jVar.invalidate();
        }
        L l10 = this.f48478c;
        if (l10 != null) {
            l10.invalidateSelf();
        }
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f48479d && this.f48476a.containsKey(str2)) {
            return (String) this.f48476a.get(str2);
        }
        String b10 = b(str, str2);
        if (this.f48479d) {
            this.f48476a.put(str2, b10);
        }
        return b10;
    }

    public void e(String str, String str2) {
        this.f48476a.put(str, str2);
        d();
    }

    public String a(String str) {
        return str;
    }
}
