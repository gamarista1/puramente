package H1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C6496s;

public abstract class a {
    public static final File a(Context context, String str) {
        C6496s.h(context, "<this>");
        C6496s.h(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C6496s.o("datastore/", str));
    }
}
