package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.nio.file.Path;

public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(a.a());
    }

    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize(b.a(obj), jsonGenerator, serializerProvider);
    }

    public void serialize(Path path, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(path.toUri().toString());
    }
}
