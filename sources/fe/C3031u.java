package Fe;

import Fe.C3021j;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.u  reason: case insensitive filesystem */
public abstract class C3031u {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31181a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f31182b;

    /* renamed from: Fe.u$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f31183a;

        public a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException e10) {
                C3023l.a(e10.getMessage());
            }
            this.f31183a = jSONObject2;
        }

        public JSONObject a() {
            return this.f31183a;
        }

        public Object b(String str) {
            Object opt = this.f31183a.opt(str);
            this.f31183a.remove(str);
            return opt;
        }

        public boolean c(String str) {
            boolean optBoolean = this.f31183a.optBoolean(str);
            this.f31183a.remove(str);
            return optBoolean;
        }

        public Double d(String str, Double d10) {
            if (!this.f31183a.has(str)) {
                return d10;
            }
            Double valueOf = Double.valueOf(this.f31183a.optDouble(str));
            this.f31183a.remove(str);
            return valueOf;
        }

        public Integer e(String str, Integer num) {
            if (!this.f31183a.has(str)) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f31183a.optInt(str));
            this.f31183a.remove(str);
            return valueOf;
        }

        public JSONArray f(String str) {
            JSONArray optJSONArray = this.f31183a.optJSONArray(str);
            this.f31183a.remove(str);
            return optJSONArray;
        }

        public long g(String str) {
            long optLong = this.f31183a.optLong(str);
            this.f31183a.remove(str);
            return optLong;
        }

        public String h(String str) {
            String optString = this.f31183a.optString(str);
            this.f31183a.remove(str);
            return optString;
        }
    }

    static boolean a(Context context) {
        boolean z10;
        if (!f31181a && f31182b == null) {
            C3021j g10 = C3021j.g(context);
            if (g10.l(C3021j.a.useTestInstance)) {
                Boolean j10 = g10.j();
                if (j10 != null) {
                    z10 = j10.booleanValue();
                } else {
                    z10 = false;
                }
                f31181a = z10;
            } else {
                f31181a = p(context);
            }
            f31182b = Boolean.valueOf(f31181a);
        }
        return f31181a;
    }

    public static String b(Context context, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return context.getResources().getString(i10);
        } catch (Exception e10) {
            C3023l.a(e10.getMessage());
            return null;
        }
    }

    public static int c(Context context, int i10) {
        return Math.round(((float) i10) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[SYNTHETIC, Splitter:B:26:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ IOException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[SYNTHETIC, Splitter:B:31:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073 A[Catch:{ IOException -> 0x006f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject d(android.content.Context r5) {
        /*
            boolean r0 = i(r5)
            r1 = 0
            if (r0 != 0) goto L_0x007f
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r3 = r5.getPackageName()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r4 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r2 = r2.publicSourceDir     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r2 = "AndroidManifest.xml"
            java.util.zip.ZipEntry r2 = r0.getEntry(r2)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            java.io.InputStream r2 = r0.getInputStream(r2)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            int r3 = r2.available()     // Catch:{ Exception -> 0x004a }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x004a }
            r2.read(r3)     // Catch:{ Exception -> 0x004a }
            Fe.b r4 = new Fe.b     // Catch:{ Exception -> 0x004a }
            r4.<init>()     // Catch:{ Exception -> 0x004a }
            org.json.JSONObject r1 = r4.d(r3, r5)     // Catch:{ Exception -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x003e }
            r0.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x007f
        L_0x003e:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            Fe.C3023l.a(r5)
            goto L_0x007f
        L_0x0047:
            r5 = move-exception
            r1 = r2
            goto L_0x0069
        L_0x004a:
            r5 = move-exception
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            goto L_0x0069
        L_0x004e:
            r5 = move-exception
            r2 = r1
            goto L_0x0057
        L_0x0051:
            r5 = move-exception
            r0 = r1
            goto L_0x0069
        L_0x0054:
            r5 = move-exception
            r0 = r1
            r2 = r0
        L_0x0057:
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0047 }
            Fe.C3023l.a(r5)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0063
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x0063:
            if (r0 == 0) goto L_0x007f
            r0.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x007f
        L_0x0069:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0071
        L_0x006f:
            r0 = move-exception
            goto L_0x0077
        L_0x0071:
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x007e
        L_0x0077:
            java.lang.String r0 = r0.getMessage()
            Fe.C3023l.a(r0)
        L_0x007e:
            throw r5
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.C3031u.d(android.content.Context):org.json.JSONObject");
    }

    public static boolean e(Context context) {
        C3021j g10 = C3021j.g(context);
        if (g10.k()) {
            return Boolean.TRUE.equals(g10.d());
        }
        return false;
    }

    public static Drawable f(Context context, int i10) {
        return context.getResources().getDrawable(i10, context.getTheme());
    }

    public static boolean g(Context context) {
        C3021j g10 = C3021j.g(context);
        if (g10.k()) {
            return Boolean.TRUE.equals(g10.e());
        }
        return false;
    }

    private static String h(Context context, ApplicationInfo applicationInfo) {
        String str;
        if (!j()) {
            C3023l.l("Branch key not found for live mode in manifest");
            return null;
        }
        C3023l.l("Test mode enabled but test key not found, attempting fallback to live key...");
        String string = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
        if (string != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found live branch key for test mode fallback: ");
            if (string.length() > 10) {
                str = string.substring(0, 10) + "...";
            } else {
                str = string;
            }
            sb2.append(str);
            C3023l.l(sb2.toString());
            r(context, string, "manifest_test_fallback");
        } else {
            C3023l.l("No live key found for test mode fallback");
        }
        return string;
    }

    public static boolean i(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static boolean j() {
        return f31181a;
    }

    public static String k(Context context) {
        C3023l.l("Reading branch key from available sources...");
        C3023l.l("Attempting to read branch key from branch.json configuration...");
        String l10 = l(context);
        if (l10 != null) {
            C3023l.l("Successfully read branch key from branch.json configuration");
            r(context, l10, "branch_json");
            return l10;
        }
        C3023l.l("Branch key not found in branch.json, falling back to manifest...");
        C3023l.l("Attempting to read branch key from manifest meta-data...");
        String m10 = m(context);
        if (m10 != null) {
            C3023l.l("Successfully read branch key from manifest meta-data");
            return m10;
        }
        C3023l.l("Branch key not found in manifest, falling back to string resources...");
        C3023l.l("Attempting to read branch key from string resources...");
        String o10 = o(context);
        if (o10 != null) {
            C3023l.l("Successfully read branch key from string resources");
        } else {
            C3023l.m("Branch key not found in any source (branch.json, manifest, or string resources)");
        }
        return o10;
    }

    private static String l(Context context) {
        String str;
        String str2;
        C3021j g10 = C3021j.g(context);
        if (g10.k()) {
            str = g10.b();
        } else {
            str = null;
        }
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found branch key in branch.json: ");
            if (str.length() > 10) {
                str2 = str.substring(0, 10) + "...";
            } else {
                str2 = str;
            }
            sb2.append(str2);
            C3023l.l(sb2.toString());
        } else {
            C3023l.l("branch.json configuration not valid or branch key not present");
        }
        return str;
    }

    private static String m(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                return n(context, applicationInfo);
            }
            C3023l.l("No meta-data found in manifest");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            C3023l.a("Error reading manifest: " + e10.getMessage());
            return null;
        }
    }

    private static String n(Context context, ApplicationInfo applicationInfo) {
        String str;
        String str2;
        if (j()) {
            str = "io.branch.sdk.BranchKey.test";
        } else {
            str = "io.branch.sdk.BranchKey";
        }
        C3023l.l("Looking for branch key in manifest with key: " + str + " (test mode: " + j() + ")");
        String string = applicationInfo.metaData.getString(str);
        if (string == null) {
            return h(context, applicationInfo);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Found branch key in manifest meta-data: ");
        if (string.length() > 10) {
            str2 = string.substring(0, 10) + "...";
        } else {
            str2 = string;
        }
        sb2.append(str2);
        C3023l.l(sb2.toString());
        r(context, string, "manifest");
        return string;
    }

    private static String o(Context context) {
        String str;
        String str2;
        if (j()) {
            str = "io.branch.sdk.BranchKey.test";
        } else {
            str = "io.branch.sdk.BranchKey";
        }
        C3023l.l("Looking for branch key in string resources with key: " + str + " (test mode: " + j() + ")");
        try {
            Resources resources = context.getResources();
            String string = resources.getString(resources.getIdentifier(str, "string", context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Found branch key in string resources: ");
                if (string.length() > 10) {
                    str2 = string.substring(0, 10) + "...";
                } else {
                    str2 = string;
                }
                sb2.append(str2);
                C3023l.l(sb2.toString());
                r(context, string, "strings");
            } else {
                C3023l.l("Branch key string resource is empty");
            }
            return string;
        } catch (Resources.NotFoundException unused) {
            C3023l.l("Branch key string resource not found: " + str);
            return null;
        }
    }

    private static boolean p(Context context) {
        boolean parseBoolean;
        boolean z10 = f31181a;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (bundle.containsKey("io.branch.sdk.TestMode")) {
                    parseBoolean = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                    return parseBoolean;
                }
            }
            Resources resources = context.getResources();
            parseBoolean = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
            return parseBoolean;
        } catch (Exception unused) {
            return z10;
        }
    }

    public static void q(Context context) {
        String a10 = C3021j.g(context).a();
        if (!TextUtils.isEmpty(a10)) {
            C3016e.I0(a10);
        }
    }

    private static void r(Context context, String str, String str2) {
        E G10 = E.G(context);
        G10.B0(str);
        G10.C0(str2);
    }

    public static void s(Context context) {
        String c10 = C3021j.g(context).c();
        if (!TextUtils.isEmpty(c10)) {
            C3016e.X().K0(C3032v.valueOf(c10));
        }
    }

    public static void t(Context context) {
        String f10 = C3021j.g(context).f();
        if (!TextUtils.isEmpty(f10)) {
            C3016e.N0(f10);
        }
    }

    static void u(boolean z10) {
        f31181a = z10;
    }
}
