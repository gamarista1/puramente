package K6;

import android.content.Context;
import android.content.Intent;
import com.facebook.C3462y;
import com.facebook.S;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f32429a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f32430b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0530c f32431c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap f32432d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public L6.a f32433e;

    class a implements Consumer {
        a() {
        }

        /* renamed from: a */
        public void accept(S s10) {
            if (c.this.f32431c != null) {
                c.this.f32431c.a(s10);
            }
        }
    }

    class b implements Supplier {
        b() {
        }

        /* renamed from: a */
        public S get() {
            String uuid = UUID.randomUUID().toString();
            try {
                c.this.f32430b.put("requestID", uuid);
                Intent intent = new Intent();
                String string = c.this.f32430b.getString("type");
                c.this.f32433e.e(string, uuid, c.this.f32430b);
                if (!string.equals(L6.b.GET_ACCESS_TOKEN.toString()) && !string.equals(L6.b.IS_ENV_READY.toString())) {
                    String string2 = c.this.f32429a.getSharedPreferences("com.facebook.gamingservices.cloudgaming:preferences", 0).getString("daemonPackageName", (String) null);
                    if (string2 == null) {
                        return b.d(new C3462y(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection"), uuid);
                    }
                    intent.setPackage(string2);
                }
                intent.setAction("com.facebook.gamingservices.DAEMON_REQUEST");
                Iterator<String> keys = c.this.f32430b.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    intent.putExtra(next, c.this.f32430b.getString(next));
                }
                CompletableFuture completableFuture = new CompletableFuture();
                c.this.f32432d.put(uuid, completableFuture);
                c.this.f32429a.sendBroadcast(intent);
                c.this.f32433e.h(string, uuid, c.this.f32430b);
                return (S) completableFuture.get();
            } catch (InterruptedException | ExecutionException | JSONException unused) {
                return b.d(new C3462y(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), uuid);
            }
        }
    }

    /* renamed from: K6.c$c  reason: collision with other inner class name */
    public interface C0530c {
        void a(S s10);
    }

    c(Context context, JSONObject jSONObject, C0530c cVar) {
        this.f32429a = context;
        this.f32430b = jSONObject;
        this.f32431c = cVar;
        this.f32432d = b.g(context).h();
        this.f32433e = L6.a.b(context);
    }

    private CompletableFuture f() {
        return CompletableFuture.supplyAsync(new b());
    }

    private void g() {
        f().thenAccept(new a());
    }

    public static void h(Context context, JSONObject jSONObject, C0530c cVar, L6.b bVar) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject().put("type", bVar.toString());
            } catch (InterruptedException | ExecutionException | JSONException unused) {
                if (cVar != null) {
                    cVar.a(b.d(new C3462y(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), (String) null));
                    return;
                }
                return;
            }
        } else {
            jSONObject2 = jSONObject.put("type", bVar.toString());
        }
        new c(context, jSONObject2, cVar).g();
    }
}
