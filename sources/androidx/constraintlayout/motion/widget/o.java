package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.j;
import g1.C2008c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f14702a;

    /* renamed from: b  reason: collision with root package name */
    j f14703b = null;

    /* renamed from: c  reason: collision with root package name */
    b f14704c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14705d = false;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f14706e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private b f14707f = null;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f14708g = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public SparseArray f14709h = new SparseArray();

    /* renamed from: i  reason: collision with root package name */
    private HashMap f14710i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private SparseIntArray f14711j = new SparseIntArray();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f14712k = 400;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f14713l = 0;

    /* renamed from: m  reason: collision with root package name */
    private MotionEvent f14714m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14715n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14716o = false;

    /* renamed from: p  reason: collision with root package name */
    private MotionLayout.f f14717p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f14718q;

    /* renamed from: r  reason: collision with root package name */
    final s f14719r;

    /* renamed from: s  reason: collision with root package name */
    float f14720s;

    /* renamed from: t  reason: collision with root package name */
    float f14721t;

    class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2008c f14722a;

        a(C2008c cVar) {
            this.f14722a = cVar;
        }

        public float getInterpolation(float f10) {
            return (float) this.f14722a.a((double) f10);
        }
    }

    o(Context context, MotionLayout motionLayout, int i10) {
        this.f14702a = motionLayout;
        this.f14719r = new s(motionLayout);
        J(context, i10);
        this.f14709h.put(g.f15138a, new d());
        this.f14710i.put("motion_base", Integer.valueOf(g.f15138a));
    }

    private boolean H(int i10) {
        int i11 = this.f14711j.get(i10);
        int size = this.f14711j.size();
        while (i11 > 0) {
            if (i11 == i10) {
                return true;
            }
            int i12 = size - 1;
            if (size < 0) {
                return true;
            }
            i11 = this.f14711j.get(i11);
            size = i12;
        }
        return false;
    }

    private boolean I() {
        if (this.f14717p != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void J(android.content.Context r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "MotionScene"
            android.content.res.Resources r2 = r10.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r11)
            int r3 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r4 = 0
        L_0x0011:
            r5 = 1
            if (r3 == r5) goto L_0x0180
            r6 = 2
            if (r3 == r6) goto L_0x0019
            goto L_0x0155
        L_0x0019:
            java.lang.String r3 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            int r7 = r3.hashCode()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r8 = -1
            switch(r7) {
                case -1349929691: goto L_0x0087;
                case -1239391468: goto L_0x007c;
                case -687739768: goto L_0x0072;
                case 61998586: goto L_0x0067;
                case 269306229: goto L_0x005e;
                case 312750793: goto L_0x0054;
                case 327855227: goto L_0x004a;
                case 793277014: goto L_0x0042;
                case 1382829617: goto L_0x0038;
                case 1942574248: goto L_0x0027;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
        L_0x0025:
            goto L_0x0091
        L_0x0027:
            java.lang.String r5 = "include"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 6
            goto L_0x0092
        L_0x0032:
            r10 = move-exception
            goto L_0x015b
        L_0x0035:
            r10 = move-exception
            goto L_0x016e
        L_0x0038:
            java.lang.String r5 = "StateSet"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 4
            goto L_0x0092
        L_0x0042:
            boolean r3 = r3.equals(r1)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 0
            goto L_0x0092
        L_0x004a:
            java.lang.String r5 = "OnSwipe"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = r6
            goto L_0x0092
        L_0x0054:
            java.lang.String r5 = "OnClick"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 3
            goto L_0x0092
        L_0x005e:
            java.lang.String r6 = "Transition"
            boolean r3 = r3.equals(r6)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0067:
            java.lang.String r5 = "ViewTransition"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 9
            goto L_0x0092
        L_0x0072:
            java.lang.String r5 = "Include"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 7
            goto L_0x0092
        L_0x007c:
            java.lang.String r5 = "KeyFrameSet"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 8
            goto L_0x0092
        L_0x0087:
            java.lang.String r5 = "ConstraintSet"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0091
            r5 = 5
            goto L_0x0092
        L_0x0091:
            r5 = r8
        L_0x0092:
            switch(r5) {
                case 0: goto L_0x0152;
                case 1: goto L_0x0111;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00b8;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00a3;
                case 9: goto L_0x0097;
                default: goto L_0x0095;
            }     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
        L_0x0095:
            goto L_0x0155
        L_0x0097:
            androidx.constraintlayout.motion.widget.r r3 = new androidx.constraintlayout.motion.widget.r     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.<init>(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.s r5 = r9.f14719r     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r5.a(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x00a3:
            androidx.constraintlayout.motion.widget.f r3 = new androidx.constraintlayout.motion.widget.f     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.<init>(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r4 == 0) goto L_0x0155
            java.util.ArrayList r5 = r4.f14734k     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r5.add(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x00b3:
            r9.M(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x00b8:
            r9.K(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x00bd:
            androidx.constraintlayout.widget.j r3 = new androidx.constraintlayout.widget.j     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.<init>(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r9.f14703b = r3     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x00c6:
            if (r4 == 0) goto L_0x0155
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r9.f14702a     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            boolean r3 = r3.isInEditMode()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 != 0) goto L_0x0155
            r4.u(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x00d5:
            if (r4 != 0) goto L_0x0104
            android.content.res.Resources r3 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            java.lang.String r3 = r3.getResourceEntryName(r11)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            int r5 = r2.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            java.lang.String r7 = " OnSwipe ("
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r6.append(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            java.lang.String r3 = ".xml:"
            r6.append(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            java.lang.String r3 = ")"
            r6.append(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            java.lang.String r3 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            android.util.Log.v(r1, r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
        L_0x0104:
            if (r4 == 0) goto L_0x0155
            androidx.constraintlayout.motion.widget.p r3 = new androidx.constraintlayout.motion.widget.p     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r9.f14702a     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.<init>(r10, r5, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.p unused = r4.f14735l = r3     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x0111:
            java.util.ArrayList r3 = r9.f14706e     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.o$b r4 = new androidx.constraintlayout.motion.widget.o$b     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r4.<init>(r9, r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.add(r4)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.o$b r3 = r9.f14704c     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 != 0) goto L_0x0138
            boolean r3 = r4.f14725b     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 != 0) goto L_0x0138
            r9.f14704c = r4     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.p r3 = r4.f14735l     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0138
            androidx.constraintlayout.motion.widget.o$b r3 = r9.f14704c     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            androidx.constraintlayout.motion.widget.p r3 = r3.f14735l     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            boolean r5 = r9.f14718q     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.x(r5)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
        L_0x0138:
            boolean r3 = r4.f14725b     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 == 0) goto L_0x0155
            int r3 = r4.f14726c     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            if (r3 != r8) goto L_0x0147
            r9.f14707f = r4     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x014c
        L_0x0147:
            java.util.ArrayList r3 = r9.f14708g     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.add(r4)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
        L_0x014c:
            java.util.ArrayList r3 = r9.f14706e     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            r3.remove(r4)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0155
        L_0x0152:
            r9.N(r10, r2)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
        L_0x0155:
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x0032 }
            goto L_0x0011
        L_0x015b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.e(r1, r11, r10)
            goto L_0x0180
        L_0x016e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.e(r1, r11, r10)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.o.J(android.content.Context, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int K(android.content.Context r18, org.xmlpull.v1.XmlPullParser r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            androidx.constraintlayout.widget.d r7 = new androidx.constraintlayout.widget.d
            r7.<init>()
            r8 = 0
            r7.Q(r8)
            int r9 = r19.getAttributeCount()
            r11 = r8
            r12 = -1
            r13 = -1
        L_0x001a:
            if (r11 >= r9) goto L_0x00e2
            java.lang.String r14 = r2.getAttributeName(r11)
            java.lang.String r15 = r2.getAttributeValue(r11)
            r14.hashCode()
            int r16 = r14.hashCode()
            switch(r16) {
                case -1496482599: goto L_0x0051;
                case -1153153640: goto L_0x0046;
                case 3355: goto L_0x003b;
                case 973381616: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r10 = -1
            goto L_0x005b
        L_0x0030:
            java.lang.String r10 = "stateLabels"
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0039
            goto L_0x002e
        L_0x0039:
            r10 = r4
            goto L_0x005b
        L_0x003b:
            java.lang.String r10 = "id"
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0044
            goto L_0x002e
        L_0x0044:
            r10 = r5
            goto L_0x005b
        L_0x0046:
            java.lang.String r10 = "constraintRotate"
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x004f
            goto L_0x002e
        L_0x004f:
            r10 = r6
            goto L_0x005b
        L_0x0051:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x005a
            goto L_0x002e
        L_0x005a:
            r10 = r8
        L_0x005b:
            switch(r10) {
                case 0: goto L_0x00db;
                case 1: goto L_0x007e;
                case 2: goto L_0x0065;
                case 3: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x00df
        L_0x0060:
            r7.R(r15)
            goto L_0x00df
        L_0x0065:
            int r12 = r0.q(r1, r15)
            java.util.HashMap r10 = r0.f14710i
            java.lang.String r14 = Z(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r10.put(r14, r15)
            java.lang.String r10 = androidx.constraintlayout.motion.widget.a.c(r1, r12)
            r7.f14993b = r10
            goto L_0x00df
        L_0x007e:
            int r10 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x0086 }
            r7.f14996e = r10     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x00df
        L_0x0086:
            r15.hashCode()
            int r10 = r15.hashCode()
            switch(r10) {
                case -768416914: goto L_0x00be;
                case 3317767: goto L_0x00b3;
                case 3387192: goto L_0x00a8;
                case 108511772: goto L_0x009d;
                case 1954540437: goto L_0x0092;
                default: goto L_0x0090;
            }
        L_0x0090:
            r10 = -1
            goto L_0x00c8
        L_0x0092:
            java.lang.String r10 = "x_right"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x009b
            goto L_0x0090
        L_0x009b:
            r10 = r3
            goto L_0x00c8
        L_0x009d:
            java.lang.String r10 = "right"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x00a6
            goto L_0x0090
        L_0x00a6:
            r10 = r4
            goto L_0x00c8
        L_0x00a8:
            java.lang.String r10 = "none"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x00b1
            goto L_0x0090
        L_0x00b1:
            r10 = r5
            goto L_0x00c8
        L_0x00b3:
            java.lang.String r10 = "left"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x00bc
            goto L_0x0090
        L_0x00bc:
            r10 = r6
            goto L_0x00c8
        L_0x00be:
            java.lang.String r10 = "x_left"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x00c7
            goto L_0x0090
        L_0x00c7:
            r10 = r8
        L_0x00c8:
            switch(r10) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00cc;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            goto L_0x00df
        L_0x00cc:
            r7.f14996e = r4
            goto L_0x00df
        L_0x00cf:
            r7.f14996e = r6
            goto L_0x00df
        L_0x00d2:
            r7.f14996e = r8
            goto L_0x00df
        L_0x00d5:
            r7.f14996e = r5
            goto L_0x00df
        L_0x00d8:
            r7.f14996e = r3
            goto L_0x00df
        L_0x00db:
            int r13 = r0.q(r1, r15)
        L_0x00df:
            int r11 = r11 + r6
            goto L_0x001a
        L_0x00e2:
            r10 = -1
            if (r12 == r10) goto L_0x00fd
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14702a
            int r3 = r3.f14440s0
            if (r3 == 0) goto L_0x00ee
            r7.S(r6)
        L_0x00ee:
            r7.D(r1, r2)
            if (r13 == r10) goto L_0x00f8
            android.util.SparseIntArray r1 = r0.f14711j
            r1.put(r12, r13)
        L_0x00f8:
            android.util.SparseArray r1 = r0.f14709h
            r1.put(r12, r7)
        L_0x00fd:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.o.K(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: private */
    public int L(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return K(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
            return -1;
        } catch (IOException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
            return -1;
        }
    }

    private void M(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15509j9);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == h.f15520k9) {
                L(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15168C7);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == h.f15178D7) {
                int i11 = obtainStyledAttributes.getInt(index, this.f14712k);
                this.f14712k = i11;
                if (i11 < 8) {
                    this.f14712k = 8;
                }
            } else if (index == h.f15188E7) {
                this.f14713l = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void R(int i10, MotionLayout motionLayout) {
        d dVar = (d) this.f14709h.get(i10);
        dVar.f14994c = dVar.f14993b;
        int i11 = this.f14711j.get(i10);
        if (i11 > 0) {
            R(i11, motionLayout);
            d dVar2 = (d) this.f14709h.get(i11);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + a.c(this.f14702a.getContext(), i11));
                return;
            }
            dVar.f14994c += "/" + dVar2.f14994c;
            dVar.L(dVar2);
        } else {
            dVar.f14994c += "  layout";
            dVar.K(motionLayout);
        }
        dVar.h(dVar);
    }

    public static String Z(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    private int q(Context context, String str) {
        int i10;
        if (str.contains("/")) {
            i10 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            return i10;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i10;
    }

    private int x(int i10) {
        int c10;
        j jVar = this.f14703b;
        if (jVar == null || (c10 = jVar.c(i10, -1, -1)) == -1) {
            return i10;
        }
        return c10;
    }

    /* access modifiers changed from: package-private */
    public float A() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.m();
    }

    /* access modifiers changed from: package-private */
    public float B() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.n();
    }

    /* access modifiers changed from: package-private */
    public float C() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.o();
    }

    public float D() {
        b bVar = this.f14704c;
        if (bVar != null) {
            return bVar.f14732i;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int E() {
        b bVar = this.f14704c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f14727d;
    }

    public b F(int i10) {
        Iterator it = this.f14706e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f14724a == i10) {
                return bVar;
            }
        }
        return null;
    }

    public List G(int i10) {
        int x10 = x(i10);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14706e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f14727d == x10 || bVar.f14726c == x10) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void O(float f10, float f11) {
        b bVar = this.f14704c;
        if (bVar != null && bVar.f14735l != null) {
            this.f14704c.f14735l.u(f10, f11);
        }
    }

    /* access modifiers changed from: package-private */
    public void P(float f10, float f11) {
        b bVar = this.f14704c;
        if (bVar != null && bVar.f14735l != null) {
            this.f14704c.f14735l.v(f10, f11);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(MotionEvent motionEvent, int i10, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f14717p == null) {
            this.f14717p = this.f14702a.u0();
        }
        this.f14717p.a(motionEvent);
        if (i10 != -1) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f14720s = motionEvent.getRawX();
                this.f14721t = motionEvent.getRawY();
                this.f14714m = motionEvent;
                this.f14715n = false;
                if (this.f14704c.f14735l != null) {
                    RectF f10 = this.f14704c.f14735l.f(this.f14702a, rectF);
                    if (f10 == null || f10.contains(this.f14714m.getX(), this.f14714m.getY())) {
                        RectF p10 = this.f14704c.f14735l.p(this.f14702a, rectF);
                        if (p10 == null || p10.contains(this.f14714m.getX(), this.f14714m.getY())) {
                            this.f14716o = false;
                        } else {
                            this.f14716o = true;
                        }
                        this.f14704c.f14735l.w(this.f14720s, this.f14721t);
                        return;
                    }
                    this.f14714m = null;
                    this.f14715n = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f14715n) {
                float rawY = motionEvent.getRawY() - this.f14721t;
                float rawX = motionEvent.getRawX() - this.f14720s;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f14714m) != null) {
                    b h10 = h(i10, rawX, rawY, motionEvent2);
                    if (h10 != null) {
                        motionLayout.setTransition(h10);
                        RectF p11 = this.f14704c.f14735l.p(this.f14702a, rectF);
                        if (p11 != null && !p11.contains(this.f14714m.getX(), this.f14714m.getY())) {
                            z10 = true;
                        }
                        this.f14716o = z10;
                        this.f14704c.f14735l.y(this.f14720s, this.f14721t);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f14715n) {
            b bVar = this.f14704c;
            if (!(bVar == null || bVar.f14735l == null || this.f14716o)) {
                this.f14704c.f14735l.s(motionEvent, this.f14717p, i10, this);
            }
            this.f14720s = motionEvent.getRawX();
            this.f14721t = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (fVar = this.f14717p) != null) {
                fVar.recycle();
                this.f14717p = null;
                int i11 = motionLayout.f14382E;
                if (i11 != -1) {
                    g(motionLayout, i11);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S(MotionLayout motionLayout) {
        int i10 = 0;
        while (i10 < this.f14709h.size()) {
            int keyAt = this.f14709h.keyAt(i10);
            if (H(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                R(keyAt, motionLayout);
                i10++;
            }
        }
    }

    public void T(int i10, d dVar) {
        this.f14709h.put(i10, dVar);
    }

    public void U(int i10) {
        b bVar = this.f14704c;
        if (bVar != null) {
            bVar.E(i10);
        } else {
            this.f14712k = i10;
        }
    }

    public void V(boolean z10) {
        this.f14718q = z10;
        b bVar = this.f14704c;
        if (bVar != null && bVar.f14735l != null) {
            this.f14704c.f14735l.x(this.f14718q);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.j r0 = r6.f14703b
            r1 = -1
            if (r0 == 0) goto L_0x0018
            int r0 = r0.c(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.j r2 = r6.f14703b
            int r2 = r2.c(r8, r1, r1)
            if (r2 == r1) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            r2 = r8
            goto L_0x001a
        L_0x0018:
            r0 = r7
            goto L_0x0016
        L_0x001a:
            androidx.constraintlayout.motion.widget.o$b r3 = r6.f14704c
            if (r3 == 0) goto L_0x002d
            int r3 = r3.f14726c
            if (r3 != r8) goto L_0x002d
            androidx.constraintlayout.motion.widget.o$b r3 = r6.f14704c
            int r3 = r3.f14727d
            if (r3 != r7) goto L_0x002d
            return
        L_0x002d:
            java.util.ArrayList r3 = r6.f14706e
            java.util.Iterator r3 = r3.iterator()
        L_0x0033:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.o$b r4 = (androidx.constraintlayout.motion.widget.o.b) r4
            int r5 = r4.f14726c
            if (r5 != r2) goto L_0x004b
            int r5 = r4.f14727d
            if (r5 == r0) goto L_0x0057
        L_0x004b:
            int r5 = r4.f14726c
            if (r5 != r8) goto L_0x0033
            int r5 = r4.f14727d
            if (r5 != r7) goto L_0x0033
        L_0x0057:
            r6.f14704c = r4
            if (r4 == 0) goto L_0x006c
            androidx.constraintlayout.motion.widget.p r7 = r4.f14735l
            if (r7 == 0) goto L_0x006c
            androidx.constraintlayout.motion.widget.o$b r7 = r6.f14704c
            androidx.constraintlayout.motion.widget.p r7 = r7.f14735l
            boolean r8 = r6.f14718q
            r7.x(r8)
        L_0x006c:
            return
        L_0x006d:
            androidx.constraintlayout.motion.widget.o$b r7 = r6.f14707f
            java.util.ArrayList r3 = r6.f14708g
            java.util.Iterator r3 = r3.iterator()
        L_0x0075:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.o$b r4 = (androidx.constraintlayout.motion.widget.o.b) r4
            int r5 = r4.f14726c
            if (r5 != r8) goto L_0x0075
            r7 = r4
            goto L_0x0075
        L_0x0089:
            androidx.constraintlayout.motion.widget.o$b r8 = new androidx.constraintlayout.motion.widget.o$b
            r8.<init>(r6, r7)
            int unused = r8.f14727d = r0
            int unused = r8.f14726c = r2
            if (r0 == r1) goto L_0x009b
            java.util.ArrayList r7 = r6.f14706e
            r7.add(r8)
        L_0x009b:
            r6.f14704c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.o.W(int, int):void");
    }

    public void X(b bVar) {
        this.f14704c = bVar;
        if (bVar != null && bVar.f14735l != null) {
            this.f14704c.f14735l.x(this.f14718q);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        b bVar = this.f14704c;
        if (bVar != null && bVar.f14735l != null) {
            this.f14704c.f14735l.z();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a0() {
        Iterator it = this.f14706e.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f14735l != null) {
                return true;
            }
        }
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return false;
        }
        return true;
    }

    public void b0(int i10, View... viewArr) {
        this.f14719r.h(i10, viewArr);
    }

    public void f(MotionLayout motionLayout, int i10) {
        Iterator it = this.f14706e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f14736m.size() > 0) {
                Iterator it2 = bVar.f14736m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator it3 = this.f14708g.iterator();
        while (it3.hasNext()) {
            b bVar2 = (b) it3.next();
            if (bVar2.f14736m.size() > 0) {
                Iterator it4 = bVar2.f14736m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator it5 = this.f14706e.iterator();
        while (it5.hasNext()) {
            b bVar3 = (b) it5.next();
            if (bVar3.f14736m.size() > 0) {
                Iterator it6 = bVar3.f14736m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, i10, bVar3);
                }
            }
        }
        Iterator it7 = this.f14708g.iterator();
        while (it7.hasNext()) {
            b bVar4 = (b) it7.next();
            if (bVar4.f14736m.size() > 0) {
                Iterator it8 = bVar4.f14736m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, i10, bVar4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g(MotionLayout motionLayout, int i10) {
        b bVar;
        if (I() || this.f14705d) {
            return false;
        }
        Iterator it = this.f14706e.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f14737n != 0 && ((bVar = this.f14704c) != bVar2 || !bVar.D(2))) {
                if (i10 == bVar2.f14727d && (bVar2.f14737n == 4 || bVar2.f14737n == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f14737n == 4) {
                        motionLayout.F0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.h0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar);
                        motionLayout.v0();
                    }
                    return true;
                } else if (i10 == bVar2.f14726c && (bVar2.f14737n == 3 || bVar2.f14737n == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f14737n == 3) {
                        motionLayout.H0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.h0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar2);
                        motionLayout.v0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i10, float f10, float f11, MotionEvent motionEvent) {
        RectF f12;
        float f13;
        int i11 = i10;
        float f14 = f10;
        float f15 = f11;
        if (i11 == -1) {
            return this.f14704c;
        }
        List<b> G10 = G(i10);
        RectF rectF = new RectF();
        float f16 = 0.0f;
        b bVar = null;
        for (b bVar2 : G10) {
            if (!bVar2.f14738o && bVar2.f14735l != null) {
                bVar2.f14735l.x(this.f14718q);
                RectF p10 = bVar2.f14735l.p(this.f14702a, rectF);
                if ((p10 == null || motionEvent == null || p10.contains(motionEvent.getX(), motionEvent.getY())) && ((f12 = bVar2.f14735l.f(this.f14702a, rectF)) == null || motionEvent == null || f12.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a10 = bVar2.f14735l.a(f14, f15);
                    if (bVar2.f14735l.f14764l && motionEvent != null) {
                        float x10 = motionEvent.getX() - bVar2.f14735l.f14761i;
                        float y10 = motionEvent.getY() - bVar2.f14735l.f14762j;
                        a10 = ((float) (Math.atan2((double) (f15 + y10), (double) (f14 + x10)) - Math.atan2((double) x10, (double) y10))) * 10.0f;
                    }
                    if (bVar2.f14726c == i11) {
                        f13 = -1.0f;
                    } else {
                        f13 = 1.1f;
                    }
                    float f17 = a10 * f13;
                    if (f17 > f16) {
                        bVar = bVar2;
                        f16 = f17;
                    }
                }
            }
        }
        return bVar;
    }

    public int i() {
        b bVar = this.f14704c;
        if (bVar != null) {
            return bVar.f14739p;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0;
        }
        return this.f14704c.f14735l.d();
    }

    /* access modifiers changed from: package-private */
    public d k(int i10) {
        return l(i10, -1, -1);
    }

    /* access modifiers changed from: package-private */
    public d l(int i10, int i11, int i12) {
        int c10;
        j jVar = this.f14703b;
        if (!(jVar == null || (c10 = jVar.c(i10, i11, i12)) == -1)) {
            i10 = c10;
        }
        if (this.f14709h.get(i10) != null) {
            return (d) this.f14709h.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + a.c(this.f14702a.getContext(), i10) + " In MotionScene");
        SparseArray sparseArray = this.f14709h;
        return (d) sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] m() {
        int size = this.f14709h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f14709h.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList n() {
        return this.f14706e;
    }

    public int o() {
        b bVar = this.f14704c;
        if (bVar != null) {
            return bVar.f14731h;
        }
        return this.f14712k;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        b bVar = this.f14704c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f14726c;
    }

    public Interpolator r() {
        int g10 = this.f14704c.f14728e;
        if (g10 == -2) {
            return AnimationUtils.loadInterpolator(this.f14702a.getContext(), this.f14704c.f14730g);
        }
        if (g10 == -1) {
            return new a(C2008c.c(this.f14704c.f14729f));
        }
        if (g10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g10 == 1) {
            return new AccelerateInterpolator();
        }
        if (g10 == 2) {
            return new DecelerateInterpolator();
        }
        if (g10 == 4) {
            return new BounceInterpolator();
        }
        if (g10 == 5) {
            return new OvershootInterpolator();
        }
        if (g10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void s(l lVar) {
        b bVar = this.f14704c;
        if (bVar == null) {
            b bVar2 = this.f14707f;
            if (bVar2 != null) {
                Iterator it = bVar2.f14734k.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).b(lVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f14734k.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).b(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    public float t() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.g();
    }

    /* access modifiers changed from: package-private */
    public float u() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.h();
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return false;
        }
        return this.f14704c.f14735l.i();
    }

    /* access modifiers changed from: package-private */
    public float w(float f10, float f11) {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.j(f10, f11);
    }

    /* access modifiers changed from: package-private */
    public int y() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0;
        }
        return this.f14704c.f14735l.k();
    }

    /* access modifiers changed from: package-private */
    public float z() {
        b bVar = this.f14704c;
        if (bVar == null || bVar.f14735l == null) {
            return 0.0f;
        }
        return this.f14704c.f14735l.l();
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f14724a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f14725b = false;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f14726c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f14727d = -1;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f14728e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f14729f = null;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f14730g = -1;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f14731h = 400;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public float f14732i = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public final o f14733j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f14734k = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public p f14735l = null;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public ArrayList f14736m = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public int f14737n = 0;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public boolean f14738o = false;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f14739p = -1;

        /* renamed from: q  reason: collision with root package name */
        private int f14740q = 0;

        /* renamed from: r  reason: collision with root package name */
        private int f14741r = 0;

        public static class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            private final b f14742a;

            /* renamed from: b  reason: collision with root package name */
            int f14743b = -1;

            /* renamed from: c  reason: collision with root package name */
            int f14744c = 17;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f14742a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15208G7);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    if (index == h.f15228I7) {
                        this.f14743b = obtainStyledAttributes.getResourceId(index, this.f14743b);
                    } else if (index == h.f15218H7) {
                        this.f14744c = obtainStyledAttributes.getInt(index, this.f14744c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i10, b bVar) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                int i11 = this.f14743b;
                View view = motionLayout;
                if (i11 != -1) {
                    view = motionLayout.findViewById(i11);
                }
                if (view == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f14743b);
                    return;
                }
                int c10 = bVar.f14727d;
                int a10 = bVar.f14726c;
                if (c10 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i12 = this.f14744c;
                boolean z14 = false;
                if ((i12 & 1) == 0 || i10 != c10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if ((i12 & 256) == 0 || i10 != c10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z15 = z10 | z11;
                if ((i12 & 1) == 0 || i10 != c10) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                boolean z16 = z12 | z15;
                if ((i12 & 16) == 0 || i10 != a10) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                boolean z17 = z16 | z13;
                if ((i12 & 4096) != 0 && i10 == a10) {
                    z14 = true;
                }
                if (z17 || z14) {
                    view.setOnClickListener(this);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f14742a;
                if (bVar2 == bVar) {
                    return true;
                }
                int a10 = bVar2.f14726c;
                int c10 = this.f14742a.f14727d;
                if (c10 != -1) {
                    int i10 = motionLayout.f14382E;
                    if (i10 == c10 || i10 == a10) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.f14382E != a10) {
                    return true;
                } else {
                    return false;
                }
            }

            public void c(MotionLayout motionLayout) {
                int i10 = this.f14743b;
                if (i10 != -1) {
                    View findViewById = motionLayout.findViewById(i10);
                    if (findViewById == null) {
                        Log.e("MotionScene", " (*)  could not find id " + this.f14743b);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
            /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    androidx.constraintlayout.motion.widget.o$b r8 = r7.f14742a
                    androidx.constraintlayout.motion.widget.o r8 = r8.f14733j
                    androidx.constraintlayout.motion.widget.MotionLayout r8 = r8.f14702a
                    boolean r0 = r8.t0()
                    if (r0 != 0) goto L_0x0011
                    return
                L_0x0011:
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    int r0 = r0.f14727d
                    r1 = -1
                    if (r0 != r1) goto L_0x004a
                    int r0 = r8.getCurrentState()
                    if (r0 != r1) goto L_0x002a
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    int r0 = r0.f14726c
                    r8.I0(r0)
                    return
                L_0x002a:
                    androidx.constraintlayout.motion.widget.o$b r1 = new androidx.constraintlayout.motion.widget.o$b
                    androidx.constraintlayout.motion.widget.o$b r2 = r7.f14742a
                    androidx.constraintlayout.motion.widget.o r2 = r2.f14733j
                    androidx.constraintlayout.motion.widget.o$b r3 = r7.f14742a
                    r1.<init>(r2, r3)
                    int unused = r1.f14727d = r0
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    int r0 = r0.f14726c
                    int unused = r1.f14726c = r0
                    r8.setTransition((androidx.constraintlayout.motion.widget.o.b) r1)
                    r8.F0()
                    return
                L_0x004a:
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    androidx.constraintlayout.motion.widget.o r0 = r0.f14733j
                    androidx.constraintlayout.motion.widget.o$b r0 = r0.f14704c
                    int r1 = r7.f14744c
                    r2 = r1 & 1
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0061
                    r2 = r1 & 256(0x100, float:3.59E-43)
                    if (r2 == 0) goto L_0x005f
                    goto L_0x0061
                L_0x005f:
                    r2 = r3
                    goto L_0x0062
                L_0x0061:
                    r2 = r4
                L_0x0062:
                    r5 = r1 & 16
                    if (r5 != 0) goto L_0x006d
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x006b
                    goto L_0x006d
                L_0x006b:
                    r1 = r3
                    goto L_0x006e
                L_0x006d:
                    r1 = r4
                L_0x006e:
                    if (r2 == 0) goto L_0x0097
                    if (r1 == 0) goto L_0x0097
                    androidx.constraintlayout.motion.widget.o$b r5 = r7.f14742a
                    androidx.constraintlayout.motion.widget.o r5 = r5.f14733j
                    androidx.constraintlayout.motion.widget.o$b r5 = r5.f14704c
                    androidx.constraintlayout.motion.widget.o$b r6 = r7.f14742a
                    if (r5 == r6) goto L_0x0081
                    r8.setTransition((androidx.constraintlayout.motion.widget.o.b) r6)
                L_0x0081:
                    int r5 = r8.getCurrentState()
                    int r6 = r8.getEndState()
                    if (r5 == r6) goto L_0x0098
                    float r5 = r8.getProgress()
                    r6 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0096
                    goto L_0x0098
                L_0x0096:
                    r1 = r3
                L_0x0097:
                    r3 = r2
                L_0x0098:
                    boolean r0 = r7.b(r0, r8)
                    if (r0 == 0) goto L_0x00e3
                    if (r3 == 0) goto L_0x00ae
                    int r0 = r7.f14744c
                    r0 = r0 & r4
                    if (r0 == 0) goto L_0x00ae
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    r8.setTransition((androidx.constraintlayout.motion.widget.o.b) r0)
                    r8.F0()
                    goto L_0x00e3
                L_0x00ae:
                    if (r1 == 0) goto L_0x00bf
                    int r0 = r7.f14744c
                    r0 = r0 & 16
                    if (r0 == 0) goto L_0x00bf
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    r8.setTransition((androidx.constraintlayout.motion.widget.o.b) r0)
                    r8.H0()
                    goto L_0x00e3
                L_0x00bf:
                    if (r3 == 0) goto L_0x00d2
                    int r0 = r7.f14744c
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L_0x00d2
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    r8.setTransition((androidx.constraintlayout.motion.widget.o.b) r0)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r8.setProgress(r0)
                    goto L_0x00e3
                L_0x00d2:
                    if (r1 == 0) goto L_0x00e3
                    int r0 = r7.f14744c
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L_0x00e3
                    androidx.constraintlayout.motion.widget.o$b r0 = r7.f14742a
                    r8.setTransition((androidx.constraintlayout.motion.widget.o.b) r0)
                    r0 = 0
                    r8.setProgress(r0)
                L_0x00e3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.o.b.a.onClick(android.view.View):void");
            }
        }

        b(o oVar, b bVar) {
            this.f14733j = oVar;
            this.f14731h = oVar.f14712k;
            if (bVar != null) {
                this.f14739p = bVar.f14739p;
                this.f14728e = bVar.f14728e;
                this.f14729f = bVar.f14729f;
                this.f14730g = bVar.f14730g;
                this.f14731h = bVar.f14731h;
                this.f14734k = bVar.f14734k;
                this.f14732i = bVar.f14732i;
                this.f14740q = bVar.f14740q;
            }
        }

        private void v(o oVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                if (index == h.f15189E8) {
                    this.f14726c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f14726c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        dVar.C(context, this.f14726c);
                        oVar.f14709h.append(this.f14726c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f14726c = oVar.L(context, this.f14726c);
                    }
                } else if (index == h.f15199F8) {
                    this.f14727d = typedArray.getResourceId(index, this.f14727d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f14727d);
                    if ("layout".equals(resourceTypeName2)) {
                        d dVar2 = new d();
                        dVar2.C(context, this.f14727d);
                        oVar.f14709h.append(this.f14727d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f14727d = oVar.L(context, this.f14727d);
                    }
                } else if (index == h.f15229I8) {
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f14730g = resourceId;
                        if (resourceId != -1) {
                            this.f14728e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        this.f14729f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f14730g = typedArray.getResourceId(index, -1);
                                this.f14728e = -2;
                            } else {
                                this.f14728e = -1;
                            }
                        }
                    } else {
                        this.f14728e = typedArray.getInteger(index, this.f14728e);
                    }
                } else if (index == h.f15209G8) {
                    int i12 = typedArray.getInt(index, this.f14731h);
                    this.f14731h = i12;
                    if (i12 < 8) {
                        this.f14731h = 8;
                    }
                } else if (index == h.f15249K8) {
                    this.f14732i = typedArray.getFloat(index, this.f14732i);
                } else if (index == h.f15179D8) {
                    this.f14737n = typedArray.getInteger(index, this.f14737n);
                } else if (index == h.f15169C8) {
                    this.f14724a = typedArray.getResourceId(index, this.f14724a);
                } else if (index == h.f15259L8) {
                    this.f14738o = typedArray.getBoolean(index, this.f14738o);
                } else if (index == h.f15239J8) {
                    this.f14739p = typedArray.getInteger(index, -1);
                } else if (index == h.f15219H8) {
                    this.f14740q = typedArray.getInteger(index, 0);
                } else if (index == h.f15269M8) {
                    this.f14741r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f14727d == -1) {
                this.f14725b = true;
            }
        }

        private void w(o oVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15159B8);
            v(oVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f14727d;
        }

        public p B() {
            return this.f14735l;
        }

        public boolean C() {
            return !this.f14738o;
        }

        public boolean D(int i10) {
            if ((i10 & this.f14741r) != 0) {
                return true;
            }
            return false;
        }

        public void E(int i10) {
            this.f14731h = Math.max(i10, 8);
        }

        public void F(int i10, String str, int i11) {
            this.f14728e = i10;
            this.f14729f = str;
            this.f14730g = i11;
        }

        public void G(int i10) {
            this.f14739p = i10;
        }

        public void t(f fVar) {
            this.f14734k.add(fVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.f14736m.add(new a(context, this, xmlPullParser));
        }

        public int x() {
            return this.f14737n;
        }

        public int y() {
            return this.f14726c;
        }

        public int z() {
            return this.f14740q;
        }

        public b(int i10, o oVar, int i11, int i12) {
            this.f14724a = i10;
            this.f14733j = oVar;
            this.f14727d = i11;
            this.f14726c = i12;
            this.f14731h = oVar.f14712k;
            this.f14740q = oVar.f14713l;
        }

        b(o oVar, Context context, XmlPullParser xmlPullParser) {
            this.f14731h = oVar.f14712k;
            this.f14740q = oVar.f14713l;
            this.f14733j = oVar;
            w(oVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
