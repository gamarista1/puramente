package o7;

import Sg.p;
import com.facebook.C3462y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o7.o  reason: case insensitive filesystem */
public final class C3899o {

    /* renamed from: g  reason: collision with root package name */
    public static final a f47275g = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static C3899o f47276h;

    /* renamed from: a  reason: collision with root package name */
    private final Map f47277a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f47278b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f47279c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47280d;

    /* renamed from: e  reason: collision with root package name */
    private final String f47281e;

    /* renamed from: f  reason: collision with root package name */
    private final String f47282f;

    /* renamed from: o7.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C3899o c() {
            return new C3899o((Map) null, O.k(C6502A.a(2, (Object) null), C6502A.a(4, (Object) null), C6502A.a(9, (Object) null), C6502A.a(17, (Object) null), C6502A.a(341, (Object) null)), O.k(C6502A.a(102, (Object) null), C6502A.a(190, (Object) null), C6502A.a(412, (Object) null)), (String) null, (String) null, (String) null);
        }

        private final Map d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            int optInt2 = optJSONArray2.optInt(i11);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        public final C3899o a(JSONArray jSONArray) {
            String optString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map map = null;
            Map map2 = null;
            Map map3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                    if (p.v(optString, "other", true)) {
                        str = optJSONObject.optString("recovery_message", (String) null);
                        map = d(optJSONObject);
                    } else if (p.v(optString, "transient", true)) {
                        str2 = optJSONObject.optString("recovery_message", (String) null);
                        map2 = d(optJSONObject);
                    } else if (p.v(optString, "login_recoverable", true)) {
                        str3 = optJSONObject.optString("recovery_message", (String) null);
                        map3 = d(optJSONObject);
                    }
                }
            }
            return new C3899o(map, map2, map3, str, str2, str3);
        }

        public final synchronized C3899o b() {
            C3899o a10;
            try {
                if (C3899o.f47276h == null) {
                    C3899o.f47276h = c();
                }
                a10 = C3899o.f47276h;
                C6496s.f(a10, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return a10;
        }

        private a() {
        }
    }

    /* renamed from: o7.o$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47283a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.y$a[] r0 = com.facebook.C3462y.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.y$a r1 = com.facebook.C3462y.a.OTHER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.y$a r1 = com.facebook.C3462y.a.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.y$a r1 = com.facebook.C3462y.a.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f47283a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.C3899o.b.<clinit>():void");
        }
    }

    public C3899o(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f47277a = map;
        this.f47278b = map2;
        this.f47279c = map3;
        this.f47280d = str;
        this.f47281e = str2;
        this.f47282f = str3;
    }

    public final C3462y.a c(int i10, int i11, boolean z10) {
        Set set;
        Set set2;
        Set set3;
        if (z10) {
            return C3462y.a.TRANSIENT;
        }
        Map map = this.f47277a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = (Set) this.f47277a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return C3462y.a.OTHER;
        }
        Map map2 = this.f47279c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = (Set) this.f47279c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return C3462y.a.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f47278b;
        if (map3 == null || !map3.containsKey(Integer.valueOf(i10)) || ((set = (Set) this.f47278b.get(Integer.valueOf(i10))) != null && !set.contains(Integer.valueOf(i11)))) {
            return C3462y.a.OTHER;
        }
        return C3462y.a.TRANSIENT;
    }

    public final String d(C3462y.a aVar) {
        int i10;
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.f47283a[aVar.ordinal()];
        }
        if (i10 == 1) {
            return this.f47280d;
        }
        if (i10 == 2) {
            return this.f47282f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f47281e;
    }
}
