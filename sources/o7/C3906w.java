package o7;

import Sg.p;
import android.net.Uri;
import com.amazon.a.a.o.b.f;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o7.w  reason: case insensitive filesystem */
public final class C3906w {

    /* renamed from: G  reason: collision with root package name */
    public static final a f47355G = new a((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private final JSONArray f47356A;

    /* renamed from: B  reason: collision with root package name */
    private final List f47357B;

    /* renamed from: C  reason: collision with root package name */
    private final List f47358C;

    /* renamed from: D  reason: collision with root package name */
    private final List f47359D;

    /* renamed from: E  reason: collision with root package name */
    private final List f47360E;

    /* renamed from: F  reason: collision with root package name */
    private final Long f47361F;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f47362a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47363b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47364c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47365d;

    /* renamed from: e  reason: collision with root package name */
    private final EnumSet f47366e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f47367f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f47368g;

    /* renamed from: h  reason: collision with root package name */
    private final C3899o f47369h;

    /* renamed from: i  reason: collision with root package name */
    private final String f47370i;

    /* renamed from: j  reason: collision with root package name */
    private final String f47371j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f47372k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f47373l;

    /* renamed from: m  reason: collision with root package name */
    private final JSONArray f47374m;

    /* renamed from: n  reason: collision with root package name */
    private final String f47375n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f47376o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f47377p;

    /* renamed from: q  reason: collision with root package name */
    private final String f47378q;

    /* renamed from: r  reason: collision with root package name */
    private final String f47379r;

    /* renamed from: s  reason: collision with root package name */
    private final String f47380s;

    /* renamed from: t  reason: collision with root package name */
    private final JSONArray f47381t;

    /* renamed from: u  reason: collision with root package name */
    private final JSONArray f47382u;

    /* renamed from: v  reason: collision with root package name */
    private final Map f47383v;

    /* renamed from: w  reason: collision with root package name */
    private final JSONArray f47384w;

    /* renamed from: x  reason: collision with root package name */
    private final JSONArray f47385x;

    /* renamed from: y  reason: collision with root package name */
    private final JSONArray f47386y;

    /* renamed from: z  reason: collision with root package name */
    private final JSONArray f47387z;

    /* renamed from: o7.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String str, String str2, String str3) {
            Map map;
            Map g10;
            C6496s.h(str, "applicationId");
            C6496s.h(str2, "actionName");
            C6496s.h(str3, "featureName");
            if (str2.length() == 0 || str3.length() == 0) {
                return null;
            }
            C3906w f10 = C3884A.f(str);
            if (f10 == null || (g10 = f10.g()) == null) {
                map = null;
            } else {
                map = (Map) g10.get(str2);
            }
            if (map != null) {
                return (b) map.get(str3);
            }
            return null;
        }

        private a() {
        }
    }

    /* renamed from: o7.w$b */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f47388e = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f47389a;

        /* renamed from: b  reason: collision with root package name */
        private final String f47390b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f47391c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f47392d;

        /* renamed from: o7.w$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = -1;
                    int optInt = jSONArray.optInt(i10, -1);
                    if (optInt == -1) {
                        String optString = jSONArray.optString(i10);
                        if (!W.e0(optString)) {
                            try {
                                C6496s.g(optString, "versionString");
                                i11 = Integer.parseInt(optString);
                            } catch (NumberFormatException e10) {
                                W.k0("FacebookSDK", e10);
                            }
                            optInt = i11;
                        }
                    }
                    iArr[i10] = optInt;
                }
                return iArr;
            }

            public final b a(JSONObject jSONObject) {
                C6496s.h(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString("name");
                Uri uri = null;
                if (W.e0(optString)) {
                    return null;
                }
                C6496s.g(optString, "dialogNameWithFeature");
                List F02 = p.F0(optString, new String[]{f.f37531c}, false, 0, 6, (Object) null);
                if (F02.size() != 2) {
                    return null;
                }
                String str = (String) C6565s.o0(F02);
                String str2 = (String) C6565s.z0(F02);
                if (W.e0(str) || W.e0(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                if (!W.e0(optString2)) {
                    uri = Uri.parse(optString2);
                }
                return new b(str, str2, uri, b(jSONObject.optJSONArray("versions")), (DefaultConstructorMarker) null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.f47389a;
        }

        public final String b() {
            return this.f47390b;
        }

        public final int[] c() {
            return this.f47392d;
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f47389a = str;
            this.f47390b = str2;
            this.f47391c = uri;
            this.f47392d = iArr;
        }
    }

    public C3906w(boolean z10, String str, boolean z11, int i10, EnumSet enumSet, Map map, boolean z12, C3899o oVar, String str2, String str3, boolean z13, boolean z14, JSONArray jSONArray, String str4, boolean z15, boolean z16, String str5, String str6, String str7, JSONArray jSONArray2, JSONArray jSONArray3, Map map2, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, List list, List list2, List list3, List list4, Long l10) {
        C3899o oVar2 = oVar;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        C6496s.h(str, "nuxContent");
        C6496s.h(enumSet, "smartLoginOptions");
        C6496s.h(map, "dialogConfigurations");
        C6496s.h(oVar2, "errorClassification");
        C6496s.h(str8, "smartLoginBookmarkIconURL");
        C6496s.h(str9, "smartLoginMenuIconURL");
        C6496s.h(str10, "sdkUpdateMessage");
        this.f47362a = z10;
        this.f47363b = str;
        this.f47364c = z11;
        this.f47365d = i10;
        this.f47366e = enumSet;
        this.f47367f = map;
        this.f47368g = z12;
        this.f47369h = oVar2;
        this.f47370i = str8;
        this.f47371j = str9;
        this.f47372k = z13;
        this.f47373l = z14;
        this.f47374m = jSONArray;
        this.f47375n = str10;
        this.f47376o = z15;
        this.f47377p = z16;
        this.f47378q = str5;
        this.f47379r = str6;
        this.f47380s = str7;
        this.f47381t = jSONArray2;
        this.f47382u = jSONArray3;
        this.f47383v = map2;
        this.f47384w = jSONArray4;
        this.f47385x = jSONArray5;
        this.f47386y = jSONArray6;
        this.f47387z = jSONArray7;
        this.f47356A = jSONArray8;
        this.f47357B = list;
        this.f47358C = list2;
        this.f47359D = list3;
        this.f47360E = list4;
        this.f47361F = l10;
    }

    public final boolean A() {
        return this.f47362a;
    }

    public final boolean a() {
        return this.f47368g;
    }

    public final JSONArray b() {
        return this.f47356A;
    }

    public final JSONArray c() {
        return this.f47384w;
    }

    public final boolean d() {
        return this.f47373l;
    }

    public final List e() {
        return this.f47357B;
    }

    public final Long f() {
        return this.f47361F;
    }

    public final Map g() {
        return this.f47367f;
    }

    public final C3899o h() {
        return this.f47369h;
    }

    public final JSONArray i() {
        return this.f47374m;
    }

    public final boolean j() {
        return this.f47372k;
    }

    public final JSONArray k() {
        return this.f47382u;
    }

    public final String l() {
        return this.f47363b;
    }

    public final boolean m() {
        return this.f47364c;
    }

    public final List n() {
        return this.f47359D;
    }

    public final JSONArray o() {
        return this.f47381t;
    }

    public final List p() {
        return this.f47358C;
    }

    public final String q() {
        return this.f47378q;
    }

    public final JSONArray r() {
        return this.f47385x;
    }

    public final String s() {
        return this.f47380s;
    }

    public final JSONArray t() {
        return this.f47387z;
    }

    public final String u() {
        return this.f47375n;
    }

    public final JSONArray v() {
        return this.f47386y;
    }

    public final int w() {
        return this.f47365d;
    }

    public final EnumSet x() {
        return this.f47366e;
    }

    public final String y() {
        return this.f47379r;
    }

    public final List z() {
        return this.f47360E;
    }
}
