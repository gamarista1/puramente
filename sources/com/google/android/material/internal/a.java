package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f55975a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set f55976b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private b f55977c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55978d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f55979e;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0835a implements h.a {
        C0835a() {
        }

        /* renamed from: b */
        public void a(h hVar, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(hVar, aVar.f55979e)) {
                    return;
                }
            } else if (!a.this.g(hVar)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set set);
    }

    /* access modifiers changed from: private */
    public boolean g(h hVar) {
        int id2 = hVar.getId();
        if (this.f55976b.contains(Integer.valueOf(id2))) {
            return false;
        }
        h hVar2 = (h) this.f55975a.get(Integer.valueOf(k()));
        if (hVar2 != null) {
            r(hVar2, false);
        }
        boolean add = this.f55976b.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    /* access modifiers changed from: private */
    public void m() {
        b bVar = this.f55977c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* access modifiers changed from: private */
    public boolean r(h hVar, boolean z10) {
        int id2 = hVar.getId();
        if (!this.f55976b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (!z10 || this.f55976b.size() != 1 || !this.f55976b.contains(Integer.valueOf(id2))) {
            boolean remove = this.f55976b.remove(Integer.valueOf(id2));
            if (hVar.isChecked()) {
                hVar.setChecked(false);
            }
            return remove;
        }
        hVar.setChecked(true);
        return false;
    }

    public void e(h hVar) {
        this.f55975a.put(Integer.valueOf(hVar.getId()), hVar);
        if (hVar.isChecked()) {
            g(hVar);
        }
        hVar.setInternalOnCheckedChangeListener(new C0835a());
    }

    public void f(int i10) {
        h hVar = (h) this.f55975a.get(Integer.valueOf(i10));
        if (hVar != null && g(hVar)) {
            m();
        }
    }

    public void h() {
        boolean isEmpty = this.f55976b.isEmpty();
        for (h r10 : this.f55975a.values()) {
            r(r10, false);
        }
        if (!isEmpty) {
            m();
        }
    }

    public Set i() {
        return new HashSet(this.f55976b);
    }

    public List j(ViewGroup viewGroup) {
        Set i10 = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof h) && i10.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f55978d || this.f55976b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f55976b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f55978d;
    }

    public void n(h hVar) {
        hVar.setInternalOnCheckedChangeListener((h.a) null);
        this.f55975a.remove(Integer.valueOf(hVar.getId()));
        this.f55976b.remove(Integer.valueOf(hVar.getId()));
    }

    public void o(b bVar) {
        this.f55977c = bVar;
    }

    public void p(boolean z10) {
        this.f55979e = z10;
    }

    public void q(boolean z10) {
        if (this.f55978d != z10) {
            this.f55978d = z10;
            h();
        }
    }
}
