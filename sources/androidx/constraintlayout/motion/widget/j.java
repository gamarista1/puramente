package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.h;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class j extends c {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public boolean f14591A;

    /* renamed from: g  reason: collision with root package name */
    float f14592g = 0.1f;

    /* renamed from: h  reason: collision with root package name */
    int f14593h;

    /* renamed from: i  reason: collision with root package name */
    int f14594i;

    /* renamed from: j  reason: collision with root package name */
    int f14595j;

    /* renamed from: k  reason: collision with root package name */
    RectF f14596k;

    /* renamed from: l  reason: collision with root package name */
    RectF f14597l;

    /* renamed from: m  reason: collision with root package name */
    HashMap f14598m;

    /* renamed from: n  reason: collision with root package name */
    private int f14599n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public String f14600o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f14601p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public String f14602q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f14603r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f14604s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f14605t;

    /* renamed from: u  reason: collision with root package name */
    private View f14606u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f14607v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f14608w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f14609x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public float f14610y;

    /* renamed from: z  reason: collision with root package name */
    private float f14611z;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f14612a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14612a = sparseIntArray;
            sparseIntArray.append(h.f15206G5, 8);
            f14612a.append(h.f15246K5, 4);
            f14612a.append(h.f15256L5, 1);
            f14612a.append(h.f15266M5, 2);
            f14612a.append(h.f15216H5, 7);
            f14612a.append(h.f15276N5, 6);
            f14612a.append(h.f15296P5, 5);
            f14612a.append(h.f15236J5, 9);
            f14612a.append(h.f15226I5, 10);
            f14612a.append(h.f15286O5, 11);
            f14612a.append(h.f15306Q5, 12);
            f14612a.append(h.f15316R5, 13);
            f14612a.append(h.f15326S5, 14);
        }

        public static void a(j jVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14612a.get(index)) {
                    case 1:
                        String unused = jVar.f14602q = typedArray.getString(index);
                        break;
                    case 2:
                        String unused2 = jVar.f14603r = typedArray.getString(index);
                        break;
                    case 4:
                        String unused3 = jVar.f14600o = typedArray.getString(index);
                        break;
                    case 5:
                        jVar.f14592g = typedArray.getFloat(index, jVar.f14592g);
                        break;
                    case 6:
                        int unused4 = jVar.f14604s = typedArray.getResourceId(index, jVar.f14604s);
                        break;
                    case 7:
                        if (!MotionLayout.f14373w1) {
                            if (typedArray.peekValue(index).type != 3) {
                                jVar.f14513b = typedArray.getResourceId(index, jVar.f14513b);
                                break;
                            } else {
                                jVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, jVar.f14513b);
                            jVar.f14513b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                jVar.f14514c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, jVar.f14512a);
                        jVar.f14512a = integer;
                        float unused5 = jVar.f14610y = (((float) integer) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = jVar.f14605t = typedArray.getResourceId(index, jVar.f14605t);
                        break;
                    case 10:
                        boolean unused7 = jVar.f14591A = typedArray.getBoolean(index, jVar.f14591A);
                        break;
                    case 11:
                        int unused8 = jVar.f14601p = typedArray.getResourceId(index, jVar.f14601p);
                        break;
                    case 12:
                        jVar.f14595j = typedArray.getResourceId(index, jVar.f14595j);
                        break;
                    case 13:
                        jVar.f14593h = typedArray.getResourceId(index, jVar.f14593h);
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        jVar.f14594i = typedArray.getResourceId(index, jVar.f14594i);
                        break;
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14612a.get(index));
                        break;
                }
            }
        }
    }

    public j() {
        int i10 = c.f14511f;
        this.f14593h = i10;
        this.f14594i = i10;
        this.f14595j = i10;
        this.f14596k = new RectF();
        this.f14597l = new RectF();
        this.f14598m = new HashMap();
        this.f14599n = -1;
        this.f14600o = null;
        int i11 = c.f14511f;
        this.f14601p = i11;
        this.f14602q = null;
        this.f14603r = null;
        this.f14604s = i11;
        this.f14605t = i11;
        this.f14606u = null;
        this.f14607v = true;
        this.f14608w = true;
        this.f14609x = true;
        this.f14610y = Float.NaN;
        this.f14591A = false;
        this.f14515d = 5;
        this.f14516e = new HashMap();
    }

    private void v(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                w(str, view);
                return;
            }
            if (this.f14598m.containsKey(str)) {
                method = (Method) this.f14598m.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, (Class[]) null);
                    this.f14598m.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f14598m.put(str, (Object) null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + a.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, (Object[]) null);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f14600o + "\"on class " + view.getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + a.d(view));
            }
        }
    }

    private void w(String str, View view) {
        boolean z10;
        androidx.constraintlayout.widget.a aVar;
        if (str.length() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f14516e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if ((z10 || lowerCase.matches(str)) && (aVar = (androidx.constraintlayout.widget.a) this.f14516e.get(str2)) != null) {
                aVar.a(view);
            }
        }
    }

    private void x(RectF rectF, View view, boolean z10) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public void a(HashMap hashMap) {
    }

    /* renamed from: b */
    public c clone() {
        return new j().c(this);
    }

    public c c(c cVar) {
        super.c(cVar);
        j jVar = (j) cVar;
        this.f14599n = jVar.f14599n;
        this.f14600o = jVar.f14600o;
        this.f14601p = jVar.f14601p;
        this.f14602q = jVar.f14602q;
        this.f14603r = jVar.f14603r;
        this.f14604s = jVar.f14604s;
        this.f14605t = jVar.f14605t;
        this.f14606u = jVar.f14606u;
        this.f14592g = jVar.f14592g;
        this.f14607v = jVar.f14607v;
        this.f14608w = jVar.f14608w;
        this.f14609x = jVar.f14609x;
        this.f14610y = jVar.f14610y;
        this.f14611z = jVar.f14611z;
        this.f14591A = jVar.f14591A;
        this.f14596k = jVar.f14596k;
        this.f14597l = jVar.f14597l;
        this.f14598m = jVar.f14598m;
        return this;
    }

    public void d(HashSet hashSet) {
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.f15196F5), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f14605t
            int r1 = androidx.constraintlayout.motion.widget.c.f14511f
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0063
            android.view.View r0 = r9.f14606u
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.f14605t
            android.view.View r0 = r0.findViewById(r1)
            r9.f14606u = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.f14596k
            android.view.View r1 = r9.f14606u
            boolean r4 = r9.f14591A
            r9.x(r0, r1, r4)
            android.graphics.RectF r0 = r9.f14597l
            boolean r1 = r9.f14591A
            r9.x(r0, r11, r1)
            android.graphics.RectF r0 = r9.f14596k
            android.graphics.RectF r1 = r9.f14597l
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r9.f14607v
            if (r0 == 0) goto L_0x003c
            r9.f14607v = r3
            r0 = r2
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            boolean r1 = r9.f14609x
            if (r1 == 0) goto L_0x0045
            r9.f14609x = r3
            r1 = r2
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            r9.f14608w = r2
            goto L_0x00df
        L_0x004a:
            boolean r0 = r9.f14607v
            if (r0 != 0) goto L_0x0052
            r9.f14607v = r2
            r0 = r2
            goto L_0x0053
        L_0x0052:
            r0 = r3
        L_0x0053:
            boolean r1 = r9.f14608w
            if (r1 == 0) goto L_0x005b
            r9.f14608w = r3
            r1 = r2
            goto L_0x005c
        L_0x005b:
            r1 = r3
        L_0x005c:
            r9.f14609x = r2
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x00df
        L_0x0063:
            boolean r0 = r9.f14607v
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.f14610y
            float r4 = r10 - r0
            float r5 = r9.f14611z
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.f14607v = r3
            r0 = r2
            goto L_0x0089
        L_0x0078:
            float r0 = r9.f14610y
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.f14592g
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.f14607v = r2
        L_0x0088:
            r0 = r3
        L_0x0089:
            boolean r4 = r9.f14608w
            if (r4 == 0) goto L_0x00a1
            float r4 = r9.f14610y
            float r5 = r10 - r4
            float r6 = r9.f14611z
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b1
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b1
            r9.f14608w = r3
            r4 = r2
            goto L_0x00b2
        L_0x00a1:
            float r4 = r9.f14610y
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.f14592g
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b1
            r9.f14608w = r2
        L_0x00b1:
            r4 = r3
        L_0x00b2:
            boolean r5 = r9.f14609x
            if (r5 == 0) goto L_0x00cd
            float r5 = r9.f14610y
            float r6 = r10 - r5
            float r7 = r9.f14611z
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c9
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c9
            r9.f14609x = r3
            goto L_0x00ca
        L_0x00c9:
            r2 = r3
        L_0x00ca:
            r1 = r2
        L_0x00cb:
            r3 = r4
            goto L_0x00df
        L_0x00cd:
            float r1 = r9.f14610y
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.f14592g
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dd
            r9.f14609x = r2
        L_0x00dd:
            r1 = r3
            goto L_0x00cb
        L_0x00df:
            r9.f14611z = r10
            if (r3 != 0) goto L_0x00e7
            if (r0 != 0) goto L_0x00e7
            if (r1 == 0) goto L_0x00f2
        L_0x00e7:
            android.view.ViewParent r2 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = (androidx.constraintlayout.motion.widget.MotionLayout) r2
            int r4 = r9.f14604s
            r2.m0(r4, r1, r10)
        L_0x00f2:
            int r10 = r9.f14601p
            int r2 = androidx.constraintlayout.motion.widget.c.f14511f
            if (r10 != r2) goto L_0x00fa
            r10 = r11
            goto L_0x0106
        L_0x00fa:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r2 = r9.f14601p
            android.view.View r10 = r10.findViewById(r2)
        L_0x0106:
            if (r3 == 0) goto L_0x0124
            java.lang.String r2 = r9.f14602q
            if (r2 == 0) goto L_0x010f
            r9.v(r2, r10)
        L_0x010f:
            int r2 = r9.f14593h
            int r3 = androidx.constraintlayout.motion.widget.c.f14511f
            if (r2 == r3) goto L_0x0124
            android.view.ViewParent r2 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = (androidx.constraintlayout.motion.widget.MotionLayout) r2
            int r3 = r9.f14593h
            android.view.View[] r4 = new android.view.View[]{r10}
            r2.N0(r3, r4)
        L_0x0124:
            if (r1 == 0) goto L_0x0142
            java.lang.String r1 = r9.f14603r
            if (r1 == 0) goto L_0x012d
            r9.v(r1, r10)
        L_0x012d:
            int r1 = r9.f14594i
            int r2 = androidx.constraintlayout.motion.widget.c.f14511f
            if (r1 == r2) goto L_0x0142
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r2 = r9.f14594i
            android.view.View[] r3 = new android.view.View[]{r10}
            r1.N0(r2, r3)
        L_0x0142:
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r9.f14600o
            if (r0 == 0) goto L_0x014b
            r9.v(r0, r10)
        L_0x014b:
            int r0 = r9.f14595j
            int r1 = androidx.constraintlayout.motion.widget.c.f14511f
            if (r0 == r1) goto L_0x0160
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f14595j
            android.view.View[] r10 = new android.view.View[]{r10}
            r11.N0(r0, r10)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.u(float, android.view.View):void");
    }
}
