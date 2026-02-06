package u7;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import q7.k;

/* renamed from: u7.a  reason: case insensitive filesystem */
public final class C4094a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0734a f48616d = new C0734a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f48617a;

    /* renamed from: b  reason: collision with root package name */
    private String f48618b;

    /* renamed from: c  reason: collision with root package name */
    private Long f48619c;

    /* renamed from: u7.a$a  reason: collision with other inner class name */
    public static final class C0734a {
        public /* synthetic */ C0734a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0734a() {
        }
    }

    public C4094a(String str) {
        this.f48619c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f48618b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f48619c;
        C6496s.f(l10, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6496s.g(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f48617a = stringBuffer2;
    }

    public final void a() {
        k.d(this.f48617a);
    }

    public final int b(C4094a aVar) {
        C6496s.h(aVar, "data");
        Long l10 = this.f48619c;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = aVar.f48619c;
        if (l11 != null) {
            return C6496s.j(l11.longValue(), longValue);
        }
        return 1;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f48619c;
            if (l10 != null) {
                jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, l10);
            }
            jSONObject.put("error_message", this.f48618b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.f48618b == null || this.f48619c == null) {
            return false;
        }
        return true;
    }

    public final void e() {
        if (d()) {
            k.t(this.f48617a, toString());
        }
    }

    public String toString() {
        JSONObject c10 = c();
        if (c10 == null) {
            return super.toString();
        }
        String jSONObject = c10.toString();
        C6496s.g(jSONObject, "params.toString()");
        return jSONObject;
    }

    public C4094a(File file) {
        C6496s.h(file, "file");
        String name = file.getName();
        C6496s.g(name, "file.name");
        this.f48617a = name;
        JSONObject r10 = k.r(name, true);
        if (r10 != null) {
            this.f48619c = Long.valueOf(r10.optLong(DiagnosticsEntry.TIMESTAMP_KEY, 0));
            this.f48618b = r10.optString("error_message", (String) null);
        }
    }
}
