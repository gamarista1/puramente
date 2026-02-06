package io.invertase.firebase.storage;

import Ue.g;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.C4848d;
import com.google.firebase.storage.D;
import com.google.firebase.storage.o;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.util.concurrent.ExecutorService;

class f extends p {

    /* renamed from: f  reason: collision with root package name */
    private C4848d f71476f;

    f(int i10, o oVar, String str) {
        super(i10, oVar, str);
    }

    private void p(ExecutorService executorService) {
        this.f71476f.s(executorService, new c(this));
        this.f71476f.addOnCanceledListener(executorService, new d(this));
        this.f71476f.r(executorService, new e(this));
    }

    private static WritableMap s(C4848d.a aVar) {
        WritableMap createMap = Arguments.createMap();
        if (aVar != null) {
            createMap.putDouble("totalBytes", (double) aVar.d());
            createMap.putDouble("bytesTransferred", (double) aVar.c());
            createMap.putString("state", a.e(aVar.b()));
        } else {
            createMap.putDouble("totalBytes", 0.0d);
            createMap.putDouble("bytesTransferred", 0.0d);
            createMap.putString("state", a.e((D) null));
        }
        return createMap;
    }

    private String t(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }

    private String u(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf <= 0) {
            return "/";
        }
        return str.substring(0, lastIndexOf) + "/";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(C4848d.a aVar) {
        Log.d("RNFBStorageDownload", "onProgress " + this.f71494c.toString());
        g.i().o(new g(s(aVar), "state_changed", this.f71493b, this.f71492a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        Log.d("RNFBStorageDownload", "onCancelled " + this.f71494c.toString());
        g.i().o(new g(p.a(s((C4848d.a) this.f71476f.F())), "state_changed", this.f71493b, this.f71492a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(C4848d.a aVar) {
        Log.d("RNFBStorageDownload", "onPaused " + this.f71494c.toString());
        g.i().o(new g(s(aVar), "state_changed", this.f71493b, this.f71492a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(Promise promise, Task task) {
        f();
        if (task.isSuccessful()) {
            Log.d("RNFBStorageDownload", "onComplete:success " + this.f71494c.toString());
            WritableMap s10 = s((C4848d.a) task.getResult());
            g i10 = g.i();
            i10.o(new g(s10, "state_changed", this.f71493b, this.f71492a));
            i10.o(new g(s((C4848d.a) task.getResult()), "download_success", this.f71493b, this.f71492a));
            promise.resolve(s((C4848d.a) task.getResult()));
            return;
        }
        Log.d("RNFBStorageDownload", "onComplete:failure " + this.f71494c.toString());
        g i11 = g.i();
        WritableMap b10 = p.b(task.getException(), s((C4848d.a) this.f71476f.F()), true);
        if (b10 != null) {
            i11.o(new g(b10, "state_changed", this.f71493b, this.f71492a));
        }
        i11.o(new g(p.b(task.getException(), s((C4848d.a) this.f71476f.F()), false), "download_failure", this.f71493b, this.f71492a));
        a.g(promise, task.getException());
    }

    /* access modifiers changed from: package-private */
    public void q(ExecutorService executorService, Promise promise) {
        C4848d dVar = this.f71476f;
        if (dVar == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "error-creating-directory", "Unable to create the directory specified as the download path for your file.");
        } else {
            dVar.addOnCompleteListener(executorService, new b(this, promise));
        }
    }

    /* access modifiers changed from: package-private */
    public void r(ExecutorService executorService, String str) {
        boolean z10;
        String u10 = u(str);
        File file = new File(u10);
        if (!file.exists()) {
            z10 = file.mkdirs();
        } else {
            z10 = true;
        }
        if (z10) {
            this.f71476f = this.f71494c.l(new File(u10, t(str)));
            p(executorService);
            k(this.f71476f);
        }
    }
}
