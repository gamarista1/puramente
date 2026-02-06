package com.facebook.react.devsupport;

import Gh.C5404e;
import Gh.C5406g;
import I7.b;
import com.facebook.react.devsupport.X;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.C3863a;
import org.json.JSONException;
import org.json.JSONObject;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;
import rh.u;

/* renamed from: com.facebook.react.devsupport.b  reason: case insensitive filesystem */
public class C3335b {

    /* renamed from: a  reason: collision with root package name */
    private final C6703A f40762a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C6708e f40763b;

    /* renamed from: com.facebook.react.devsupport.b$a */
    class a implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f40764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f40765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f40766c;

        a(b bVar, File file, c cVar) {
            this.f40764a = bVar;
            this.f40765b = file;
            this.f40766c = cVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            if (C3335b.this.f40763b == null || C3335b.this.f40763b.isCanceled()) {
                C3335b.this.f40763b = null;
                return;
            }
            C3335b.this.f40763b = null;
            String vVar = eVar.request().l().toString();
            b bVar = this.f40764a;
            bVar.onFailure(C7.c.b(vVar, "Could not connect to development server.", "URL: " + vVar, iOException));
        }

        public void onResponse(C6708e eVar, E e10) {
            F a10;
            try {
                if (C3335b.this.f40763b != null) {
                    if (!C3335b.this.f40763b.isCanceled()) {
                        C3335b.this.f40763b = null;
                        String vVar = e10.g0().l().toString();
                        Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(e10.v("content-type"));
                        if (matcher.find()) {
                            C3335b.this.i(vVar, e10, matcher.group(1), this.f40765b, this.f40766c, this.f40764a);
                        } else {
                            a10 = e10.a();
                            C3335b.this.h(vVar, e10.o(), e10.F(), e10.a().y(), this.f40765b, this.f40766c, this.f40764a);
                            if (a10 != null) {
                                a10.close();
                            }
                        }
                        e10.close();
                        return;
                    }
                }
                C3335b.this.f40763b = null;
                if (e10 != null) {
                    e10.close();
                    return;
                }
                return;
                throw th;
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }

    /* renamed from: com.facebook.react.devsupport.b$b  reason: collision with other inner class name */
    class C0640b implements X.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f40768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ File f40770c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f40771d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f40772e;

        C0640b(E e10, String str, File file, c cVar, b bVar) {
            this.f40768a = e10;
            this.f40769b = str;
            this.f40770c = file;
            this.f40771d = cVar;
            this.f40772e = bVar;
        }

        public void a(Map map, long j10, long j11) {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                this.f40772e.a("Downloading", Integer.valueOf((int) (j10 / 1024)), Integer.valueOf((int) (j11 / 1024)));
            }
        }

        public void b(Map map, C5404e eVar, boolean z10) {
            String str;
            Integer num;
            if (z10) {
                int o10 = this.f40768a.o();
                if (map.containsKey("X-Http-Status")) {
                    o10 = Integer.parseInt((String) map.get("X-Http-Status"));
                }
                C3335b.this.h(this.f40769b, o10, u.r(map), eVar, this.f40770c, this.f40771d, this.f40772e);
            } else if (map.containsKey("Content-Type") && ((String) map.get("Content-Type")).equals("application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(eVar.p1());
                    if (jSONObject.has("status")) {
                        str = jSONObject.getString("status");
                    } else {
                        str = "Bundling";
                    }
                    Integer num2 = null;
                    if (jSONObject.has("done")) {
                        num = Integer.valueOf(jSONObject.getInt("done"));
                    } else {
                        num = null;
                    }
                    if (jSONObject.has("total")) {
                        num2 = Integer.valueOf(jSONObject.getInt("total"));
                    }
                    this.f40772e.a(str, num, num2);
                } catch (JSONException e10) {
                    U5.a.m("ReactNative", "Error parsing progress JSON. " + e10.toString());
                }
            }
        }
    }

    /* renamed from: com.facebook.react.devsupport.b$c */
    public static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f40774a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f40775b;

        public String c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f40774a);
                jSONObject.put("filesChangedCount", this.f40775b);
                return jSONObject.toString();
            } catch (JSONException e10) {
                U5.a.n("BundleDownloader", "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    public C3335b(C6703A a10) {
        this.f40762a = a10;
    }

    private static void g(String str, u uVar, c cVar) {
        cVar.f40774a = str;
        String a10 = uVar.a("X-Metro-Files-Changed-Count");
        if (a10 != null) {
            try {
                cVar.f40775b = Integer.parseInt(a10);
            } catch (NumberFormatException unused) {
                cVar.f40775b = -2;
            }
        }
    }

    /* access modifiers changed from: private */
    public void h(String str, int i10, u uVar, C5406g gVar, File file, c cVar, b bVar) {
        if (i10 != 200) {
            String p12 = gVar.p1();
            C7.c d10 = C7.c.d(str, p12);
            if (d10 != null) {
                bVar.onFailure(d10);
                return;
            }
            bVar.onFailure(new C7.c("The development server returned response error code: " + i10 + "\n\n" + "URL: " + str + "\n\n" + "Body:\n" + p12));
            return;
        }
        if (cVar != null) {
            g(str, uVar, cVar);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!j(gVar, file2) || file2.renameTo(file)) {
            bVar.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* access modifiers changed from: private */
    public void i(String str, E e10, String str2, File file, c cVar, b bVar) {
        if (!new X(e10.a().y(), str2).d(new C0640b(e10, str, file, cVar, bVar))) {
            bVar.onFailure(new C7.c("Error while reading multipart response.\n\nResponse code: " + e10.o() + "\n\nURL: " + str.toString() + "\n\n"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean j(Gh.C5406g r0, java.io.File r1) {
        /*
            Gh.U r1 = Gh.H.f(r1)     // Catch:{ all -> 0x0010 }
            r0.d0(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r1.close()
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.C3335b.j(Gh.g, java.io.File):boolean");
    }

    public void e(b bVar, File file, String str, c cVar) {
        f(bVar, file, str, cVar, new C.a());
    }

    public void f(b bVar, File file, String str, c cVar, C.a aVar) {
        C6708e eVar = (C6708e) C3863a.c(this.f40762a.a(aVar.l(str).a("Accept", "multipart/mixed").b()));
        this.f40763b = eVar;
        FirebasePerfOkHttpClient.enqueue(eVar, new a(bVar, file, cVar));
    }
}
