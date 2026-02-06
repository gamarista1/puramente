package expo.modules.filesystem;

import Td.a;
import Td.e;
import android.content.Context;
import expo.modules.core.BasePackage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/filesystem/FileSystemPackage;", "Lexpo/modules/core/BasePackage;", "<init>", "()V", "Landroid/content/Context;", "context", "", "LPd/c;", "f", "(Landroid/content/Context;)Ljava/util/List;", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemPackage extends BasePackage {
    public List f(Context context) {
        C6496s.h(context, "context");
        return C6565s.q(new e(), new a(context));
    }
}
