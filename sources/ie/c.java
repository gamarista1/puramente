package Ie;

import Fe.B;
import Fe.C3016e;
import Fe.C3023l;
import Fe.I;
import Fe.M;
import Fe.Q;
import Fe.y;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f31877a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31878b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f31879c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f31880d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f31881e;

    /* renamed from: f  reason: collision with root package name */
    private final List f31882f;

    public interface b {
        void onFailure(Exception exc);
    }

    public c(a aVar) {
        this(aVar.b());
    }

    private c d(String str, Object obj) {
        if (obj != null) {
            try {
                this.f31880d.put(str, obj);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            this.f31880d.remove(str);
        }
        return this;
    }

    private c e(String str, Object obj) {
        if (!this.f31879c.containsKey(str)) {
            this.f31879c.put(str, obj);
        } else {
            this.f31879c.remove(str);
        }
        return this;
    }

    public c a(List list) {
        this.f31882f.addAll(list);
        return this;
    }

    public c b(Ce.a... aVarArr) {
        Collections.addAll(this.f31882f, aVarArr);
        return this;
    }

    public c c(String str, String str2) {
        try {
            this.f31881e.put(str, str2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public boolean f(Context context) {
        return g(context, (b) null);
    }

    public boolean g(Context context, b bVar) {
        B b10;
        if (this.f31878b) {
            b10 = B.TrackStandardEvent;
        } else {
            b10 = B.TrackCustomEvent;
        }
        B b11 = b10;
        if (C3016e.X() != null) {
            a aVar = new a(context, b11, this.f31877a, this.f31879c, this.f31880d, this.f31881e, this.f31882f, bVar);
            C3023l.l("Preparing V2 event, user agent is " + C3016e.f31053z);
            if (TextUtils.isEmpty(C3016e.f31053z)) {
                C3023l.l("User agent is empty, handleNewRequest adding process wait lock USER_AGENT_STRING_LOCK");
                aVar.d(I.b.USER_AGENT_STRING_LOCK);
            }
            C3016e.X().f31062i.k(aVar);
            return true;
        }
        if (bVar != null) {
            bVar.onFailure(new Exception("Failed logEvent server request: The Branch instance was not available"));
        }
        return false;
    }

    public c h(String str) {
        return d(y.Affiliation.b(), str);
    }

    public c i(String str) {
        return d(y.Coupon.b(), str);
    }

    public c j(e eVar) {
        return d(y.Currency.b(), eVar.toString());
    }

    public c k(String str) {
        return e(y.CustomerEventAlias.b(), str);
    }

    public c l(String str) {
        return d(y.Description.b(), str);
    }

    public c m(double d10) {
        return d(y.Revenue.b(), Double.valueOf(d10));
    }

    public c n(String str) {
        return d(y.SearchQuery.b(), str);
    }

    public c o(double d10) {
        return d(y.Shipping.b(), Double.valueOf(d10));
    }

    public c p(double d10) {
        return d(y.Tax.b(), Double.valueOf(d10));
    }

    public c q(String str) {
        return d(y.TransactionID.b(), str);
    }

    public c(String str) {
        this.f31879c = new HashMap();
        this.f31880d = new JSONObject();
        this.f31881e = new JSONObject();
        this.f31877a = str;
        a[] values = a.values();
        int length = values.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (str.equals(values[i10].b())) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        this.f31878b = z10;
        this.f31882f = new ArrayList();
    }

    class a extends M {
        a(Context context, B b10, String str, HashMap hashMap, JSONObject jSONObject, JSONObject jSONObject2, List list, b bVar) {
            super(context, b10, str, hashMap, jSONObject, jSONObject2, list);
        }

        public void q(int i10, String str) {
        }

        public void x(Q q10, C3016e eVar) {
        }
    }
}
