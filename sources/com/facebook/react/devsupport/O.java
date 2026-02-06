package com.facebook.react.devsupport;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Inspector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.I;
import rh.J;

public class O implements N {

    /* renamed from: a  reason: collision with root package name */
    private final b f40728a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f40729b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final String f40730c;

    class a implements Inspector.RemoteConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f40731a;

        a(String str) {
            this.f40731a = str;
        }

        public void onDisconnect() {
            try {
                O.this.f40729b.remove(this.f40731a);
                O o10 = O.this;
                o10.l("disconnect", o10.k(this.f40731a));
            } catch (JSONException e10) {
                U5.a.J("InspectorPackagerConnection", "Couldn't send event to packager", e10);
            }
        }

        public void onMessage(String str) {
            try {
                O.this.m(this.f40731a, str);
            } catch (JSONException e10) {
                U5.a.J("InspectorPackagerConnection", "Couldn't send event to packager", e10);
            }
        }
    }

    private class b extends J {

        /* renamed from: a  reason: collision with root package name */
        private final String f40733a;

        /* renamed from: b  reason: collision with root package name */
        private C6703A f40734b;

        /* renamed from: c  reason: collision with root package name */
        private I f40735c;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f40736d = new Handler(Looper.getMainLooper());
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f40737e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f40738f;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (!b.this.f40737e) {
                    b.this.e();
                }
            }
        }

        /* renamed from: com.facebook.react.devsupport.O$b$b  reason: collision with other inner class name */
        class C0639b extends AsyncTask {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JSONObject f40741a;

            C0639b(JSONObject jSONObject) {
                this.f40741a = jSONObject;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Void doInBackground(I... iArr) {
                if (!(iArr == null || iArr.length == 0)) {
                    try {
                        iArr[0].send(this.f40741a.toString());
                    } catch (Exception e10) {
                        U5.a.J("InspectorPackagerConnection", "Couldn't send event to packager", e10);
                    }
                }
                return null;
            }
        }

        public b(String str) {
            this.f40733a = str;
        }

        private void b(String str, Throwable th2) {
            U5.a.n("InspectorPackagerConnection", "Error occurred, shutting down websocket connection: " + str, th2);
            O.this.e();
            d();
        }

        private void d() {
            I i10 = this.f40735c;
            if (i10 != null) {
                try {
                    i10.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f40735c = null;
            }
        }

        private void f() {
            if (!this.f40737e) {
                if (!this.f40738f) {
                    U5.a.I("InspectorPackagerConnection", "Couldn't connect to packager, will silently retry");
                    this.f40738f = true;
                }
                this.f40736d.postDelayed(new a(), 2000);
                return;
            }
            throw new IllegalStateException("Can't reconnect closed client");
        }

        public void c() {
            this.f40737e = true;
            I i10 = this.f40735c;
            if (i10 != null) {
                try {
                    i10.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f40735c = null;
            }
        }

        public void e() {
            if (!this.f40737e) {
                if (this.f40734b == null) {
                    C6703A.a aVar = new C6703A.a();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    this.f40734b = aVar.f(10, timeUnit).W(10, timeUnit).S(0, TimeUnit.MINUTES).c();
                }
                this.f40734b.C(new C.a().l(this.f40733a).b(), this);
                return;
            }
            throw new IllegalStateException("Can't connect closed client");
        }

        public void g(JSONObject jSONObject) {
            new C0639b(jSONObject).execute(new I[]{this.f40735c});
        }

        public void onClosed(I i10, int i11, String str) {
            this.f40735c = null;
            O.this.e();
            if (!this.f40737e) {
                f();
            }
        }

        public void onFailure(I i10, Throwable th2, E e10) {
            if (this.f40735c != null) {
                b("Websocket exception", th2);
            }
            if (!this.f40737e) {
                f();
            }
        }

        public void onMessage(I i10, String str) {
            try {
                O.this.i(new JSONObject(str));
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        public void onOpen(I i10, E e10) {
            this.f40735c = i10;
        }
    }

    public O(String str, String str2) {
        this.f40728a = new b(str);
        this.f40730c = str2;
    }

    private JSONArray f() {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        for (Inspector.Page next : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(next.getId()));
            jSONObject.put(com.amazon.a.a.o.b.f37461S, next.getTitle());
            jSONObject.put("app", this.f40730c);
            jSONObject.put("vm", next.getVM());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void g(JSONObject jSONObject) {
        String string = jSONObject.getString("pageId");
        if (((Inspector.LocalConnection) this.f40729b.remove(string)) == null) {
            try {
                this.f40729b.put(string, Inspector.connect(Integer.parseInt(string), new a(string)));
            } catch (Exception e10) {
                U5.a.J("InspectorPackagerConnection", "Failed to open page: " + string, e10);
                l("disconnect", k(string));
            }
        } else {
            throw new IllegalStateException("Already connected: " + string);
        }
    }

    private void h(JSONObject jSONObject) {
        Inspector.LocalConnection localConnection = (Inspector.LocalConnection) this.f40729b.remove(jSONObject.getString("pageId"));
        if (localConnection != null) {
            localConnection.disconnect();
        }
    }

    private void j(JSONObject jSONObject) {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = (Inspector.LocalConnection) this.f40729b.get(string);
        if (localConnection == null) {
            U5.a.I("InspectorPackagerConnection", "PageID " + string + " is disconnected. Dropping event: " + string2);
            return;
        }
        localConnection.sendMessage(string2);
    }

    /* access modifiers changed from: private */
    public JSONObject k(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public void l(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("payload", obj);
        this.f40728a.g(jSONObject);
    }

    /* access modifiers changed from: private */
    public void m(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        l("wrappedEvent", jSONObject);
    }

    public void closeQuietly() {
        this.f40728a.c();
    }

    public void connect() {
        this.f40728a.e();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        for (Map.Entry value : this.f40729b.entrySet()) {
            ((Inspector.LocalConnection) value.getValue()).disconnect();
        }
        this.f40729b.clear();
    }

    /* access modifiers changed from: package-private */
    public void i(JSONObject jSONObject) {
        String string = jSONObject.getString("event");
        string.hashCode();
        char c10 = 65535;
        switch (string.hashCode()) {
            case 530405532:
                if (string.equals("disconnect")) {
                    c10 = 0;
                    break;
                }
                break;
            case 951351530:
                if (string.equals("connect")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1328613653:
                if (string.equals("wrappedEvent")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1962251790:
                if (string.equals("getPages")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                h(jSONObject.getJSONObject("payload"));
                return;
            case 1:
                g(jSONObject.getJSONObject("payload"));
                return;
            case 2:
                j(jSONObject.getJSONObject("payload"));
                return;
            case 3:
                l("getPages", f());
                return;
            default:
                throw new IllegalArgumentException("Unknown event: " + string);
        }
    }

    public void sendEventToAllConnections(String str) {
        for (Map.Entry value : this.f40729b.entrySet()) {
            ((Inspector.LocalConnection) value.getValue()).sendMessage(str);
        }
    }
}
