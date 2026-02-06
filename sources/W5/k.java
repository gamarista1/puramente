package W5;

import T5.p;
import java.io.IOException;
import java.io.OutputStream;

public abstract class k extends OutputStream {
    public abstract h a();

    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            p.a(e10);
        }
    }

    public abstract int size();
}
