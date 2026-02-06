package Db;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.List;
import s.C2576d;

public final /* synthetic */ class G implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ GenericIdpActivity f50452a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f50453b;

    public /* synthetic */ G(GenericIdpActivity genericIdpActivity, String str) {
        this.f50452a = genericIdpActivity;
        this.f50453b = str;
    }

    public final void onComplete(Task task) {
        GenericIdpActivity genericIdpActivity = this.f50452a;
        String str = this.f50453b;
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                intent.putExtra("com.android.browser.application_id", str);
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                genericIdpActivity.startActivity(intent);
                return;
            }
            C2576d a10 = new C2576d.a().a();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            a10.a(genericIdpActivity, (Uri) task.getResult());
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        zzacl.zzb(genericIdpActivity, str);
    }
}
