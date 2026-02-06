package Vh;

import ci.c;
import ci.d;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    protected static c f65538a = d.j(l.class);

    /* renamed from: b  reason: collision with root package name */
    protected static Map f65539b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet<>();
        hashSet.add(f.class);
        hashSet.add(n.class);
        hashSet.add(b.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(m.class);
        hashSet.add(a.class);
        hashSet.add(j.class);
        hashSet.add(h.class);
        hashSet.add(e.class);
        for (Class cls : hashSet) {
            g gVar = (g) cls.getAnnotation(g.class);
            int[] tags = gVar.tags();
            int objectTypeIndication = gVar.objectTypeIndication();
            Map map = (Map) f65539b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int valueOf : tags) {
                map.put(Integer.valueOf(valueOf), cls);
            }
            f65539b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b bVar;
        int l10 = bi.d.l(byteBuffer);
        Map map = (Map) f65539b.get(Integer.valueOf(i10));
        if (map == null) {
            map = (Map) f65539b.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(l10));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            if (f65538a.b()) {
                f65538a.warn("No ObjectDescriptor found for objectTypeIndication {} and tag {} found: {}", Integer.toHexString(i10), Integer.toHexString(l10), cls);
            }
            bVar = new o();
        } else {
            try {
                bVar = (b) cls.newInstance();
            } catch (Exception e10) {
                c cVar = f65538a;
                cVar.a("Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + l10, e10);
                throw new RuntimeException(e10);
            }
        }
        bVar.d(l10, byteBuffer);
        return bVar;
    }
}
