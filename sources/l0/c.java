package L0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.C6496s;
import q0.C2423i;
import yf.C6787a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C6787a f4119a;

    /* renamed from: b  reason: collision with root package name */
    private C2423i f4120b;

    /* renamed from: c  reason: collision with root package name */
    private C6787a f4121c;

    /* renamed from: d  reason: collision with root package name */
    private C6787a f4122d;

    /* renamed from: e  reason: collision with root package name */
    private C6787a f4123e;

    /* renamed from: f  reason: collision with root package name */
    private C6787a f4124f;

    public c(C6787a aVar, C2423i iVar, C6787a aVar2, C6787a aVar3, C6787a aVar4, C6787a aVar5) {
        this.f4119a = aVar;
        this.f4120b = iVar;
        this.f4121c = aVar2;
        this.f4122d = aVar3;
        this.f4123e = aVar4;
        this.f4124f = aVar5;
    }

    private final void b(Menu menu, b bVar, C6787a aVar) {
        if (aVar != null && menu.findItem(bVar.b()) == null) {
            a(menu, bVar);
        } else if (aVar == null && menu.findItem(bVar.b()) != null) {
            menu.removeItem(bVar.b());
        }
    }

    public final void a(Menu menu, b bVar) {
        menu.add(0, bVar.b(), bVar.c(), bVar.e()).setShowAsAction(1);
    }

    public final C2423i c() {
        return this.f4120b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        C6496s.e(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.b()) {
            C6787a aVar = this.f4121c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.b()) {
            C6787a aVar2 = this.f4122d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.b()) {
            C6787a aVar3 = this.f4123e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != b.SelectAll.b()) {
            return false;
        } else {
            C6787a aVar4 = this.f4124f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        } else if (actionMode != null) {
            if (this.f4121c != null) {
                a(menu, b.Copy);
            }
            if (this.f4122d != null) {
                a(menu, b.Paste);
            }
            if (this.f4123e != null) {
                a(menu, b.Cut);
            }
            if (this.f4124f == null) {
                return true;
            }
            a(menu, b.SelectAll);
            return true;
        } else {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
    }

    public final void f() {
        C6787a aVar = this.f4119a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(C6787a aVar) {
        this.f4121c = aVar;
    }

    public final void i(C6787a aVar) {
        this.f4123e = aVar;
    }

    public final void j(C6787a aVar) {
        this.f4122d = aVar;
    }

    public final void k(C6787a aVar) {
        this.f4124f = aVar;
    }

    public final void l(C2423i iVar) {
        this.f4120b = iVar;
    }

    public final void m(Menu menu) {
        b(menu, b.Copy, this.f4121c);
        b(menu, b.Paste, this.f4122d);
        b(menu, b.Cut, this.f4123e);
        b(menu, b.SelectAll, this.f4124f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(yf.C6787a r6, q0.C2423i r7, yf.C6787a r8, yf.C6787a r9, yf.C6787a r10, yf.C6787a r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0012
            q0.i$a r6 = q0.C2423i.f25325e
            q0.i r7 = r6.a()
        L_0x0012:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r8
        L_0x001a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r10
        L_0x0028:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002e
            r12 = r0
            goto L_0x002f
        L_0x002e:
            r12 = r11
        L_0x002f:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.<init>(yf.a, q0.i, yf.a, yf.a, yf.a, yf.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
