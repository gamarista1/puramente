package x7;

import Sg.C5541d;
import Sg.p;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.I;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.jsonwebtoken.JwsHeader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import lf.C6514M;
import org.json.JSONObject;
import wf.t;

/* renamed from: x7.b  reason: case insensitive filesystem */
public final class C4176b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4176b f49492a = new C4176b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f49493b = "/.well-known/oauth/openid/keys/";

    private C4176b() {
    }

    public static final PublicKey b(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        byte[] decode = Base64.decode(p.D(p.D(p.D(str, "\n", "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0);
        C6496s.g(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        C6496s.g(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX INFO: finally extract failed */
    public static final String c(String str) {
        C6496s.h(str, JwsHeader.KEY_ID);
        URL url = new URL(Constants.SCHEME, "www." + I.u(), f49493b);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        N n10 = new N();
        I.t().execute(new C4175a(url, n10, str, reentrantLock, newCondition));
        reentrantLock.lock();
        try {
            newCondition.await(5000, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) n10.f71759a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static final void d(URL url, N n10, String str, ReentrantLock reentrantLock, Condition condition) {
        C6496s.h(url, "$openIdKeyUrl");
        C6496s.h(n10, "$result");
        C6496s.h(str, "$kid");
        C6496s.h(reentrantLock, "$lock");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        C6496s.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            C6496s.g(inputStream, "connection.inputStream");
            String d10 = t.d(new BufferedReader(new InputStreamReader(inputStream, C5541d.f65029b), 8192));
            httpURLConnection.getInputStream().close();
            n10.f71759a = new JSONObject(d10).optString(str);
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                C6514M m10 = C6514M.f71813a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Exception e10) {
            try {
                String name = f49492a.getClass().getName();
                String message = e10.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                condition.signal();
                C6514M m11 = C6514M.f71813a;
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                reentrantLock.lock();
                condition.signal();
                C6514M m12 = C6514M.f71813a;
                throw th3;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static final boolean e(PublicKey publicKey, String str, String str2) {
        C6496s.h(publicKey, "publicKey");
        C6496s.h(str, "data");
        C6496s.h(str2, "signature");
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            byte[] bytes = str.getBytes(C5541d.f65029b);
            C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            C6496s.g(decode, "decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
