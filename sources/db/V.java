package Db;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;

final class V implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50473a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ W f50474b;

    V(W w10, String str) {
        this.f50473a = str;
        this.f50474b = w10;
    }

    public final /* synthetic */ Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            return Tasks.forException(new T((String) C4536s.l(((Exception) C4536s.l(task.getException())).getMessage())));
        }
        zzafn zzafn = (zzafn) task.getResult();
        String zza = zzafn.zza();
        if (zzah.zzc(zza)) {
            String str2 = this.f50473a;
            return Tasks.forException(new T("No Recaptcha Enterprise siteKey configured for tenant/project " + str2));
        }
        List<String> zza2 = zzac.zza('/').zza((CharSequence) zza);
        if (zza2.size() != 4) {
            str = null;
        } else {
            str = zza2.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            String str3 = this.f50473a;
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + str3);
        }
        this.f50474b.f50476b = zzafn;
        W w10 = this.f50474b;
        Task a10 = w10.f50479e.a((Application) w10.f50477c.m(), str);
        this.f50474b.f50475a.put(this.f50473a, a10);
        return a10;
    }
}
