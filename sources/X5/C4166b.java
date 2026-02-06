package x5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: x5.b  reason: case insensitive filesystem */
public final class C4166b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f49446e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f49447a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49448b;

    /* renamed from: c  reason: collision with root package name */
    private final List f49449c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49450d;

    /* renamed from: x5.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4166b(JSONObject jSONObject) {
        C6496s.h(jSONObject, "component");
        String string = jSONObject.getString("name");
        C6496s.g(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f49447a = string;
        String optString = jSONObject.optString("value");
        C6496s.g(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f49448b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        C6496s.g(optString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f49450d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                C6496s.g(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new C4167c(jSONObject2));
            }
        }
        this.f49449c = arrayList;
    }

    public final String a() {
        return this.f49447a;
    }

    public final List b() {
        return this.f49449c;
    }

    public final String c() {
        return this.f49450d;
    }

    public final String d() {
        return this.f49448b;
    }
}
