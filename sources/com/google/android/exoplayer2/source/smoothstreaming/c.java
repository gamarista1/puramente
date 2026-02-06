package com.google.android.exoplayer2.source.smoothstreaming;

import N9.A;
import N9.C3059h;
import N9.M;
import N9.N;
import N9.T;
import N9.V;
import N9.r;
import P9.i;
import V9.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import ia.A;
import ia.C;
import ia.C3604b;
import ia.J;
import java.util.ArrayList;
import k9.C3717q0;
import k9.e1;
import o9.u;
import o9.v;

final class c implements r, N.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f42987a;

    /* renamed from: b  reason: collision with root package name */
    private final J f42988b;

    /* renamed from: c  reason: collision with root package name */
    private final C f42989c;

    /* renamed from: d  reason: collision with root package name */
    private final v f42990d;

    /* renamed from: e  reason: collision with root package name */
    private final u.a f42991e;

    /* renamed from: f  reason: collision with root package name */
    private final A f42992f;

    /* renamed from: g  reason: collision with root package name */
    private final A.a f42993g;

    /* renamed from: h  reason: collision with root package name */
    private final C3604b f42994h;

    /* renamed from: i  reason: collision with root package name */
    private final V f42995i;

    /* renamed from: j  reason: collision with root package name */
    private final C3059h f42996j;

    /* renamed from: k  reason: collision with root package name */
    private r.a f42997k;

    /* renamed from: l  reason: collision with root package name */
    private a f42998l;

    /* renamed from: m  reason: collision with root package name */
    private i[] f42999m;

    /* renamed from: n  reason: collision with root package name */
    private N f43000n;

    public c(a aVar, b.a aVar2, J j10, C3059h hVar, v vVar, u.a aVar3, ia.A a10, A.a aVar4, C c10, C3604b bVar) {
        this.f42998l = aVar;
        this.f42987a = aVar2;
        this.f42988b = j10;
        this.f42989c = c10;
        this.f42990d = vVar;
        this.f42991e = aVar3;
        this.f42992f = a10;
        this.f42993g = aVar4;
        this.f42994h = bVar;
        this.f42996j = hVar;
        this.f42995i = i(aVar, vVar);
        i[] t10 = t(0);
        this.f42999m = t10;
        this.f43000n = hVar.a(t10);
    }

    private i e(ga.r rVar, long j10) {
        int c10 = this.f42995i.c(rVar.g());
        return new i(this.f42998l.f34759f[c10].f34765a, (int[]) null, (C3717q0[]) null, this.f42987a.a(this.f42989c, this.f42998l, c10, rVar, this.f42988b), this, this.f42994h, j10, this.f42990d, this.f42991e, this.f42992f, this.f42993g);
    }

    private static V i(a aVar, v vVar) {
        T[] tArr = new T[aVar.f34759f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f34759f;
            if (i10 >= bVarArr.length) {
                return new V(tArr);
            }
            C3717q0[] q0VarArr = bVarArr[i10].f34774j;
            C3717q0[] q0VarArr2 = new C3717q0[q0VarArr.length];
            for (int i11 = 0; i11 < q0VarArr.length; i11++) {
                C3717q0 q0Var = q0VarArr[i11];
                q0VarArr2[i11] = q0Var.c(vVar.d(q0Var));
            }
            tArr[i10] = new T(Integer.toString(i10), q0VarArr2);
            i10++;
        }
    }

    private static i[] t(int i10) {
        return new i[i10];
    }

    public long a() {
        return this.f43000n.a();
    }

    public boolean b() {
        return this.f43000n.b();
    }

    public long c() {
        return this.f43000n.c();
    }

    public void f(long j10) {
        this.f43000n.f(j10);
    }

    public long g(long j10) {
        for (i S10 : this.f42999m) {
            S10.S(j10);
        }
        return j10;
    }

    public long h() {
        return -9223372036854775807L;
    }

    public void j() {
        this.f42989c.e();
    }

    public long l(long j10, e1 e1Var) {
        for (i iVar : this.f42999m) {
            if (iVar.f33611a == 2) {
                return iVar.l(j10, e1Var);
            }
        }
        return j10;
    }

    public boolean m(long j10) {
        return this.f43000n.m(j10);
    }

    public V n() {
        return this.f42995i;
    }

    public void o(long j10, boolean z10) {
        for (i o10 : this.f42999m) {
            o10.o(j10, z10);
        }
    }

    public void r(r.a aVar, long j10) {
        this.f42997k = aVar;
        aVar.k(this);
    }

    public long s(ga.r[] rVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j10) {
        ga.r rVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            i iVar = mArr[i10];
            if (iVar != null) {
                i iVar2 = iVar;
                if (rVarArr[i10] == null || !zArr[i10]) {
                    iVar2.P();
                    mArr[i10] = null;
                } else {
                    ((b) iVar2.E()).a(rVarArr[i10]);
                    arrayList.add(iVar2);
                }
            }
            if (mArr[i10] == null && (rVar = rVarArr[i10]) != null) {
                i e10 = e(rVar, j10);
                arrayList.add(e10);
                mArr[i10] = e10;
                zArr2[i10] = true;
            }
        }
        i[] t10 = t(arrayList.size());
        this.f42999m = t10;
        arrayList.toArray(t10);
        this.f43000n = this.f42996j.a(this.f42999m);
        return j10;
    }

    /* renamed from: u */
    public void p(i iVar) {
        this.f42997k.p(this);
    }

    public void v() {
        for (i P10 : this.f42999m) {
            P10.P();
        }
        this.f42997k = null;
    }

    public void w(a aVar) {
        this.f42998l = aVar;
        for (i E10 : this.f42999m) {
            ((b) E10.E()).i(aVar);
        }
        this.f42997k.p(this);
    }
}
