package com.google.firebase.storage;

import Kc.d;
import Kc.h;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ub.C5230g;

public class o implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f58110a;

    /* renamed from: b  reason: collision with root package name */
    private final C4849e f58111b;

    class a implements Continuation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f58112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f58113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f58114c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f58115d;

        a(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f58112a = list;
            this.f58113b = list2;
            this.f58114c = executor;
            this.f58115d = taskCompletionSource;
        }

        /* renamed from: a */
        public Task then(Task task) {
            if (task.isSuccessful()) {
                C4853i iVar = (C4853i) task.getResult();
                this.f58112a.addAll(iVar.d());
                this.f58113b.addAll(iVar.b());
                if (iVar.c() != null) {
                    o.this.A((Integer) null, iVar.c()).continueWithTask(this.f58114c, this);
                } else {
                    this.f58115d.setResult(new C4853i(this.f58112a, this.f58113b, (String) null));
                }
            } else {
                this.f58115d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    o(Uri uri, C4849e eVar) {
        boolean z10;
        boolean z11 = false;
        if (uri != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "storageUri cannot be null");
        C4536s.b(eVar != null ? true : z11, "FirebaseApp cannot be null");
        this.f58110a = uri;
        this.f58111b = eVar;
    }

    /* access modifiers changed from: private */
    public Task A(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        F.b().f(new C4854j(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public L C(byte[] bArr, n nVar) {
        boolean z10;
        boolean z11 = false;
        if (bArr != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "bytes cannot be null");
        if (nVar != null) {
            z11 = true;
        }
        C4536s.b(z11, "metadata cannot be null");
        L l10 = new L(this, nVar, bArr);
        l10.b0();
        return l10;
    }

    public L D(Uri uri, n nVar) {
        boolean z10;
        boolean z11 = false;
        if (uri != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "uri cannot be null");
        if (nVar != null) {
            z11 = true;
        }
        C4536s.b(z11, "metadata cannot be null");
        L l10 = new L(this, nVar, uri, (Uri) null);
        l10.b0();
        return l10;
    }

    public Task E(n nVar) {
        C4536s.l(nVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        F.b().f(new K(this, taskCompletionSource, nVar));
        return taskCompletionSource.getTask();
    }

    public o b(String str) {
        C4536s.b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new o(this.f58110a.buildUpon().appendEncodedPath(d.b(d.a(str))).build(), this.f58111b);
    }

    /* renamed from: c */
    public int compareTo(o oVar) {
        return this.f58110a.compareTo(oVar.f58110a);
    }

    public Task e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        F.b().f(new C4847c(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        return ((o) obj).toString().equals(toString());
    }

    /* access modifiers changed from: package-private */
    public C5230g f() {
        return t().a();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public Task i() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        F.b().f(new C4851g(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public C4848d j(Uri uri) {
        C4848d dVar = new C4848d(this, uri);
        dVar.b0();
        return dVar;
    }

    public C4848d l(File file) {
        return j(Uri.fromFile(file));
    }

    public Task m() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        F.b().f(new C4852h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public String o() {
        String path = this.f58110a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return path.substring(lastIndexOf + 1);
        }
        return path;
    }

    public o p() {
        String path = this.f58110a.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        String str = "/";
        if (path.equals(str)) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = path.substring(0, lastIndexOf);
        }
        return new o(this.f58110a.buildUpon().path(str).build(), this.f58111b);
    }

    public String r() {
        return this.f58110a.getPath();
    }

    public o s() {
        return new o(this.f58110a.buildUpon().path("").build(), this.f58111b);
    }

    public C4849e t() {
        return this.f58111b;
    }

    public String toString() {
        return "gs://" + this.f58110a.getAuthority() + this.f58110a.getEncodedPath();
    }

    /* access modifiers changed from: package-private */
    public h u() {
        return new h(this.f58110a, this.f58111b.e());
    }

    public Task x(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "maxResults must be greater than zero");
        if (i10 <= 1000) {
            z11 = true;
        }
        C4536s.b(z11, "maxResults must be at most 1000");
        return A(Integer.valueOf(i10), (String) null);
    }

    public Task y(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "maxResults must be greater than zero");
        if (i10 <= 1000) {
            z11 = true;
        } else {
            z11 = false;
        }
        C4536s.b(z11, "maxResults must be at most 1000");
        if (str != null) {
            z12 = true;
        }
        C4536s.b(z12, "pageToken must be non-null to resume a previous list() operation");
        return A(Integer.valueOf(i10), str);
    }

    public Task z() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor a10 = F.b().a();
        A((Integer) null, (String) null).continueWithTask(a10, new a(arrayList, arrayList2, a10, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
