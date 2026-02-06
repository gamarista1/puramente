package io.invertase.firebase.storage;

import Ue.g;
import Ue.m;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.D;
import com.google.firebase.storage.L;
import com.google.firebase.storage.n;
import com.google.firebase.storage.o;
import java.util.concurrent.ExecutorService;

class u extends p {

    /* renamed from: f  reason: collision with root package name */
    private L f71501f;

    u(int i10, o oVar, String str) {
        super(i10, oVar, str);
    }

    private void p(ExecutorService executorService) {
        this.f71501f.s(executorService, new r(this));
        this.f71501f.addOnCanceledListener(executorService, new s(this));
        this.f71501f.r(executorService, new t(this));
    }

    private static WritableMap t(L.b bVar) {
        WritableMap createMap = Arguments.createMap();
        if (bVar != null) {
            createMap.putDouble("totalBytes", (double) bVar.e());
            createMap.putDouble("bytesTransferred", (double) bVar.c());
            createMap.putString("state", a.e(bVar.b()));
            createMap.putMap("metadata", a.d(bVar.d()));
        } else {
            createMap.putDouble("totalBytes", 0.0d);
            createMap.putDouble("bytesTransferred", 0.0d);
            createMap.putString("state", a.e((D) null));
            createMap.putMap("metadata", Arguments.createMap());
        }
        return createMap;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(L.b bVar) {
        Log.d("RNFBStorageUpload", "onProgress " + this.f71494c.toString());
        g.i().o(new g(t(bVar), "state_changed", this.f71493b, this.f71492a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v() {
        Log.d("RNFBStorageUpload", "onCancelled " + this.f71494c.toString());
        g.i().o(new g(p.a(t((L.b) this.f71501f.F())), "state_changed", this.f71493b, this.f71492a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(L.b bVar) {
        Log.d("RNFBStorageUpload", "onPaused " + this.f71494c.toString());
        g.i().o(new g(t(bVar), "state_changed", this.f71493b, this.f71492a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(Promise promise, Task task) {
        f();
        if (task.isSuccessful()) {
            g i10 = g.i();
            i10.o(new g(t((L.b) task.getResult()), "state_changed", this.f71493b, this.f71492a));
            i10.o(new g(t((L.b) task.getResult()), "upload_success", this.f71493b, this.f71492a));
            promise.resolve(t((L.b) task.getResult()));
            return;
        }
        g i11 = g.i();
        WritableMap b10 = p.b(task.getException(), t((L.b) this.f71501f.F()), true);
        if (b10 != null) {
            i11.o(new g(b10, "state_changed", this.f71493b, this.f71492a));
        }
        i11.o(new g(p.b(task.getException(), t((L.b) this.f71501f.F()), false), "upload_failure", this.f71493b, this.f71492a));
        a.g(promise, task.getException());
    }

    private byte[] y(String str, String str2) {
        str2.hashCode();
        if (str2.equals("base64url")) {
            return Base64.decode(str, 8);
        }
        if (!str2.equals("base64")) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* access modifiers changed from: package-private */
    public void q(ExecutorService executorService, Promise promise) {
        this.f71501f.addOnCompleteListener(executorService, new q(this, promise));
    }

    /* access modifiers changed from: package-private */
    public void r(ExecutorService executorService, String str, ReadableMap readableMap) {
        Uri c10 = m.c(str);
        L D10 = this.f71494c.D(c10, a.a(readableMap, c10, (n) null));
        this.f71501f = D10;
        k(D10);
        p(executorService);
    }

    /* access modifiers changed from: package-private */
    public void s(ExecutorService executorService, String str, String str2, ReadableMap readableMap) {
        L C10 = this.f71494c.C(y(str, str2), a.a(readableMap, (Uri) null, (n) null));
        this.f71501f = C10;
        k(C10);
        p(executorService);
    }
}
