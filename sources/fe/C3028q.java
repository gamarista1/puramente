package Fe;

import Fe.C3016e;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: Fe.q  reason: case insensitive filesystem */
public class C3028q {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f31143a;

    /* renamed from: b  reason: collision with root package name */
    private String f31144b;

    /* renamed from: c  reason: collision with root package name */
    private String f31145c;

    /* renamed from: d  reason: collision with root package name */
    private C3016e.C0512e f31146d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f31147e;

    /* renamed from: f  reason: collision with root package name */
    private String f31148f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f31149g;

    /* renamed from: h  reason: collision with root package name */
    private String f31150h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f31151i;

    /* renamed from: j  reason: collision with root package name */
    private String f31152j;

    /* renamed from: k  reason: collision with root package name */
    private String f31153k;

    /* renamed from: l  reason: collision with root package name */
    private int f31154l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f31155m;

    /* renamed from: n  reason: collision with root package name */
    private int f31156n;

    /* renamed from: o  reason: collision with root package name */
    private int f31157o;

    /* renamed from: p  reason: collision with root package name */
    private String f31158p;

    /* renamed from: q  reason: collision with root package name */
    private View f31159q;

    /* renamed from: r  reason: collision with root package name */
    private int f31160r;

    /* renamed from: s  reason: collision with root package name */
    private r f31161s;

    /* renamed from: t  reason: collision with root package name */
    private List f31162t;

    /* renamed from: u  reason: collision with root package name */
    private List f31163u;

    public C3028q(Activity activity, JSONObject jSONObject) {
        this.f31157o = -1;
        this.f31158p = null;
        this.f31159q = null;
        this.f31160r = 50;
        this.f31162t = new ArrayList();
        this.f31163u = new ArrayList();
        this.f31143a = activity;
        this.f31161s = new r(activity);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f31161s.a(next, jSONObject.get(next));
            }
        } catch (Exception e10) {
            C3023l.a(e10.getMessage());
        }
        this.f31144b = "";
        this.f31146d = null;
        this.f31147e = new ArrayList();
        this.f31148f = null;
        this.f31149g = C3031u.f(activity.getApplicationContext(), 17301573);
        this.f31150h = "More...";
        this.f31151i = C3031u.f(activity.getApplicationContext(), 17301582);
        this.f31152j = "Copy link";
        this.f31153k = "Copied link to clipboard!";
        if (C3016e.X().T().i()) {
            b("com.google.android.tv.frameworkpackagestubs");
        }
    }

    public C3028q A(boolean z10) {
        this.f31155m = z10;
        return this;
    }

    public C3028q B(C3016e.C0512e eVar) {
        this.f31146d = eVar;
        return this;
    }

    public C3028q D(Drawable drawable, String str, String str2) {
        this.f31151i = drawable;
        this.f31152j = str;
        this.f31153k = str2;
        return this;
    }

    public C3028q E(String str) {
        this.f31148f = str;
        return this;
    }

    public C3028q F(int i10) {
        this.f31156n = i10;
        return this;
    }

    public C3028q G(int i10) {
        this.f31157o = i10;
        return this;
    }

    public C3028q H(int i10) {
        this.f31160r = i10;
        return this;
    }

    public C3028q I(String str) {
        this.f31144b = str;
        return this;
    }

    public C3028q J(Drawable drawable, String str) {
        this.f31149g = drawable;
        this.f31150h = str;
        return this;
    }

    public C3028q K(View view) {
        this.f31159q = view;
        return this;
    }

    public C3028q L(String str) {
        this.f31158p = str;
        return this;
    }

    public void M(int i10) {
        this.f31154l = i10;
    }

    public C3028q N(String str) {
        this.f31145c = str;
        return this;
    }

    public void O() {
        C3016e.X().X0(this);
    }

    public C3028q a(ArrayList arrayList) {
        this.f31147e.addAll(arrayList);
        return this;
    }

    public C3028q b(String str) {
        this.f31163u.add(str);
        return this;
    }

    public C3028q c(List list) {
        this.f31163u.addAll(list);
        return this;
    }

    public Activity d() {
        return this.f31143a;
    }

    public C3016e.C0512e e() {
        return this.f31146d;
    }

    public C3016e.j f() {
        return null;
    }

    public String g() {
        return this.f31152j;
    }

    public Drawable h() {
        return this.f31151i;
    }

    public String i() {
        return this.f31148f;
    }

    public int j() {
        return this.f31156n;
    }

    public int k() {
        return this.f31157o;
    }

    /* access modifiers changed from: package-private */
    public List l() {
        return this.f31163u;
    }

    public int m() {
        return this.f31160r;
    }

    /* access modifiers changed from: package-private */
    public List n() {
        return this.f31162t;
    }

    public boolean o() {
        return this.f31155m;
    }

    public Drawable p() {
        return this.f31149g;
    }

    public String q() {
        return this.f31150h;
    }

    public ArrayList r() {
        return this.f31147e;
    }

    public String s() {
        return this.f31144b;
    }

    public String t() {
        return this.f31145c;
    }

    public String u() {
        return this.f31158p;
    }

    public View v() {
        return this.f31159q;
    }

    public r w() {
        return this.f31161s;
    }

    public int x() {
        return this.f31154l;
    }

    public String y() {
        return this.f31153k;
    }

    public C3028q z(List list) {
        this.f31162t.addAll(list);
        return this;
    }

    public C3028q(Activity activity, r rVar) {
        this(activity, new JSONObject());
        this.f31161s = rVar;
    }

    public C3028q C(C3016e.j jVar) {
        return this;
    }
}
