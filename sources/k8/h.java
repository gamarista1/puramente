package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class h {

    static class a extends IOException {
        a() {
            super("Gif Format error");
        }
    }

    private static void a(GifReader gifReader) {
        byte peek;
        if (gifReader.peek() != 71 || gifReader.peek() != 73 || gifReader.peek() != 70 || gifReader.peek() != 56 || (((peek = gifReader.peek()) != 55 && peek != 57) || gifReader.peek() != 97)) {
            throw new a();
        }
    }

    public static boolean b(Reader reader) {
        GifReader gifReader;
        try {
            if (reader instanceof GifReader) {
                gifReader = (GifReader) reader;
            } else {
                gifReader = new GifReader(reader);
            }
            a(gifReader);
            return true;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List c(GifReader gifReader) {
        b bVar;
        a(gifReader);
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.a(gifReader);
        arrayList.add(kVar);
        if (kVar.b()) {
            c cVar = new c(kVar.c());
            cVar.a(gifReader);
            arrayList.add(cVar);
        }
        while (true) {
            try {
                byte peek = gifReader.peek();
                if (peek == 59) {
                    break;
                }
                if (peek == 33) {
                    bVar = f.b(gifReader);
                } else if (peek != 44) {
                    bVar = null;
                } else {
                    bVar = new j();
                }
                if (bVar != null) {
                    bVar.a(gifReader);
                    arrayList.add(bVar);
                } else {
                    throw new a();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }
}
