package x5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x5.a  reason: case insensitive filesystem */
public final class C4165a {

    /* renamed from: j  reason: collision with root package name */
    public static final b f49429j = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f49430a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49431b;

    /* renamed from: c  reason: collision with root package name */
    private final C0751a f49432c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49433d;

    /* renamed from: e  reason: collision with root package name */
    private final List f49434e;

    /* renamed from: f  reason: collision with root package name */
    private final List f49435f;

    /* renamed from: g  reason: collision with root package name */
    private final String f49436g;

    /* renamed from: h  reason: collision with root package name */
    private final String f49437h;

    /* renamed from: i  reason: collision with root package name */
    private final String f49438i;

    /* renamed from: x5.a$a  reason: collision with other inner class name */
    public enum C0751a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: x5.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4165a a(JSONObject jSONObject) {
            C6496s.h(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            C6496s.g(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C6496s.g(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            C6496s.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C6496s.g(string3, "mapping.getString(\"event_type\")");
            C6496s.g(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            C6496s.g(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            C0751a valueOf2 = C0751a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                C6496s.g(jSONObject2, "jsonPath");
                arrayList.add(new C4167c(jSONObject2));
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                    C6496s.g(jSONObject3, "jsonParameter");
                    arrayList2.add(new C4166b(jSONObject3));
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            C6496s.g(string, "eventName");
            C6496s.g(string4, "appVersion");
            C6496s.g(optString2, "componentId");
            C6496s.g(optString, "pathType");
            C6496s.g(optString3, "activityName");
            return new C4165a(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        public final List b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        C6496s.g(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        private b() {
        }
    }

    /* renamed from: x5.a$c */
    public enum c {
        MANUAL,
        INFERENCE
    }

    public C4165a(String str, c cVar, C0751a aVar, String str2, List list, List list2, String str3, String str4, String str5) {
        C6496s.h(str, "eventName");
        C6496s.h(cVar, "method");
        C6496s.h(aVar, "type");
        C6496s.h(str2, "appVersion");
        C6496s.h(list, "path");
        C6496s.h(list2, "parameters");
        C6496s.h(str3, "componentId");
        C6496s.h(str4, "pathType");
        C6496s.h(str5, "activityName");
        this.f49430a = str;
        this.f49431b = cVar;
        this.f49432c = aVar;
        this.f49433d = str2;
        this.f49434e = list;
        this.f49435f = list2;
        this.f49436g = str3;
        this.f49437h = str4;
        this.f49438i = str5;
    }

    public final String a() {
        return this.f49438i;
    }

    public final String b() {
        return this.f49430a;
    }

    public final List c() {
        List unmodifiableList = Collections.unmodifiableList(this.f49435f);
        C6496s.g(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List d() {
        List unmodifiableList = Collections.unmodifiableList(this.f49434e);
        C6496s.g(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
