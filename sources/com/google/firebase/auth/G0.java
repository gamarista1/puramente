package com.google.firebase.auth;

import com.google.firebase.auth.Q;
import ub.m;

public final /* synthetic */ class G0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Q.b f56904a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ m f56905b;

    public /* synthetic */ G0(Q.b bVar, m mVar) {
        this.f56904a = bVar;
        this.f56905b = mVar;
    }

    public final void run() {
        this.f56904a.onVerificationFailed(this.f56905b);
    }
}
