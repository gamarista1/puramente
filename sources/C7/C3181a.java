package c7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: c7.a  reason: case insensitive filesystem */
public abstract class C3181a implements C3185e {

    /* renamed from: c  reason: collision with root package name */
    private static final Set f36528c = new HashSet(Arrays.asList(new String[]{"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"}));

    /* renamed from: a  reason: collision with root package name */
    private Map f36529a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private C3191k f36530b;

    public void I(Map map) {
        if (map != null) {
            for (String str : f36528c) {
                Object obj = map.get(str);
                if (obj != null) {
                    this.f36529a.put(str, obj);
                }
            }
        }
    }

    public n d1() {
        return m.f36558d;
    }

    public C3191k f1() {
        if (this.f36530b == null) {
            this.f36530b = new l(e(), d(), p(), d1(), getExtras());
        }
        return this.f36530b;
    }

    public Map getExtras() {
        return this.f36529a;
    }

    public void t(String str, Object obj) {
        if (f36528c.contains(str)) {
            this.f36529a.put(str, obj);
        }
    }

    public boolean u1() {
        return false;
    }
}
