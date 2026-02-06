package Je;

import Fe.C3031u;
import android.content.Context;
import android.text.TextUtils;

public class e extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32248d = "Branch Keys";

    /* renamed from: e  reason: collision with root package name */
    String f32249e = "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.";

    /* renamed from: f  reason: collision with root package name */
    String f32250f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=%3C!%2D%2D%20REPLACE%20%60BranchKey%60%20with,%22key_test_XXX%22%20/%3E\">More info</a>";

    public e() {
        this.f32273a = "Branch Keys";
        this.f32274b = "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=%3C!%2D%2D%20REPLACE%20%60BranchKey%60%20with,%22key_test_XXX%22%20/%3E\">More info</a>";
    }

    public String b(Context context, boolean z10) {
        return super.b(context, d(context));
    }

    public boolean d(Context context) {
        return !TextUtils.isEmpty(C3031u.k(context));
    }
}
