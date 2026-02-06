package Db;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzadq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzafi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.C4807q;
import com.google.firebase.auth.C4812t;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: Db.c  reason: case insensitive filesystem */
public class C4255c {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f50489b = "c";

    /* renamed from: c  reason: collision with root package name */
    private static final C4255c f50490c = new C4255c();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f50491a;

    private C4255c() {
    }

    public static C4255c a() {
        return f50490c;
    }

    private final void e(FirebaseAuth firebaseAuth, d0 d0Var, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new C4812t());
            return;
        }
        L.e(firebaseAuth.j().m(), firebaseAuth);
        C4536s.l(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (!C4275x.a().h(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzach.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            new zzadq(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new f0(this, taskCompletionSource)).addOnFailureListener(new g0(this, taskCompletionSource));
    }

    public static boolean f(Exception exc) {
        if (exc instanceof C4812t) {
            return true;
        }
        if (!(exc instanceof C4807q) || !((C4807q) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            return false;
        }
        return true;
    }

    public final Task b(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10, boolean z11) {
        Task task;
        B0 b02 = (B0) firebaseAuth.m();
        d0 g10 = d0.g();
        if (zzaec.zza(firebaseAuth.j()) || b02.h()) {
            return Tasks.forResult(new l0().b());
        }
        String str2 = f50489b;
        boolean f10 = b02.f();
        Log.i(str2, "ForceRecaptchaFlow from phoneAuthOptions = " + z11 + ", ForceRecaptchaFlow from firebaseSettings = " + f10);
        boolean f11 = z11 | b02.f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task f12 = g10.f();
        if (f12 != null) {
            if (f12.isSuccessful()) {
                return Tasks.forResult(new l0().c((String) f12.getResult()).b());
            }
            String message = f12.getException().getMessage();
            Log.e(str2, "Error in previous reCAPTCHA flow: " + message);
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (!z10 || f11) {
            e(firebaseAuth, g10, activity, taskCompletionSource);
        } else {
            IntegrityManager create = IntegrityManagerFactory.create(firebaseAuth.j().m());
            if (!TextUtils.isEmpty(this.f50491a)) {
                task = Tasks.forResult(new zzafi(this.f50491a));
            } else {
                task = firebaseAuth.J();
            }
            task.continueWithTask(firebaseAuth.B0(), new D(this, str, create)).addOnCompleteListener(new c0(this, taskCompletionSource, firebaseAuth, g10, activity));
        }
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, d0 d0Var, Activity activity, Task task) {
        String str;
        if (!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            if (task.getException() == null) {
                str = "";
            } else {
                str = task.getException().getMessage();
            }
            String str2 = f50489b;
            Log.e(str2, "Play Integrity Token fetch failed, falling back to Recaptcha" + str);
            e(firebaseAuth, d0Var, activity, taskCompletionSource);
            return;
        }
        taskCompletionSource.setResult(new l0().a(((IntegrityTokenResponse) task.getResult()).token()).b());
    }
}
