package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.collection.Y;
import java.util.ArrayList;
import n.c;
import n.d;
import r1.C2552a;
import r1.C2553b;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f11157a;

    /* renamed from: b  reason: collision with root package name */
    final b f11158b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f11159a;

        /* renamed from: b  reason: collision with root package name */
        final Context f11160b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList f11161c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        final Y f11162d = new Y();

        public a(Context context, ActionMode.Callback callback) {
            this.f11160b = context;
            this.f11159a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f11162d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            d dVar = new d(this.f11160b, (C2552a) menu);
            this.f11162d.put(menu, dVar);
            return dVar;
        }

        public void a(b bVar) {
            this.f11159a.onDestroyActionMode(e(bVar));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f11159a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean c(b bVar, MenuItem menuItem) {
            return this.f11159a.onActionItemClicked(e(bVar), new c(this.f11160b, (C2553b) menuItem));
        }

        public boolean d(b bVar, Menu menu) {
            return this.f11159a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f11161c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f11161c.get(i10);
                if (fVar != null && fVar.f11158b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f11160b, bVar);
            this.f11161c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f11157a = context;
        this.f11158b = bVar;
    }

    public void finish() {
        this.f11158b.c();
    }

    public View getCustomView() {
        return this.f11158b.d();
    }

    public Menu getMenu() {
        return new d(this.f11157a, (C2552a) this.f11158b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f11158b.f();
    }

    public CharSequence getSubtitle() {
        return this.f11158b.g();
    }

    public Object getTag() {
        return this.f11158b.h();
    }

    public CharSequence getTitle() {
        return this.f11158b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f11158b.j();
    }

    public void invalidate() {
        this.f11158b.k();
    }

    public boolean isTitleOptional() {
        return this.f11158b.l();
    }

    public void setCustomView(View view) {
        this.f11158b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f11158b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f11158b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11158b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f11158b.s(z10);
    }

    public void setSubtitle(int i10) {
        this.f11158b.n(i10);
    }

    public void setTitle(int i10) {
        this.f11158b.q(i10);
    }
}
