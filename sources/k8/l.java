package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.util.ArrayList;
import java.util.List;

public class l extends f {

    /* renamed from: a  reason: collision with root package name */
    private List f32466a = new ArrayList();

    public void a(GifReader gifReader) {
        gifReader.peek();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        while (true) {
            e c10 = e.c(gifReader);
            if (!c10.b()) {
                this.f32466a.add(c10);
            } else {
                return;
            }
        }
    }
}
