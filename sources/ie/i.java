package Ie;

import Fe.T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f32127a;

    /* renamed from: b  reason: collision with root package name */
    private String f32128b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f32129c;

    /* renamed from: d  reason: collision with root package name */
    private String f32130d;

    /* renamed from: e  reason: collision with root package name */
    private String f32131e;

    /* renamed from: f  reason: collision with root package name */
    private final String f32132f;

    /* renamed from: g  reason: collision with root package name */
    private final String f32133g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList f32134h;

    /* renamed from: i  reason: collision with root package name */
    private String f32135i;

    /* renamed from: j  reason: collision with root package name */
    private int f32136j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f32137k = -1;

    /* renamed from: l  reason: collision with root package name */
    final Context f32138l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f32139m;

    /* renamed from: n  reason: collision with root package name */
    private int f32140n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f32141o = 50;

    /* renamed from: p  reason: collision with root package name */
    private String f32142p = null;

    /* renamed from: q  reason: collision with root package name */
    private View f32143q = null;

    /* renamed from: r  reason: collision with root package name */
    private List f32144r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private List f32145s = new ArrayList();

    public i(Context context, String str, String str2) {
        this.f32138l = context;
        this.f32127a = null;
        this.f32128b = null;
        this.f32129c = null;
        this.f32130d = null;
        this.f32131e = null;
        this.f32134h = new ArrayList();
        this.f32135i = null;
        this.f32132f = str;
        this.f32133g = str2;
    }

    public i a(T t10) {
        this.f32134h.add(t10);
        return this;
    }

    public String b() {
        return this.f32130d;
    }

    public Drawable c() {
        return this.f32129c;
    }

    public String d() {
        return this.f32135i;
    }

    public int e() {
        return this.f32137k;
    }

    public int f() {
        return this.f32140n;
    }

    public List g() {
        return this.f32145s;
    }

    public int h() {
        return this.f32141o;
    }

    public List i() {
        return this.f32144r;
    }

    public boolean j() {
        return this.f32139m;
    }

    public String k() {
        return this.f32133g;
    }

    public String l() {
        return this.f32132f;
    }

    public Drawable m() {
        return this.f32127a;
    }

    public String n() {
        return this.f32128b;
    }

    public ArrayList o() {
        return this.f32134h;
    }

    public String p() {
        return this.f32142p;
    }

    public View q() {
        return this.f32143q;
    }

    public int r() {
        return this.f32136j;
    }

    public String s() {
        return this.f32131e;
    }

    public i t(Drawable drawable, String str, String str2) {
        this.f32129c = drawable;
        this.f32130d = str;
        this.f32131e = str2;
        return this;
    }

    public i u(Drawable drawable, String str) {
        this.f32127a = drawable;
        this.f32128b = str;
        return this;
    }
}
