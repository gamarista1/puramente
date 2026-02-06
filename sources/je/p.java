package Je;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

public class p {

    /* renamed from: b  reason: collision with root package name */
    private static p f32291b;

    /* renamed from: a  reason: collision with root package name */
    private r f32292a;

    private p(Context context) {
    }

    public static void a(Context context) {
        if (f32291b == null) {
            f32291b = new p(context);
        }
        f32291b.f32292a = new r(context);
        f32291b.b(context);
    }

    private void b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = f32291b.f32292a.getWindow();
        Objects.requireNonNull(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = 2000;
        f32291b.f32292a.show();
        f32291b.f32292a.getWindow().setAttributes(layoutParams);
    }
}
