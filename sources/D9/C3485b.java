package d9;

/* renamed from: d9.b  reason: case insensitive filesystem */
public abstract class C3485b {
    public static Object a(int i10, Object obj, C3484a aVar, C3486c cVar) {
        Object apply;
        if (i10 < 1) {
            return aVar.apply(obj);
        }
        do {
            apply = aVar.apply(obj);
            obj = cVar.a(obj, apply);
            if (obj == null || i10 - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(obj);
            obj = cVar.a(obj, apply);
            break;
        } while (i10 - 1 < 1);
        return apply;
    }
}
