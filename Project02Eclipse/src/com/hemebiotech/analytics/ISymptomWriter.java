package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {

    void write(Map<String, Integer> map) throws IOException;


}
