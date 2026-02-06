package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f17296a = aVar.p(audioAttributesImplBase.f17296a, 1);
        audioAttributesImplBase.f17297b = aVar.p(audioAttributesImplBase.f17297b, 2);
        audioAttributesImplBase.f17298c = aVar.p(audioAttributesImplBase.f17298c, 3);
        audioAttributesImplBase.f17299d = aVar.p(audioAttributesImplBase.f17299d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f17296a, 1);
        aVar.F(audioAttributesImplBase.f17297b, 2);
        aVar.F(audioAttributesImplBase.f17298c, 3);
        aVar.F(audioAttributesImplBase.f17299d, 4);
    }
}
