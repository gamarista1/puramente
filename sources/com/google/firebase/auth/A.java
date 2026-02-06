package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.tasks.Task;
import java.util.List;
import ub.C5230g;
import za.C5298a;

public abstract class A extends C5298a implements C4778b0 {
    public Task A0(Activity activity, C4801n nVar) {
        C4536s.l(activity);
        C4536s.l(nVar);
        return FirebaseAuth.getInstance(K0()).K(activity, nVar, this);
    }

    public Task B0(Activity activity, C4801n nVar) {
        C4536s.l(activity);
        C4536s.l(nVar);
        return FirebaseAuth.getInstance(K0()).l0(activity, nVar, this);
    }

    public Task C0(String str) {
        C4536s.f(str);
        return FirebaseAuth.getInstance(K0()).n0(this, str);
    }

    public Task D0(String str) {
        C4536s.f(str);
        return FirebaseAuth.getInstance(K0()).t0(this, str);
    }

    public Task E0(String str) {
        C4536s.f(str);
        return FirebaseAuth.getInstance(K0()).w0(this, str);
    }

    public Task F0(O o10) {
        return FirebaseAuth.getInstance(K0()).R(this, o10);
    }

    public Task G0(C4780c0 c0Var) {
        C4536s.l(c0Var);
        return FirebaseAuth.getInstance(K0()).S(this, c0Var);
    }

    public Task H0(String str) {
        return I0(str, (C4783e) null);
    }

    public Task I0(String str, C4783e eVar) {
        return FirebaseAuth.getInstance(K0()).T(this, false).continueWithTask(new C4798l0(this, str, eVar));
    }

    public abstract A J0(List list);

    public abstract C5230g K0();

    public abstract void L0(zzafm zzafm);

    public abstract A M0();

    public abstract void N0(List list);

    public abstract zzafm O0();

    public abstract void P0(List list);

    public abstract List Q0();

    public abstract String a();

    public abstract String d();

    public abstract String g();

    public abstract Uri h();

    public abstract String j0();

    public Task o0() {
        return FirebaseAuth.getInstance(K0()).N(this);
    }

    public Task p0(boolean z10) {
        return FirebaseAuth.getInstance(K0()).T(this, z10);
    }

    public abstract B q0();

    public abstract String r();

    public abstract H r0();

    public abstract List s0();

    public abstract String t0();

    public abstract boolean u0();

    public Task v0(C4789h hVar) {
        C4536s.l(hVar);
        return FirebaseAuth.getInstance(K0()).P(this, hVar);
    }

    public Task w0(C4789h hVar) {
        C4536s.l(hVar);
        return FirebaseAuth.getInstance(K0()).s0(this, hVar);
    }

    public Task x0() {
        return FirebaseAuth.getInstance(K0()).m0(this);
    }

    public Task y0() {
        return FirebaseAuth.getInstance(K0()).T(this, false).continueWithTask(new C4796k0(this));
    }

    public Task z0(C4783e eVar) {
        return FirebaseAuth.getInstance(K0()).T(this, false).continueWithTask(new C4794j0(this, eVar));
    }

    public abstract String zzd();

    public abstract String zze();

    public abstract List zzg();
}
