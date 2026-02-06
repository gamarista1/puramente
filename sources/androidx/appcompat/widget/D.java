package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C1680b0;
import com.google.android.gms.common.api.a;
import i.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class D {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f11531l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap f11532m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private int f11533a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11534b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f11535c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f11536d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f11537e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f11538f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f11539g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f11540h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f11541i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f11542j;

    /* renamed from: k  reason: collision with root package name */
    private final d f11543k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) D.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) D.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    D(TextView textView) {
        this.f11541i = textView;
        this.f11542j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11543k = new c();
        } else {
            this.f11543k = new b();
        }
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f11533a = 0;
        this.f11536d = -1.0f;
        this.f11537e = -1.0f;
        this.f11535c = -1.0f;
        this.f11538f = new int[0];
        this.f11534b = false;
    }

    private int e(RectF rectF) {
        int length = this.f11538f.length;
        if (length != 0) {
            int i10 = 1;
            int i11 = length - 1;
            int i12 = 0;
            while (i10 <= i11) {
                int i13 = (i10 + i11) / 2;
                if (x(this.f11538f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i10;
                    i10 = i14;
                } else {
                    i12 = i13 - 1;
                    i11 = i12;
                }
            }
            return this.f11538f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f11532m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                f11532m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.reflect.Method r0 = k(r4)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x002a
        L_0x000a:
            r3 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r3
        L_0x000f:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.D.m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private void s(float f10) {
        if (f10 != this.f11541i.getPaint().getTextSize()) {
            this.f11541i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f11541i.isInLayout();
            if (this.f11541i.getLayout() != null) {
                this.f11534b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f11541i, (Object[]) null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.f11541i.requestLayout();
                } else {
                    this.f11541i.forceLayout();
                }
                this.f11541i.invalidate();
            }
        }
    }

    private boolean u() {
        if (!y() || this.f11533a != 1) {
            this.f11534b = false;
        } else {
            if (!this.f11539g || this.f11538f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f11537e - this.f11536d) / this.f11535c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f11536d + (((float) i10) * this.f11535c));
                }
                this.f11538f = b(iArr);
            }
            this.f11534b = true;
        }
        return this.f11534b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f11538f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10;
        int[] iArr = this.f11538f;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11539g = z10;
        if (z10) {
            this.f11533a = 1;
            this.f11536d = (float) iArr[0];
            this.f11537e = (float) iArr[length - 1];
            this.f11535c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f11541i.getText();
        TransformationMethod transformationMethod = this.f11541i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f11541i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f11541i.getMaxLines();
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f11541i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        if ((maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom) {
            return true;
        }
        return false;
    }

    private boolean y() {
        return !(this.f11541i instanceof C1573l);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f11533a = 1;
            this.f11536d = f10;
            this.f11537e = f11;
            this.f11535c = f12;
            this.f11539g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i10;
        if (n()) {
            if (this.f11534b) {
                if (this.f11541i.getMeasuredHeight() > 0 && this.f11541i.getMeasuredWidth() > 0) {
                    if (this.f11543k.b(this.f11541i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f11541i.getMeasuredWidth() - this.f11541i.getTotalPaddingLeft()) - this.f11541i.getTotalPaddingRight();
                    }
                    int height = (this.f11541i.getHeight() - this.f11541i.getCompoundPaddingBottom()) - this.f11541i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f11531l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i10;
                                rectF.bottom = (float) height;
                                float e10 = (float) e(rectF);
                                if (e10 != this.f11541i.getTextSize()) {
                                    t(0, e10);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f11534b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f11541i, this.f11540h, this.f11543k);
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.f11537e);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f11536d);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f11535c);
    }

    /* access modifiers changed from: package-private */
    public int[] i() {
        return this.f11538f;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f11533a;
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        TextPaint textPaint = this.f11540h;
        if (textPaint == null) {
            this.f11540h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f11540h.set(this.f11541i.getPaint());
        this.f11540h.setTextSize((float) i10);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        if (!y() || this.f11533a == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i10) {
        float f10;
        float f11;
        float f12;
        int resourceId;
        TypedArray obtainStyledAttributes = this.f11542j.obtainStyledAttributes(attributeSet, j.f21585g0, i10, 0);
        TextView textView = this.f11541i;
        C1680b0.m0(textView, textView.getContext(), j.f21585g0, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(j.f21610l0)) {
            this.f11533a = obtainStyledAttributes.getInt(j.f21610l0, 0);
        }
        if (obtainStyledAttributes.hasValue(j.f21605k0)) {
            f10 = obtainStyledAttributes.getDimension(j.f21605k0, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(j.f21595i0)) {
            f11 = obtainStyledAttributes.getDimension(j.f21595i0, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(j.f21590h0)) {
            f12 = obtainStyledAttributes.getDimension(j.f21590h0, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(j.f21600j0) && (resourceId = obtainStyledAttributes.getResourceId(j.f21600j0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f11533a = 0;
        } else if (this.f11533a == 1) {
            if (!this.f11539g) {
                DisplayMetrics displayMetrics = this.f11542j.getResources().getDisplayMetrics();
                if (f11 == -1.0f) {
                    f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f12 == -1.0f) {
                    f12 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f10 == -1.0f) {
                    f10 = 1.0f;
                }
                z(f11, f12, f10);
            }
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f11542j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f11542j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f11538f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f11539g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        if (!y()) {
            return;
        }
        if (i10 == 0) {
            c();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f11542j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, float f10) {
        Resources resources;
        Context context = this.f11542j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        s(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }
}
