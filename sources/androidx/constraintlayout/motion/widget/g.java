package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import g1.C2008c;
import java.util.HashMap;

public class g extends h {

    /* renamed from: h  reason: collision with root package name */
    String f14558h = null;

    /* renamed from: i  reason: collision with root package name */
    int f14559i = c.f14511f;

    /* renamed from: j  reason: collision with root package name */
    int f14560j = 0;

    /* renamed from: k  reason: collision with root package name */
    float f14561k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    float f14562l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    float f14563m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    float f14564n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    float f14565o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    float f14566p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    int f14567q = 0;

    /* renamed from: r  reason: collision with root package name */
    private float f14568r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f14569s = Float.NaN;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f14570a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14570a = sparseIntArray;
            sparseIntArray.append(h.f15439d5, 1);
            f14570a.append(h.f15417b5, 2);
            f14570a.append(h.f15516k5, 3);
            f14570a.append(h.f15395Z4, 4);
            f14570a.append(h.f15406a5, 5);
            f14570a.append(h.f15483h5, 6);
            f14570a.append(h.f15494i5, 7);
            f14570a.append(h.f15428c5, 9);
            f14570a.append(h.f15505j5, 8);
            f14570a.append(h.f15472g5, 11);
            f14570a.append(h.f15461f5, 12);
            f14570a.append(h.f15450e5, 10);
        }

        /* access modifiers changed from: private */
        public static void b(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14570a.get(index)) {
                    case 1:
                        if (!MotionLayout.f14373w1) {
                            if (typedArray.peekValue(index).type != 3) {
                                gVar.f14513b = typedArray.getResourceId(index, gVar.f14513b);
                                break;
                            } else {
                                gVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, gVar.f14513b);
                            gVar.f14513b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                gVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        gVar.f14512a = typedArray.getInt(index, gVar.f14512a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            gVar.f14558h = C2008c.f20889c[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            gVar.f14558h = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        gVar.f14571g = typedArray.getInteger(index, gVar.f14571g);
                        break;
                    case 5:
                        gVar.f14560j = typedArray.getInt(index, gVar.f14560j);
                        break;
                    case 6:
                        gVar.f14563m = typedArray.getFloat(index, gVar.f14563m);
                        break;
                    case 7:
                        gVar.f14564n = typedArray.getFloat(index, gVar.f14564n);
                        break;
                    case 8:
                        float f10 = typedArray.getFloat(index, gVar.f14562l);
                        gVar.f14561k = f10;
                        gVar.f14562l = f10;
                        break;
                    case 9:
                        gVar.f14567q = typedArray.getInt(index, gVar.f14567q);
                        break;
                    case 10:
                        gVar.f14559i = typedArray.getInt(index, gVar.f14559i);
                        break;
                    case 11:
                        gVar.f14561k = typedArray.getFloat(index, gVar.f14561k);
                        break;
                    case 12:
                        gVar.f14562l = typedArray.getFloat(index, gVar.f14562l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14570a.get(index));
                        break;
                }
            }
            if (gVar.f14512a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public g() {
        this.f14515d = 2;
    }

    public void a(HashMap hashMap) {
    }

    /* renamed from: b */
    public c clone() {
        return new g().c(this);
    }

    public c c(c cVar) {
        super.c(cVar);
        g gVar = (g) cVar;
        this.f14558h = gVar.f14558h;
        this.f14559i = gVar.f14559i;
        this.f14560j = gVar.f14560j;
        this.f14561k = gVar.f14561k;
        this.f14562l = Float.NaN;
        this.f14563m = gVar.f14563m;
        this.f14564n = gVar.f14564n;
        this.f14565o = gVar.f14565o;
        this.f14566p = gVar.f14566p;
        this.f14568r = gVar.f14568r;
        this.f14569s = gVar.f14569s;
        return this;
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, h.f15385Y4));
    }
}
