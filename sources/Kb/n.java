package kb;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lb.C5076i;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f60917a = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: b  reason: collision with root package name */
    private static final Map f60918b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final C5076i f60919c = new C5076i("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map b10 = b();
        bundle.putInt("playcore_version_code", ((Integer) b10.get("java")).intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b10.get("native")).intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b10.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        synchronized (n.class) {
            map = f60918b;
            map.put("java", 11004);
        }
        return map;
    }
}
