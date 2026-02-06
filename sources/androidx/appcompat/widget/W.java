package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.C1607v;
import androidx.collection.C1609x;
import androidx.collection.Y;
import androidx.collection.Z;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.C2162a;
import org.xmlpull.v1.XmlPullParser;
import q1.C2429a;

public final class W {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f11740h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static W f11741i;

    /* renamed from: j  reason: collision with root package name */
    private static final a f11742j = new a(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap f11743a;

    /* renamed from: b  reason: collision with root package name */
    private Y f11744b;

    /* renamed from: c  reason: collision with root package name */
    private Z f11745c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap f11746d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f11747e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11748f;

    /* renamed from: g  reason: collision with root package name */
    private c f11749g;

    private static class a extends C1609x {
        public a(int i10) {
            super(i10);
        }

        private static int b(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i10, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter d(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(W w10, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C1607v vVar = (C1607v) this.f11746d.get(context);
            if (vVar == null) {
                vVar = new C1607v();
                this.f11746d.put(context, vVar);
            }
            vVar.j(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f11743a == null) {
            this.f11743a = new WeakHashMap();
        }
        Z z10 = (Z) this.f11743a.get(context);
        if (z10 == null) {
            z10 = new Z();
            this.f11743a.put(context, z10);
        }
        z10.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (!this.f11748f) {
            this.f11748f = true;
            Drawable i10 = i(context, C2162a.f23478a);
            if (i10 == null || !p(i10)) {
                this.f11748f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        Drawable drawable;
        if (this.f11747e == null) {
            this.f11747e = new TypedValue();
        }
        TypedValue typedValue = this.f11747e;
        context.getResources().getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        c cVar = this.f11749g;
        if (cVar == null) {
            drawable = null;
        } else {
            drawable = cVar.a(this, context, i10);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d10, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized W g() {
        W w10;
        synchronized (W.class) {
            try {
                if (f11741i == null) {
                    W w11 = new W();
                    f11741i = w11;
                    o(w11);
                }
                w10 = f11741i;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return w10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable h(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f11746d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            androidx.collection.v r0 = (androidx.collection.C1607v) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.e(r5)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002f
        L_0x002a:
            r0.k(r5)     // Catch:{ all -> 0x0028 }
        L_0x002d:
            monitor-exit(r3)
            return r1
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.W.h(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter c10;
        synchronized (W.class) {
            a aVar = f11742j;
            c10 = aVar.c(i10, mode);
            if (c10 == null) {
                c10 = new PorterDuffColorFilter(i10, mode);
                aVar.d(i10, mode, c10);
            }
        }
        return c10;
    }

    private ColorStateList m(Context context, int i10) {
        Z z10;
        WeakHashMap weakHashMap = this.f11743a;
        if (weakHashMap == null || (z10 = (Z) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) z10.g(i10);
    }

    private static void o(W w10) {
    }

    private static boolean p(Drawable drawable) {
        if ((drawable instanceof F3.c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c A[Catch:{ Exception -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable q(android.content.Context r11, int r12) {
        /*
            r10 = this;
            androidx.collection.Y r0 = r10.f11744b
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b3
            androidx.collection.Z r0 = r10.f11745c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.g(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.Y r3 = r10.f11744b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.Z r0 = new androidx.collection.Z
            r0.<init>()
            r10.f11745c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f11747e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f11747e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f11747e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = d(r0)
            android.graphics.drawable.Drawable r6 = r10.h(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00ab
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00ab
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x008f }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x008f }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x008f }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009c
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x008f }
            androidx.collection.Z r8 = r10.f11745c     // Catch:{ Exception -> 0x008f }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x008f }
            androidx.collection.Y r8 = r10.f11744b     // Catch:{ Exception -> 0x008f }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x008f }
            androidx.appcompat.widget.W$b r3 = (androidx.appcompat.widget.W.b) r3     // Catch:{ Exception -> 0x008f }
            if (r3 == 0) goto L_0x0091
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x008f }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x008f }
            goto L_0x0091
        L_0x008f:
            r11 = move-exception
            goto L_0x00a4
        L_0x0091:
            if (r6 == 0) goto L_0x00ab
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x008f }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x008f }
            r10.a(r11, r4, r6)     // Catch:{ Exception -> 0x008f }
            goto L_0x00ab
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x008f }
            throw r11     // Catch:{ Exception -> 0x008f }
        L_0x00a4:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00ab:
            if (r6 != 0) goto L_0x00b2
            androidx.collection.Z r11 = r10.f11745c
            r11.a(r12, r2)
        L_0x00b2:
            return r6
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.W.q(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList l10 = l(context, i10);
        if (l10 != null) {
            Drawable l11 = C2429a.l(drawable.mutate());
            C2429a.i(l11, l10);
            PorterDuff.Mode n10 = n(i10);
            if (n10 == null) {
                return l11;
            }
            C2429a.j(l11, n10);
            return l11;
        }
        c cVar = this.f11749g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, e0 e0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = e0Var.f11893d;
            if (z10 || e0Var.f11892c) {
                if (z10) {
                    colorStateList = e0Var.f11890a;
                } else {
                    colorStateList = null;
                }
                if (e0Var.f11892c) {
                    mode = e0Var.f11891b;
                } else {
                    mode = f11740h;
                }
                drawable.setColorFilter(f(colorStateList, mode, iArr));
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable q10;
        try {
            c(context);
            q10 = q(context, i10);
            if (q10 == null) {
                q10 = e(context, i10);
            }
            if (q10 == null) {
                q10 = androidx.core.content.c.getDrawable(context, i10);
            }
            if (q10 != null) {
                q10 = u(context, i10, z10, q10);
            }
            if (q10 != null) {
                N.b(q10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return q10;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList l(Context context, int i10) {
        ColorStateList m10;
        m10 = m(context, i10);
        if (m10 == null) {
            c cVar = this.f11749g;
            if (cVar == null) {
                m10 = null;
            } else {
                m10 = cVar.b(context, i10);
            }
            if (m10 != null) {
                b(context, i10, m10);
            }
        }
        return m10;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode n(int i10) {
        c cVar = this.f11749g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        C1607v vVar = (C1607v) this.f11746d.get(context);
        if (vVar != null) {
            vVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable s(Context context, q0 q0Var, int i10) {
        try {
            Drawable q10 = q(context, i10);
            if (q10 == null) {
                q10 = q0Var.a(i10);
            }
            if (q10 == null) {
                return null;
            }
            return u(context, i10, false, q10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void t(c cVar) {
        this.f11749g = cVar;
    }

    /* access modifiers changed from: package-private */
    public boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f11749g;
        if (cVar == null || !cVar.c(context, i10, drawable)) {
            return false;
        }
        return true;
    }
}
