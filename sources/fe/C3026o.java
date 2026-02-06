package Fe;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.a.a.o.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.o  reason: case insensitive filesystem */
abstract class C3026o {

    /* renamed from: Fe.o$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3016e f31137b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f31138c;

        a(String str, C3016e eVar, Context context) {
            this.f31136a = str;
            this.f31137b = eVar;
            this.f31138c = context;
        }

        public void run() {
            try {
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.f31136a)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                bufferedReader.close();
                JSONObject jSONObject = new JSONObject(sb2.toString().trim());
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    C3026o.b(jSONObject, this.f31137b, this.f31138c);
                    return;
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e10) {
                C3023l.a(e10.getMessage());
            } catch (IOException e11) {
                C3023l.a(e11.getMessage());
            } catch (JSONException e12) {
                C3023l.a(e12.getMessage());
            }
        }
    }

    private static String a() {
        try {
            return (String) Class.forName(b.at).getMethod(b.au, new Class[]{String.class}).invoke((Object) null, new Object[]{"io.branch.preinstall.apps.path"});
        } catch (Exception unused) {
            return null;
        }
    }

    public static void b(JSONObject jSONObject, C3016e eVar, Context context) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (next.equals("apps") && (jSONObject.get(next) instanceof JSONObject) && jSONObject.getJSONObject(next).get(U.v(context)) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next).getJSONObject(U.v(context));
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        A a10 = A.campaign;
                        if (!next2.equals(a10.b()) || !TextUtils.isEmpty(E.G(context).D(a10.b()))) {
                            A a11 = A.partner;
                            if (!next2.equals(a11.b()) || !TextUtils.isEmpty(E.G(context).D(a11.b()))) {
                                eVar.V0(next2, jSONObject2.get(next2).toString());
                            } else {
                                eVar.U0(jSONObject2.get(next2).toString());
                            }
                        } else {
                            eVar.T0(jSONObject2.get(next2).toString());
                        }
                    }
                }
            } catch (JSONException e10) {
                C3023l.a(e10.getMessage());
            }
        }
    }

    public static void c(C3016e eVar, Context context) {
        if (eVar != null) {
            String a10 = a();
            if (!TextUtils.isEmpty(a10)) {
                d(a10, eVar, context);
            }
        }
    }

    private static void d(String str, C3016e eVar, Context context) {
        new Thread(new a(str, eVar, context)).start();
    }

    public static void e(Context context, HashMap hashMap) {
        C3016e X10 = C3016e.X();
        E G10 = E.G(context);
        if (TextUtils.isEmpty(G10.D(A.partner.b())) && TextUtils.isEmpty(G10.D(A.campaign.b()))) {
            y yVar = y.UTMCampaign;
            if (!TextUtils.isEmpty((CharSequence) hashMap.get(yVar.b()))) {
                X10.T0((String) hashMap.get(yVar.b()));
            }
            y yVar2 = y.UTMMedium;
            if (!TextUtils.isEmpty((CharSequence) hashMap.get(yVar2.b()))) {
                X10.U0((String) hashMap.get(yVar2.b()));
            }
        }
    }
}
