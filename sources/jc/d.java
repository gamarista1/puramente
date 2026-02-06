package Jc;

import Hc.C4299b;
import Ug.C5572i;
import Ug.K;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import org.json.JSONObject;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public final class d implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f51376d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C4299b f51377a;

    /* renamed from: b  reason: collision with root package name */
    private final g f51378b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51379c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f51380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f51381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f51382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f51383d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f51384e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Map map, p pVar, p pVar2, C6658d dVar2) {
            super(2, dVar2);
            this.f51381b = dVar;
            this.f51382c = map;
            this.f51383d = pVar;
            this.f51384e = pVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f51381b, this.f51382c, this.f51383d, this.f51384e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f51380a;
            if (i10 == 0) {
                w.b(obj);
                URLConnection openConnection = this.f51381b.c().openConnection();
                C6496s.f(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f51382c.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    N n10 = new N();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        n10.f71759a = readLine;
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    p pVar = this.f51383d;
                    this.f51380a = 1;
                    if (pVar.invoke(jSONObject, this) == f10) {
                        return f10;
                    }
                } else {
                    p pVar2 = this.f51384e;
                    String str = "Bad response code: " + responseCode;
                    this.f51380a = 2;
                    if (pVar2.invoke(str, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                try {
                    w.b(obj);
                } catch (Exception e10) {
                    p pVar3 = this.f51384e;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = e10.toString();
                    }
                    this.f51380a = 3;
                    if (pVar3.invoke(message, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 3) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public d(C4299b bVar, g gVar, String str) {
        C6496s.h(bVar, "appInfo");
        C6496s.h(gVar, "blockingDispatcher");
        C6496s.h(str, "baseUrl");
        this.f51377a = bVar;
        this.f51378b = gVar;
        this.f51379c = str;
    }

    /* access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(Constants.SCHEME).authority(this.f51379c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f51377a.b()).appendPath("settings").appendQueryParameter("build_version", this.f51377a.a().a()).appendQueryParameter("display_version", this.f51377a.a().f()).build().toString());
    }

    public Object a(Map map, p pVar, p pVar2, C6658d dVar) {
        Object g10 = C5572i.g(this.f51378b, new b(this, map, pVar, pVar2, (C6658d) null), dVar);
        if (g10 == C6680b.f()) {
            return g10;
        }
        return C6514M.f71813a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(C4299b bVar, g gVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, gVar, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
