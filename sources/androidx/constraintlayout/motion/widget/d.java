package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import g1.j;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.HashMap;
import java.util.HashSet;
import k1.C2143d;

public class d extends c {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f14517g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f14518h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14519i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public float f14520j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public float f14521k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f14522l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public float f14523m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public float f14524n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public float f14525o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f14526p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public float f14527q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f14528r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f14529s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public float f14530t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public float f14531u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public float f14532v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public float f14533w = Float.NaN;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f14534a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14534a = sparseIntArray;
            sparseIntArray.append(h.f15482h4, 1);
            f14534a.append(h.f15596s4, 2);
            f14534a.append(h.f15556o4, 4);
            f14534a.append(h.f15566p4, 5);
            f14534a.append(h.f15576q4, 6);
            f14534a.append(h.f15493i4, 19);
            f14534a.append(h.f15504j4, 20);
            f14534a.append(h.f15536m4, 7);
            f14534a.append(h.f15656y4, 8);
            f14534a.append(h.f15646x4, 9);
            f14534a.append(h.f15636w4, 10);
            f14534a.append(h.f15616u4, 12);
            f14534a.append(h.f15606t4, 13);
            f14534a.append(h.f15546n4, 14);
            f14534a.append(h.f15515k4, 15);
            f14534a.append(h.f15526l4, 16);
            f14534a.append(h.f15586r4, 17);
            f14534a.append(h.f15626v4, 18);
        }

        public static void a(d dVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14534a.get(index)) {
                    case 1:
                        float unused = dVar.f14520j = typedArray.getFloat(index, dVar.f14520j);
                        break;
                    case 2:
                        float unused2 = dVar.f14521k = typedArray.getDimension(index, dVar.f14521k);
                        break;
                    case 4:
                        float unused3 = dVar.f14522l = typedArray.getFloat(index, dVar.f14522l);
                        break;
                    case 5:
                        float unused4 = dVar.f14523m = typedArray.getFloat(index, dVar.f14523m);
                        break;
                    case 6:
                        float unused5 = dVar.f14524n = typedArray.getFloat(index, dVar.f14524n);
                        break;
                    case 7:
                        float unused6 = dVar.f14528r = typedArray.getFloat(index, dVar.f14528r);
                        break;
                    case 8:
                        float unused7 = dVar.f14527q = typedArray.getFloat(index, dVar.f14527q);
                        break;
                    case 9:
                        String unused8 = dVar.f14517g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f14373w1) {
                            if (typedArray.peekValue(index).type != 3) {
                                dVar.f14513b = typedArray.getResourceId(index, dVar.f14513b);
                                break;
                            } else {
                                dVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, dVar.f14513b);
                            dVar.f14513b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                dVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        dVar.f14512a = typedArray.getInt(index, dVar.f14512a);
                        break;
                    case 13:
                        int unused9 = dVar.f14518h = typedArray.getInteger(index, dVar.f14518h);
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        float unused10 = dVar.f14529s = typedArray.getFloat(index, dVar.f14529s);
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        float unused11 = dVar.f14530t = typedArray.getDimension(index, dVar.f14530t);
                        break;
                    case 16:
                        float unused12 = dVar.f14531u = typedArray.getDimension(index, dVar.f14531u);
                        break;
                    case 17:
                        float unused13 = dVar.f14532v = typedArray.getDimension(index, dVar.f14532v);
                        break;
                    case 18:
                        float unused14 = dVar.f14533w = typedArray.getFloat(index, dVar.f14533w);
                        break;
                    case 19:
                        float unused15 = dVar.f14525o = typedArray.getDimension(index, dVar.f14525o);
                        break;
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        float unused16 = dVar.f14526p = typedArray.getDimension(index, dVar.f14526p);
                        break;
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14534a.get(index));
                        break;
                }
            }
        }
    }

    public d() {
        this.f14515d = 1;
        this.f14516e = new HashMap();
    }

    public void a(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            j jVar = (j) hashMap.get(str);
            if (jVar != null) {
                if (!str.startsWith("CUSTOM")) {
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
                            if (Float.isNaN(this.f14523m)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14523m);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f14524n)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14524n);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f14530t)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14530t);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f14531u)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14531u);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f14532v)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14532v);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f14533w)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14533w);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f14528r)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14528r);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f14529s)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14529s);
                                break;
                            }
                        case 8:
                            if (Float.isNaN(this.f14523m)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14525o);
                                break;
                            }
                        case 9:
                            if (Float.isNaN(this.f14524n)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14526p);
                                break;
                            }
                        case 10:
                            if (Float.isNaN(this.f14522l)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14522l);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f14521k)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14521k);
                                break;
                            }
                        case 12:
                            if (Float.isNaN(this.f14527q)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14527q);
                                break;
                            }
                        case 13:
                            if (Float.isNaN(this.f14520j)) {
                                break;
                            } else {
                                jVar.b(this.f14512a, this.f14520j);
                                break;
                            }
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f14516e.get(str.substring(7));
                    if (aVar != null) {
                        ((C2143d.b) jVar).h(this.f14512a, aVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public c clone() {
        return new d().c(this);
    }

    public c c(c cVar) {
        super.c(cVar);
        d dVar = (d) cVar;
        this.f14518h = dVar.f14518h;
        this.f14519i = dVar.f14519i;
        this.f14520j = dVar.f14520j;
        this.f14521k = dVar.f14521k;
        this.f14522l = dVar.f14522l;
        this.f14523m = dVar.f14523m;
        this.f14524n = dVar.f14524n;
        this.f14525o = dVar.f14525o;
        this.f14526p = dVar.f14526p;
        this.f14527q = dVar.f14527q;
        this.f14528r = dVar.f14528r;
        this.f14529s = dVar.f14529s;
        this.f14530t = dVar.f14530t;
        this.f14531u = dVar.f14531u;
        this.f14532v = dVar.f14532v;
        this.f14533w = dVar.f14533w;
        this.f14517g = dVar.f14517g;
        return this;
    }

    public void d(HashSet hashSet) {
        if (!Float.isNaN(this.f14520j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f14521k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f14522l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f14523m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f14524n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f14525o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f14526p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f14530t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f14531u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f14532v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f14527q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f14528r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f14529s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f14533w)) {
            hashSet.add(ReactProgressBarViewManager.PROP_PROGRESS);
        }
        if (this.f14516e.size() > 0) {
            for (String str : this.f14516e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.f15471g4));
    }

    public void g(HashMap hashMap) {
        if (this.f14518h != -1) {
            if (!Float.isNaN(this.f14520j)) {
                hashMap.put("alpha", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14521k)) {
                hashMap.put("elevation", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14522l)) {
                hashMap.put("rotation", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14523m)) {
                hashMap.put("rotationX", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14524n)) {
                hashMap.put("rotationY", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14525o)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14526p)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14530t)) {
                hashMap.put("translationX", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14531u)) {
                hashMap.put("translationY", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14532v)) {
                hashMap.put("translationZ", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14527q)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14528r)) {
                hashMap.put("scaleX", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14529s)) {
                hashMap.put("scaleY", Integer.valueOf(this.f14518h));
            }
            if (!Float.isNaN(this.f14533w)) {
                hashMap.put(ReactProgressBarViewManager.PROP_PROGRESS, Integer.valueOf(this.f14518h));
            }
            if (this.f14516e.size() > 0) {
                for (String str : this.f14516e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f14518h));
                }
            }
        }
    }
}
