package Je;

import Fe.C3018g;
import Fe.C3031u;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class d {

    /* renamed from: a  reason: collision with root package name */
    JSONObject f32241a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32242b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32243c;

    /* renamed from: d  reason: collision with root package name */
    final List f32244d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    final String f32245e;

    /* renamed from: f  reason: collision with root package name */
    boolean f32246f = false;

    private class b extends C3018g {
        private b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public JSONObject doInBackground(Context... contextArr) {
            return C3031u.d(contextArr[0]);
        }
    }

    public d(Context context) {
        String str;
        String str2;
        this.f32245e = context.getPackageName();
        String str3 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                str2 = bundle.getString("io.branch.sdk.BranchKey");
                try {
                    str3 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey.test");
                } catch (PackageManager.NameNotFoundException e10) {
                    e = e10;
                    e.printStackTrace();
                    str = str3;
                    str3 = str2;
                    this.f32243c = str3;
                    this.f32242b = str;
                    a(context);
                }
                str = str3;
                str3 = str2;
                this.f32243c = str3;
                this.f32242b = str;
                a(context);
            }
            str = null;
            this.f32243c = str3;
            this.f32242b = str;
            a(context);
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            str2 = null;
            e.printStackTrace();
            str = str3;
            str3 = str2;
            this.f32243c = str3;
            this.f32242b = str;
            a(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 0
            Je.d$b r1 = new Je.d$b     // Catch:{ Exception -> 0x001e }
            r1.<init>()     // Catch:{ Exception -> 0x001e }
            android.content.Context[] r6 = new android.content.Context[]{r6}     // Catch:{ Exception -> 0x001e }
            android.os.AsyncTask r6 = r1.a(r6)     // Catch:{ Exception -> 0x001e }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x001e }
            r2 = 2500(0x9c4, double:1.235E-320)
            java.lang.Object r6 = r6.get(r2, r1)     // Catch:{ Exception -> 0x001e }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ Exception -> 0x001e }
            r0 = 1
            r5.f32246f = r0     // Catch:{ Exception -> 0x001c }
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            goto L_0x0022
        L_0x001e:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0022:
            java.lang.String r0 = r0.getMessage()
            Fe.C3023l.a(r0)
        L_0x0029:
            if (r6 == 0) goto L_0x0056
            Fe.y r0 = Fe.y.URIScheme
            java.lang.String r0 = r0.b()
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            r5.f32241a = r0
            Fe.y r0 = Fe.y.AppLinks
            java.lang.String r0 = r0.b()
            org.json.JSONArray r6 = r6.optJSONArray(r0)
            if (r6 == 0) goto L_0x0056
            r0 = 0
        L_0x0044:
            int r1 = r6.length()
            if (r0 >= r1) goto L_0x0056
            java.util.List r1 = r5.f32244d
            java.lang.String r2 = r6.optString(r0)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x0044
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Je.d.a(android.content.Context):void");
    }
}
