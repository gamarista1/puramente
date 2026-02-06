package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    e f11304a;

    /* renamed from: b  reason: collision with root package name */
    private int f11305b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11306c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11307d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f11308e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11309f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f11307d = z10;
        this.f11308e = layoutInflater;
        this.f11304a = eVar;
        this.f11309f = i10;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        g v10 = this.f11304a.v();
        if (v10 != null) {
            ArrayList z10 = this.f11304a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) z10.get(i10)) == v10) {
                    this.f11305b = i10;
                    return;
                }
            }
        }
        this.f11305b = -1;
    }

    public e b() {
        return this.f11304a;
    }

    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList arrayList;
        if (this.f11307d) {
            arrayList = this.f11304a.z();
        } else {
            arrayList = this.f11304a.E();
        }
        int i11 = this.f11305b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayList.get(i10);
    }

    public void d(boolean z10) {
        this.f11306c = z10;
    }

    public int getCount() {
        ArrayList arrayList;
        if (this.f11307d) {
            arrayList = this.f11304a.z();
        } else {
            arrayList = this.f11304a.E();
        }
        if (this.f11305b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10;
        if (view == null) {
            view = this.f11308e.inflate(this.f11309f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i12 = i10 - 1;
        if (i12 >= 0) {
            i11 = getItem(i12).getGroupId();
        } else {
            i11 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f11304a.G() || groupId == i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f11306c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
