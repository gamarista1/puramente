package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import com.amazon.a.a.o.b.f;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import g1.C2008c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import k1.C2143d;

class k implements Comparable {

    /* renamed from: D  reason: collision with root package name */
    static String[] f14613D = {"position", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "pathRotate"};

    /* renamed from: A  reason: collision with root package name */
    private float f14614A = Float.NaN;

    /* renamed from: B  reason: collision with root package name */
    private float f14615B = Float.NaN;

    /* renamed from: C  reason: collision with root package name */
    private int f14616C = -1;

    /* renamed from: a  reason: collision with root package name */
    public float f14617a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    int f14618b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f14619c;

    /* renamed from: d  reason: collision with root package name */
    LinkedHashMap f14620d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    int f14621e = 0;

    /* renamed from: f  reason: collision with root package name */
    double[] f14622f = new double[18];

    /* renamed from: g  reason: collision with root package name */
    double[] f14623g = new double[18];

    /* renamed from: h  reason: collision with root package name */
    private float f14624h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14625i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f14626j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    private float f14627k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f14628l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f14629m = 1.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f14630n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f14631o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    private float f14632p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f14633q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f14634r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f14635s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    private C2008c f14636t;

    /* renamed from: u  reason: collision with root package name */
    private int f14637u = 0;

    /* renamed from: v  reason: collision with root package name */
    private float f14638v;

    /* renamed from: w  reason: collision with root package name */
    private float f14639w;

    /* renamed from: x  reason: collision with root package name */
    private float f14640x;

    /* renamed from: y  reason: collision with root package name */
    private float f14641y;

    /* renamed from: z  reason: collision with root package name */
    private float f14642z;

    k() {
    }

    private boolean f(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            if (Float.isNaN(f10) != Float.isNaN(f11)) {
                return true;
            }
            return false;
        } else if (Math.abs(f10 - f11) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public void a(HashMap hashMap, int i10) {
        for (String str : hashMap.keySet()) {
            C2143d dVar = (C2143d) hashMap.get(str);
            if (dVar != null) {
                str.hashCode();
                float f10 = 1.0f;
                float f11 = 0.0f;
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c10 = 13;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        if (!Float.isNaN(this.f14628l)) {
                            f11 = this.f14628l;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 1:
                        if (!Float.isNaN(this.f14617a)) {
                            f11 = this.f14617a;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 2:
                        if (!Float.isNaN(this.f14633q)) {
                            f11 = this.f14633q;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 3:
                        if (!Float.isNaN(this.f14634r)) {
                            f11 = this.f14634r;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 4:
                        if (!Float.isNaN(this.f14635s)) {
                            f11 = this.f14635s;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 5:
                        if (!Float.isNaN(this.f14615B)) {
                            f11 = this.f14615B;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 6:
                        if (!Float.isNaN(this.f14629m)) {
                            f10 = this.f14629m;
                        }
                        dVar.b(i10, f10);
                        break;
                    case 7:
                        if (!Float.isNaN(this.f14630n)) {
                            f10 = this.f14630n;
                        }
                        dVar.b(i10, f10);
                        break;
                    case 8:
                        if (!Float.isNaN(this.f14631o)) {
                            f11 = this.f14631o;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 9:
                        if (!Float.isNaN(this.f14632p)) {
                            f11 = this.f14632p;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 10:
                        if (!Float.isNaN(this.f14627k)) {
                            f11 = this.f14627k;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 11:
                        if (!Float.isNaN(this.f14626j)) {
                            f11 = this.f14626j;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 12:
                        if (!Float.isNaN(this.f14614A)) {
                            f11 = this.f14614A;
                        }
                        dVar.b(i10, f11);
                        break;
                    case 13:
                        if (!Float.isNaN(this.f14624h)) {
                            f10 = this.f14624h;
                        }
                        dVar.b(i10, f10);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                            break;
                        } else {
                            String str2 = str.split(f.f37529a)[1];
                            if (!this.f14620d.containsKey(str2)) {
                                break;
                            } else {
                                a aVar = (a) this.f14620d.get(str2);
                                if (!(dVar instanceof C2143d.b)) {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + aVar.e() + dVar);
                                    break;
                                } else {
                                    ((C2143d.b) dVar).h(i10, aVar);
                                    break;
                                }
                            }
                        }
                }
            }
        }
    }

    public void b(View view) {
        float f10;
        this.f14619c = view.getVisibility();
        if (view.getVisibility() != 0) {
            f10 = 0.0f;
        } else {
            f10 = view.getAlpha();
        }
        this.f14624h = f10;
        this.f14625i = false;
        this.f14626j = view.getElevation();
        this.f14627k = view.getRotation();
        this.f14628l = view.getRotationX();
        this.f14617a = view.getRotationY();
        this.f14629m = view.getScaleX();
        this.f14630n = view.getScaleY();
        this.f14631o = view.getPivotX();
        this.f14632p = view.getPivotY();
        this.f14633q = view.getTranslationX();
        this.f14634r = view.getTranslationY();
        this.f14635s = view.getTranslationZ();
    }

    public void c(d.a aVar) {
        float f10;
        d.C0278d dVar = aVar.f15002c;
        int i10 = dVar.f15107c;
        this.f14618b = i10;
        int i11 = dVar.f15106b;
        this.f14619c = i11;
        if (i11 == 0 || i10 != 0) {
            f10 = dVar.f15108d;
        } else {
            f10 = 0.0f;
        }
        this.f14624h = f10;
        d.e eVar = aVar.f15005f;
        this.f14625i = eVar.f15123m;
        this.f14626j = eVar.f15124n;
        this.f14627k = eVar.f15112b;
        this.f14628l = eVar.f15113c;
        this.f14617a = eVar.f15114d;
        this.f14629m = eVar.f15115e;
        this.f14630n = eVar.f15116f;
        this.f14631o = eVar.f15117g;
        this.f14632p = eVar.f15118h;
        this.f14633q = eVar.f15120j;
        this.f14634r = eVar.f15121k;
        this.f14635s = eVar.f15122l;
        this.f14636t = C2008c.c(aVar.f15003d.f15094d);
        d.c cVar = aVar.f15003d;
        this.f14614A = cVar.f15099i;
        this.f14637u = cVar.f15096f;
        this.f14616C = cVar.f15092b;
        this.f14615B = aVar.f15002c.f15109e;
        for (String str : aVar.f15006g.keySet()) {
            a aVar2 = (a) aVar.f15006g.get(str);
            if (aVar2.g()) {
                this.f14620d.put(str, aVar2);
            }
        }
    }

    /* renamed from: e */
    public int compareTo(k kVar) {
        return Float.compare(this.f14638v, kVar.f14638v);
    }

    /* access modifiers changed from: package-private */
    public void i(k kVar, HashSet hashSet) {
        if (f(this.f14624h, kVar.f14624h)) {
            hashSet.add("alpha");
        }
        if (f(this.f14626j, kVar.f14626j)) {
            hashSet.add("elevation");
        }
        int i10 = this.f14619c;
        int i11 = kVar.f14619c;
        if (i10 != i11 && this.f14618b == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add("alpha");
        }
        if (f(this.f14627k, kVar.f14627k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f14614A) || !Float.isNaN(kVar.f14614A)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f14615B) || !Float.isNaN(kVar.f14615B)) {
            hashSet.add(ReactProgressBarViewManager.PROP_PROGRESS);
        }
        if (f(this.f14628l, kVar.f14628l)) {
            hashSet.add("rotationX");
        }
        if (f(this.f14617a, kVar.f14617a)) {
            hashSet.add("rotationY");
        }
        if (f(this.f14631o, kVar.f14631o)) {
            hashSet.add("transformPivotX");
        }
        if (f(this.f14632p, kVar.f14632p)) {
            hashSet.add("transformPivotY");
        }
        if (f(this.f14629m, kVar.f14629m)) {
            hashSet.add("scaleX");
        }
        if (f(this.f14630n, kVar.f14630n)) {
            hashSet.add("scaleY");
        }
        if (f(this.f14633q, kVar.f14633q)) {
            hashSet.add("translationX");
        }
        if (f(this.f14634r, kVar.f14634r)) {
            hashSet.add("translationY");
        }
        if (f(this.f14635s, kVar.f14635s)) {
            hashSet.add("translationZ");
        }
    }

    /* access modifiers changed from: package-private */
    public void j(float f10, float f11, float f12, float f13) {
        this.f14639w = f10;
        this.f14640x = f11;
        this.f14641y = f12;
        this.f14642z = f13;
    }

    public void l(Rect rect, d dVar, int i10, int i11) {
        j((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        c(dVar.y(i11));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f14627k + 90.0f;
            this.f14627k = f10;
            if (f10 > 180.0f) {
                this.f14627k = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f14627k -= 90.0f;
    }

    public void m(View view) {
        j(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        b(view);
    }
}
