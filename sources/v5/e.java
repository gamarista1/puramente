package v5;

import com.facebook.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6523g;
import mf.C6565s;
import mf.O;
import o7.J;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C4104a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f48727a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f48728b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map f48729c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f48730d = O.l(C6502A.a("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), C6502A.a("fb_mobile_activate_app", j.ACTIVATED_APP), C6502A.a("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), C6502A.a("fb_mobile_add_to_cart", j.ADDED_TO_CART), C6502A.a("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), C6502A.a("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), C6502A.a("fb_mobile_content_view", j.VIEWED_CONTENT), C6502A.a("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), C6502A.a("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), C6502A.a("fb_mobile_purchase", j.PURCHASED), C6502A.a("fb_mobile_rate", j.RATED), C6502A.a("fb_mobile_search", j.SEARCHED), C6502A.a("fb_mobile_spent_credits", j.SPENT_CREDITS), C6502A.a("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));

    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");
        

        /* renamed from: b  reason: collision with root package name */
        public static final C0737a f48731b = null;

        /* renamed from: a  reason: collision with root package name */
        private final String f48736a;

        /* renamed from: v5.e$a$a  reason: collision with other inner class name */
        public static final class C0737a {
            public /* synthetic */ C0737a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                C6496s.h(str, "rawValue");
                for (a aVar : a.values()) {
                    if (C6496s.c(aVar.b(), str)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0737a() {
            }
        }

        static {
            f48731b = new C0737a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.f48736a = str;
        }

        public final String b() {
            return this.f48736a;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private k f48737a;

        /* renamed from: b  reason: collision with root package name */
        private i f48738b;

        public b(k kVar, i iVar) {
            C6496s.h(iVar, "field");
            this.f48737a = kVar;
            this.f48738b = iVar;
        }

        public final i a() {
            return this.f48738b;
        }

        public final k b() {
            return this.f48737a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f48737a == bVar.f48737a && this.f48738b == bVar.f48738b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            k kVar = this.f48737a;
            if (kVar == null) {
                i10 = 0;
            } else {
                i10 = kVar.hashCode();
            }
            return (i10 * 31) + this.f48738b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f48737a + ", field=" + this.f48738b + ')';
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private k f48739a;

        /* renamed from: b  reason: collision with root package name */
        private l f48740b;

        public c(k kVar, l lVar) {
            C6496s.h(kVar, "section");
            this.f48739a = kVar;
            this.f48740b = lVar;
        }

        public final l a() {
            return this.f48740b;
        }

        public final k b() {
            return this.f48739a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f48739a == cVar.f48739a && this.f48740b == cVar.f48740b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f48739a.hashCode() * 31;
            l lVar = this.f48740b;
            if (lVar == null) {
                i10 = 0;
            } else {
                i10 = lVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f48739a + ", field=" + this.f48740b + ')';
        }
    }

    public enum d {
        ARRAY,
        BOOL,
        INT;
        

        /* renamed from: a  reason: collision with root package name */
        public static final a f48741a = null;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                C6496s.h(str, "rawValue");
                if (C6496s.c(str, C4105b.EXT_INFO.b())) {
                    return d.ARRAY;
                }
                if (C6496s.c(str, C4105b.URL_SCHEMES.b())) {
                    return d.ARRAY;
                }
                if (C6496s.c(str, m.CONTENT_IDS.b())) {
                    return d.ARRAY;
                }
                if (C6496s.c(str, m.CONTENTS.b())) {
                    return d.ARRAY;
                }
                if (C6496s.c(str, a.OPTIONS.b())) {
                    return d.ARRAY;
                }
                if (C6496s.c(str, C4105b.ADV_TE.b())) {
                    return d.BOOL;
                }
                if (C6496s.c(str, C4105b.APP_TE.b())) {
                    return d.BOOL;
                }
                if (C6496s.c(str, m.EVENT_TIME.b())) {
                    return d.INT;
                }
                return null;
            }

            private a() {
            }
        }

        static {
            f48741a = new a((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: v5.e$e  reason: collision with other inner class name */
    public /* synthetic */ class C0738e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f48746a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f48747b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f48748c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                v5.e$d[] r0 = v5.e.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                v5.e$d r2 = v5.e.d.ARRAY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                v5.e$d r3 = v5.e.d.BOOL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                v5.e$d r3 = v5.e.d.INT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f48746a = r0
                v5.k[] r0 = v5.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                v5.k r3 = v5.k.APP_DATA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                v5.k r3 = v5.k.USER_DATA     // Catch:{ NoSuchFieldError -> 0x003b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f48747b = r0
                v5.a[] r0 = v5.C4104a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                v5.a r3 = v5.C4104a.MOBILE_APP_INSTALL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                v5.a r1 = v5.C4104a.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f48748c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.e.C0738e.<clinit>():void");
        }
    }

    static {
        C4105b bVar = C4105b.ANON_ID;
        k kVar = k.USER_DATA;
        Pair a10 = C6502A.a(bVar, new c(kVar, l.ANON_ID));
        Pair a11 = C6502A.a(C4105b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID));
        Pair a12 = C6502A.a(C4105b.ADVERTISER_ID, new c(kVar, l.MAD_ID));
        Pair a13 = C6502A.a(C4105b.PAGE_ID, new c(kVar, l.PAGE_ID));
        Pair a14 = C6502A.a(C4105b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID));
        C4105b bVar2 = C4105b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f48728b = O.l(a10, a11, a12, a13, a14, C6502A.a(bVar2, new c(kVar2, l.ADV_TE)), C6502A.a(C4105b.APP_TE, new c(kVar2, l.APP_TE)), C6502A.a(C4105b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), C6502A.a(C4105b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), C6502A.a(C4105b.EXT_INFO, new c(kVar2, l.EXT_INFO)), C6502A.a(C4105b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), C6502A.a(C4105b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), C6502A.a(C4105b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), C6502A.a(C4105b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), C6502A.a(C4105b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), C6502A.a(C4105b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), C6502A.a(C4105b.USER_DATA, new c(kVar, (l) null)));
        Pair a15 = C6502A.a(m.EVENT_TIME, new b((k) null, i.EVENT_TIME));
        Pair a16 = C6502A.a(m.EVENT_NAME, new b((k) null, i.EVENT_NAME));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f48729c = O.l(a15, a16, C6502A.a(mVar, new b(kVar3, i.VALUE_TO_SUM)), C6502A.a(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), C6502A.a(m.CONTENTS, new b(kVar3, i.CONTENTS)), C6502A.a(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), C6502A.a(m.CURRENCY, new b(kVar3, i.CURRENCY)), C6502A.a(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), C6502A.a(m.LEVEL, new b(kVar3, i.LEVEL)), C6502A.a(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), C6502A.a(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), C6502A.a(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), C6502A.a(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), C6502A.a(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), C6502A.a(m.SUCCESS, new b(kVar3, i.SUCCESS)), C6502A.a(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), C6502A.a(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
    }

    private e() {
    }

    private final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll((Map) it.next());
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.b(), n.MOBILE_APP_INSTALL.b());
        linkedHashMap.put(i.EVENT_TIME.b(), obj);
        return C6565s.e(linkedHashMap);
    }

    private final C4104a f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(n.EVENT.b());
        C4104a.C0736a aVar = C4104a.f48699a;
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
        C4104a a10 = aVar.a((String) obj);
        if (a10 == C4104a.OTHER) {
            return a10;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            C4105b a11 = C4105b.f48704b.a(str);
            if (a11 != null) {
                f48727a.g(map2, map3, a11, value);
            } else {
                boolean c10 = C6496s.c(str, k.CUSTOM_EVENTS.b());
                boolean z10 = value instanceof String;
                if (a10 == C4104a.CUSTOM && c10 && z10) {
                    C6496s.f(value, "null cannot be cast to non-null type kotlin.String");
                    ArrayList k10 = k((String) value);
                    if (k10 != null) {
                        arrayList.addAll(k10);
                    }
                } else if (a.f48731b.a(str) != null) {
                    map4.put(str, value);
                }
            }
        }
        return a10;
    }

    private final void h(Map map, C4105b bVar, Object obj) {
        l a10;
        String b10;
        c cVar = (c) f48728b.get(bVar);
        if (cVar != null && (a10 = cVar.a()) != null && (b10 = a10.b()) != null) {
            map.put(b10, obj);
        }
    }

    private final void i(Map map, C4105b bVar, Object obj) {
        l a10;
        String b10;
        if (bVar == C4105b.USER_DATA) {
            try {
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
                map.putAll(W.o(new JSONObject((String) obj)));
            } catch (JSONException e10) {
                J.f47112e.c(V.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
            }
        } else {
            c cVar = (c) f48728b.get(bVar);
            if (cVar != null && (a10 = cVar.a()) != null && (b10 = a10.b()) != null) {
                map.put(b10, obj);
            }
        }
    }

    private final String j(String str) {
        String b10;
        Map map = f48730d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = (j) map.get(str);
        if (jVar == null || (b10 = jVar.b()) == null) {
            return "";
        }
        return b10;
    }

    public static final ArrayList k(String str) {
        C6496s.h(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList<>();
        try {
            for (String jSONObject : W.n(new JSONArray(str))) {
                arrayList.add(W.o(new JSONObject(jSONObject)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m a10 = m.f48822b.a(str2);
                    b bVar = (b) f48729c.get(a10);
                    if (!(a10 == null || bVar == null)) {
                        k b10 = bVar.b();
                        if (b10 == null) {
                            try {
                                String b11 = bVar.a().b();
                                if (a10 == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    e eVar = f48727a;
                                    Object obj = map.get(str2);
                                    C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(b11, eVar.j((String) obj));
                                } else if (a10 == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Any");
                                    Object l10 = l(str2, obj2);
                                    C6496s.f(l10, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(b11, l10);
                                }
                            } catch (ClassCastException e10) {
                                J.f47112e.c(V.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", C6523g.b(e10));
                            }
                        } else if (b10 == k.CUSTOM_DATA) {
                            String b12 = bVar.a().b();
                            Object obj3 = map.get(str2);
                            C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object l11 = l(str2, obj3);
                            C6496s.f(l11, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(b12, l11);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.b(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            J.f47112e.c(V.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str, e11);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|31|32|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = o7.W.n(new org.json.JSONArray(r1));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.String r0 = "field"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            v5.e$d$a r0 = v5.e.d.f48741a
            v5.e$d r4 = r0.a(r4)
            boolean r0 = r5 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r4 == 0) goto L_0x00a3
            if (r0 != 0) goto L_0x0020
            goto L_0x00a3
        L_0x0020:
            int[] r2 = v5.e.C0738e.f48746a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L_0x0057
            r3 = 2
            if (r4 == r3) goto L_0x0040
            r0 = 3
            if (r4 != r0) goto L_0x003a
            java.lang.String r4 = r5.toString()
            java.lang.Integer r4 = Sg.p.m(r4)
            return r4
        L_0x003a:
            lf.s r4 = new lf.s
            r4.<init>()
            throw r4
        L_0x0040:
            java.lang.String r4 = r0.toString()
            java.lang.Integer r4 = Sg.p.m(r4)
            if (r4 == 0) goto L_0x0056
            int r4 = r4.intValue()
            if (r4 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x0056:
            return r1
        L_0x0057:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008e }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x008e }
            java.util.List r4 = o7.W.n(r4)     // Catch:{ JSONException -> 0x008e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x008e }
            r0.<init>()     // Catch:{ JSONException -> 0x008e }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ JSONException -> 0x008e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x008e }
        L_0x006b:
            boolean r1 = r4.hasNext()     // Catch:{ JSONException -> 0x008e }
            if (r1 == 0) goto L_0x0090
            java.lang.Object r1 = r4.next()     // Catch:{ JSONException -> 0x008e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x008e }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0081 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0081 }
            java.util.Map r1 = o7.W.o(r2)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x008a
        L_0x0081:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x008a }
            java.util.List r1 = o7.W.n(r2)     // Catch:{ JSONException -> 0x008a }
        L_0x008a:
            r0.add(r1)     // Catch:{ JSONException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r4 = move-exception
            goto L_0x0091
        L_0x0090:
            return r0
        L_0x0091:
            o7.J$a r0 = o7.J.f47112e
            com.facebook.V r1 = com.facebook.V.APP_EVENTS
            java.lang.String r2 = "\n transformEvents JSONException: \n%s\n%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            java.lang.String r5 = "AppEventsConversionsAPITransformer"
            r0.c(r1, r5, r2, r4)
            lf.M r4 = lf.C6514M.f71813a
            return r4
        L_0x00a3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.e.l(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final List a(C4104a aVar, Map map, Map map2, Map map3, List list, Object obj) {
        C6496s.h(aVar, "eventType");
        C6496s.h(map, "userData");
        C6496s.h(map2, "appData");
        C6496s.h(map3, "restOfData");
        C6496s.h(list, "customEvents");
        Map d10 = d(map, map2, map3);
        int i10 = C0738e.f48748c[aVar.ordinal()];
        if (i10 == 1) {
            return c(d10, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return b(d10, list);
    }

    public final Map d(Map map, Map map2, Map map3) {
        C6496s.h(map, "userData");
        C6496s.h(map2, "appData");
        C6496s.h(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.b(), n.APP.b());
        linkedHashMap.put(k.USER_DATA.b(), map);
        linkedHashMap.put(k.APP_DATA.b(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    public final List e(Map map) {
        C6496s.h(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C4104a f10 = f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f10 == C4104a.OTHER) {
            return null;
        }
        return a(f10, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(n.INSTALL_EVENT_TIME.b()));
    }

    public final void g(Map map, Map map2, C4105b bVar, Object obj) {
        k b10;
        C6496s.h(map, "userData");
        C6496s.h(map2, "appData");
        C6496s.h(bVar, "field");
        C6496s.h(obj, "value");
        c cVar = (c) f48728b.get(bVar);
        if (cVar != null && (b10 = cVar.b()) != null) {
            int i10 = C0738e.f48747b[b10.ordinal()];
            if (i10 == 1) {
                h(map2, bVar, obj);
            } else if (i10 == 2) {
                i(map, bVar, obj);
            }
        }
    }
}
