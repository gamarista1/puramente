package com.facebook.imagepipeline.producers;

import e7.d;
import e7.e;
import kotlin.jvm.internal.C6496s;

public final class F extends E implements d {

    /* renamed from: c  reason: collision with root package name */
    private final e f39811c;

    /* renamed from: d  reason: collision with root package name */
    private final d f39812d;

    public F(e eVar, d dVar) {
        super(eVar, dVar);
        this.f39811c = eVar;
        this.f39812d = dVar;
    }

    public void a(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        e eVar = this.f39811c;
        if (eVar != null) {
            eVar.c(e0Var.F(), e0Var.a(), e0Var.getId(), e0Var.M());
        }
        d dVar = this.f39812d;
        if (dVar != null) {
            dVar.a(e0Var);
        }
    }

    public void e(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        e eVar = this.f39811c;
        if (eVar != null) {
            eVar.b(e0Var.F(), e0Var.getId(), e0Var.M());
        }
        d dVar = this.f39812d;
        if (dVar != null) {
            dVar.e(e0Var);
        }
    }

    public void g(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        e eVar = this.f39811c;
        if (eVar != null) {
            eVar.k(e0Var.getId());
        }
        d dVar = this.f39812d;
        if (dVar != null) {
            dVar.g(e0Var);
        }
    }

    public void i(e0 e0Var, Throwable th2) {
        C6496s.h(e0Var, "producerContext");
        e eVar = this.f39811c;
        if (eVar != null) {
            eVar.j(e0Var.F(), e0Var.getId(), th2, e0Var.M());
        }
        d dVar = this.f39812d;
        if (dVar != null) {
            dVar.i(e0Var, th2);
        }
    }
}
