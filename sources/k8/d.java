package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.util.ArrayList;
import java.util.List;

public class d extends f {

    /* renamed from: a  reason: collision with root package name */
    private List f32439a = new ArrayList();

    public void a(GifReader gifReader) {
        while (true) {
            e c10 = e.c(gifReader);
            if (!c10.b()) {
                this.f32439a.add(c10);
            } else {
                return;
            }
        }
    }
}
