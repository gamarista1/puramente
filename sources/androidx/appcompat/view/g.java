package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.g0;
import androidx.core.view.A;
import androidx.core.view.C1679b;
import i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r1.C2552a;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class[] f11163e;

    /* renamed from: f  reason: collision with root package name */
    static final Class[] f11164f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f11165a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f11166b;

    /* renamed from: c  reason: collision with root package name */
    Context f11167c;

    /* renamed from: d  reason: collision with root package name */
    private Object f11168d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class[] f11169c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f11170a;

        /* renamed from: b  reason: collision with root package name */
        private Method f11171b;

        public a(Object obj, String str) {
            this.f11170a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11171b = cls.getMethod(str, f11169c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11171b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11171b.invoke(this.f11170a, new Object[]{menuItem})).booleanValue();
                }
                this.f11171b.invoke(this.f11170a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* renamed from: A  reason: collision with root package name */
        C1679b f11172A;

        /* renamed from: B  reason: collision with root package name */
        private CharSequence f11173B;

        /* renamed from: C  reason: collision with root package name */
        private CharSequence f11174C;

        /* renamed from: D  reason: collision with root package name */
        private ColorStateList f11175D = null;

        /* renamed from: E  reason: collision with root package name */
        private PorterDuff.Mode f11176E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f11178a;

        /* renamed from: b  reason: collision with root package name */
        private int f11179b;

        /* renamed from: c  reason: collision with root package name */
        private int f11180c;

        /* renamed from: d  reason: collision with root package name */
        private int f11181d;

        /* renamed from: e  reason: collision with root package name */
        private int f11182e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11183f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11184g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f11185h;

        /* renamed from: i  reason: collision with root package name */
        private int f11186i;

        /* renamed from: j  reason: collision with root package name */
        private int f11187j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f11188k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f11189l;

        /* renamed from: m  reason: collision with root package name */
        private int f11190m;

        /* renamed from: n  reason: collision with root package name */
        private char f11191n;

        /* renamed from: o  reason: collision with root package name */
        private int f11192o;

        /* renamed from: p  reason: collision with root package name */
        private char f11193p;

        /* renamed from: q  reason: collision with root package name */
        private int f11194q;

        /* renamed from: r  reason: collision with root package name */
        private int f11195r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f11196s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f11197t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f11198u;

        /* renamed from: v  reason: collision with root package name */
        private int f11199v;

        /* renamed from: w  reason: collision with root package name */
        private int f11200w;

        /* renamed from: x  reason: collision with root package name */
        private String f11201x;

        /* renamed from: y  reason: collision with root package name */
        private String f11202y;

        /* renamed from: z  reason: collision with root package name */
        private String f11203z;

        public b(Menu menu) {
            this.f11178a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f11167c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f11196s).setVisible(this.f11197t).setEnabled(this.f11198u);
            boolean z11 = false;
            if (this.f11195r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f11189l).setIcon(this.f11190m);
            int i10 = this.f11199v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f11203z != null) {
                if (!g.this.f11167c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f11203z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f11195r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).h(true);
                }
            }
            String str = this.f11201x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f11163e, g.this.f11165a));
                z11 = true;
            }
            int i11 = this.f11200w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C1679b bVar = this.f11172A;
            if (bVar != null) {
                A.a(menuItem, bVar);
            }
            A.c(menuItem, this.f11173B);
            A.g(menuItem, this.f11174C);
            A.b(menuItem, this.f11191n, this.f11192o);
            A.f(menuItem, this.f11193p, this.f11194q);
            PorterDuff.Mode mode = this.f11176E;
            if (mode != null) {
                A.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f11175D;
            if (colorStateList != null) {
                A.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f11185h = true;
            i(this.f11178a.add(this.f11179b, this.f11186i, this.f11187j, this.f11188k));
        }

        public SubMenu b() {
            this.f11185h = true;
            SubMenu addSubMenu = this.f11178a.addSubMenu(this.f11179b, this.f11186i, this.f11187j, this.f11188k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f11185h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f11167c.obtainStyledAttributes(attributeSet, j.f21626o1);
            this.f11179b = obtainStyledAttributes.getResourceId(j.f21636q1, 0);
            this.f11180c = obtainStyledAttributes.getInt(j.f21646s1, 0);
            this.f11181d = obtainStyledAttributes.getInt(j.f21651t1, 0);
            this.f11182e = obtainStyledAttributes.getInt(j.f21656u1, 0);
            this.f11183f = obtainStyledAttributes.getBoolean(j.f21641r1, true);
            this.f11184g = obtainStyledAttributes.getBoolean(j.f21631p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            boolean z10;
            g0 u10 = g0.u(g.this.f11167c, attributeSet, j.f21661v1);
            this.f11186i = u10.n(j.f21676y1, 0);
            this.f11187j = (u10.k(j.f21439B1, this.f11180c) & -65536) | (u10.k(j.f21444C1, this.f11181d) & 65535);
            this.f11188k = u10.p(j.f21449D1);
            this.f11189l = u10.p(j.f21454E1);
            this.f11190m = u10.n(j.f21666w1, 0);
            this.f11191n = c(u10.o(j.f21459F1));
            this.f11192o = u10.k(j.f21494M1, 4096);
            this.f11193p = c(u10.o(j.f21464G1));
            this.f11194q = u10.k(j.f21514Q1, 4096);
            if (u10.s(j.f21469H1)) {
                this.f11195r = u10.a(j.f21469H1, false) ? 1 : 0;
            } else {
                this.f11195r = this.f11182e;
            }
            this.f11196s = u10.a(j.f21681z1, false);
            this.f11197t = u10.a(j.f21434A1, this.f11183f);
            this.f11198u = u10.a(j.f21671x1, this.f11184g);
            this.f11199v = u10.k(j.f21519R1, -1);
            this.f11203z = u10.o(j.f21474I1);
            this.f11200w = u10.n(j.f21479J1, 0);
            this.f11201x = u10.o(j.f21489L1);
            String o10 = u10.o(j.f21484K1);
            this.f11202y = o10;
            if (o10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f11200w == 0 && this.f11201x == null) {
                this.f11172A = (C1679b) e(o10, g.f11164f, g.this.f11166b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f11172A = null;
            }
            this.f11173B = u10.p(j.f21499N1);
            this.f11174C = u10.p(j.f21524S1);
            if (u10.s(j.f21509P1)) {
                this.f11176E = N.e(u10.k(j.f21509P1, -1), this.f11176E);
            } else {
                this.f11176E = null;
            }
            if (u10.s(j.f21504O1)) {
                this.f11175D = u10.c(j.f21504O1);
            } else {
                this.f11175D = null;
            }
            u10.x();
            this.f11185h = false;
        }

        public void h() {
            this.f11179b = 0;
            this.f11180c = 0;
            this.f11181d = 0;
            this.f11182e = 0;
            this.f11183f = true;
            this.f11184g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f11163e = clsArr;
        f11164f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f11167c = context;
        Object[] objArr = {context};
        this.f11165a = objArr;
        this.f11166b = objArr;
    }

    private Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            z11 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                C1679b bVar2 = bVar.f11172A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f11168d == null) {
            this.f11168d = a(this.f11167c);
        }
        return this.f11168d;
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof C2552a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            XmlResourceParser layout = this.f11167c.getResources().getLayout(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof e) {
                e eVar = (e) menu;
                if (eVar.F()) {
                    eVar.e0();
                    z10 = true;
                }
            }
            c(layout, asAttributeSet, menu);
            if (z10) {
                ((e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th2) {
            if (0 != 0) {
                ((e) menu).d0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
