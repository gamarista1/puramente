package k2;

import java.io.IOException;

public abstract class i {
    public static void a(f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
