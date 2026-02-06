package Je;

import Fe.C3016e;
import android.content.Context;

public class c extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32238d = "Branch instance";

    /* renamed from: e  reason: collision with root package name */
    String f32239e = "Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method.";

    /* renamed from: f  reason: collision with root package name */
    String f32240f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=Branch.getAutoInstance(this)\">More info</a>";

    public c() {
        this.f32273a = "Branch instance";
        this.f32274b = "Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method.";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=Branch.getAutoInstance(this)\">More info</a>";
    }

    public String a() {
        return this.f32240f;
    }

    public String b(Context context, boolean z10) {
        return super.b(context, d(context));
    }

    public boolean d(Context context) {
        if (C3016e.X() != null) {
            return true;
        }
        return false;
    }
}
