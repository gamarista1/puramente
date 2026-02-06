package Of;

import java.util.Collection;

/* renamed from: Of.b  reason: case insensitive filesystem */
public interface C5484b extends C5483a, D {

    /* renamed from: Of.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            if (this != FAKE_OVERRIDE) {
                return true;
            }
            return false;
        }
    }

    void E0(Collection collection);

    C5484b a();

    Collection e();

    a h();

    C5484b p0(C5495m mVar, E e10, C5502u uVar, a aVar, boolean z10);
}
