package Z4;

import T4.d;
import T4.i;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o5.C3882a;

public class c implements d {
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, i iVar) {
        try {
            C3882a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
