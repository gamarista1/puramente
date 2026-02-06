package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.c;
import androidx.core.view.C1679b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r1.C2552a;

public class e implements C2552a {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f11310A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f11311a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f11312b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11313c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11314d;

    /* renamed from: e  reason: collision with root package name */
    private a f11315e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f11316f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f11317g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11318h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f11319i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f11320j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11321k;

    /* renamed from: l  reason: collision with root package name */
    private int f11322l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f11323m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f11324n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f11325o;

    /* renamed from: p  reason: collision with root package name */
    View f11326p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11327q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11328r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11329s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11330t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11331u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList f11332v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList f11333w = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    private g f11334x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f11335y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11336z;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean d(g gVar);
    }

    public e(Context context) {
        this.f11311a = context;
        this.f11312b = context.getResources();
        this.f11316f = new ArrayList();
        this.f11317g = new ArrayList();
        this.f11318h = true;
        this.f11319i = new ArrayList();
        this.f11320j = new ArrayList();
        this.f11321k = true;
        c0(true);
    }

    private static int B(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f11310A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f11316f.size()) {
            this.f11316f.remove(i10);
            if (z10) {
                L(true);
            }
        }
    }

    private void X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C10 = C();
        if (view != null) {
            this.f11326p = view;
            this.f11324n = null;
            this.f11325o = null;
        } else {
            if (i10 > 0) {
                this.f11324n = C10.getText(i10);
            } else if (charSequence != null) {
                this.f11324n = charSequence;
            }
            if (i11 > 0) {
                this.f11325o = c.getDrawable(u(), i11);
            } else if (drawable != null) {
                this.f11325o = drawable;
            }
            this.f11326p = null;
        }
        L(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (androidx.core.view.C1686e0.l(android.view.ViewConfiguration.get(r2.f11311a), r2.f11311a) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f11312b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f11311a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f11311a
            boolean r3 = androidx.core.view.C1686e0.l(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f11314d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c0(boolean):void");
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (!this.f11333w.isEmpty()) {
            e0();
            Iterator it = this.f11333w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f11333w.remove(weakReference);
                } else {
                    jVar.g(z10);
                }
            }
            d0();
        }
    }

    private boolean j(m mVar, j jVar) {
        boolean z10 = false;
        if (this.f11333w.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z10 = jVar.f(mVar);
        }
        Iterator it = this.f11333w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f11333w.remove(weakReference);
            } else if (!z10) {
                z10 = jVar2.f(mVar);
            }
        }
        return z10;
    }

    private static int n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f11330t;
    }

    /* access modifiers changed from: package-private */
    public Resources C() {
        return this.f11312b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f11318h) {
            return this.f11317g;
        }
        this.f11317g.clear();
        int size = this.f11316f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f11316f.get(i10);
            if (gVar.isVisible()) {
                this.f11317g.add(gVar);
            }
        }
        this.f11318h = false;
        this.f11321k = true;
        return this.f11317g;
    }

    public boolean F() {
        return !this.f11327q;
    }

    public boolean G() {
        return this.f11335y;
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        return this.f11313c;
    }

    public boolean I() {
        return this.f11314d;
    }

    /* access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f11321k = true;
        L(true);
    }

    /* access modifiers changed from: package-private */
    public void K(g gVar) {
        this.f11318h = true;
        L(true);
    }

    public void L(boolean z10) {
        if (!this.f11327q) {
            if (z10) {
                this.f11318h = true;
                this.f11321k = true;
            }
            i(z10);
            return;
        }
        this.f11328r = true;
        if (z10) {
            this.f11329s = true;
        }
    }

    public boolean M(MenuItem menuItem, int i10) {
        return N(menuItem, (j) null, i10);
    }

    public boolean N(MenuItem menuItem, j jVar, int i10) {
        boolean z10;
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        C1679b a10 = gVar.a();
        if (a10 == null || !a10.a()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (gVar.j()) {
            k10 |= gVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                a10.e(mVar);
            }
            k10 |= j(mVar, jVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public void P(j jVar) {
        Iterator it = this.f11333w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f11333w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).Q(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f11315e = aVar;
    }

    public e T(int i10) {
        this.f11322l = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void U(MenuItem menuItem) {
        boolean z10;
        int groupId = menuItem.getGroupId();
        int size = this.f11316f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f11316f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                if (gVar == menuItem) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gVar.s(z10);
            }
        }
        d0();
    }

    /* access modifiers changed from: protected */
    public e V(int i10) {
        X(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e W(Drawable drawable) {
        X(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Y(int i10) {
        X(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Z(CharSequence charSequence) {
        X(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B10 = B(i12);
        g g10 = g(i10, i11, i12, B10, charSequence, this.f11322l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f11323m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f11316f;
        arrayList.add(n(arrayList, B10), g10);
        L(true);
        return g10;
    }

    /* access modifiers changed from: protected */
    public e a0(View view) {
        X(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f11311a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent4;
            }
        }
        return i14;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f11311a);
    }

    public void b0(boolean z10) {
        this.f11336z = z10;
    }

    public void c(j jVar, Context context) {
        this.f11333w.add(new WeakReference(jVar));
        jVar.j(context, this);
        this.f11321k = true;
    }

    public void clear() {
        g gVar = this.f11334x;
        if (gVar != null) {
            f(gVar);
        }
        this.f11316f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f11325o = null;
        this.f11324n = null;
        this.f11326p = null;
        L(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f11315e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f11327q = false;
        if (this.f11328r) {
            this.f11328r = false;
            L(this.f11329s);
        }
    }

    public final void e(boolean z10) {
        if (!this.f11331u) {
            this.f11331u = true;
            Iterator it = this.f11333w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f11333w.remove(weakReference);
                } else {
                    jVar.a(this, z10);
                }
            }
            this.f11331u = false;
        }
    }

    public void e0() {
        if (!this.f11327q) {
            this.f11327q = true;
            this.f11328r = false;
            this.f11329s = false;
        }
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f11333w.isEmpty() && this.f11334x == gVar) {
            e0();
            Iterator it = this.f11333w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f11333w.remove(weakReference);
                } else {
                    z10 = jVar.i(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            d0();
            if (z10) {
                this.f11334x = null;
            }
        }
        return z10;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f11316f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i10) {
        return (MenuItem) this.f11316f.get(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f11315e;
        if (aVar == null || !aVar.a(eVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean hasVisibleItems() {
        if (this.f11336z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f11316f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (p(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f11333w.isEmpty()) {
            return false;
        }
        e0();
        Iterator it = this.f11333w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f11333w.remove(weakReference);
            } else {
                z10 = jVar.d(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        d0();
        if (z10) {
            this.f11334x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f11316f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f11316f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public g p(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f11332v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean H10 = H();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            if (H10) {
                c10 = gVar.getAlphabeticShortcut();
            } else {
                c10 = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (H10 && c10 == 8 && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return M(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        g p10 = p(i10, keyEvent);
        if (p10 != null) {
            z10 = M(p10, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            e(true);
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void q(List list, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean H10 = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f11316f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) this.f11316f.get(i12);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                if (H10) {
                    c10 = gVar.getAlphabeticShortcut();
                } else {
                    c10 = gVar.getNumericShortcut();
                }
                if (H10) {
                    i11 = gVar.getAlphabeticModifiers();
                } else {
                    i11 = gVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i11 & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (H10 && c10 == 8 && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E10 = E();
        if (this.f11321k) {
            Iterator it = this.f11333w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f11333w.remove(weakReference);
                } else {
                    z10 |= jVar.h();
                }
            }
            if (z10) {
                this.f11319i.clear();
                this.f11320j.clear();
                int size = E10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) E10.get(i10);
                    if (gVar.l()) {
                        this.f11319i.add(gVar);
                    } else {
                        this.f11320j.add(gVar);
                    }
                }
            } else {
                this.f11319i.clear();
                this.f11320j.clear();
                this.f11320j.addAll(E());
            }
            this.f11321k = false;
        }
    }

    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f11316f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f11316f.get(l10)).getGroupId() != i10) {
                    L(true);
                } else {
                    O(l10, false);
                    i11 = i12;
                }
            }
            L(true);
        }
    }

    public void removeItem(int i10) {
        O(o(i10), true);
    }

    public ArrayList s() {
        r();
        return this.f11319i;
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f11316f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f11316f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f11335y = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f11316f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f11316f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f11316f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f11316f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            L(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f11313c = z10;
        L(false);
    }

    public int size() {
        return this.f11316f.size();
    }

    /* access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f11311a;
    }

    public g v() {
        return this.f11334x;
    }

    public Drawable w() {
        return this.f11325o;
    }

    public CharSequence x() {
        return this.f11324n;
    }

    public View y() {
        return this.f11326p;
    }

    public ArrayList z() {
        r();
        return this.f11320j;
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f11312b.getString(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f11312b.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f11311a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f11312b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f11312b.getString(i13));
    }
}
