package S4;

import T4.c;
import T4.i;
import V4.v;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import o5.C3882a;

public class l implements T4.l {
    public c b(i iVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean a(v vVar, File file, i iVar) {
        try {
            C3882a.f(((k) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("WebpEncoder", 5)) {
                Log.w("WebpEncoder", "Failed to encode WebP drawable data", e10);
            }
            return false;
        }
    }
}
