package Db;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class P implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ RecaptchaAction f50465a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FirebaseAuth f50466b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ String f50467c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Continuation f50468d;

    public /* synthetic */ P(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation) {
        this.f50465a = recaptchaAction;
        this.f50466b = firebaseAuth;
        this.f50467c = str;
        this.f50468d = continuation;
    }

    public final Object then(Task task) {
        return N.b(this.f50465a, this.f50466b, this.f50467c, this.f50468d, task);
    }
}
