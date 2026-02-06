package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.f;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f37330a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteException f37331b;

    /* renamed from: c  reason: collision with root package name */
    private j f37332c;

    /* renamed from: d  reason: collision with root package name */
    private h f37333d;

    /* renamed from: e  reason: collision with root package name */
    private f f37334e;

    /* renamed from: f  reason: collision with root package name */
    private g f37335f;

    /* renamed from: g  reason: collision with root package name */
    private int f37336g = Binder.getCallingUid();

    public c(j jVar) {
        this.f37332c = jVar;
        try {
            this.f37330a = jVar.a();
        } catch (RemoteException e10) {
            this.f37331b = e10;
        }
    }

    public String a() {
        RemoteException remoteException = this.f37331b;
        if (remoteException == null) {
            return this.f37330a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f37332c;
    }

    public h c() {
        return this.f37333d;
    }

    public f d() {
        return this.f37334e;
    }

    public g e() {
        return this.f37335f;
    }

    public int f() {
        return this.f37336g;
    }

    public String toString() {
        return "CommandResult: [" + "CallingUid: " + this.f37336g + ", SuccessResult: " + this.f37332c + ", FailureResult: " + this.f37333d + ", DecisionResult: " + this.f37334e + ", ExceptionResult: " + this.f37335f + "]";
    }

    public c(h hVar) {
        this.f37333d = hVar;
        try {
            this.f37330a = hVar.a();
        } catch (RemoteException e10) {
            this.f37331b = e10;
        }
    }

    public c(f fVar) {
        this.f37334e = fVar;
        try {
            this.f37330a = fVar.a();
        } catch (RemoteException e10) {
            this.f37331b = e10;
        }
    }

    public c(g gVar) {
        this.f37335f = gVar;
    }
}
