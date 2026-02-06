package x5;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: x5.c  reason: case insensitive filesystem */
public final class C4167c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f49451i = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f49452a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49453b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49454c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49455d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49456e;

    /* renamed from: f  reason: collision with root package name */
    private final String f49457f;

    /* renamed from: g  reason: collision with root package name */
    private final String f49458g;

    /* renamed from: h  reason: collision with root package name */
    private final int f49459h;

    /* renamed from: x5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: x5.c$b */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f49466a;

        private b(int i10) {
            this.f49466a = i10;
        }

        public final int b() {
            return this.f49466a;
        }
    }

    public C4167c(JSONObject jSONObject) {
        C6496s.h(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        C6496s.g(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f49452a = string;
        this.f49453b = jSONObject.optInt("index", -1);
        this.f49454c = jSONObject.optInt("id");
        String optString = jSONObject.optString(AttributeType.TEXT);
        C6496s.g(optString, "component.optString(PATH_TEXT_KEY)");
        this.f49455d = optString;
        String optString2 = jSONObject.optString("tag");
        C6496s.g(optString2, "component.optString(PATH_TAG_KEY)");
        this.f49456e = optString2;
        String optString3 = jSONObject.optString(com.amazon.a.a.o.b.f37480c);
        C6496s.g(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f49457f = optString3;
        String optString4 = jSONObject.optString("hint");
        C6496s.g(optString4, "component.optString(PATH_HINT_KEY)");
        this.f49458g = optString4;
        this.f49459h = jSONObject.optInt("match_bitmask");
    }

    public final String a() {
        return this.f49452a;
    }

    public final String b() {
        return this.f49457f;
    }

    public final String c() {
        return this.f49458g;
    }

    public final int d() {
        return this.f49454c;
    }

    public final int e() {
        return this.f49453b;
    }

    public final int f() {
        return this.f49459h;
    }

    public final String g() {
        return this.f49456e;
    }

    public final String h() {
        return this.f49455d;
    }
}
