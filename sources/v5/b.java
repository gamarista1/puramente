package V5;

import T5.g;
import android.webkit.MimeTypeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Map;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final MimeTypeMap f34670a = MimeTypeMap.getSingleton();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f34671b = g.of(ClipboardModule.MIMETYPE_HEIF, "heif", ClipboardModule.MIMETYPE_HEIC, "heic");

    /* renamed from: c  reason: collision with root package name */
    private static final Map f34672c = g.of("heif", ClipboardModule.MIMETYPE_HEIF, "heic", ClipboardModule.MIMETYPE_HEIC);

    public static String a(String str) {
        String str2 = (String) f34672c.get(str);
        if (str2 != null) {
            return str2;
        }
        return f34670a.getMimeTypeFromExtension(str);
    }
}
