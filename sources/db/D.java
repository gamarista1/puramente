package Db;

import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.p002firebaseauthapi.zzafi;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

final class D implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50444a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IntegrityManager f50445b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4255c f50446c;

    D(C4255c cVar, String str, IntegrityManager integrityManager) {
        this.f50444a = str;
        this.f50445b = integrityManager;
        this.f50446c = cVar;
    }

    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f50446c.f50491a = ((zzafi) task.getResult()).zza();
            return this.f50445b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzafi) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f50444a.getBytes(Constants.ENCODING)), 11))).build());
        }
        String g10 = C4255c.f50489b;
        String message = task.getException().getMessage();
        Log.e(g10, "Problem retrieving Play Integrity producer project:  " + message);
        return Tasks.forException(task.getException());
    }
}
