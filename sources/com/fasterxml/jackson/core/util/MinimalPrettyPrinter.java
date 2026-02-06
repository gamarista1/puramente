package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.Serializable;

public class MinimalPrettyPrinter implements PrettyPrinter, Serializable {
    public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
    private static final long serialVersionUID = 1;
    protected String _rootValueSeparator;

    public MinimalPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) {
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) {
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(',');
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i10) {
        jsonGenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i10) {
        jsonGenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(',');
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(':');
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('{');
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
    }
}
