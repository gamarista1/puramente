package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rh.m;
import rh.u;
import rh.v;

public class n implements a {

    /* renamed from: c  reason: collision with root package name */
    private rh.n f41104c = null;

    public void a(rh.n nVar) {
        this.f41104c = nVar;
    }

    public List b(v vVar) {
        rh.n nVar = this.f41104c;
        if (nVar == null) {
            return Collections.emptyList();
        }
        List<m> b10 = nVar.b(vVar);
        ArrayList arrayList = new ArrayList();
        for (m mVar : b10) {
            try {
                new u.a().a(mVar.e(), mVar.g());
                arrayList.add(mVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    public void c() {
        this.f41104c = null;
    }

    public void d(v vVar, List list) {
        rh.n nVar = this.f41104c;
        if (nVar != null) {
            nVar.d(vVar, list);
        }
    }
}
