package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.h;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import g1.j;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.HashMap;
import java.util.HashSet;
import k1.C2142c;

public class e extends c {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f14535g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f14536h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f14537i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f14538j = null;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public float f14539k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f14540l = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public float f14541m = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public float f14542n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f14543o = -1;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f14544p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public float f14545q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f14546r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f14547s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public float f14548t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public float f14549u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public float f14550v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public float f14551w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public float f14552x = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public float f14553y = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public float f14554z = Float.NaN;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f14555a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14555a = sparseIntArray;
            sparseIntArray.append(h.f15275N4, 1);
            f14555a.append(h.f15255L4, 2);
            f14555a.append(h.f15285O4, 3);
            f14555a.append(h.f15245K4, 4);
            f14555a.append(h.f15335T4, 5);
            f14555a.append(h.f15315R4, 6);
            f14555a.append(h.f15305Q4, 7);
            f14555a.append(h.f15345U4, 8);
            f14555a.append(h.f15145A4, 9);
            f14555a.append(h.f15235J4, 10);
            f14555a.append(h.f15195F4, 11);
            f14555a.append(h.f15205G4, 12);
            f14555a.append(h.f15215H4, 13);
            f14555a.append(h.f15295P4, 14);
            f14555a.append(h.f15175D4, 15);
            f14555a.append(h.f15185E4, 16);
            f14555a.append(h.f15155B4, 17);
            f14555a.append(h.f15165C4, 18);
            f14555a.append(h.f15225I4, 19);
            f14555a.append(h.f15265M4, 20);
            f14555a.append(h.f15325S4, 21);
        }

        /* access modifiers changed from: private */
        public static void b(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14555a.get(index)) {
                    case 1:
                        if (!MotionLayout.f14373w1) {
                            if (typedArray.peekValue(index).type != 3) {
                                eVar.f14513b = typedArray.getResourceId(index, eVar.f14513b);
                                break;
                            } else {
                                eVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, eVar.f14513b);
                            eVar.f14513b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                eVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        eVar.f14512a = typedArray.getInt(index, eVar.f14512a);
                        break;
                    case 3:
                        String unused = eVar.f14535g = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = eVar.f14536h = typedArray.getInteger(index, eVar.f14536h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused3 = eVar.f14537i = typedArray.getInt(index, eVar.f14537i);
                            break;
                        } else {
                            String unused4 = eVar.f14538j = typedArray.getString(index);
                            int unused5 = eVar.f14537i = 7;
                            break;
                        }
                    case 6:
                        float unused6 = eVar.f14539k = typedArray.getFloat(index, eVar.f14539k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused7 = eVar.f14540l = typedArray.getFloat(index, eVar.f14540l);
                            break;
                        } else {
                            float unused8 = eVar.f14540l = typedArray.getDimension(index, eVar.f14540l);
                            break;
                        }
                    case 8:
                        int unused9 = eVar.f14543o = typedArray.getInt(index, eVar.f14543o);
                        break;
                    case 9:
                        float unused10 = eVar.f14544p = typedArray.getFloat(index, eVar.f14544p);
                        break;
                    case 10:
                        float unused11 = eVar.f14545q = typedArray.getDimension(index, eVar.f14545q);
                        break;
                    case 11:
                        float unused12 = eVar.f14546r = typedArray.getFloat(index, eVar.f14546r);
                        break;
                    case 12:
                        float unused13 = eVar.f14548t = typedArray.getFloat(index, eVar.f14548t);
                        break;
                    case 13:
                        float unused14 = eVar.f14549u = typedArray.getFloat(index, eVar.f14549u);
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        float unused15 = eVar.f14547s = typedArray.getFloat(index, eVar.f14547s);
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        float unused16 = eVar.f14550v = typedArray.getFloat(index, eVar.f14550v);
                        break;
                    case 16:
                        float unused17 = eVar.f14551w = typedArray.getFloat(index, eVar.f14551w);
                        break;
                    case 17:
                        float unused18 = eVar.f14552x = typedArray.getDimension(index, eVar.f14552x);
                        break;
                    case 18:
                        float unused19 = eVar.f14553y = typedArray.getDimension(index, eVar.f14553y);
                        break;
                    case 19:
                        float unused20 = eVar.f14554z = typedArray.getDimension(index, eVar.f14554z);
                        break;
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        float unused21 = eVar.f14542n = typedArray.getFloat(index, eVar.f14542n);
                        break;
                    case 21:
                        float unused22 = eVar.f14541m = typedArray.getFloat(index, eVar.f14541m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14555a.get(index));
                        break;
                }
            }
        }
    }

    public e() {
        this.f14515d = 4;
        this.f14516e = new HashMap();
    }

    public void U(HashMap hashMap) {
        C2142c cVar;
        C2142c cVar2;
        HashMap hashMap2 = hashMap;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f14516e.get(str.substring(7));
                if (!(aVar == null || aVar.d() != a.C0276a.FLOAT_TYPE || (cVar2 = (C2142c) hashMap2.get(str)) == null)) {
                    cVar2.d(this.f14512a, this.f14537i, this.f14538j, this.f14543o, this.f14539k, this.f14540l, this.f14541m, aVar.e(), aVar);
                }
            } else {
                float V10 = V(str);
                if (!Float.isNaN(V10) && (cVar = (C2142c) hashMap2.get(str)) != null) {
                    cVar.c(this.f14512a, this.f14537i, this.f14538j, this.f14543o, this.f14539k, this.f14540l, this.f14541m, V10);
                }
            }
        }
    }

    public float V(String str) {
        str.hashCode();
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
            case -40300674:
                if (str.equals("rotation")) {
                    c10 = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c10 = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.f14548t;
            case 1:
                return this.f14549u;
            case 2:
                return this.f14552x;
            case 3:
                return this.f14553y;
            case 4:
                return this.f14554z;
            case 5:
                return this.f14542n;
            case 6:
                return this.f14550v;
            case 7:
                return this.f14551w;
            case 8:
                return this.f14546r;
            case 9:
                return this.f14545q;
            case 10:
                return this.f14547s;
            case 11:
                return this.f14544p;
            case 12:
                return this.f14540l;
            case 13:
                return this.f14541m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    public void a(HashMap hashMap) {
        a.g("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            j jVar = (j) hashMap.get(str);
            if (jVar != null) {
                str.hashCode();
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
                    case -40300674:
                        if (str.equals("rotation")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c10 = 13;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        jVar.b(this.f14512a, this.f14548t);
                        break;
                    case 1:
                        jVar.b(this.f14512a, this.f14549u);
                        break;
                    case 2:
                        jVar.b(this.f14512a, this.f14552x);
                        break;
                    case 3:
                        jVar.b(this.f14512a, this.f14553y);
                        break;
                    case 4:
                        jVar.b(this.f14512a, this.f14554z);
                        break;
                    case 5:
                        jVar.b(this.f14512a, this.f14542n);
                        break;
                    case 6:
                        jVar.b(this.f14512a, this.f14550v);
                        break;
                    case 7:
                        jVar.b(this.f14512a, this.f14551w);
                        break;
                    case 8:
                        jVar.b(this.f14512a, this.f14546r);
                        break;
                    case 9:
                        jVar.b(this.f14512a, this.f14545q);
                        break;
                    case 10:
                        jVar.b(this.f14512a, this.f14547s);
                        break;
                    case 11:
                        jVar.b(this.f14512a, this.f14544p);
                        break;
                    case 12:
                        jVar.b(this.f14512a, this.f14540l);
                        break;
                    case 13:
                        jVar.b(this.f14512a, this.f14541m);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: b */
    public c clone() {
        return new e().c(this);
    }

    public c c(c cVar) {
        super.c(cVar);
        e eVar = (e) cVar;
        this.f14535g = eVar.f14535g;
        this.f14536h = eVar.f14536h;
        this.f14537i = eVar.f14537i;
        this.f14538j = eVar.f14538j;
        this.f14539k = eVar.f14539k;
        this.f14540l = eVar.f14540l;
        this.f14541m = eVar.f14541m;
        this.f14542n = eVar.f14542n;
        this.f14543o = eVar.f14543o;
        this.f14544p = eVar.f14544p;
        this.f14545q = eVar.f14545q;
        this.f14546r = eVar.f14546r;
        this.f14547s = eVar.f14547s;
        this.f14548t = eVar.f14548t;
        this.f14549u = eVar.f14549u;
        this.f14550v = eVar.f14550v;
        this.f14551w = eVar.f14551w;
        this.f14552x = eVar.f14552x;
        this.f14553y = eVar.f14553y;
        this.f14554z = eVar.f14554z;
        return this;
    }

    public void d(HashSet hashSet) {
        if (!Float.isNaN(this.f14544p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f14545q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f14546r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f14548t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f14549u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f14550v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f14551w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f14547s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f14552x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f14553y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f14554z)) {
            hashSet.add("translationZ");
        }
        if (this.f14516e.size() > 0) {
            for (String str : this.f14516e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, h.f15666z4));
    }
}
