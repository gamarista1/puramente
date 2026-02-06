package app.puramente.app;

import Dd.k;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.C3433v;
import com.facebook.react.defaults.b;
import com.facebook.react.r;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lapp/puramente/app/MainActivity;", "Lcom/facebook/react/r;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "onCreate", "(Landroid/os/Bundle;)V", "", "H", "()Ljava/lang/String;", "Lcom/facebook/react/v;", "F", "()Lcom/facebook/react/v;", "onStart", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainActivity extends r {

    public static final class a extends b {
        a(MainActivity mainActivity, String str, boolean z10) {
            super(mainActivity, str, z10);
        }
    }

    /* access modifiers changed from: protected */
    public C3433v F() {
        return new k(this, true, new a(this, H(), com.facebook.react.defaults.a.a()));
    }

    /* access modifiers changed from: protected */
    public String H() {
        return "PuraMenteMobile";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setTheme(T3.k.f6192a);
        super.onCreate((Bundle) null);
    }

    public void onNewIntent(Intent intent) {
        C6496s.h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        RNBranchModule.reInitSession(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        RNBranchModule.initSession(getIntent().getData(), this);
    }
}
