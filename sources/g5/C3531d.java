package g5;

import T4.c;
import T4.i;
import T4.l;
import V4.v;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import o5.C3882a;

/* renamed from: g5.d  reason: case insensitive filesystem */
public class C3531d implements l {
    public c b(i iVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean a(v vVar, File file, i iVar) {
        try {
            C3882a.f(((C3530c) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
