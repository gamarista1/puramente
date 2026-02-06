package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.HashMap;
import java.util.HashSet;
import k1.C2145f;

public class i extends c {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f14572g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f14573h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public float f14574i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public float f14575j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public float f14576k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f14577l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public float f14578m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public float f14579n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public float f14580o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f14581p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public float f14582q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f14583r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f14584s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public float f14585t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f14586u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public String f14587v = null;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public float f14588w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public float f14589x = 0.0f;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f14590a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14590a = sparseIntArray;
            sparseIntArray.append(h.f15537m5, 1);
            f14590a.append(h.f15627v5, 2);
            f14590a.append(h.f15587r5, 4);
            f14590a.append(h.f15597s5, 5);
            f14590a.append(h.f15607t5, 6);
            f14590a.append(h.f15567p5, 7);
            f14590a.append(h.f15156B5, 8);
            f14590a.append(h.f15146A5, 9);
            f14590a.append(h.f15667z5, 10);
            f14590a.append(h.f15647x5, 12);
            f14590a.append(h.f15637w5, 13);
            f14590a.append(h.f15577q5, 14);
            f14590a.append(h.f15547n5, 15);
            f14590a.append(h.f15557o5, 16);
            f14590a.append(h.f15617u5, 17);
            f14590a.append(h.f15657y5, 18);
            f14590a.append(h.f15176D5, 20);
            f14590a.append(h.f15166C5, 21);
            f14590a.append(h.f15186E5, 19);
        }

        public static void a(i iVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14590a.get(index)) {
                    case 1:
                        float unused = iVar.f14574i = typedArray.getFloat(index, iVar.f14574i);
                        break;
                    case 2:
                        float unused2 = iVar.f14575j = typedArray.getDimension(index, iVar.f14575j);
                        break;
                    case 4:
                        float unused3 = iVar.f14576k = typedArray.getFloat(index, iVar.f14576k);
                        break;
                    case 5:
                        float unused4 = iVar.f14577l = typedArray.getFloat(index, iVar.f14577l);
                        break;
                    case 6:
                        float unused5 = iVar.f14578m = typedArray.getFloat(index, iVar.f14578m);
                        break;
                    case 7:
                        float unused6 = iVar.f14580o = typedArray.getFloat(index, iVar.f14580o);
                        break;
                    case 8:
                        float unused7 = iVar.f14579n = typedArray.getFloat(index, iVar.f14579n);
                        break;
                    case 9:
                        String unused8 = iVar.f14572g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f14373w1) {
                            if (typedArray.peekValue(index).type != 3) {
                                iVar.f14513b = typedArray.getResourceId(index, iVar.f14513b);
                                break;
                            } else {
                                iVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, iVar.f14513b);
                            iVar.f14513b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                iVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        iVar.f14512a = typedArray.getInt(index, iVar.f14512a);
                        break;
                    case 13:
                        int unused9 = iVar.f14573h = typedArray.getInteger(index, iVar.f14573h);
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        float unused10 = iVar.f14581p = typedArray.getFloat(index, iVar.f14581p);
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        float unused11 = iVar.f14582q = typedArray.getDimension(index, iVar.f14582q);
                        break;
                    case 16:
                        float unused12 = iVar.f14583r = typedArray.getDimension(index, iVar.f14583r);
                        break;
                    case 17:
                        float unused13 = iVar.f14584s = typedArray.getDimension(index, iVar.f14584s);
                        break;
                    case 18:
                        float unused14 = iVar.f14585t = typedArray.getFloat(index, iVar.f14585t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused15 = iVar.f14586u = typedArray.getInt(index, iVar.f14586u);
                            break;
                        } else {
                            String unused16 = iVar.f14587v = typedArray.getString(index);
                            int unused17 = iVar.f14586u = 7;
                            break;
                        }
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        float unused18 = iVar.f14588w = typedArray.getFloat(index, iVar.f14588w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused19 = iVar.f14589x = typedArray.getFloat(index, iVar.f14589x);
                            break;
                        } else {
                            float unused20 = iVar.f14589x = typedArray.getDimension(index, iVar.f14589x);
                            break;
                        }
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14590a.get(index));
                        break;
                }
            }
        }
    }

    public i() {
        this.f14515d = 3;
        this.f14516e = new HashMap();
    }

    public void Q(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            C2145f fVar = (C2145f) hashMap.get(str);
            if (fVar != null) {
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
                    }
                    switch (c10) {
                        case 0:
                            if (Float.isNaN(this.f14577l)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14577l, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f14578m)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14578m, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f14582q)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14582q, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f14583r)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14583r, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f14584s)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14584s, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f14585t)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14585t, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f14580o)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14580o, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f14581p)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14581p, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 8:
                            if (Float.isNaN(this.f14576k)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14576k, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 9:
                            if (Float.isNaN(this.f14575j)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14575j, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 10:
                            if (Float.isNaN(this.f14579n)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14579n, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f14574i)) {
                                break;
                            } else {
                                fVar.b(this.f14512a, this.f14574i, this.f14588w, this.f14586u, this.f14589x);
                                break;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f14516e.get(str.substring(7));
                    if (aVar != null) {
                        ((C2145f.b) fVar).j(this.f14512a, aVar, this.f14588w, this.f14586u, this.f14589x);
                    }
                }
            }
        }
    }

    public void a(HashMap hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public c clone() {
        return new i().c(this);
    }

    public c c(c cVar) {
        super.c(cVar);
        i iVar = (i) cVar;
        this.f14572g = iVar.f14572g;
        this.f14573h = iVar.f14573h;
        this.f14586u = iVar.f14586u;
        this.f14588w = iVar.f14588w;
        this.f14589x = iVar.f14589x;
        this.f14585t = iVar.f14585t;
        this.f14574i = iVar.f14574i;
        this.f14575j = iVar.f14575j;
        this.f14576k = iVar.f14576k;
        this.f14579n = iVar.f14579n;
        this.f14577l = iVar.f14577l;
        this.f14578m = iVar.f14578m;
        this.f14580o = iVar.f14580o;
        this.f14581p = iVar.f14581p;
        this.f14582q = iVar.f14582q;
        this.f14583r = iVar.f14583r;
        this.f14584s = iVar.f14584s;
        this.f14587v = iVar.f14587v;
        return this;
    }

    public void d(HashSet hashSet) {
        if (!Float.isNaN(this.f14574i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f14575j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f14576k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f14577l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f14578m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f14582q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f14583r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f14584s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f14579n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f14580o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f14581p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f14585t)) {
            hashSet.add(ReactProgressBarViewManager.PROP_PROGRESS);
        }
        if (this.f14516e.size() > 0) {
            for (String str : this.f14516e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.f15527l5));
    }

    public void g(HashMap hashMap) {
        if (this.f14573h != -1) {
            if (!Float.isNaN(this.f14574i)) {
                hashMap.put("alpha", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14575j)) {
                hashMap.put("elevation", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14576k)) {
                hashMap.put("rotation", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14577l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14578m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14582q)) {
                hashMap.put("translationX", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14583r)) {
                hashMap.put("translationY", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14584s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14579n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14580o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14580o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f14573h));
            }
            if (!Float.isNaN(this.f14585t)) {
                hashMap.put(ReactProgressBarViewManager.PROP_PROGRESS, Integer.valueOf(this.f14573h));
            }
            if (this.f14516e.size() > 0) {
                for (String str : this.f14516e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f14573h));
                }
            }
        }
    }
}
