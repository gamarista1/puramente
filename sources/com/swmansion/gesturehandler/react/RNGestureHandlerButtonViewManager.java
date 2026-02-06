package com.swmansion.gesturehandler.react;

import Rg.h;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1692h0;
import com.facebook.react.C3367m;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C3787A;
import m8.C3839z;
import mf.C6565s;
import vd.C5260d;
import vd.q;

@Q7.a(name = "RNGestureHandlerButton")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002?@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lm8/A;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", "", "useDrawableOnForeground", "Llf/M;", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "", "backgroundColor", "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", "borderRadius", "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", "borderTopLeftRadius", "setBorderTopLeftRadius", "borderTopRightRadius", "setBorderTopRightRadius", "borderBottomLeftRadius", "setBorderBottomLeftRadius", "borderBottomRightRadius", "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", "borderColor", "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "mDelegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "b", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements C3787A {
    public static final b Companion = new b((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final w0 mDelegate = new C3839z(this);

    public static final class a extends ViewGroup implements q.e {

        /* renamed from: t  reason: collision with root package name */
        public static final C0877a f59551t = new C0877a((DefaultConstructorMarker) null);

        /* renamed from: u  reason: collision with root package name */
        private static TypedValue f59552u = new TypedValue();

        /* renamed from: v  reason: collision with root package name */
        private static a f59553v;

        /* renamed from: w  reason: collision with root package name */
        private static a f59554w;

        /* renamed from: x  reason: collision with root package name */
        private static View.OnClickListener f59555x = new b();

        /* renamed from: a  reason: collision with root package name */
        private Integer f59556a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f59557b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f59558c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f59559d;

        /* renamed from: e  reason: collision with root package name */
        private float f59560e;

        /* renamed from: f  reason: collision with root package name */
        private float f59561f;

        /* renamed from: g  reason: collision with root package name */
        private float f59562g;

        /* renamed from: h  reason: collision with root package name */
        private float f59563h;

        /* renamed from: i  reason: collision with root package name */
        private float f59564i;

        /* renamed from: j  reason: collision with root package name */
        private float f59565j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f59566k;

        /* renamed from: l  reason: collision with root package name */
        private String f59567l = "solid";

        /* renamed from: m  reason: collision with root package name */
        private boolean f59568m = true;

        /* renamed from: n  reason: collision with root package name */
        private int f59569n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f59570o;

        /* renamed from: p  reason: collision with root package name */
        private long f59571p = -1;

        /* renamed from: q  reason: collision with root package name */
        private int f59572q = -1;

        /* renamed from: r  reason: collision with root package name */
        private boolean f59573r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f59574s;

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a  reason: collision with other inner class name */
        public static final class C0877a {
            public /* synthetic */ C0877a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0877a() {
            }
        }

        public a(Context context) {
            super(context);
            setOnClickListener(f59555x);
            setClickable(true);
            setFocusable(true);
            this.f59570o = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            if (this.f59560e == 0.0f && this.f59561f == 0.0f && this.f59562g == 0.0f && this.f59563h == 0.0f && this.f59564i == 0.0f) {
                return false;
            }
            return true;
        }

        private final float[] j() {
            float f10 = this.f59561f;
            float f11 = this.f59562g;
            float f12 = this.f59564i;
            float f13 = this.f59563h;
            float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
            ArrayList arrayList = new ArrayList(8);
            for (int i10 = 0; i10 < 8; i10++) {
                float f14 = fArr[i10];
                if (f14 == 0.0f) {
                    f14 = this.f59560e;
                }
                arrayList.add(Float.valueOf(f14));
            }
            return C6565s.b1(arrayList);
        }

        private final PathEffect k() {
            String str = this.f59567l;
            if (C6496s.c(str, "dotted")) {
                float f10 = this.f59565j;
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            } else if (!C6496s.c(str, "dashed")) {
                return null;
            } else {
                float f11 = this.f59565j;
                float f12 = (float) 3;
                return new DashPathEffect(new float[]{f11 * f12, f11 * f12, f11 * f12, f11 * f12}, 0.0f);
            }
        }

        private final Drawable l() {
            int i10;
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            if (this.f59565j > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f59565j);
                Integer num = this.f59566k;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = -16777216;
                }
                paint.setColor(i10);
                paint.setPathEffect(k());
            }
            return paintDrawable;
        }

        private final Drawable m() {
            ColorStateList colorStateList;
            ShapeDrawable shapeDrawable;
            Integer num = this.f59556a;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{16842910}};
            Integer num2 = this.f59557b;
            Integer num3 = this.f59556a;
            if (num3 != null) {
                C6496s.e(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(16843820, f59552u, true);
                colorStateList = new ColorStateList(iArr, new int[]{f59552u.data});
            }
            if (this.f59559d) {
                shapeDrawable = null;
            } else {
                shapeDrawable = new ShapeDrawable(new RectShape());
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, (Drawable) null, shapeDrawable);
            if (num2 != null) {
                rippleDrawable.setRadius((int) G.h((float) num2.intValue()));
            }
            return rippleDrawable;
        }

        /* access modifiers changed from: private */
        public static final void n(View view) {
        }

        private final l o() {
            l lVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    lVar = (l) parent;
                }
            }
            return lVar;
        }

        private final boolean p(h hVar) {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f59574s || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && p(C1692h0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        static /* synthetic */ boolean q(a aVar, h hVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hVar = C1692h0.a(aVar);
            }
            return aVar.p(hVar);
        }

        private final void r() {
            if (f59553v == this) {
                f59553v = null;
                f59554w = this;
            }
        }

        private final boolean s() {
            boolean z10;
            if (q(this, (h) null, 1, (Object) null)) {
                return false;
            }
            a aVar = f59553v;
            if (aVar == null) {
                f59553v = this;
                return true;
            }
            if (!this.f59568m) {
                if (aVar != null) {
                    z10 = aVar.f59568m;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return true;
                }
            } else if (aVar == this) {
                return true;
            }
            return false;
        }

        private final void u(int i10, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i10);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }

        public boolean a() {
            return q.e.a.f(this);
        }

        public Boolean b(C5260d dVar) {
            return q.e.a.g(this, dVar);
        }

        public boolean c(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
                return false;
            }
            boolean s10 = s();
            if (s10) {
                this.f59574s = true;
            }
            return s10;
        }

        public boolean d() {
            return q.e.a.h(this);
        }

        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f59553v;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        public boolean e(View view) {
            return q.e.a.b(this, view);
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            return q.e.a.e(this, view, motionEvent);
        }

        public void g(MotionEvent motionEvent) {
            q.e.a.d(this, motionEvent);
        }

        public final float getBorderBottomLeftRadius() {
            return this.f59563h;
        }

        public final float getBorderBottomRightRadius() {
            return this.f59564i;
        }

        public final Integer getBorderColor() {
            return this.f59566k;
        }

        public final float getBorderRadius() {
            return this.f59560e;
        }

        public final String getBorderStyle() {
            return this.f59567l;
        }

        public final float getBorderTopLeftRadius() {
            return this.f59561f;
        }

        public final float getBorderTopRightRadius() {
            return this.f59562g;
        }

        public final float getBorderWidth() {
            return this.f59565j;
        }

        public final boolean getExclusive() {
            return this.f59568m;
        }

        public final Integer getRippleColor() {
            return this.f59556a;
        }

        public final Integer getRippleRadius() {
            return this.f59557b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f59559d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f59558c;
        }

        public void h(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            r();
            this.f59574s = false;
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            C6496s.h(accessibilityNodeInfo, "info");
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            Object tag = super.getTag(C3367m.f40944t);
            if (tag instanceof String) {
                accessibilityNodeInfo.setViewIdResourceName((String) tag);
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "ev");
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            this.f59573r = true;
            return super.onKeyUp(i10, keyEvent);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            long eventTime = motionEvent.getEventTime();
            int action = motionEvent.getAction();
            a aVar = f59553v;
            if (!(aVar == null || aVar == this)) {
                C6496s.e(aVar);
                if (aVar.f59568m) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.f59571p = eventTime;
                    this.f59572q = action;
                    return false;
                }
            }
            if (motionEvent.getAction() == 3) {
                r();
            }
            if (this.f59571p == eventTime && this.f59572q == action && action != 3) {
                return false;
            }
            this.f59571p = eventTime;
            this.f59572q = action;
            return super.onTouchEvent(motionEvent);
        }

        public boolean performClick() {
            if (q(this, (h) null, 1, (Object) null)) {
                return false;
            }
            Context context = getContext();
            C6496s.g(context, "getContext(...)");
            if (a.c(context)) {
                l o10 = o();
                if (o10 != null) {
                    o10.l(this);
                }
            } else if (this.f59573r) {
                l o11 = o();
                if (o11 != null) {
                    o11.l(this);
                }
                this.f59573r = false;
            }
            if (f59554w != this) {
                return false;
            }
            r();
            f59554w = null;
            return super.performClick();
        }

        public void setBackgroundColor(int i10) {
            this.f59569n = i10;
            this.f59570o = true;
        }

        public final void setBorderBottomLeftRadius(float f10) {
            this.f59563h = f10 * getResources().getDisplayMetrics().density;
            this.f59570o = true;
        }

        public final void setBorderBottomRightRadius(float f10) {
            this.f59564i = f10 * getResources().getDisplayMetrics().density;
            this.f59570o = true;
        }

        public final void setBorderColor(Integer num) {
            this.f59566k = num;
            this.f59570o = true;
        }

        public final void setBorderRadius(float f10) {
            this.f59560e = f10 * getResources().getDisplayMetrics().density;
            this.f59570o = true;
        }

        public final void setBorderStyle(String str) {
            this.f59567l = str;
            this.f59570o = true;
        }

        public final void setBorderTopLeftRadius(float f10) {
            this.f59561f = f10 * getResources().getDisplayMetrics().density;
            this.f59570o = true;
        }

        public final void setBorderTopRightRadius(float f10) {
            this.f59562g = f10 * getResources().getDisplayMetrics().density;
            this.f59570o = true;
        }

        public final void setBorderWidth(float f10) {
            this.f59565j = f10 * getResources().getDisplayMetrics().density;
            this.f59570o = true;
        }

        public final void setExclusive(boolean z10) {
            this.f59568m = z10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (q(r3, (Rg.h) null, 1, (java.lang.Object) null) != false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0.f59568m == true) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setPressed(boolean r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x000a
                boolean r0 = r3.s()
                if (r0 == 0) goto L_0x000a
                f59554w = r3
            L_0x000a:
                boolean r0 = r3.f59568m
                r1 = 0
                if (r0 != 0) goto L_0x0021
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = f59553v
                r2 = 1
                if (r0 == 0) goto L_0x0019
                boolean r0 = r0.f59568m
                if (r0 != r2) goto L_0x0019
                goto L_0x0021
            L_0x0019:
                r0 = 0
                boolean r0 = q(r3, r0, r2, r0)
                if (r0 != 0) goto L_0x0021
                goto L_0x0022
            L_0x0021:
                r2 = r1
            L_0x0022:
                if (r4 == 0) goto L_0x002a
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = f59553v
                if (r0 == r3) goto L_0x002a
                if (r2 == 0) goto L_0x002f
            L_0x002a:
                r3.f59574s = r4
                super.setPressed(r4)
            L_0x002f:
                if (r4 != 0) goto L_0x0037
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r4 = f59553v
                if (r4 != r3) goto L_0x0037
                r3.f59574s = r1
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.setPressed(boolean):void");
        }

        public final void setRippleColor(Integer num) {
            this.f59556a = num;
            this.f59570o = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f59557b = num;
            this.f59570o = true;
        }

        public final void setTouched(boolean z10) {
            this.f59574s = z10;
        }

        public final void setUseBorderlessDrawable(boolean z10) {
            this.f59559d = z10;
        }

        public final void setUseDrawableOnForeground(boolean z10) {
            this.f59558c = z10;
            this.f59570o = true;
        }

        public final void t() {
            if (this.f59570o) {
                this.f59570o = false;
                if (this.f59569n == 0) {
                    setBackground((Drawable) null);
                }
                setForeground((Drawable) null);
                Drawable m10 = m();
                Drawable l10 = l();
                if (getHasBorderRadii() && (m10 instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(j());
                    ((RippleDrawable) m10).setDrawableByLayerId(16908334, paintDrawable);
                }
                if (this.f59558c) {
                    setForeground(m10);
                    int i10 = this.f59569n;
                    if (i10 != 0) {
                        u(i10, l10, (Drawable) null);
                        return;
                    }
                    return;
                }
                int i11 = this.f59569n;
                if (i11 == 0 && this.f59556a == null) {
                    setBackground(new LayerDrawable(new Drawable[]{m10, l10}));
                } else {
                    u(i11, l10, m10);
                }
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public a createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new a(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(a aVar) {
        C6496s.h(aVar, "view");
        super.onAfterUpdateTransaction(aVar);
        aVar.t();
    }

    @C3500a(name = "backgroundColor")
    public void setBackgroundColor(a aVar, int i10) {
        C6496s.h(aVar, "view");
        aVar.setBackgroundColor(i10);
    }

    @C3500a(name = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setBorderBottomLeftRadius(f10);
    }

    @C3500a(name = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setBorderBottomRightRadius(f10);
    }

    @C3500a(name = "borderColor")
    public void setBorderColor(a aVar, Integer num) {
        C6496s.h(aVar, "view");
        aVar.setBorderColor(num);
    }

    @C3500a(name = "borderRadius")
    public void setBorderRadius(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setBorderRadius(f10);
    }

    @C3500a(name = "borderStyle")
    public void setBorderStyle(a aVar, String str) {
        C6496s.h(aVar, "view");
        aVar.setBorderStyle(str);
    }

    @C3500a(name = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setBorderTopLeftRadius(f10);
    }

    @C3500a(name = "borderTopRightRadius")
    public void setBorderTopRightRadius(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setBorderTopRightRadius(f10);
    }

    @C3500a(name = "borderWidth")
    public void setBorderWidth(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setBorderWidth(f10);
    }

    @C3500a(name = "borderless")
    public void setBorderless(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setUseBorderlessDrawable(z10);
    }

    @C3500a(name = "enabled")
    public void setEnabled(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setEnabled(z10);
    }

    @C3500a(name = "exclusive")
    public void setExclusive(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setExclusive(z10);
    }

    @C3500a(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setUseDrawableOnForeground(z10);
    }

    @C3500a(name = "rippleColor")
    public void setRippleColor(a aVar, Integer num) {
        C6496s.h(aVar, "view");
        aVar.setRippleColor(num);
    }

    @C3500a(name = "rippleRadius")
    public void setRippleRadius(a aVar, int i10) {
        C6496s.h(aVar, "view");
        aVar.setRippleRadius(Integer.valueOf(i10));
    }

    @C3500a(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setSoundEffectsEnabled(!z10);
    }
}
