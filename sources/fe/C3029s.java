package Fe;

import Fe.C3016e;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.s  reason: case insensitive filesystem */
abstract class C3029s {

    /* renamed from: a  reason: collision with root package name */
    protected JSONObject f31164a;

    /* renamed from: b  reason: collision with root package name */
    protected String f31165b;

    /* renamed from: c  reason: collision with root package name */
    protected String f31166c;

    /* renamed from: d  reason: collision with root package name */
    protected String f31167d;

    /* renamed from: e  reason: collision with root package name */
    protected String f31168e;

    /* renamed from: f  reason: collision with root package name */
    protected String f31169f;

    /* renamed from: g  reason: collision with root package name */
    protected int f31170g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected int f31171h = 0;

    /* renamed from: i  reason: collision with root package name */
    protected ArrayList f31172i;

    /* renamed from: j  reason: collision with root package name */
    protected C3016e f31173j = C3016e.X();

    /* renamed from: k  reason: collision with root package name */
    private boolean f31174k = true;

    /* renamed from: l  reason: collision with root package name */
    private final Context f31175l;

    protected C3029s(Context context) {
        this.f31175l = context.getApplicationContext();
    }

    public C3029s a(String str, Object obj) {
        try {
            if (this.f31164a == null) {
                this.f31164a = new JSONObject();
            }
            this.f31164a.put(str, obj);
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException" + e10.getMessage());
        }
        return this;
    }

    public C3029s b(List list) {
        if (this.f31172i == null) {
            this.f31172i = new ArrayList();
        }
        this.f31172i.addAll(list);
        return this;
    }

    /* access modifiers changed from: protected */
    public void c(C3016e.d dVar) {
        C3016e.d dVar2 = dVar;
        if (this.f31173j != null) {
            this.f31173j.K(new J(this.f31175l, this.f31169f, this.f31170g, this.f31171h, this.f31172i, this.f31165b, this.f31166c, this.f31167d, this.f31168e, this.f31164a, dVar, true, this.f31174k));
            return;
        }
        if (dVar2 != null) {
            dVar2.a((String) null, new C3020i("session has not been initialized", -101));
        }
        C3023l.m("Warning: User session has not been initialized");
    }

    /* access modifiers changed from: protected */
    public String d() {
        if (this.f31173j == null) {
            return null;
        }
        return this.f31173j.K(new J(this.f31175l, this.f31169f, this.f31170g, this.f31171h, this.f31172i, this.f31165b, this.f31166c, this.f31167d, this.f31168e, this.f31164a, (C3016e.d) null, false, this.f31174k));
    }
}
