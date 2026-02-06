package G5;

import Ef.i;
import F5.m;
import J5.e;
import Sg.p;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C3286a;
import com.facebook.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import mf.L;
import o7.C3902s;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f31479a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f31480b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final List f31481c = C6565s.q("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d  reason: collision with root package name */
    private static final List f31482d = C6565s.q("none", "address", "health");

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: G5.f$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0514a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f31486a = null;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    G5.f$a[] r0 = G5.f.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    G5.f$a r1 = G5.f.a.MTML_INTEGRITY_DETECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    G5.f$a r1 = G5.f.a.MTML_APP_EVENT_PREDICTION     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f31486a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: G5.f.a.C0514a.<clinit>():void");
            }
        }

        public final String b() {
            int i10 = C0514a.f31486a[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new C6535s();
        }

        public final String c() {
            int i10 = C0514a.f31486a[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new C6535s();
        }
    }

    public static final class b {

        /* renamed from: i  reason: collision with root package name */
        public static final a f31487i = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private String f31488a;

        /* renamed from: b  reason: collision with root package name */
        private String f31489b;

        /* renamed from: c  reason: collision with root package name */
        private String f31490c;

        /* renamed from: d  reason: collision with root package name */
        private int f31491d;

        /* renamed from: e  reason: collision with root package name */
        private float[] f31492e;

        /* renamed from: f  reason: collision with root package name */
        private File f31493f;

        /* renamed from: g  reason: collision with root package name */
        private b f31494g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Runnable f31495h;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final void d(String str, int i10) {
                File[] listFiles;
                File a10 = j.a();
                if (a10 != null && (listFiles = a10.listFiles()) != null && listFiles.length != 0) {
                    String str2 = str + '_' + i10;
                    for (File file : listFiles) {
                        String name = file.getName();
                        C6496s.g(name, "name");
                        if (p.J(name, str, false, 2, (Object) null) && !p.J(name, str2, false, 2, (Object) null)) {
                            file.delete();
                        }
                    }
                }
            }

            private final void e(String str, String str2, m.a aVar) {
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new m(str, file, aVar).execute(new String[0]);
                }
            }

            /* access modifiers changed from: private */
            public static final void g(List list, File file) {
                C6496s.h(list, "$slaves");
                C6496s.h(file, "file");
                b a10 = b.f31465m.a(file);
                if (a10 != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        b.f31487i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new h(bVar, a10));
                    }
                }
            }

            /* access modifiers changed from: private */
            public static final void h(b bVar, b bVar2, File file) {
                C6496s.h(bVar, "$slave");
                C6496s.h(file, "file");
                bVar.i(bVar2);
                bVar.k(file);
                Runnable a10 = bVar.f31495h;
                if (a10 != null) {
                    a10.run();
                }
            }

            public final b c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", (String) null);
                    int i10 = jSONObject.getInt("version_id");
                    float[] d10 = f.d(f.f31479a, jSONObject.getJSONArray("thresholds"));
                    C6496s.g(string, "useCase");
                    C6496s.g(string2, "assetUri");
                    return new b(string, string2, optString, i10, d10);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void f(b bVar, List list) {
                C6496s.h(bVar, "master");
                C6496s.h(list, "slaves");
                d(bVar.g(), bVar.h());
                e(bVar.b(), bVar.g() + '_' + bVar.h(), new g(list));
            }

            private a() {
            }
        }

        public b(String str, String str2, String str3, int i10, float[] fArr) {
            C6496s.h(str, "useCase");
            C6496s.h(str2, "assetUri");
            this.f31488a = str;
            this.f31489b = str2;
            this.f31490c = str3;
            this.f31491d = i10;
            this.f31492e = fArr;
        }

        public final String b() {
            return this.f31489b;
        }

        public final b c() {
            return this.f31494g;
        }

        public final File d() {
            return this.f31493f;
        }

        public final String e() {
            return this.f31490c;
        }

        public final float[] f() {
            return this.f31492e;
        }

        public final String g() {
            return this.f31488a;
        }

        public final int h() {
            return this.f31491d;
        }

        public final void i(b bVar) {
            this.f31494g = bVar;
        }

        public final b j(Runnable runnable) {
            this.f31495h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f31493f = file;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31496a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                G5.f$a[] r0 = G5.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                G5.f$a r1 = G5.f.a.MTML_APP_EVENT_PREDICTION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                G5.f$a r1 = G5.f.a.MTML_INTEGRITY_DETECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f31496a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G5.f.c.<clinit>():void");
        }
    }

    private f() {
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        Class<f> cls = f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (!C4049a.d(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        b c10 = b.f31487i.c(jSONObject.getJSONObject(keys.next()));
                        if (c10 != null) {
                            f31480b.put(c10.g(), c10);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void f() {
        Class<f> cls = f.class;
        if (!C4049a.d(cls)) {
            try {
                W.F0(new c());
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ Exception -> 0x007b, all -> 0x002c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ Exception -> 0x007b, all -> 0x002c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<G5.f> r2 = G5.f.class
            boolean r3 = t7.C4049a.d(r2)
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            android.content.Context r3 = com.facebook.I.l()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            if (r4 == 0) goto L_0x002e
            int r5 = r4.length()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            if (r5 != 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            r5.<init>(r4)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            goto L_0x0078
        L_0x002e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            r5.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
        L_0x0033:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            o7.s$b r4 = o7.C3902s.b.ModelRequest     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            boolean r4 = o7.C3902s.g(r4)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            if (r4 == 0) goto L_0x004f
            int r4 = r5.length()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            if (r4 == 0) goto L_0x004f
            G5.f r4 = f31479a     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            boolean r4 = r4.n(r6)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            if (r4 != 0) goto L_0x006f
        L_0x004f:
            G5.f r4 = f31479a     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            org.json.JSONObject r5 = r4.k()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            if (r5 != 0) goto L_0x0058
            return
        L_0x0058:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            r0.apply()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
        L_0x006f:
            G5.f r0 = f31479a     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            r0.e(r5)     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            r0.h()     // Catch:{ Exception -> 0x007b, all -> 0x002c }
            goto L_0x007b
        L_0x0078:
            t7.C4049a.b(r0, r2)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.f.g():void");
    }

    private final void h() {
        if (!C4049a.d(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i10 = 0;
                for (Map.Entry entry : f31480b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    b bVar = (b) entry.getValue();
                    if (C6496s.c(str2, a.MTML_APP_EVENT_PREDICTION.c())) {
                        String b10 = bVar.b();
                        int max = Math.max(i10, bVar.h());
                        if (C3902s.g(C3902s.b.SuggestedEvents) && m()) {
                            arrayList.add(bVar.j(new d()));
                        }
                        str = b10;
                        i10 = max;
                    }
                    if (C6496s.c(str2, a.MTML_INTEGRITY_DETECT.c())) {
                        str = bVar.b();
                        i10 = Math.max(i10, bVar.h());
                        if (C3902s.g(C3902s.b.IntelligentIntegrity)) {
                            arrayList.add(bVar.j(new e()));
                        }
                    }
                }
                if (str != null && i10 > 0 && !arrayList.isEmpty()) {
                    b.f31487i.f(new b("MTML", str, (String) null, i10, (float[]) null), arrayList);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void i() {
        Class<f> cls = f.class;
        if (!C4049a.d(cls)) {
            try {
                e.b();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j() {
        Class<f> cls = f.class;
        if (!C4049a.d(cls)) {
            try {
                E5.c.a();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final JSONObject k() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(com.amazon.a.a.o.b.f.f37529a, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            M x10 = M.f39311n.x((C3286a) null, "app/model_asset", (M.b) null);
            x10.J(bundle);
            JSONObject c10 = x10.k().c();
            if (c10 == null) {
                return null;
            }
            return p(c10);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final File l(a aVar) {
        Class<f> cls = f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "task");
            b bVar = (b) f31480b.get(aVar.c());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final boolean m() {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            Locale O10 = W.O();
            if (O10 != null) {
                String language = O10.getLanguage();
                C6496s.g(language, "locale.language");
                if (p.O(language, "en", false, 2, (Object) null)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean n(long j10) {
        if (C4049a.d(this) || j10 == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j10 < 259200000) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (C4049a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    C6496s.g(string, "jsonArray.getString(i)");
                    fArr[i10] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject p(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = t7.C4049a.d(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0012
            return r6
        L_0x0012:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0057 }
            r5.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0063 }
            int r7 = r13.length()     // Catch:{ JSONException -> 0x0063 }
            r8 = 0
        L_0x0022:
            if (r8 >= r7) goto L_0x0068
            org.json.JSONObject r9 = r13.getJSONObject(r8)     // Catch:{ JSONException -> 0x0063 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0063 }
            r10.<init>()     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r2)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r4)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0063 }
            org.json.JSONArray r11 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0063 }
            boolean r11 = r9.has(r3)     // Catch:{ JSONException -> 0x0063 }
            if (r11 == 0) goto L_0x0059
            java.lang.String r11 = r9.getString(r3)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0063 }
            goto L_0x0059
        L_0x0057:
            r13 = move-exception
            goto L_0x0069
        L_0x0059:
            java.lang.String r9 = r9.getString(r4)     // Catch:{ JSONException -> 0x0063 }
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0063 }
            int r8 = r8 + 1
            goto L_0x0022
        L_0x0063:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0057 }
            r5.<init>()     // Catch:{ all -> 0x0057 }
        L_0x0068:
            return r5
        L_0x0069:
            t7.C4049a.b(r13, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.f.p(org.json.JSONObject):org.json.JSONObject");
    }

    public static final String[] q(a aVar, float[][] fArr, String[] strArr) {
        Class<f> cls = f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "task");
            C6496s.h(fArr, "denses");
            C6496s.h(strArr, "texts");
            b bVar = (b) f31480b.get(aVar.c());
            if (bVar == null) {
                return null;
            }
            b c10 = bVar.c();
            if (c10 == null) {
                return null;
            }
            float[] f10 = bVar.f();
            int length = strArr.length;
            int length2 = fArr[0].length;
            a aVar2 = new a(new int[]{length, length2});
            for (int i10 = 0; i10 < length; i10++) {
                System.arraycopy(fArr[i10], 0, aVar2.a(), i10 * length2, length2);
            }
            a b10 = c10.b(aVar2, strArr, aVar.b());
            if (b10 == null || f10 == null) {
                return null;
            }
            if (b10.a().length == 0) {
                return null;
            }
            if (f10.length == 0) {
                return null;
            }
            int i11 = c.f31496a[aVar.ordinal()];
            if (i11 == 1) {
                return f31479a.s(b10, f10);
            }
            if (i11 == 2) {
                return f31479a.r(b10, f10);
            }
            throw new C6535s();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final String[] r(a aVar, float[] fArr) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            int b10 = aVar.b(0);
            int b11 = aVar.b(1);
            float[] a10 = aVar.a();
            if (b11 != fArr.length) {
                return null;
            }
            i u10 = Ef.m.u(0, b10);
            ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                int a11 = ((L) it).a();
                Object obj = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(a11 * b11) + i11] >= fArr[i10]) {
                        obj = f31482d.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final String[] s(a aVar, float[] fArr) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            int b10 = aVar.b(0);
            int b11 = aVar.b(1);
            float[] a10 = aVar.a();
            if (b11 != fArr.length) {
                return null;
            }
            i u10 = Ef.m.u(0, b10);
            ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                int a11 = ((L) it).a();
                Object obj = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(a11 * b11) + i11] >= fArr[i10]) {
                        obj = f31481c.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }
}
