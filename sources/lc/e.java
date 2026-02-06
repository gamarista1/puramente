package Lc;

import Kc.h;
import Mc.a;
import Mc.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.m;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;

public abstract class e {

    /* renamed from: k  reason: collision with root package name */
    public static final Uri f51970k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l  reason: collision with root package name */
    static a f51971l = new b();

    /* renamed from: a  reason: collision with root package name */
    protected Exception f51972a;

    /* renamed from: b  reason: collision with root package name */
    private h f51973b;

    /* renamed from: c  reason: collision with root package name */
    private Context f51974c;

    /* renamed from: d  reason: collision with root package name */
    private Map f51975d;

    /* renamed from: e  reason: collision with root package name */
    private int f51976e;

    /* renamed from: f  reason: collision with root package name */
    private String f51977f;

    /* renamed from: g  reason: collision with root package name */
    private int f51978g;

    /* renamed from: h  reason: collision with root package name */
    private InputStream f51979h;

    /* renamed from: i  reason: collision with root package name */
    private HttpURLConnection f51980i;

    /* renamed from: j  reason: collision with root package name */
    private Map f51981j = new HashMap();

    public e(h hVar, C5230g gVar) {
        C4536s.l(hVar);
        C4536s.l(gVar);
        this.f51973b = hVar;
        this.f51974c = gVar.m();
        G("x-firebase-gmpid", gVar.r().c());
    }

    private final void A(String str, String str2) {
        D(str, str2);
        try {
            E();
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + e() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + u(), e10);
            this.f51972a = e10;
            this.f51976e = -2;
        }
        C();
    }

    private void E() {
        if (v()) {
            z(this.f51979h);
        } else {
            w(this.f51979h);
        }
    }

    private void b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] bArr;
        int i10;
        C4536s.l(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        } else {
            Log.w("NetworkRequest", "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        } else {
            Log.w("NetworkRequest", "No App Check token for request.");
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.0");
        for (Map.Entry entry : this.f51981j.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject g10 = g();
        if (g10 != null) {
            bArr = g10.toString().getBytes(Constants.ENCODING);
            i10 = bArr.length;
        } else {
            bArr = h();
            i10 = i();
            if (i10 == 0 && bArr != null) {
                i10 = bArr.length;
            }
        }
        if (bArr == null || bArr.length <= 0) {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        } else {
            if (g10 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(i10));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArr != null && bArr.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(bArr, 0, i10);
                } finally {
                    bufferedOutputStream.close();
                }
            } else {
                Log.e("NetworkRequest", "Unable to write to the http request!");
            }
        }
    }

    private HttpURLConnection c() {
        Uri u10 = u();
        Map l10 = l();
        if (l10 != null) {
            Uri.Builder buildUpon = u10.buildUpon();
            for (Map.Entry entry : l10.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            u10 = buildUpon.build();
        }
        return f51971l.a(new URL(u10.toString()));
    }

    private boolean d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f51972a = new SocketException("Network subsystem is unavailable");
        this.f51976e = -2;
        return false;
    }

    private static String k(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return "";
        }
        if (path.startsWith("/")) {
            return path.substring(1);
        }
        return path;
    }

    private void x(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Constants.ENCODING));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f51977f = sb2.toString();
        if (!v()) {
            this.f51972a = new IOException(this.f51977f);
        }
    }

    private void y(HttpURLConnection httpURLConnection) {
        C4536s.l(httpURLConnection);
        this.f51976e = httpURLConnection.getResponseCode();
        this.f51975d = httpURLConnection.getHeaderFields();
        this.f51978g = httpURLConnection.getContentLength();
        if (v()) {
            this.f51979h = httpURLConnection.getInputStream();
        } else {
            this.f51979h = httpURLConnection.getErrorStream();
        }
    }

    public void B(String str, String str2, Context context) {
        if (d(context)) {
            A(str, str2);
        }
    }

    public void C() {
        HttpURLConnection httpURLConnection = this.f51980i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void D(String str, String str2) {
        if (this.f51972a != null) {
            this.f51976e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + e() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + u());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f51974c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f51976e = -2;
            this.f51972a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection c10 = c();
            this.f51980i = c10;
            c10.setRequestMethod(e());
            b(this.f51980i, str, str2);
            y(this.f51980i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f51976e);
            }
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + e() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + u(), e10);
            this.f51972a = e10;
            this.f51976e = -2;
        }
    }

    public final void F() {
        this.f51972a = null;
        this.f51976e = 0;
    }

    public void G(String str, String str2) {
        this.f51981j.put(str, str2);
    }

    public void a(TaskCompletionSource taskCompletionSource, Object obj) {
        Exception f10 = f();
        if (!v() || f10 != null) {
            taskCompletionSource.setException(m.e(f10, o()));
        } else {
            taskCompletionSource.setResult(obj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    public Exception f() {
        return this.f51972a;
    }

    /* access modifiers changed from: protected */
    public JSONObject g() {
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] h() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int i() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return k(this.f51973b.a());
    }

    /* access modifiers changed from: protected */
    public Map l() {
        return null;
    }

    public String m() {
        return this.f51977f;
    }

    public JSONObject n() {
        if (TextUtils.isEmpty(this.f51977f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f51977f);
        } catch (JSONException e10) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f51977f, e10);
            return new JSONObject();
        }
    }

    public int o() {
        return this.f51976e;
    }

    public Map p() {
        return this.f51975d;
    }

    public String q(String str) {
        List list;
        Map p10 = p();
        if (p10 == null || (list = (List) p10.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public int r() {
        return this.f51978g;
    }

    /* access modifiers changed from: protected */
    public h s() {
        return this.f51973b;
    }

    public InputStream t() {
        return this.f51979h;
    }

    public Uri u() {
        return this.f51973b.c();
    }

    public boolean v() {
        int i10 = this.f51976e;
        if (i10 < 200 || i10 >= 300) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void w(InputStream inputStream) {
        x(inputStream);
    }

    /* access modifiers changed from: protected */
    public void z(InputStream inputStream) {
        x(inputStream);
    }
}
