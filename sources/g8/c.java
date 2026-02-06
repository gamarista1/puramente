package G8;

import H8.a;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;

public abstract class c {
    public static boolean a(Reader reader) {
        a aVar;
        if (reader instanceof a) {
            aVar = (a) reader;
        } else {
            aVar = new a(reader);
        }
        try {
            return AvifDecoder.isAvifImage(aVar.a());
        } catch (IOException unused) {
            return false;
        }
    }
}
