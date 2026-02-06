package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import i.C2043g;
import java.util.ArrayList;

public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f11293a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f11294b;

    /* renamed from: c  reason: collision with root package name */
    e f11295c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f11296d;

    /* renamed from: e  reason: collision with root package name */
    int f11297e;

    /* renamed from: f  reason: collision with root package name */
    int f11298f;

    /* renamed from: g  reason: collision with root package name */
    int f11299g;

    /* renamed from: h  reason: collision with root package name */
    private j.a f11300h;

    /* renamed from: i  reason: collision with root package name */
    a f11301i;

    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f11302a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            g v10 = c.this.f11295c.v();
            if (v10 != null) {
                ArrayList z10 = c.this.f11295c.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) z10.get(i10)) == v10) {
                        this.f11302a = i10;
                        return;
                    }
                }
            }
            this.f11302a = -1;
        }

        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList z10 = c.this.f11295c.z();
            int i11 = i10 + c.this.f11297e;
            int i12 = this.f11302a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) z10.get(i11);
        }

        public int getCount() {
            int size = c.this.f11295c.z().size() - c.this.f11297e;
            if (this.f11302a < 0) {
                return size;
            }
            return size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f11294b.inflate(cVar.f11299g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f11293a = context;
        this.f11294b = LayoutInflater.from(context);
    }

    public void a(e eVar, boolean z10) {
        j.a aVar = this.f11300h;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f11301i == null) {
            this.f11301i = new a();
        }
        return this.f11301i;
    }

    public k c(ViewGroup viewGroup) {
        if (this.f11296d == null) {
            this.f11296d = (ExpandedMenuView) this.f11294b.inflate(C2043g.f21400g, viewGroup, false);
            if (this.f11301i == null) {
                this.f11301i = new a();
            }
            this.f11296d.setAdapter(this.f11301i);
            this.f11296d.setOnItemClickListener(this);
        }
        return this.f11296d;
    }

    public boolean d(e eVar, g gVar) {
        return false;
    }

    public void e(j.a aVar) {
        this.f11300h = aVar;
    }

    public boolean f(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d((IBinder) null);
        j.a aVar = this.f11300h;
        if (aVar == null) {
            return true;
        }
        aVar.b(mVar);
        return true;
    }

    public void g(boolean z10) {
        a aVar = this.f11301i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public void j(Context context, e eVar) {
        if (this.f11298f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f11298f);
            this.f11293a = contextThemeWrapper;
            this.f11294b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f11293a != null) {
            this.f11293a = context;
            if (this.f11294b == null) {
                this.f11294b = LayoutInflater.from(context);
            }
        }
        this.f11295c = eVar;
        a aVar = this.f11301i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f11295c.N(this.f11301i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f11299g = i10;
        this.f11298f = i11;
    }
}
