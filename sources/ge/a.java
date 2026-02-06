package Ge;

import Fe.B;
import Fe.C3016e;
import Fe.C3023l;
import Fe.C3027p;
import Fe.E;
import Fe.Q;
import Fe.y;
import Fe.z;
import Ie.g;
import android.content.Context;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f31638a = null;

    /* renamed from: b  reason: collision with root package name */
    private String f31639b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f31640c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f31641d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f31642e = null;

    /* renamed from: f  reason: collision with root package name */
    private b f31643f = null;

    /* renamed from: Ge.a$a  reason: collision with other inner class name */
    class C0518a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f31644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f31645b;

        C0518a(Map map, c cVar) {
            this.f31644a = map;
            this.f31645b = cVar;
        }

        public void a(Q q10) {
            try {
                byte[] decode = Base64.decode(q10.c().getString(y.QRCodeResponseString.b()), 0);
                C3027p.e().a(new JSONObject(this.f31644a), decode);
                this.f31645b.a(decode);
            } catch (JSONException e10) {
                e10.printStackTrace();
                this.f31645b.onFailure(e10);
            }
        }

        public void onFailure(Exception exc) {
            this.f31645b.onFailure(exc);
        }
    }

    public enum b {
        JPEG,
        PNG
    }

    public interface c {
        void a(byte[] bArr);

        void onFailure(Exception exc);
    }

    public interface d {
        void a(Q q10);

        void onFailure(Exception exc);
    }

    public void a(Context context, Ce.a aVar, g gVar, c cVar) {
        HashMap hashMap = new HashMap();
        if (this.f31638a != null) {
            hashMap.put(y.CodeColor.b(), this.f31638a);
        }
        if (this.f31639b != null) {
            hashMap.put(y.BackgroundColor.b(), this.f31639b);
        }
        if (this.f31641d != null) {
            hashMap.put(y.Width.b(), this.f31641d);
        }
        if (this.f31642e != null) {
            hashMap.put(y.Margin.b(), this.f31642e);
        }
        if (this.f31643f == b.JPEG) {
            hashMap.put(y.ImageFormat.b(), "JPEG");
        } else {
            hashMap.put(y.ImageFormat.b(), "PNG");
        }
        if (this.f31640c != null) {
            hashMap.put(y.CenterLogo.b(), this.f31640c);
        }
        HashMap hashMap2 = new HashMap();
        if (gVar.e() != null) {
            hashMap2.put(z.Channel.b(), gVar.e());
        }
        if (gVar.g() != null) {
            hashMap2.put(z.Feature.b(), gVar.g());
        }
        if (gVar.d() != null) {
            hashMap2.put(z.Campaign.b(), gVar.d());
        }
        if (gVar.j() != null) {
            hashMap2.put(z.Stage.b(), gVar.j());
        }
        if (gVar.k() != null) {
            hashMap2.put(z.Tags.b(), gVar.k());
        }
        hashMap2.put(y.QRCodeSettings.b(), hashMap);
        hashMap2.put(y.QRCodeData.b(), aVar.c());
        hashMap2.put(y.QRCodeBranchKey.b(), E.G(context).r());
        JSONObject jSONObject = new JSONObject(hashMap2);
        byte[] c10 = C3027p.e().c(jSONObject);
        if (c10 != null) {
            cVar.a(c10);
            return;
        }
        C3016e.X().f31062i.k(new b(B.QRCode, jSONObject, context, new C0518a(hashMap2, cVar)));
    }

    public a b(String str) {
        this.f31639b = str;
        return this;
    }

    public a c(String str) {
        this.f31640c = str;
        return this;
    }

    public a d(String str) {
        this.f31638a = str;
        return this;
    }

    public a e(b bVar) {
        this.f31643f = bVar;
        return this;
    }

    public a f(Integer num) {
        if (num.intValue() > 20) {
            C3023l.l("Margin was reduced to the maximum of 20.");
            this.f31642e = 20;
        } else if (num.intValue() < 1) {
            C3023l.l("Margin was increased to the minimum of 1.");
            this.f31642e = 1;
        } else {
            this.f31642e = num;
        }
        return this;
    }

    public a g(Integer num) {
        if (num.intValue() > 2000) {
            C3023l.l("Width was reduced to the maximum of 2000.");
            this.f31641d = 2000;
        } else if (num.intValue() < 300) {
            C3023l.l("Width was increased to the minimum of 300.");
            this.f31641d = 300;
        } else {
            this.f31641d = num;
        }
        return this;
    }
}
