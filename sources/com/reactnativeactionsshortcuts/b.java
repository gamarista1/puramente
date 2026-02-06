package com.reactnativeactionsshortcuts;

import android.os.PersistableBundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f59234f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f59235a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59236b;

    /* renamed from: c  reason: collision with root package name */
    private final String f59237c;

    /* renamed from: d  reason: collision with root package name */
    private final String f59238d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f59239e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(PersistableBundle persistableBundle) {
            String string;
            String str;
            C6496s.h(persistableBundle, "bundle");
            String string2 = persistableBundle.getString("type");
            if (string2 == null || (string = persistableBundle.getString(com.amazon.a.a.o.b.f37461S)) == null) {
                return null;
            }
            String string3 = persistableBundle.getString("shortTitle");
            String string4 = persistableBundle.getString("iconName");
            JSONObject jSONObject = new JSONObject(persistableBundle.getString("data"));
            if (string3 == null) {
                str = string;
            } else {
                str = string3;
            }
            return new b(string2, string, str, string4, jSONObject);
        }

        public final b b(ReadableMap readableMap) {
            String string;
            String str;
            String str2;
            ReadableMap readableMap2;
            JSONObject jSONObject;
            String str3;
            C6496s.h(readableMap, "map");
            String string2 = readableMap.getString("type");
            if (string2 == null || (string = readableMap.getString(com.amazon.a.a.o.b.f37461S)) == null) {
                return null;
            }
            if (readableMap.hasKey("shortTitle")) {
                str = readableMap.getString("shortTitle");
            } else {
                str = null;
            }
            if (readableMap.hasKey("iconName")) {
                str2 = readableMap.getString("iconName");
            } else {
                str2 = null;
            }
            if (readableMap.hasKey("data")) {
                readableMap2 = readableMap.getMap("data");
            } else {
                readableMap2 = null;
            }
            if (readableMap2 != null) {
                jSONObject = a.f59232a.b(readableMap2);
            } else {
                jSONObject = null;
            }
            if (str == null) {
                str3 = string;
            } else {
                str3 = str;
            }
            return new b(string2, string, str3, str2, jSONObject);
        }

        public final WritableArray c(List list) {
            C6496s.h(list, "items");
            WritableArray createArray = Arguments.createArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                createArray.pushMap(((b) it.next()).f());
            }
            C6496s.e(createArray);
            return createArray;
        }

        private a() {
        }
    }

    public b(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        C6496s.h(str, "type");
        C6496s.h(str2, com.amazon.a.a.o.b.f37461S);
        C6496s.h(str3, "shortTitle");
        this.f59235a = str;
        this.f59236b = str2;
        this.f59237c = str3;
        this.f59238d = str4;
        this.f59239e = jSONObject;
    }

    public final String a() {
        return this.f59235a;
    }

    public final String b() {
        return this.f59236b;
    }

    public final String c() {
        return this.f59237c;
    }

    public final String d() {
        return this.f59238d;
    }

    public final PersistableBundle e() {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("type", this.f59235a);
        persistableBundle.putString(com.amazon.a.a.o.b.f37461S, this.f59236b);
        persistableBundle.putString("shortTitle", this.f59237c);
        String str = this.f59238d;
        if (str != null) {
            persistableBundle.putString("iconName", str);
        }
        JSONObject jSONObject = this.f59239e;
        if (jSONObject != null) {
            persistableBundle.putString("data", jSONObject.toString());
        }
        return persistableBundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C6496s.c(this.f59235a, bVar.f59235a) && C6496s.c(this.f59236b, bVar.f59236b) && C6496s.c(this.f59237c, bVar.f59237c) && C6496s.c(this.f59238d, bVar.f59238d) && C6496s.c(this.f59239e, bVar.f59239e);
    }

    public final WritableMap f() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", this.f59235a);
        createMap.putString(com.amazon.a.a.o.b.f37461S, this.f59236b);
        createMap.putString("shortTitle", this.f59237c);
        String str = this.f59238d;
        if (str != null) {
            createMap.putString("iconName", str);
        }
        JSONObject jSONObject = this.f59239e;
        if (jSONObject != null) {
            createMap.putMap("data", a.f59232a.d(jSONObject));
        }
        C6496s.e(createMap);
        return createMap;
    }

    public int hashCode() {
        int hashCode = ((((this.f59235a.hashCode() * 31) + this.f59236b.hashCode()) * 31) + this.f59237c.hashCode()) * 31;
        String str = this.f59238d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        JSONObject jSONObject = this.f59239e;
        if (jSONObject != null) {
            i10 = jSONObject.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f59235a;
        String str2 = this.f59236b;
        String str3 = this.f59237c;
        String str4 = this.f59238d;
        JSONObject jSONObject = this.f59239e;
        return "ShortcutItem(type=" + str + ", title=" + str2 + ", shortTitle=" + str3 + ", iconName=" + str4 + ", data=" + jSONObject + ")";
    }
}
